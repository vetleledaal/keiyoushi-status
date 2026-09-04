package dev.vetle.extstats

import dev.vetle.extstats.core.CheckResult
import dev.vetle.extstats.core.CheckStatus
import dev.vetle.extstats.core.ImageEvidence
import dev.vetle.extstats.core.ProbeValidationPolicy
import dev.vetle.extstats.core.RedactionMode
import dev.vetle.extstats.core.RetryConditionType
import dev.vetle.extstats.core.RetryDisposition
import dev.vetle.extstats.core.RetryReason
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ProbeValidationPolicyTest {
    private fun response(vararg operations: JsonObject): String = buildJsonObject {
        put("results", JsonArray(operations.toList()))
    }.toString()

    private fun operation(
        name: String,
        status: String = "success",
        hasNextPage: Boolean? = null,
        mangas: List<JsonObject>? = null,
    ): JsonObject = buildJsonObject {
        put("operation", name)
        put("status", status)
        hasNextPage?.let { put("hasNextPage", it) }
        mangas?.let { put("mangas", JsonArray(it)) }
    }

    private fun manga(title: String, url: String): JsonObject = buildJsonObject {
        put("title", title)
        put("url", url)
    }

    @Test
    fun `maps operation outcomes to check statuses`() {
        val cases = listOf(
            "success" to CheckStatus.PASS,
            "error" to CheckStatus.ERROR,
            "timeout" to CheckStatus.TIMEOUT,
        )

        cases.forEach { (operationStatus, checkStatus) ->
            val response =
                """{"results":[{"operation":"details","status":"$operationStatus",""" +
                    """"exceptionClass":"FixtureException",""" +
                    """"message":"fixture message"}]}"""
            val result = ProbeValidationPolicy.evaluateOperationOutcome(response, "details")

            assertEquals(checkStatus, result.status, operationStatus)
            if (operationStatus == "success") {
                assertEquals("", result.details)
            } else {
                assertEquals("FixtureException: fixture message", result.details, operationStatus)
            }
        }
    }

    @Test
    fun `treats deliberate stub operation as skipped`() {
        val stub = ProbeValidationPolicy.evaluateOperationOutcome(
            """{"results":[{"operation":"search","status":"error","exceptionClass":"java.lang.Exception","message":"Stub!"}]}""",
            "search",
        )
        val unsupportedSearch = ProbeValidationPolicy.evaluateOperationOutcome(
            """{"results":[{"operation":"search","status":"error","exceptionClass":"java.lang.UnsupportedOperationException"}]}""",
            "search",
        )
        val unsupportedDetails = ProbeValidationPolicy.evaluateOperationOutcome(
            """{"results":[{"operation":"details","status":"error","exceptionClass":"java.lang.UnsupportedOperationException"}]}""",
            "details",
        )
        val otherMessage = ProbeValidationPolicy.evaluateOperationOutcome(
            """{"results":[{"operation":"search","status":"error","exceptionClass":"java.lang.Exception","message":"Not implemented"}]}""",
            "search",
        )
        val otherType = ProbeValidationPolicy.evaluateOperationOutcome(
            """{"results":[{"operation":"search","status":"error","exceptionClass":"java.lang.RuntimeException","message":"Stub!"}]}""",
            "search",
        )

        assertEquals(CheckStatus.SKIP, stub.status)
        assertEquals("Stub!", stub.details)
        assertEquals(CheckStatus.SKIP, unsupportedSearch.status)
        assertEquals("java.lang.UnsupportedOperationException", unsupportedSearch.details)
        assertEquals(CheckStatus.ERROR, unsupportedDetails.status)
        assertEquals(CheckStatus.ERROR, otherMessage.status)
        assertEquals(CheckStatus.ERROR, otherType.status)
        assertTrue(otherType.blocksBuild)
    }

    @Test
    fun `marks compatibility failures as build blocking`() {
        val linkageFailure = ProbeValidationPolicy.evaluateOperationOutcome(
            """{"results":[{"operation":"popular","status":"error","exceptionClass":"java.lang.NoSuchMethodError","message":"missing compatibility method"}]}""",
            "popular",
        )
        val missingImplementation = ProbeValidationPolicy.evaluateOperationOutcome(
            """{"results":[{"operation":"popular","status":"error","exceptionClass":"kotlin.NotImplementedError","message":"TODO"}]}""",
            "popular",
        )
        val extensionFailure = ProbeValidationPolicy.evaluateOperationOutcome(
            """{"results":[{"operation":"popular","status":"error","exceptionClass":"java.net.UnknownHostException","message":"offline"}]}""",
            "popular",
        )

        assertTrue(linkageFailure.blocksBuild)
        assertTrue(missingImplementation.blocksBuild)
        assertEquals(false, extensionFailure.blocksBuild)
    }

    @Test
    fun `classifies retry advice from ordered structured evidence`() {
        data class Case(
            val label: String,
            val fields: String,
            val disposition: RetryDisposition,
            val reason: RetryReason,
            val conditionType: RetryConditionType? = null,
            val conditionValue: String? = null,
        )

        val cases = listOf(
            Case("timeout", "\"status\":\"timeout\"", RetryDisposition.RETRY_NOW, RetryReason.TIMEOUT),
            Case(
                "timeout exception",
                "\"status\":\"error\",\"exceptionClass\":\"java.net.SocketTimeoutException\"",
                RetryDisposition.RETRY_NOW,
                RetryReason.TIMEOUT,
            ),
            Case(
                "connection reset",
                "\"status\":\"error\",\"exceptionClass\":\"java.net.SocketException\",\"message\":\"Connection reset\"",
                RetryDisposition.RETRY_NOW,
                RetryReason.TEMPORARY_CONNECTION_FAILURE,
            ),
            Case(
                "rate limit",
                "\"status\":\"error\",\"statusCode\":429,\"retryAfter\":\"120\"",
                RetryDisposition.RETRY_WHEN,
                RetryReason.RATE_LIMITED,
                RetryConditionType.RETRY_TIME_REACHED,
                "120",
            ),
            Case(
                "DNS",
                "\"status\":\"error\",\"exceptionClass\":\"java.net.UnknownHostException\",\"host\":\"example.test\"",
                RetryDisposition.RETRY_WHEN,
                RetryReason.DNS_LOOKUP_FAILURE,
                RetryConditionType.HOST_RESOLVES,
                "example.test",
            ),
            Case(
                "TLS",
                "\"status\":\"error\",\"exceptionClass\":\"javax.net.ssl.SSLHandshakeException\",\"host\":\"example.test\"",
                RetryDisposition.RETRY_WHEN,
                RetryReason.TLS_FAILURE,
                RetryConditionType.TLS_HANDSHAKE_SUCCEEDS,
                "example.test",
            ),
            Case("HTTP 5xx", "\"status\":\"error\",\"statusCode\":503", RetryDisposition.RETRY_NOW, RetryReason.HTTP_SERVER_ERROR),
            Case(
                "compatibility",
                "\"status\":\"error\",\"exceptionClass\":\"java.lang.NoSuchMethodError\"",
                RetryDisposition.RETRY_WHEN,
                RetryReason.HARNESS_COMPATIBILITY_FAILURE,
                RetryConditionType.HARNESS_REVISION_CHANGES,
                "java.lang.NoSuchMethodError",
            ),
        )

        cases.forEach { case ->
            val result = ProbeValidationPolicy.evaluateOperationOutcome(
                """{"results":[{"operation":"details",${case.fields}}]}""",
                "details",
            )

            assertEquals(case.disposition, result.retryAdvice.disposition, case.label)
            assertEquals(case.reason, result.retryAdvice.reason, case.label)
            assertEquals(case.conditionType, result.retryAdvice.condition?.type, case.label)
            assertEquals(case.conditionValue, result.retryAdvice.condition?.value, case.label)
        }
    }

    @Test
    fun `requires complete structured evidence for conditional retry`() {
        val fields = listOf(
            "\"status\":\"error\",\"statusCode\":429,\"retryAfter\":\"later\"",
            "\"status\":\"error\",\"exceptionClass\":\"java.net.UnknownHostException\"",
            "\"status\":\"error\",\"exceptionClass\":\"javax.net.ssl.SSLHandshakeException\"",
            "\"status\":\"error\",\"message\":\"DNS TLS timeout parked\"",
            "\"status\":\"error\",\"exceptionClass\":\"fixture.UnknownException\"",
        )

        fields.forEach { evidence ->
            val result = ProbeValidationPolicy.evaluateOperationOutcome(
                """{"results":[{"operation":"details",$evidence}]}""",
                "details",
            )

            assertEquals(RetryDisposition.REVIEW, result.retryAdvice.disposition, evidence)
            assertEquals(RetryReason.INSUFFICIENT_EVIDENCE, result.retryAdvice.reason, evidence)
        }
    }

    @Test
    fun `does not retry deterministic validation failures`() {
        val result = ProbeValidationPolicy.assignRetryAdvice(
            CheckResult("fixture validation", CheckStatus.FAIL, "fixture assertion failed"),
        )

        assertEquals(RetryDisposition.DO_NOT_RETRY, result.retryAdvice.disposition)
        assertEquals(RetryReason.DETERMINISTIC_FAILURE, result.retryAdvice.reason)
    }

    @Test
    fun `preserves only protocol-defined operation skips`() {
        val expectedSkips = listOf(
            "popular_next" to "hasNextPage = false",
            "latest" to "supportsLatest = false",
            "latest_next" to "supportsLatest = false",
            "latest_next" to "hasNextPage = false",
            "search" to "No manga was returned by popular or latest",
            "details" to "No manga was returned by popular or latest",
            "chapters" to "No manga was returned by popular or latest",
            "pages" to "No usable chapter was available",
        )

        expectedSkips.forEach { (operation, message) ->
            val response = """{"results":[{"operation":"$operation","status":"skipped","message":"$message"}]}"""
            val result = ProbeValidationPolicy.evaluateOperationOutcome(response, operation)

            assertEquals(CheckStatus.SKIP, result.status, "$operation: $message")
            assertEquals(message, result.details, operation)
        }
    }

    @Test
    fun `fails pages operation when returned chapters are unusable`() {
        val response = """{"results":[{"operation":"chapters","status":"success","chapters":[{"url":"file:///private/chapter"}]},{"operation":"pages","status":"skipped","message":"No usable chapter was available","pages":[]}]}"""

        val result = ProbeValidationPolicy.evaluateOperationOutcome(response, "pages")

        assertEquals(CheckStatus.FAIL, result.status)
        assertEquals(
            "No returned chapter could be used for pages; rejection reasons: uses unsupported file scheme (1 of 1)",
            result.details,
        )
    }

    @Test
    fun `rejects unexpected missing and malformed operation outcomes`() {
        val unexpectedSkip = ProbeValidationPolicy.evaluateOperationOutcome(
            """{"results":[{"operation":"popular","status":"skipped","message":"supportsLatest = false"}]}""",
            "popular",
        )
        val missing = ProbeValidationPolicy.evaluateOperationOutcome("""{"results":[]}""", "popular")
        val missingStatus = ProbeValidationPolicy.evaluateOperationOutcome(
            """{"results":[{"operation":"popular"}]}""",
            "popular",
        )
        val unknownStatus = ProbeValidationPolicy.evaluateOperationOutcome(
            """{"results":[{"operation":"popular","status":"cancelled"}]}""",
            "popular",
        )

        assertEquals(CheckStatus.ERROR, unexpectedSkip.status)
        assertEquals("Unexpected skip: supportsLatest = false", unexpectedSkip.details)
        assertEquals(CheckStatus.ERROR, missing.status)
        assertEquals("popular result was not returned", missing.details)
        assertEquals(CheckStatus.ERROR, missingStatus.status)
        assertEquals("popular result has no status", missingStatus.details)
        assertEquals(CheckStatus.ERROR, unknownStatus.status)
        assertEquals("Unexpected operation status: cancelled", unknownStatus.details)
        assertTrue(unexpectedSkip.blocksBuild)
        assertTrue(missing.blocksBuild)
        assertTrue(missingStatus.blocksBuild)
        assertTrue(unknownStatus.blocksBuild)
        listOf(unexpectedSkip, missing, missingStatus, unknownStatus).forEach { result ->
            assertEquals(RetryDisposition.DO_NOT_RETRY, result.retryAdvice.disposition)
            assertEquals(RetryReason.MALFORMED_OUTPUT, result.retryAdvice.reason)
        }
    }

    @Test
    fun `detects reordered duplicate pagination results`() {
        val response = """{"results":[{"operation":"popular","status":"success","hasNextPage":true,"mangas":[{"title":"A","url":"/a"},{"title":"B","url":"/b"}]},{"operation":"popular_next","status":"success","mangas":[{"title":"B","url":"/b"},{"title":"A","url":"/a"}]}]}"""

        val result = ProbeValidationPolicy.evaluatePagination(response, "popular")

        assertEquals(CheckStatus.FAIL, result.status)
        assertEquals(
            "Page 2 repeats page 1: title=A, URL=`/<redacted>/a` at page 1 offset 0 and page 2 offset 1, title=B, URL=`/<redacted>/b` at page 1 offset 1 and page 2 offset 0",
            result.details,
        )
    }

    @Test
    fun `summarizes exact duplicate pagination results`() {
        val response = """{"results":[{"operation":"popular","status":"success","hasNextPage":true,"mangas":[{"title":"A","url":"/a"},{"title":"B","url":"/b"}]},{"operation":"popular_next","status":"success","mangas":[{"title":"A","url":"/a"},{"title":"B","url":"/b"}]}]}"""

        val result = ProbeValidationPolicy.evaluatePagination(response, "popular")

        assertEquals(CheckStatus.FAIL, result.status)
        assertEquals("Page 2 matches page 1 exactly", result.details)
    }

    @Test
    fun `warns about partial overlap between pagination results`() {
        val response = """{"results":[{"operation":"popular","status":"success","hasNextPage":true,"mangas":[{"title":"A","url":"/a"},{"title":"B","url":"/b"}]},{"operation":"popular_next","status":"success","mangas":[{"title":"B","url":"/b"},{"title":"C","url":"/c"}]}]}"""

        val result = ProbeValidationPolicy.evaluatePagination(response, "popular")

        assertEquals(CheckStatus.UNUSUAL, result.status)
        assertEquals("Overlapping manga: title=B, URL=`/<redacted>/b` at page 1 offset 1 and page 2 offset 0", result.details)
    }

    @Test
    fun `aggregates repeated pagination overlap by URL`() {
        val response = """{"results":[{"operation":"popular","status":"success","hasNextPage":true,"mangas":[{"title":"A","url":"/a"},{"title":"A","url":"/a"}]},{"operation":"popular_next","status":"success","mangas":[{"title":"Renamed A","url":"/a"},{"title":"Renamed A","url":"/a"}]}]}"""

        val result = ProbeValidationPolicy.evaluatePagination(response, "popular")

        assertEquals(CheckStatus.FAIL, result.status)
        assertEquals(
            "Page 2 repeats page 1: title=A, URL=`/<redacted>/a` at page 1 offsets 0, 1 and page 2 offsets 0, 1",
            result.details,
        )
    }

    @Test
    fun `skips pagination when page 1 does not advertise a next page`() {
        val response = """{"results":[{"operation":"popular","status":"success","hasNextPage":false,"mangas":[{"title":"A","url":"/a"}]}]}"""

        val result = ProbeValidationPolicy.evaluatePagination(response, "popular")

        assertEquals(CheckStatus.SKIP, result.status)
        assertEquals("Page 1 does not advertise a next page", result.details)
    }

    @Test
    fun `fails when advertised page 2 is empty`() {
        val response = """{"results":[{"operation":"popular","status":"success","hasNextPage":true,"mangas":[{"title":"A","url":"/a"}]},{"operation":"popular_next","status":"success","mangas":[]}]}"""

        val result = ProbeValidationPolicy.evaluatePagination(response, "popular")

        assertEquals(CheckStatus.FAIL, result.status)
        assertEquals("Page 2 is empty despite page 1 advertising a next page", result.details)
    }

    @Test
    fun `passes distinct listings pagination and duplicate checks`() {
        val response = response(
            operation("popular", hasNextPage = true, mangas = listOf(manga("A", "/a"))),
            operation("popular_next", mangas = listOf(manga("B", "/b"))),
            operation("latest", hasNextPage = true, mangas = listOf(manga("C", "/c"))),
            operation("latest_next", mangas = listOf(manga("D", "/d"))),
        )
        val results = listOf(
            ProbeValidationPolicy.evaluateLatestDistinct(response),
            ProbeValidationPolicy.evaluatePagination(response, "popular"),
            ProbeValidationPolicy.evaluatePagination(response, "latest"),
            ProbeValidationPolicy.evaluateListingDuplicates(response),
        )

        results.forEach { result ->
            assertEquals(CheckStatus.PASS, result.status, result.name)
            assertEquals("", result.details, result.name)
        }
    }

    @Test
    fun `skips listing duplicates when both pagination checks fully overlap`() {
        val response = response(
            operation("popular", hasNextPage = true, mangas = listOf(manga("A", "/a"), manga("A", "/a"))),
            operation("popular_next", mangas = listOf(manga("A", "/a"), manga("A", "/a"))),
            operation("latest", hasNextPage = true, mangas = listOf(manga("B", "/b"), manga("B", "/b"))),
            operation("latest_next", mangas = listOf(manga("B", "/b"), manga("B", "/b"))),
        )

        val result = ProbeValidationPolicy.evaluateListingDuplicates(response)

        assertEquals(CheckStatus.SKIP, result.status)
        assertEquals("Covered by popular and latest pagination failures", result.details)
    }

    @Test
    fun `retains listing duplicates unless both pagination checks fully overlap`() {
        val response = response(
            operation("popular", hasNextPage = true, mangas = listOf(manga("A", "/a"), manga("A", "/a"))),
            operation("popular_next", mangas = listOf(manga("A", "/a"), manga("A", "/a"))),
            operation("latest", hasNextPage = true, mangas = listOf(manga("B", "/b"))),
            operation("latest_next", mangas = listOf(manga("C", "/c"))),
        )

        val result = ProbeValidationPolicy.evaluateListingDuplicates(response)

        assertEquals(CheckStatus.FAIL, result.status)
        assertEquals(
            "Popular page 1 repeats 1 manga entry: title=A, URL=`/<redacted>/a`; Popular page 2 repeats 1 manga entry: title=A, URL=`/<redacted>/a`",
            result.details,
        )
    }

    @Test
    fun `lints when latest exactly repeats popular under changed titles`() {
        val response = """{"results":[{"operation":"popular","status":"success","mangas":[{"title":"A","url":"/a"}]},{"operation":"latest","status":"success","mangas":[{"title":"Renamed","url":"/a"}]}]}"""

        val result = ProbeValidationPolicy.evaluateLatestDistinct(response)

        assertEquals(CheckStatus.LINT, result.status)
        assertEquals("Latest page 1 exactly matches popular page 1; verify supportsLatest", result.details)
    }

    @Test
    fun `passes when latest reorders the same manga`() {
        val response = """{"results":[{"operation":"popular","status":"success","mangas":[{"title":"A","url":"/a"},{"title":"B","url":"/b"}]},{"operation":"latest","status":"success","mangas":[{"title":"B","url":"/b"},{"title":"A","url":"/a"}]}]}"""

        val result = ProbeValidationPolicy.evaluateLatestDistinct(response)

        assertEquals(CheckStatus.PASS, result.status)
        assertEquals("", result.details)
    }

    @Test
    fun `identifies invalid manga and its operation entry`() {
        val response = """{"results":[{"operation":"popular","status":"success","mangas":[{"title":"A","url":"/a"},{"title":"","url":"/missing-title"}]},{"operation":"search","status":"success","mangas":[{"title":"Missing URL","url":" "}]}]}"""

        val result = ProbeValidationPolicy.evaluateMangaIdentity(response)

        assertEquals(CheckStatus.FAIL, result.status)
        assertEquals("Invalid manga: popular entry 2: title=<blank>, URL=`/<redacted>/missing-title`, search entry 1: title=Missing URL, URL=<blank>", result.details)
    }

    @Test
    fun `allows details to omit the inherited manga URL`() {
        val response = """{"results":[{"operation":"popular","status":"success","mangas":[{"title":"A","url":"/a"}]},{"operation":"details","status":"success","mangas":[{"title":"A","url":null}]}]}"""

        val result = ProbeValidationPolicy.evaluateMangaIdentity(response)

        assertEquals(CheckStatus.PASS, result.status)
        assertEquals("1/1 popular manga have titles and relative URLs", result.details)
    }

    @Test
    fun `reports thumbnail URL coverage and fails partial coverage`() {
        val complete = response(
            "popular",
            "success",
            """[{"thumbnailUrl":"https://example.test/a.jpg"},{"thumbnailUrl":"https://example.test/b.jpg"}]""",
        )
        val completeWithDetailsOmission = """{"results":[{"operation":"popular","status":"success","mangas":[{"thumbnailUrl":"https://example.test/a.jpg"}]},{"operation":"details","status":"success","mangas":[{}]}]}"""
        val absent = response("popular", "success", """[{},{}]""")
        val partial = response("popular", "success", """[{"thumbnailUrl":"https://example.test/a.jpg"},{}]""")

        val completeResult = ProbeValidationPolicy.evaluateThumbnails(complete)
        val completeWithDetailsOmissionResult = ProbeValidationPolicy.evaluateThumbnails(completeWithDetailsOmission)
        val absentResult = ProbeValidationPolicy.evaluateThumbnails(absent)
        val partialResult = ProbeValidationPolicy.evaluateThumbnails(partial)
        assertEquals(CheckStatus.PASS, completeResult.status)
        assertEquals("2/2 manga have thumbnail URLs", completeResult.details)
        assertEquals(CheckStatus.PASS, completeWithDetailsOmissionResult.status)
        assertEquals("1/1 manga have thumbnail URLs", completeWithDetailsOmissionResult.details)
        assertEquals(CheckStatus.LINT, absentResult.status)
        assertEquals("0/2 manga have thumbnail URLs", absentResult.details)
        assertEquals(CheckStatus.UNUSUAL, partialResult.status)
        assertEquals("1/2 manga have thumbnail URLs", partialResult.details)
    }

    @Test
    fun `marks mixed manga URL forms within one listing as unusual`() {
        val response = response("popular", "success", """[{"title":"A","url":"/a"},{"title":"B","url":"http://example.test/private/b"}]""")

        val result = ProbeValidationPolicy.evaluateMangaIdentity(response)

        assertEquals(CheckStatus.UNUSUAL, result.status)
        assertEquals(
            "2/2 popular manga have titles and URLs; 1 relative, 1 absolute (examples: entry 2: `http://example.test/<redacted>/b`)",
            result.details,
        )
    }

    @Test
    fun `treats protocol-relative manga URLs as absolute and redacts their path`() {
        val response = response("popular", "success", """[{"title":"A","url":"//example.test/private/a?token=secret"}]""")

        val result = ProbeValidationPolicy.evaluateMangaIdentity(response)

        assertEquals(CheckStatus.LINT, result.status)
        assertEquals(
            "1/1 popular manga have titles and URLs; all absolute (examples: entry 1: `https://example.test/<redacted>/a`)",
            result.details,
        )
    }

    @Test
    fun `lists fewer than three duplicates within a listing page`() {
        val response = """{"results":[{"operation":"popular","status":"success","mangas":[]},{"operation":"popular_next","status":"skipped","mangas":[]},{"operation":"latest","status":"success","mangas":[]},{"operation":"latest_next","status":"success","mangas":[{"title":"A","url":"/a"},{"title":"Renamed A","url":"/a"},{"title":"B","url":"/b"},{"title":"Renamed B","url":"/b"}]}]}"""

        val result = ProbeValidationPolicy.evaluateListingDuplicates(response)

        assertEquals(CheckStatus.FAIL, result.status)
        assertEquals(
            "Latest page 2 repeats 2 manga entries: title=A, URL=`/<redacted>/a`, title=B, URL=`/<redacted>/b`",
            result.details,
        )
    }

    @Test
    fun `summarizes three or more duplicates within a listing page`() {
        val response = """{"results":[{"operation":"popular","status":"success","mangas":[{"title":"A","url":"/a"},{"title":"A","url":"/a"},{"title":"A","url":"/a"},{"title":"A","url":"/a"}]}]}"""

        val result = ProbeValidationPolicy.evaluateListingDuplicates(response)

        assertEquals(CheckStatus.FAIL, result.status)
        assertEquals("Popular page 1 repeats 3 manga entries", result.details)
    }

    @Test
    fun `compares pagination by URL while retaining the first page title in diagnostics`() {
        val complete = """{"results":[{"operation":"popular","status":"success","hasNextPage":true,"mangas":[{"title":"A","url":"/a"},{"title":"B","url":"/b"}]},{"operation":"popular_next","status":"success","mangas":[{"title":"Renamed B","url":"/b"},{"title":"Renamed A","url":"/a"}]}]}"""
        val partial = """{"results":[{"operation":"popular","status":"success","hasNextPage":true,"mangas":[{"title":"A","url":"/a"},{"title":"B","url":"/b"}]},{"operation":"popular_next","status":"success","mangas":[{"title":"Renamed A","url":"/a"},{"title":"C","url":"/c"}]}]}"""

        val completeResult = ProbeValidationPolicy.evaluatePagination(complete, "popular")
        val partialResult = ProbeValidationPolicy.evaluatePagination(partial, "popular")

        assertEquals(CheckStatus.FAIL, completeResult.status)
        assertEquals(CheckStatus.UNUSUAL, partialResult.status)
        assertEquals("Overlapping manga: title=A, URL=`/<redacted>/a` at page 1 offset 0 and page 2 offset 0", partialResult.details)
    }

    @Test
    fun `rejects malformed manga URLs without exposing their values`() {
        val cases = listOf(
            "/with\u0001control" to "contains control characters",
            "/bad%2Gescape" to "has malformed percent escape",
            "ftp://example.test/private" to "uses unsupported ftp scheme",
        )

        cases.forEach { (url, issue) ->
            val response = response("popular", "success", """[{"title":"A","url":"${url.replace("\u0001", "\\u0001")}"}]""")
            val result = ProbeValidationPolicy.evaluateMangaIdentity(response)

            assertEquals(CheckStatus.FAIL, result.status, issue)
            assertEquals("Malformed manga URLs: popular entry 1: $issue", result.details, issue)
        }
    }

    @Test
    fun `allows URL references and opaque composite manga identifiers`() {
        val identifiers = listOf(
            "/manga/title with spaces",
            "/bbs/board.php?title=title with spaces&id=42",
            "3266/title with spaces",
            "title with spaces",
            "hardcore-leveling-warrior:-earth-game#236",
            "manga-a|42",
        )

        identifiers.forEach { identifier ->
            val response = response("popular", "success", """[{"title":"A","url":"$identifier"}]""")
            val result = ProbeValidationPolicy.evaluateMangaIdentity(response, RedactionMode.NONE)

            assertEquals(CheckStatus.PASS, result.status, identifier)
        }
    }

    @Test
    fun `allows valid JSON object manga identifiers`() {
        val response = response("popular", "success", """[{"title":"One Piece","url":"{\"id\":\"47\",\"slug\":\"one-piece\"}"}]""")

        val result = ProbeValidationPolicy.evaluateMangaIdentity(response, RedactionMode.NONE)

        assertEquals(CheckStatus.PASS, result.status)
        assertEquals("1/1 popular manga have titles and relative URLs", result.details)
    }

    @Test
    fun `rejects malformed JSON object manga identifiers`() {
        val response = response("popular", "success", """[{"title":"A","url":"{\"id\":"}]""")

        val result = ProbeValidationPolicy.evaluateMangaIdentity(response, RedactionMode.NONE)

        assertEquals(CheckStatus.FAIL, result.status)
        assertEquals("Malformed manga URLs: popular entry 1: `{\"id\":` is malformed", result.details)
    }

    @Test
    fun `skips URL classification for pipe-containing manga URLs`() {
        val urls = listOf(
            "/manga/a-|-b",
            "http://example.test/manga/a-|-b",
            "https://example.test/manga/a-|-b",
            "//example.test/manga/a-|-b",
        )

        urls.forEach { url ->
            val response = response("popular", "success", """[{"title":"A","url":"$url"}]""")
            val result = ProbeValidationPolicy.evaluateMangaIdentity(response, RedactionMode.NONE)

            assertEquals(CheckStatus.PASS, result.status, url)
            assertEquals(
                "1/1 popular manga have titles and URLs; 1 pipe-containing URL skipped from classification",
                result.details,
                url,
            )
        }
    }

    @Test
    fun `allows pipes as delimiters in opaque manga identifiers`() {
        val response = response("popular", "success", """[{"title":"A","url":"manga-a|42"}]""")

        val result = ProbeValidationPolicy.evaluateMangaIdentity(response, RedactionMode.NONE)

        assertEquals(CheckStatus.PASS, result.status)
        assertEquals(
            "1/1 popular manga have titles and URLs; 1 pipe-containing URL skipped from classification",
            result.details,
        )
    }

    @Test
    fun `reports listing URL classification separately from details`() {
        val response = """{"results":[{"operation":"popular","status":"success","mangas":[{"title":"A","url":"/a"},{"title":"B","url":"/b-|-alt"}]},{"operation":"details","status":"success","mangas":[{"title":"A","url":"/a"}]}]}"""

        val result = ProbeValidationPolicy.evaluateMangaIdentity(response)

        assertEquals(CheckStatus.PASS, result.status)
        assertEquals(
            "2/2 popular manga have titles and URLs; 1 relative; 1 pipe-containing URL skipped from classification",
            result.details,
        )
    }

    @Test
    fun `marks mixed manga URL forms across listings as unusual and limits examples`() {
        val response = """{"results":[{"operation":"popular","status":"success","mangas":[{"title":"A","url":"https://example.test/a"},{"title":"B","url":"https://example.test/b"},{"title":"C","url":"https://example.test/c"},{"title":"D","url":"https://example.test/d"}]},{"operation":"latest","status":"success","mangas":[{"title":"E","url":"/e"},{"title":"F","url":"https://example.test/f"}]}]}"""

        val result = ProbeValidationPolicy.evaluateMangaIdentity(response, RedactionMode.NONE)

        assertEquals(CheckStatus.UNUSUAL, result.status)
        assertEquals(
            "6/6 listing manga have titles and URLs; popular: all absolute; latest: 1/2 absolute, 1/2 relative; Absolute URL examples: popular entry 1: `https://example.test/a`, popular entry 2: `https://example.test/b`, popular entry 3: `https://example.test/c`",
            result.details,
        )
    }

    @Test
    fun `skips checks whose subjects are absent`() {
        val response = """{"results":[{"operation":"popular","status":"success","mangas":[]},{"operation":"latest","status":"success","mangas":[]},{"operation":"search","status":"skipped","message":"No manga was returned by popular or latest","mangas":[]},{"operation":"details","status":"skipped","message":"No manga was returned by popular or latest","mangas":[],"chapters":[]},{"operation":"pages","status":"skipped","message":"No usable chapter was available","pages":[]}]}"""
        val results = listOf(
            ProbeValidationPolicy.evaluateSearch(response),
            ProbeValidationPolicy.evaluateLatestDistinct(response),
            ProbeValidationPolicy.evaluatePagination(response, "popular"),
            ProbeValidationPolicy.evaluatePagination(response, "latest"),
            ProbeValidationPolicy.evaluateListingDuplicates(response),
            ProbeValidationPolicy.evaluateMangaIdentity(response),
            ProbeValidationPolicy.evaluateThumbnails(response),
            ProbeValidationPolicy.evaluateDuplicateThumbnails(response),
            ProbeValidationPolicy.evaluateThumbnail(response),
            ProbeValidationPolicy.evaluateDetailsAuthor(response),
            ProbeValidationPolicy.evaluateDetailsArtist(response),
            ProbeValidationPolicy.evaluateDetailsGenres(response),
            ProbeValidationPolicy.evaluateDetailsStatus(response),
            ProbeValidationPolicy.evaluateDetailsDescription(response),
            ProbeValidationPolicy.evaluateMetadataTrimming(response),
            ProbeValidationPolicy.evaluateChapters(response),
            ProbeValidationPolicy.evaluateChapterDates(response),
            ProbeValidationPolicy.evaluateChapterTitles(response),
            ProbeValidationPolicy.evaluateChapterUrls(response),
            ProbeValidationPolicy.evaluateDuplicateChapterUrls(response),
            ProbeValidationPolicy.evaluatePageIndices(response),
            ProbeValidationPolicy.evaluatePageUrls(response),
            ProbeValidationPolicy.evaluateDuplicatePageUrls(response),
        )

        assertTrue(results.all { it.status == CheckStatus.SKIP })
        assertEquals("No usable chapter was available", results.single { it.name == "page URLs" }.details)
    }

    @Test
    fun `warns when different manga URLs share a thumbnail across listings`() {
        val response = """{"results":[{"operation":"popular","status":"success","mangas":[{"url":"/a","thumbnailUrl":"https://example.test/cover.jpg"},{"url":"/b","thumbnailUrl":"https://example.test/cover.jpg"},{"url":"/c","thumbnailUrl":"https://example.test/cover.jpg"}]},{"operation":"latest","status":"success","mangas":[{"url":"/d","thumbnailUrl":"https://example.test/cover.jpg"}]},{"operation":"search","status":"success","mangas":[]}]}"""

        val result = ProbeValidationPolicy.evaluateDuplicateThumbnails(response)

        assertEquals(CheckStatus.UNUSUAL, result.status)
        assertEquals(
            "Thumbnail URLs used by different manga URLs: `https://example.test/<redacted>/cover.jpg` -> all 4 manga URLs (examples: `/<redacted>/a`, `/<redacted>/b`, `/<redacted>/c`)",
            result.details,
        )
    }

    @Test
    fun `reports the duplicate thumbnail count when other thumbnails are present`() {
        val response = """{"results":[{"operation":"popular","status":"success","mangas":[{"url":"/a","thumbnailUrl":"https://example.test/shared.jpg"},{"url":"/b","thumbnailUrl":"https://example.test/shared.jpg"},{"url":"/c","thumbnailUrl":"https://example.test/unique.jpg"}]},{"operation":"latest","status":"success","mangas":[]},{"operation":"search","status":"success","mangas":[]}]}"""

        val result = ProbeValidationPolicy.evaluateDuplicateThumbnails(response)

        assertEquals(
            "Thumbnail URLs used by different manga URLs: `https://example.test/<redacted>/shared.jpg` -> 2 manga URLs (examples: `/<redacted>/a`, `/<redacted>/b`)",
            result.details,
        )
    }

    @Test
    fun `allows one manga URL to reuse its thumbnail across listings`() {
        val response = """{"results":[{"operation":"popular","status":"success","mangas":[{"url":"/a","thumbnailUrl":"https://example.test/cover.jpg"}]},{"operation":"latest","status":"success","mangas":[{"url":"/a","thumbnailUrl":"https://example.test/cover.jpg"}]},{"operation":"search","status":"success","mangas":[{"url":"/a","thumbnailUrl":"https://example.test/cover.jpg"}]}]}"""

        assertEquals(CheckStatus.PASS, ProbeValidationPolicy.evaluateDuplicateThumbnails(response).status)
    }

    @Test
    fun `skips latest comparisons when latest is unsupported`() {
        val response = """{"results":[{"operation":"popular","status":"success","hasNextPage":false,"mangas":[{}]},{"operation":"latest","status":"skipped","message":"supportsLatest = false","mangas":[]}]}"""

        val distinct = ProbeValidationPolicy.evaluateLatestDistinct(response)
        val pagination = ProbeValidationPolicy.evaluatePagination(response, "latest")

        assertEquals(CheckStatus.SKIP, distinct.status)
        assertEquals("supportsLatest = false", distinct.details)
        assertEquals(CheckStatus.SKIP, pagination.status)
        assertEquals("supportsLatest = false", pagination.details)
    }

    @Test
    fun `does not request an invalid page URL`() {
        val response = """{"results":[{"operation":"pages","status":"success","pages":[{"url":"not-a-url","imageUrl":null}]}]}"""
        val result = ProbeValidationPolicy.evaluatePageLoad(response)

        assertEquals(CheckStatus.FAIL, result.status)
        assertEquals("First page was not requested: url=`/<redacted>/not-a-url` (relative URL)", result.details)
    }

    @Test
    fun `reports captured image request failure for invalid page URL`() {
        val response = """{"results":[{"operation":"pages","status":"success","pages":[{"imageUrl":"/images/1.jpg"}],"firstPageImage":{"byteSize":0,"exceptionClass":"java.lang.IllegalArgumentException"}}]}"""

        val result = ProbeValidationPolicy.evaluatePageLoad(response)

        assertEquals(CheckStatus.FAIL, result.status)
        assertEquals(
            "First page URL `/<redacted>/1.jpg` could not be downloaded: java.lang.IllegalArgumentException",
            result.details,
        )
    }

    @Test
    fun `marks page image stub failure as build blocking compatibility failure`() {
        val response = """{"results":[{"operation":"pages","status":"success","pages":[{"imageUrl":"https://example.test/1.jpg"}],"firstPageImage":{"byteSize":0,"exceptionClass":"java.lang.RuntimeException","message":"Stub!","stubbedApi":"android.graphics.BitmapFactory.Options.<init>"}}]}"""

        val result = ProbeValidationPolicy.evaluatePageLoad(response)

        assertEquals(CheckStatus.FAIL, result.status)
        assertTrue("stubbed API `android.graphics.BitmapFactory.Options.<init>`" in result.details)
        assertTrue(result.blocksBuild)
        assertEquals(RetryDisposition.RETRY_WHEN, result.retryAdvice.disposition)
        assertEquals(RetryReason.HARNESS_COMPATIBILITY_FAILURE, result.retryAdvice.reason)
        assertEquals(RetryConditionType.HARNESS_REVISION_CHANGES, result.retryAdvice.condition?.type)
        assertEquals("java.lang.RuntimeException", result.retryAdvice.condition?.value)
    }

    @Test
    fun `reports stubbed API from thumbnail failure`() {
        val response = """{"selectedManga":{"operation":"popular","offset":0},"results":[{"operation":"popular","status":"success","mangas":[{"thumbnailUrl":"https://example.test/cover.jpg"}],"thumbnailImage":{"byteSize":0,"exceptionClass":"java.lang.RuntimeException","message":"Stub!","stubbedApi":"android.graphics.BitmapFactory.Options.<init>"}}]}"""

        val result = ProbeValidationPolicy.evaluateThumbnail(response)

        assertTrue("stubbed API `android.graphics.BitmapFactory.Options.<init>`" in result.details)
        assertTrue(result.blocksBuild)
        assertEquals(RetryReason.HARNESS_COMPATIBILITY_FAILURE, result.retryAdvice.reason)
    }

    @Test
    fun `distinguishes null empty and blank descriptions`() {
        val nullDescription = ProbeValidationPolicy.evaluateDetailsDescription(response("details", "success", "[{}]"))
        val empty = ProbeValidationPolicy.evaluateDetailsDescription(response("details", "success", """[{"description":""}]"""))
        val blank = ProbeValidationPolicy.evaluateDetailsDescription(response("details", "success", """[{"description":" "}]"""))
        assertEquals(CheckStatus.PASS, nullDescription.status)
        assertEquals("null", nullDescription.details)
        assertEquals(CheckStatus.LINT, empty.status)
        assertEquals("Description is empty; use null when unknown", empty.details)
        assertEquals(CheckStatus.LINT, blank.status)
        assertEquals("Description is blank; use null when unknown", blank.details)
        assertEquals(
            CheckStatus.PASS,
            ProbeValidationPolicy.evaluateDetailsDescription(
                response(
                    "details",
                    "success",
                    """[{"description":"Description"}]""",
                ),
            ).status,
        )
    }

    @Test
    fun `lints when metadata is not trimmed`() {
        val absentMetadata = ProbeValidationPolicy.evaluateMetadataTrimming(
            """{"results":[{"operation":"details","status":"success"}]}""",
        )
        assertEquals(CheckStatus.SKIP, absentMetadata.status)
        assertEquals("No details metadata to check", absentMetadata.details)
        val nullMetadata = ProbeValidationPolicy.evaluateMetadataTrimming(response("details", "success", "[{}]"))
        assertEquals("metadata trimming", nullMetadata.name)
        assertEquals(CheckStatus.PASS, nullMetadata.status)
        listOf("title", "artist", "author", "genre", "description").forEach { field ->
            val result = ProbeValidationPolicy.evaluateMetadataTrimming(
                response("details", "success", """[{"$field":" value "}]"""),
            )
            assertEquals(CheckStatus.LINT, result.status, field)
            assertEquals("Untrimmed fields: $field", result.details, field)
        }
        assertEquals(
            CheckStatus.LINT,
            ProbeValidationPolicy.evaluateMetadataTrimming(
                response("details", "success", """[{"genre":"Action,  Drama"}]"""),
            ).status,
        )
        listOf("title", "artist", "author", "genre").forEach { field ->
            val result = ProbeValidationPolicy.evaluateMetadataTrimming(
                response("details", "success", """[{"$field":"two  words"}]"""),
            )
            assertEquals(CheckStatus.LINT, result.status, field)
        }
        assertEquals(
            CheckStatus.PASS,
            ProbeValidationPolicy.evaluateMetadataTrimming(
                response("details", "success", """[{"description":"Markdown  line break"}]"""),
            ).status,
        )

        listOf("name", "scanlator").forEach { field ->
            listOf(" value ", "two  words").forEach { value ->
                val response = """{"results":[{"operation":"chapters","status":"success","chapters":[{"$field":"$value"}]}]}"""
                val result = ProbeValidationPolicy.evaluateMetadataTrimming(response)

                assertEquals(CheckStatus.LINT, result.status, "$field=$value")
                assertEquals("Untrimmed fields: chapter 1 $field", result.details, "$field=$value")
            }
        }

        val multiple = """{"results":[{"operation":"chapters","status":"success","chapters":[{"name":" Chapter 1"},{"scanlator":"Group  Name"}]}]}"""
        assertEquals(
            "Untrimmed fields: chapter 1 name, chapter 2 scanlator",
            ProbeValidationPolicy.evaluateMetadataTrimming(multiple).details,
        )
    }

    @Test
    fun `reports exact invalid chapter date values and counts`() {
        val response = """{"results":[{"operation":"chapters","status":"success","chapters":[{"dateUpload":10},{"dateUpload":0},{"dateUpload":-1},{"dateUpload":-2},{"dateUpload":null}]}]}"""

        val result = ProbeValidationPolicy.evaluateChapterDates(response)

        assertEquals(CheckStatus.LINT, result.status)
        assertEquals(
            "4 of 5 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1, -1 (sentinel value)=1, -2 (sentinel value)=1, null (date could not be read)=1",
            result.details,
        )
    }

    @Test
    fun `validates chapter collection and metadata`() {
        val response = """{"results":[{"operation":"chapters","status":"success","chapters":[{"name":"Chapter 1","url":"/chapter/1","dateUpload":10},{"name":"Chapter 2","url":"/chapter/2","dateUpload":20}]}]}"""
        val expectedDetails = mapOf(
            "chapters" to "2 chapters",
            "chapter dates" to "2 positive upload dates",
            "chapter URLs" to "",
            "duplicate chapter URLs" to "",
        )
        val results = listOf(
            ProbeValidationPolicy.evaluateChapters(response),
            ProbeValidationPolicy.evaluateChapterDates(response),
            ProbeValidationPolicy.evaluateChapterUrls(response),
            ProbeValidationPolicy.evaluateDuplicateChapterUrls(response),
        )

        results.forEach { result ->
            assertEquals(CheckStatus.PASS, result.status, result.name)
            assertEquals(expectedDetails.getValue(result.name), result.details, result.name)
        }

        val empty = ProbeValidationPolicy.evaluateChapters(
            """{"results":[{"operation":"chapters","status":"success","chapters":[]}]}""",
        )
        assertEquals(CheckStatus.FAIL, empty.status)
        assertEquals("0 chapters", empty.details)
    }

    @Test
    fun `validates chapter titles`() {
        val cases = listOf(
            "named" to Triple("""[{"name":"Chapter 1"}]""", CheckStatus.PASS, ""),
            "blank" to Triple("""[{"name":" "}]""", CheckStatus.LINT, "One or more chapters have no title"),
            "missing" to Triple("""[{}]""", CheckStatus.LINT, "One or more chapters have no title"),
        )

        cases.forEach { (case, expected) ->
            val (chapters, status, details) = expected
            val response = """{"results":[{"operation":"chapters","status":"success","chapters":$chapters}]}"""
            val result = ProbeValidationPolicy.evaluateChapterTitles(response)

            assertEquals(status, result.status, case)
            assertEquals(details, result.details, case)
        }
    }

    @Test
    fun `fails when only some chapter URLs are absolute`() {
        val response = """{"results":[{"operation":"chapters","status":"success","chapters":[{"url":"/chapter/1"},{"url":"https://example.test/chapter/2"}]}]}"""

        val result = ProbeValidationPolicy.evaluateChapterUrls(response)

        assertEquals(CheckStatus.FAIL, result.status)
        assertEquals("1 of 2 chapter URLs are absolute: offset 1: `https://example.test/<redacted>/2`", result.details)
    }

    @Test
    fun `reports unusual when all chapter URLs are absolute`() {
        val response = """{"results":[{"operation":"chapters","status":"success","chapters":[{"url":"https://example.test/chapter/1"},{"url":"https://example.test/chapter/2"}]}]}"""

        val result = ProbeValidationPolicy.evaluateChapterUrls(response)

        assertEquals(CheckStatus.UNUSUAL, result.status)
        assertEquals("All 2 chapter URLs are absolute", result.details)
    }

    @Test
    fun `fails when chapter URLs are blank`() {
        val response = """{"results":[{"operation":"chapters","status":"success","chapters":[{"url":"/chapter/1"},{"url":" "},{"url":null}]}]}"""

        val result = ProbeValidationPolicy.evaluateChapterUrls(response)

        assertEquals(CheckStatus.FAIL, result.status)
        assertEquals("Blank chapter URLs at offsets: 1, 2", result.details)
    }

    @Test
    fun `accepts chapter URL fragments`() {
        val response = """{"results":[{"operation":"chapters","status":"success","chapters":[{"url":"/episodes/0fff407d79a1a##LOGIN"}]}]}"""

        val result = ProbeValidationPolicy.evaluateChapterUrls(response)

        assertEquals(CheckStatus.PASS, result.status)
    }

    @Test
    fun `rejects malformed chapter URLs without exposing their values`() {
        val cases = listOf(
            "/with\u0001control" to "contains control characters",
            "/bad%2Gescape" to "has malformed percent escape",
            "file:///private/chapter" to "uses unsupported file scheme",
        )

        cases.forEach { (url, issue) ->
            val response = """{"results":[{"operation":"chapters","status":"success","chapters":[{"url":"${url.replace("\u0001", "\\u0001")}"}]}]}"""
            val result = ProbeValidationPolicy.evaluateChapterUrls(response)

            assertEquals(CheckStatus.FAIL, result.status, issue)
            assertEquals("Malformed chapter URLs: offset 0: $issue", result.details, issue)
        }
    }

    @Test
    fun `allows URL references and opaque composite chapter identifiers`() {
        val identifiers = listOf(
            "/chapter/title with spaces",
            "3266/title with spaces/119#158354",
            "chapter-title:-part-one#123",
            "chapter-a|42",
        )

        identifiers.forEach { identifier ->
            val response = """{"results":[{"operation":"chapters","status":"success","chapters":[{"url":"$identifier"}]}]}"""
            val result = ProbeValidationPolicy.evaluateChapterUrls(response, RedactionMode.NONE)

            assertEquals(CheckStatus.PASS, result.status, identifier)
        }
    }

    @Test
    fun `fails when chapter URLs are duplicated`() {
        val response = """{"results":[{"operation":"chapters","status":"success","chapters":[{"url":"/chapter/1"},{"url":"/chapter/2"},{"url":"/chapter/1"}]}]}"""

        val result = ProbeValidationPolicy.evaluateDuplicateChapterUrls(response)

        assertEquals(CheckStatus.FAIL, result.status)
        assertEquals("Duplicate chapter URLs: `/<redacted>/1` at offsets 0, 2", result.details)
    }

    @Test
    fun `fails when page indices are missing`() {
        val response = """{"results":[{"operation":"pages","status":"success","pages":[{"index":0},{"index":4},{"index":null}]}]}"""

        val result = ProbeValidationPolicy.evaluatePageIndices(response)

        assertEquals(CheckStatus.FAIL, result.status)
        assertEquals("Page indices must start at 0 and increase by 1. Page 2 uses index 4. Page 3 uses index null.", result.details)
    }

    @Test
    fun `lints when page indices differ but preserve list order`() {
        val response = """{"results":[{"operation":"pages","status":"success","pages":[{"index":1},{"index":2},{"index":3}]}]}"""

        val result = ProbeValidationPolicy.evaluatePageIndices(response)

        assertEquals(CheckStatus.LINT, result.status)
        assertEquals("Page indices are 1-indexed, but should be 0-indexed", result.details)
    }

    @Test
    fun `describes a constant page index offset`() {
        val response = """{"results":[{"operation":"pages","status":"success","pages":[{"index":2},{"index":3},{"index":4}]}]}"""

        val result = ProbeValidationPolicy.evaluatePageIndices(response)

        assertEquals(CheckStatus.LINT, result.status)
        assertEquals("Each page index is 2 greater than its 0-based list position", result.details)
    }

    @Test
    fun `fails when sorting by page index changes list order`() {
        val response = """{"results":[{"operation":"pages","status":"success","pages":[{"index":0},{"index":2},{"index":1}]}]}"""

        val result = ProbeValidationPolicy.evaluatePageIndices(response)

        assertEquals(CheckStatus.FAIL, result.status)
        assertEquals("Page indices must start at 0 and increase by 1. Page 2 uses index 2. Page 3 uses index 1.", result.details)
    }

    @Test
    fun `describes page indices in reverse order`() {
        val response = """{"results":[{"operation":"pages","status":"success","pages":[{"index":3},{"index":2},{"index":1},{"index":0}]}]}"""

        val result = ProbeValidationPolicy.evaluatePageIndices(response)

        assertEquals(CheckStatus.FAIL, result.status)
        assertEquals("Page indices are in reverse order", result.details)
    }

    @Test
    fun `groups repeated page indices`() {
        val response = """{"results":[{"operation":"pages","status":"success","pages":[{"index":0},{"index":1},{"index":0},{"index":1},{"index":0},{"index":1},{"index":0},{"index":1}]}]}"""

        val result = ProbeValidationPolicy.evaluatePageIndices(response)

        assertEquals(CheckStatus.FAIL, result.status)
        assertEquals("Page indices must start at 0 and increase by 1. Odd-numbered pages 3 through 7 use index 0. Even-numbered pages 4 through 8 use index 1.", result.details)
    }

    @Test
    fun `passes when page indices match list offsets`() {
        val response = """{"results":[{"operation":"pages","status":"success","pages":[{"index":0},{"index":1}]}]}"""

        assertEquals(CheckStatus.PASS, ProbeValidationPolicy.evaluatePageIndices(response).status)
    }

    @Test
    fun `passes when page URLs are valid and unique`() {
        val response = """{"results":[{"operation":"pages","status":"success","pages":[{"imageUrl":"https://example.test/1.jpg"},{"url":"https://example.test/2.jpg"}]}]}"""
        val pageUrls = ProbeValidationPolicy.evaluatePageUrls(response)
        val duplicates = ProbeValidationPolicy.evaluateDuplicatePageUrls(response)

        assertEquals(CheckStatus.PASS, pageUrls.status)
        assertEquals("2 HTTP page URLs", pageUrls.details)
        assertEquals(CheckStatus.PASS, duplicates.status)
        assertEquals("", duplicates.details)
    }

    @Test
    fun `allows interceptor metadata in page URL fragments`() {
        val response = """{"results":[{"operation":"pages","status":"success","pages":[{"imageUrl":"https://example.test/1.jpg#scramble=[3, 1, 2, 0]"}],"firstPageImage":{"contentType":"image/jpeg","byteSize":123,"width":100,"height":200}}]}"""

        assertEquals(CheckStatus.PASS, ProbeValidationPolicy.evaluatePageUrls(response).status)
        val pageLoad = ProbeValidationPolicy.evaluatePageLoad(response)
        assertEquals(CheckStatus.PASS, pageLoad.status)
        assertEquals("`https://example.test/<redacted>/1.jpg` (image/jpeg, 123 bytes, 100x200)", pageLoad.details)
        assertEquals(
            "`https://example.test/1.jpg#scramble=[3, 1, 2, 0]` (image/jpeg, 123 bytes, 100x200)",
            ProbeValidationPolicy.evaluatePageLoad(response, RedactionMode.NONE).details,
        )
    }

    @Test
    fun `reports invalid page URL count pages values and kinds`() {
        val response = """{"results":[{"operation":"pages","status":"success","pages":[{"imageUrl":"https://example.test/1.jpg","url":null},{"imageUrl":null,"url":"/2.jpg"},{"imageUrl":"data:image/png;base64,abc","url":null},{"imageUrl":"","url":null}]}]}"""

        val result = ProbeValidationPolicy.evaluatePageUrls(response)

        assertEquals(CheckStatus.FAIL, result.status)
        assertEquals("3 of 4 pages have invalid URLs: page 2: url=`/<redacted>/2.jpg` (relative URL), page 3: imageUrl=`data:<redacted>` (data scheme), page 4: no nonblank URL (imageUrl=<empty>, url=<null>)", result.details)
    }

    @Test
    fun `labels protocol-relative and malformed page URLs without exposing them`() {
        val response = """{"results":[{"operation":"pages","status":"success","pages":[{"imageUrl":"//example.test/private/1.jpg?token=secret"},{"imageUrl":"https://exa mple.test/private/secret.jpg"}]}]}"""

        val result = ProbeValidationPolicy.evaluatePageUrls(response)

        assertEquals(CheckStatus.FAIL, result.status)
        assertEquals(
            "2 of 2 pages have invalid URLs: page 1: imageUrl=`https://example.test/<redacted>/1.jpg` (protocol-relative URL), page 2: imageUrl=`<malformed URL>` (malformed URL)",
            result.details,
        )
    }

    @Test
    fun `warns when effective page URLs are duplicated`() {
        val response = """{"results":[{"operation":"pages","status":"success","pages":[{"imageUrl":"https://example.test/1.jpg"},{"url":"https://example.test/2.jpg"},{"imageUrl":"https://example.test/1.jpg"}]}]}"""

        val result = ProbeValidationPolicy.evaluateDuplicatePageUrls(response)

        assertEquals(CheckStatus.UNUSUAL, result.status)
        assertEquals("Duplicate page URLs: `https://example.test/<redacted>/1.jpg` at pages 1, 3", result.details)
    }

    @Test
    fun `distinguishes empty page list from decoded page image`() {
        val emptyResponse = """{"results":[{"operation":"pages","status":"success","pages":[]}]}"""
        val misleadingContentTypeResponse = """{"results":[{"operation":"pages","status":"success","pages":[{"imageUrl":"https://example.test/1.jpg","url":null}],"firstPageImage":{"contentType":"image/png","serverContentType":"text/html","byteSize":123,"width":100,"height":200}}]}"""
        val loadedResponse = """{"results":[{"operation":"pages","status":"success","pages":[{"imageUrl":"https://example.test/1.webp","url":null}],"firstPageImage":{"contentType":"image/webp","format":"lossless","byteSize":123,"width":100,"height":200,"artifactPath":"build/reports/artifacts/example/page-1.webp"}}]}"""

        assertEquals(CheckStatus.FAIL, ProbeValidationPolicy.evaluatePageUrls(emptyResponse).status)
        assertEquals("Page list is empty (0 pages)", ProbeValidationPolicy.evaluatePageUrls(emptyResponse).details)
        assertEquals(CheckStatus.SKIP, ProbeValidationPolicy.evaluatePageLoad(emptyResponse).status)
        assertEquals("No pages to load", ProbeValidationPolicy.evaluatePageLoad(emptyResponse).details)
        val misleadingContentType = ProbeValidationPolicy.evaluatePageLoad(misleadingContentTypeResponse)
        assertEquals(CheckStatus.PASS, misleadingContentType.status)
        assertEquals(
            "`https://example.test/<redacted>/1.jpg` (image/png, 123 bytes, 100x200; server Content-Type: text/html)",
            misleadingContentType.details,
        )
        val loaded = ProbeValidationPolicy.evaluatePageLoad(loadedResponse)
        assertEquals(CheckStatus.PASS, loaded.status)
        assertEquals(
            "`https://example.test/<redacted>/1.webp` (image/webp (encoding: lossless), 123 bytes, 100x200)",
            loaded.details,
        )

        val extended = ProbeValidationPolicy.evaluatePageLoad(
            loadedResponse.replace("\"format\":\"lossless\"", "\"format\":\"extended\""),
        )
        assertEquals(
            "`https://example.test/<redacted>/1.webp` (image/webp (container: extended), 123 bytes, 100x200)",
            extended.details,
        )
    }

    @Test
    fun `warns when decoded images are implausibly small`() {
        val thumbnail = ProbeValidationPolicy.evaluateThumbnail(
            response("popular", "success", THUMBNAIL_MANGA, validImageJson(width = 16, height = 200)),
        )
        val page = ProbeValidationPolicy.evaluatePageLoad(
            """{"results":[{"operation":"pages","status":"success","pages":[{"imageUrl":"https://example.test/1.jpg"}],"firstPageImage":{"contentType":"image/jpeg","byteSize":123,"width":100,"height":16}}]}""",
        )

        assertEquals(CheckStatus.UNUSUAL, thumbnail.status)
        assertEquals(CheckStatus.UNUSUAL, page.status)
        assertTrue(thumbnail.details.endsWith("image dimensions are implausibly small"))
        assertTrue(page.details.endsWith("image dimensions are implausibly small"))
    }

    @Test
    fun `fails only thumbnails whose complete RGB range is nearly solid`() {
        listOf(0, 8).forEach { rgbChannelRange ->
            val result = ProbeValidationPolicy.evaluateThumbnail(
                response("popular", "success", THUMBNAIL_MANGA, validImageJson(rgbChannelRange = rgbChannelRange)),
            )

            assertEquals(CheckStatus.FAIL, result.status)
            assertTrue(
                result.details.endsWith(
                    "image is solid or nearly solid (pixel colors vary by at most $rgbChannelRange on the 0-255 RGB scale; fails at 8 or less)",
                ),
            )
        }

        val varied = ProbeValidationPolicy.evaluateThumbnail(
            response("popular", "success", THUMBNAIL_MANGA, validImageJson(rgbChannelRange = 9)),
        )
        assertEquals(CheckStatus.PASS, varied.status)
    }

    @Test
    fun `fails known unavailable image placeholders`() {
        val placeholder = validImageJson(
            width = 240,
            height = 240,
            sha256 = "c0ff95f9ec7fea007b8236e8efddfcc6c0dfdd56f8e4c38c8ffed8fde655d8a7",
        )
        val thumbnail = ProbeValidationPolicy.evaluateThumbnail(
            response("popular", "success", THUMBNAIL_MANGA, placeholder),
        )
        val page = ProbeValidationPolicy.evaluatePageLoad(
            """{"results":[{"operation":"pages","status":"success","pages":[{"imageUrl":"https://example.test/1.jpg"}],"firstPageImage":$placeholder}]}""",
        )

        assertEquals(CheckStatus.FAIL, thumbnail.status)
        assertEquals(CheckStatus.FAIL, page.status)
        assertTrue(thumbnail.details.endsWith("known placeholder: imgbox: Thumbnail Temporarily Unavailable"))
        assertTrue(page.details.endsWith("known placeholder: imgbox: Thumbnail Temporarily Unavailable"))
    }

    @Test
    fun `reports page operation failure separately from page URL validation`() {
        val response = """{"results":[{"operation":"pages","status":"error","exceptionClass":"java.net.UnknownHostException","message":"Unable to resolve host \"www.tooncubus-read.my.id\": No address associated with hostname","pages":[]}]}"""

        val outcome = ProbeValidationPolicy.evaluateOperationOutcome(response, "pages")
        val pageUrls = ProbeValidationPolicy.evaluatePageUrls(response)

        assertEquals(CheckStatus.ERROR, outcome.status)
        assertEquals(
            "java.net.UnknownHostException: Unable to resolve host \"www.tooncubus-read.my.id\": No address associated with hostname",
            outcome.details,
        )
        assertEquals(CheckStatus.SKIP, pageUrls.status)
        assertEquals("Unable to resolve host \"www.tooncubus-read.my.id\": No address associated with hostname", pageUrls.details)
    }

    @Test
    fun `ignores partial content from failed operations`() {
        val details = """{"results":[{"operation":"details","status":"error","message":"Details failed","chapters":[{"name":"Partial"}]}]}"""
        val pages = """{"results":[{"operation":"pages","status":"timeout","message":"Pages timed out","pages":[{"index":0,"imageUrl":"https://example.test/partial.jpg"}]}]}"""
        val chapterTitles = ProbeValidationPolicy.evaluateChapterTitles(details)
        val pageIndices = ProbeValidationPolicy.evaluatePageIndices(pages)
        val pageUrls = ProbeValidationPolicy.evaluatePageUrls(pages)

        assertEquals(CheckStatus.SKIP, chapterTitles.status)
        assertEquals("No chapters to check", chapterTitles.details)
        assertEquals(CheckStatus.SKIP, pageIndices.status)
        assertEquals("No pages to check", pageIndices.details)
        assertEquals(CheckStatus.SKIP, pageUrls.status)
        assertEquals("Pages timed out", pageUrls.details)
    }

    @Test
    fun `skips pagination comparison when page 2 fails`() {
        listOf("error" to CheckStatus.ERROR, "timeout" to CheckStatus.TIMEOUT).forEach { (status, expectedOutcome) ->
            val response = """{"results":[{"operation":"popular","status":"success","hasNextPage":true,"mangas":[{"title":"A","url":"/a"}]},{"operation":"popular_next","status":"$status","message":"Page 2 $status","mangas":[{"title":"A","url":"/a"}]}]}"""

            val outcome = ProbeValidationPolicy.evaluateOperationOutcome(response, "popular_next")
            val pagination = ProbeValidationPolicy.evaluatePagination(response, "popular")

            assertEquals(expectedOutcome, outcome.status, status)
            assertEquals(CheckStatus.SKIP, pagination.status, status)
            assertEquals("Page 2 $status", pagination.details, status)
        }
    }

    @Test
    fun `skips page URLs when no chapter is available`() {
        val response = """{"results":[{"operation":"pages","status":"skipped","message":"No usable chapter was available","pages":[]}]}"""

        val result = ProbeValidationPolicy.evaluatePageUrls(response)

        assertEquals(CheckStatus.SKIP, result.status)
        assertEquals(
            "No usable chapter was available",
            result.details,
        )
    }

    @Test
    fun `requires a non-empty popular listing`() {
        val empty = ProbeValidationPolicy.evaluatePopular(response("popular", "success", "[]"))
        assertEquals(CheckStatus.FAIL, empty.status)
        assertEquals("0 entries", empty.details)
        assertEquals(CheckStatus.PASS, ProbeValidationPolicy.evaluatePopular(response("popular", "success", "[{}]")).status)
    }

    @Test
    fun `requires a non-empty latest listing or unsupported skip`() {
        val empty = ProbeValidationPolicy.evaluateLatest(response("latest", "success", "[]"))
        val unsupported = ProbeValidationPolicy.evaluateLatest(
            """{"results":[{"operation":"latest","status":"skipped","message":"supportsLatest = false","mangas":[]}]}""",
        )
        assertEquals(CheckStatus.FAIL, empty.status)
        assertEquals("0 entries", empty.details)
        assertEquals(CheckStatus.PASS, ProbeValidationPolicy.evaluateLatest(response("latest", "success", "[{}]")).status)
        assertEquals(CheckStatus.SKIP, unsupported.status)
        assertEquals("supportsLatest = false", unsupported.details)
    }

    @Test
    fun `requires search results to contain the queried manga`() {
        val selected = """"selectedManga":{"operation":"popular","offset":0,"title":"Popular Manga","url":"/popular"},"""
        val empty = ProbeValidationPolicy.evaluateSearch(response("search", "success", "[]").replace("\"results\"", "$selected\"results\""))
        assertEquals(CheckStatus.FAIL, empty.status)
        assertEquals("0 entries", empty.details)
        val urlMatching = """{$selected"results":[{"operation":"search","status":"success","mangas":[{"title":"Renamed Manga","url":"/popular"}]}]}"""
        val titleMatching = """{$selected"results":[{"operation":"search","status":"success","mangas":[{"title":"Popular Manga","url":"/canonical"}]}]}"""
        val missingMangas = (1..59).joinToString(",") { """{"title":"Other Manga $it","url":"/other-$it"}""" }
        val missing = """{$selected"results":[{"operation":"search","status":"success","mangas":[$missingMangas]}]}"""

        val urlResult = ProbeValidationPolicy.evaluateSearch(urlMatching)
        val titleResult = ProbeValidationPolicy.evaluateSearch(titleMatching)
        val missingResult = ProbeValidationPolicy.evaluateSearch(missing)
        assertEquals(CheckStatus.PASS, urlResult.status)
        assertEquals("Matched selected manga by URL at result offset 0: title=Renamed Manga, URL=`/<redacted>/popular`", urlResult.details)
        assertEquals(CheckStatus.LINT, titleResult.status)
        assertEquals(
            "Matched selected manga by title at result offset 0: title=Popular Manga, URL=`/<redacted>/canonical`",
            titleResult.details,
        )
        assertEquals(CheckStatus.FAIL, missingResult.status)
        assertEquals("No search result matched the selected manga URL or exact title; search result count: 59", missingResult.details)
    }

    @Test
    fun `separates an omitted listing outcome from its content check`() {
        val response = response("popular", "error", "[]")
        val outcome = ProbeValidationPolicy.evaluateOperationOutcome(response, "latest")
        val listing = ProbeValidationPolicy.evaluateLatest(response)

        assertEquals(CheckStatus.ERROR, outcome.status)
        assertEquals("latest result was not returned", outcome.details)
        assertEquals(CheckStatus.SKIP, listing.status)
        assertEquals("latest result was not returned", listing.details)
    }

    @Test
    fun `compares details identity with selected manga provenance`() {
        val preserved = """{"selectedManga":{"operation":"popular","offset":0,"title":"Manga","url":"/manga"},"results":[{"operation":"details","status":"success","mangas":[{"title":"Manga","url":"/manga"}]}]}"""
        val changedTitle = preserved.replace(
            "\"title\":\"Manga\",\"url\":\"/manga\"}]",
            "\"title\":\"Canonical Manga\",\"url\":\"/manga\"}]",
        )
        val changedUrl = preserved.replace("\"url\":\"/manga\"}]", "\"url\":\"/canonical\"}]")
        val changedBoth = changedTitle.replace("\"url\":\"/manga\"}]", "\"url\":\"/canonical\"}]")

        assertEquals(CheckStatus.PASS, ProbeValidationPolicy.evaluateDetailsIdentity(preserved).status)
        assertEquals(CheckStatus.UNUSUAL, ProbeValidationPolicy.evaluateDetailsIdentity(changedTitle).status)
        assertEquals(CheckStatus.UNUSUAL, ProbeValidationPolicy.evaluateDetailsIdentity(changedUrl).status)
        assertEquals(CheckStatus.UNUSUAL, ProbeValidationPolicy.evaluateDetailsIdentity(changedBoth).status)
        assertEquals(CheckStatus.SKIP, ProbeValidationPolicy.evaluateDetailsIdentity("""{"results":[]}""").status)
    }

    @Test
    fun `requires details thumbnail URLs to be absolute HTTP URLs when provided`() {
        fun evaluate(value: String) = ProbeValidationPolicy.evaluateDetailsThumbnail(
            """{"results":[{"operation":"details","status":"success","mangas":[{"thumbnailUrl":$value}]}]}""",
        )

        val cases = listOf(
            "null" to (CheckStatus.PASS to "null"),
            "\" \"" to (CheckStatus.LINT to "Thumbnail URL is blank; use null when unknown"),
            "\"\"" to (CheckStatus.LINT to "Thumbnail URL is empty; use null when unknown"),
            "\"not a url\"" to (CheckStatus.FAIL to "Thumbnail URL `<malformed URL>` is not an absolute HTTP(S) URL (malformed URL)"),
            "\"/cover.jpg\"" to (CheckStatus.FAIL to "Thumbnail URL `/<redacted>/cover.jpg` is not an absolute HTTP(S) URL (relative URL)"),
            "\"https://example.test/cover.jpg\"" to (CheckStatus.PASS to "`https://example.test/<redacted>/cover.jpg`"),
        )
        cases.forEach { (value, expected) ->
            val result = evaluate(value)
            assertEquals(expected.first, result.status, value)
            assertEquals(expected.second, result.details, value)
        }
    }

    @Test
    fun `checks the thumbnail belonging to the selected listing entry`() {
        val response = """{"selectedManga":{"operation":"latest","offset":1},"results":[{"operation":"popular","status":"success","mangas":[{"thumbnailUrl":"https://example.test/popular.jpg"}]},{"operation":"latest","status":"success","mangas":[{"thumbnailUrl":"https://example.test/other.jpg"},{"thumbnailUrl":"https://example.test/selected.jpg"}],"thumbnailImage":${validImageJson()}}]}"""

        val result = ProbeValidationPolicy.evaluateThumbnail(response)

        assertEquals(CheckStatus.PASS, result.status)
        assertEquals("`https://example.test/<redacted>/selected.jpg` (image/jpeg, 123 bytes, 100x200)", result.details)
    }

    @Test
    fun `downloads and warns for a details thumbnail only when its URL differs`() {
        fun response(
            detailsUrl: String,
            detailsImage: String? = null,
        ) = """{"selectedManga":{"operation":"popular","offset":0},"results":[{"operation":"popular","status":"success","mangas":[{"thumbnailUrl":"https://example.test/listing.jpg"}]},{"operation":"details","status":"success","mangas":[{"thumbnailUrl":"$detailsUrl"}]${detailsImage?.let { ",\"thumbnailImage\":$it" }.orEmpty()}}]}"""

        val same = ProbeValidationPolicy.evaluateDetailsThumbnail(response("https://example.test/listing.jpg"))
        val changed = ProbeValidationPolicy.evaluateDetailsThumbnail(
            response("https://example.test/details.jpg", validImageJson()),
        )
        val notDownloaded = ProbeValidationPolicy.evaluateDetailsThumbnail(
            response("https://example.test/details.jpg"),
        )
        val broken = ProbeValidationPolicy.evaluateDetailsThumbnail(
            response("https://example.test/details.jpg", validImageJson(statusCode = 404)),
        )

        assertEquals(CheckStatus.PASS, same.status)
        assertEquals(CheckStatus.UNUSUAL, changed.status)
        assertEquals(
            "Differs from selected listing thumbnail; `https://example.test/<redacted>/details.jpg` (image/jpeg, 123 bytes, 100x200)",
            changed.details,
        )
        assertEquals(CheckStatus.UNUSUAL, notDownloaded.status)
        assertTrue(notDownloaded.details.endsWith("was not downloaded"))
        assertEquals(CheckStatus.FAIL, broken.status)
        assertTrue(broken.details.endsWith("returned HTTP 404"))
    }

    @Test
    fun `skips absent thumbnails and requires advertised thumbnails to load`() {
        listOf(
            ProbeValidationPolicy.evaluateThumbnail(response("popular", "success", "[{}]")),
            ProbeValidationPolicy.evaluateThumbnail(response("popular", "success", """[{"thumbnailUrl":" "}]""")),
        ).forEach { result ->
            assertEquals(CheckStatus.SKIP, result.status)
            assertEquals("No thumbnail URL to load", result.details)
        }
        val failures = listOf(
            ProbeValidationPolicy.evaluateThumbnail(response("popular", "success", THUMBNAIL_MANGA, validImageJson(statusCode = 404))) to
                "Thumbnail URL `https://example.test/<redacted>/cover` returned HTTP 404",
            ProbeValidationPolicy.evaluateThumbnail(response("popular", "success", THUMBNAIL_MANGA, validImageJson(width = null))) to
                "Thumbnail URL `https://example.test/<redacted>/cover` did not contain a decodable image (123 bytes)",
        )
        failures.forEach { (result, details) ->
            assertEquals(CheckStatus.FAIL, result.status, details)
            assertEquals(details, result.details)
        }
        val loaded = ProbeValidationPolicy.evaluateThumbnail(response("popular", "success", THUMBNAIL_MANGA, validImageJson()))
        assertEquals(CheckStatus.PASS, loaded.status)
        assertEquals("`https://example.test/<redacted>/cover` (image/jpeg, 123 bytes, 100x200)", loaded.details)
        val misleadingContentType = ProbeValidationPolicy.evaluateThumbnail(
            response("popular", "success", THUMBNAIL_MANGA, validImageJson(serverContentType = "image")),
        )
        assertEquals(CheckStatus.PASS, misleadingContentType.status)
        assertEquals(
            "`https://example.test/<redacted>/cover` (image/jpeg, 123 bytes, 100x200; server Content-Type: image)",
            misleadingContentType.details,
        )
    }

    @Test
    fun `distinguishes null blank and populated author`() {
        val nullAuthor = ProbeValidationPolicy.evaluateDetailsAuthor(response("details", "success", "[{}]"))
        val blankAuthor = ProbeValidationPolicy.evaluateDetailsAuthor(response("details", "success", """[{"author":" "}]"""))
        assertEquals(CheckStatus.PASS, nullAuthor.status)
        assertEquals("null", nullAuthor.details)
        assertEquals(CheckStatus.LINT, blankAuthor.status)
        assertEquals("Author is blank; use null when unknown", blankAuthor.details)
        assertEquals(
            CheckStatus.PASS,
            ProbeValidationPolicy.evaluateDetailsAuthor(
                response(
                    "details",
                    "success",
                    """[{"author":"Fixture Author"}]""",
                ),
            ).status,
        )
    }

    @Test
    fun `distinguishes null blank and populated artist`() {
        val nullArtist = ProbeValidationPolicy.evaluateDetailsArtist(response("details", "success", "[{}]"))
        val blankArtist = ProbeValidationPolicy.evaluateDetailsArtist(response("details", "success", """[{"artist":" "}]"""))
        assertEquals(CheckStatus.PASS, nullArtist.status)
        assertEquals("null", nullArtist.details)
        assertEquals(CheckStatus.LINT, blankArtist.status)
        assertEquals("Artist is blank; use null when unknown", blankArtist.details)
        assertEquals(
            CheckStatus.PASS,
            ProbeValidationPolicy.evaluateDetailsArtist(
                response(
                    "details",
                    "success",
                    """[{"artist":"Fixture Artist"}]""",
                ),
            ).status,
        )
    }

    @Test
    fun `distinguishes null blank and populated genres`() {
        val nullGenres = ProbeValidationPolicy.evaluateDetailsGenres(response("details", "success", "[{}]"))
        val blankGenres = ProbeValidationPolicy.evaluateDetailsGenres(response("details", "success", """[{"genre":" "}]"""))
        assertEquals(CheckStatus.PASS, nullGenres.status)
        assertEquals("null", nullGenres.details)
        assertEquals(CheckStatus.LINT, blankGenres.status)
        assertEquals("Genres is blank; use null when unknown", blankGenres.details)
        assertEquals(
            CheckStatus.PASS,
            ProbeValidationPolicy.evaluateDetailsGenres(
                response(
                    "details",
                    "success",
                    """[{"genre":"Action"}]""",
                ),
            ).status,
        )
    }

    @Test
    fun `requires details status to be recognized`() {
        val missing = ProbeValidationPolicy.evaluateDetailsStatus(response("details", "success", "[{}]"))
        val unknown = ProbeValidationPolicy.evaluateDetailsStatus(response("details", "success", """[{"status":0}]"""))
        val unrecognized = ProbeValidationPolicy.evaluateDetailsStatus(response("details", "success", """[{"status":99}]"""))
        assertEquals(CheckStatus.LINT, missing.status)
        assertEquals("Details require a recognized status", missing.details)
        assertEquals(CheckStatus.LINT, unknown.status)
        assertEquals("UNKNOWN (0); use a concrete status when known", unknown.details)
        assertEquals(CheckStatus.FAIL, unrecognized.status)
        assertEquals("Unrecognized status: 99", unrecognized.details)
        val ongoing = ProbeValidationPolicy.evaluateDetailsStatus(response("details", "success", """[{"status":1}]"""))
        assertEquals(CheckStatus.PASS, ongoing.status)
        assertEquals("ONGOING (1)", ongoing.details)
    }

    private fun response(
        operation: String,
        status: String,
        mangas: String,
        thumbnailImage: String? = null,
    ) = """{"results":[{"operation":"$operation","status":"$status","mangas":$mangas${thumbnailImage?.let { ",\"thumbnailImage\":$it" }.orEmpty()}}]}"""

    private fun validImageJson(
        contentType: String = "image/jpeg",
        serverContentType: String? = null,
        width: Int? = 100,
        height: Int? = 200,
        rgbChannelRange: Int? = null,
        statusCode: Int? = null,
        sha256: String? = null,
    ) = """{"contentType":"$contentType"${serverContentType?.let { ",\"serverContentType\":\"$it\"" }.orEmpty()},"byteSize":123,"width":$width,"height":$height,"rgbChannelRange":$rgbChannelRange,"statusCode":$statusCode,"sha256":${sha256?.let { "\"$it\"" }}}"""

    private fun validImage(
        contentType: String? = "image/jpeg",
        width: Int? = 100,
        height: Int? = 200,
        statusCode: Int? = null,
    ) = ImageEvidence(contentType, 123, width, height, statusCode = statusCode)

    private companion object {
        const val THUMBNAIL_MANGA = "[{\"thumbnailUrl\":\"https://example.test/cover\"}]"
    }
}
