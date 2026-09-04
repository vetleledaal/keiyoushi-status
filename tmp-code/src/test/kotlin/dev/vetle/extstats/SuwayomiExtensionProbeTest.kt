package dev.vetle.extstats

import dev.vetle.extstats.core.CheckStatus
import dev.vetle.extstats.core.ProbeProcessResult
import dev.vetle.extstats.core.RetryDisposition
import dev.vetle.extstats.core.RetryReason
import dev.vetle.extstats.core.SuwayomiExtensionProbe
import dev.vetle.extstats.core.ValidationConfig
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import java.nio.file.Path
import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class SuwayomiExtensionProbeTest {
    @Test
    fun `classifies probe timeout and oversized output`() = runBlocking {
        val processResults = listOf(
            ProbeProcessResult.TimedOut(42) to (RetryDisposition.RETRY_NOW to RetryReason.TIMEOUT),
            ProbeProcessResult.ResponseTooLarge(1_024, 42) to
                (RetryDisposition.DO_NOT_RETRY to RetryReason.MALFORMED_OUTPUT),
        )

        processResults.forEach { (processResult, expected) ->
            val probe = SuwayomiExtensionProbe(
                name = "fixture",
                prepareJar = { Path.of("fixture.jar") },
                runProcess = { _, _, _ -> processResult },
            )

            val result = probe.validate(
                ValidationConfig("fixture", "https://example.test/fixture.jar", Path.of("report.md")),
            ).checks.single()

            assertEquals(expected.first, result.retryAdvice.disposition)
            assertEquals(expected.second, result.retryAdvice.reason)
        }
    }

    @Test
    fun `reports child JVM out of memory error`() = runBlocking {
        val probe = SuwayomiExtensionProbe(
            name = "fixture",
            prepareJar = { Path.of("fixture.jar") },
            runProcess = { _, _, _ ->
                ProbeProcessResult.Error(
                    response = "",
                    stderr = "Exception in thread \"main\" java.lang.OutOfMemoryError: Java heap space\n\tat fixture.Main.main(Main.kt:1)",
                    exitCode = 1,
                    elapsedTimeMillis = 12,
                )
            },
        )

        val result =
            probe.validate(
                ValidationConfig(
                    "fixture",
                    "https://example.test/fixture.jar",
                    Path.of("report.md"),
                ),
            )

        assertEquals(CheckStatus.ERROR, result.checks.single().status)
        assertEquals(
            "Exception in thread \"main\" java.lang.OutOfMemoryError: Java heap space; Probe process exited with code 1",
            result.checks.single().details,
        )
        assertTrue(result.checks.single().blocksBuild)
    }

    @Test
    fun `runs all operations and evaluates the structured response`() = runBlocking {
        val jar = Path.of("fixture.jar")
        var request = ""
        var deadlineMillis = 0L
        val probe = SuwayomiExtensionProbe(
            name = "fixture",
            prepareJar = { jar },
            runProcess = { input, deadline, _ ->
                request = input
                deadlineMillis = deadline
                ProbeProcessResult.Completed(RESPONSE, 12)
            },
        )

        val result = probe.validate(
            ValidationConfig(
                "fixture",
                "https://example.test/fixture.jar",
                Path.of("report.md"),
                sourceId = 42L,
                timeoutMillis = 42_000L,
            ),
        )

        val parsedRequest = Json.parseToJsonElement(request).jsonObject
        assertEquals(jar.toString(), parsedRequest.getValue("jarPath").jsonPrimitive.content)
        assertEquals("./artifacts/fixture", parsedRequest.getValue("artifactDirectory").jsonPrimitive.content)
        assertEquals("42", parsedRequest.getValue("sourceId").jsonPrimitive.content)
        assertEquals("0", parsedRequest.getValue("chapterOffsetFromOldest").jsonPrimitive.content)
        assertEquals(42_000L, deadlineMillis)
        assertEquals(
            listOf("popular", "popular_next", "latest", "latest_next", "search", "details", "chapters", "pages"),
            parsedRequest.getValue("operations").jsonArray.map { it.jsonPrimitive.content },
        )
        val expectedCheckNames = listOf(
            "popular operation",
            "popular_next operation",
            "latest operation",
            "latest_next operation",
            "search operation",
            "details operation",
            "chapters operation",
            "pages operation",
            "popular listing",
            "latest listing",
            "search listing",
            "latest differs from popular",
            "popular pagination",
            "latest pagination",
            "listing duplicates",
            "manga title and URL",
            "thumbnail URLs",
            "duplicate thumbnail URLs",
            "thumbnail",
            "details identity",
            "details thumbnail URL",
            "details author",
            "details artist",
            "details genres",
            "details status",
            "details description",
            "metadata trimming",
            "chapters",
            "chapter dates",
            "chapter titles",
            "chapter URLs",
            "duplicate chapter URLs",
            "page indices",
            "page URLs",
            "duplicate page URLs",
            "page load",
        )
        assertEquals(expectedCheckNames, result.checks.map { it.name })
        assertEquals(List(expectedCheckNames.size) { CheckStatus.PASS }, result.checks.map { it.status })
        assertEquals("keiyoushi.source.Generated", result.evidence?.entryPointClass)
        assertEquals("Fixture", result.evidence?.sourceName)
        assertEquals("en", result.evidence?.sourceLanguage)
        assertEquals("popular", result.evidence?.selectedManga?.operation)
        assertEquals(0, result.evidence?.selectedManga?.offset)
        assertEquals("Chapter 1", result.evidence?.operations?.get(6)?.selectedTitle)
        assertEquals("/chapter", result.evidence?.operations?.get(6)?.selectedUrl)
        assertEquals(2, result.evidence?.operations?.last()?.entryCount)
    }

    @Test
    fun `preserves URL classifications until report publication`() = runBlocking {
        val signedUrl = "https://images.example.test/page.jpg?X-Amz-Credential=AWS-CANARY&X-Amz-Signature=SIGNATURE-CANARY"
        val loopbackUrl = "http://127.0.0.1/LOCAL-PATH-CANARY"
        val response = RESPONSE
            .replace("https://example.test/page.jpg", signedUrl)
            .replace("https://example.test/cover", loopbackUrl)
        val probe = SuwayomiExtensionProbe(
            name = "fixture",
            prepareJar = { Path.of("fixture.jar") },
            runProcess = { _, _, _ -> ProbeProcessResult.Completed(response, 12) },
        )

        val result = probe.validate(ValidationConfig("fixture", "https://example.test/fixture.jar", Path.of("report.md")))
        val validationResult = dev.vetle.extstats.core.ValidationResult("fixture", result.checks, result.evidence)
        val report = dev.vetle.extstats.core.MarkdownReportWriter().write(validationResult)

        assertContains(report, "https://images.example.test/.../page.jpg")
        assertContains(report, "workstation or local network")
        assertTrue(listOf("AWS-CANARY", "SIGNATURE-CANARY", "LOCAL-PATH-CANARY").none(report::contains))
    }

    @Test
    fun `labels extension lib 1_4 operations with legacy methods`() = runBlocking {
        val probe = SuwayomiExtensionProbe(
            name = "fixture",
            prepareJar = { Path.of("fixture.jar") },
            runProcess = { _, _, _ -> ProbeProcessResult.Completed(RESPONSE.replace("1.6", "1.4"), 12) },
        )

        val result = probe.validate(ValidationConfig("fixture", "https://example.test/fixture.jar", Path.of("report.md")))

        assertEquals("fetchPopularManga(1)", result.evidence?.operations?.first()?.method)
        assertEquals("fetchMangaDetails(manga)", result.evidence?.operations?.get(5)?.method)
        assertEquals("fetchChapterList(manga)", result.evidence?.operations?.get(6)?.method)
    }

    @Test
    fun `preserves operation exception messages in report evidence`() = runBlocking {
        val response = RESPONSE.replace(
            "\"operation\":\"pages\",\"status\":\"success\",\"exceptionClass\":null",
            "\"operation\":\"pages\",\"status\":\"error\",\"exceptionClass\":\"java.net.UnknownHostException\",\"message\":\"Unable to resolve host \\\"www.tooncubus-read.my.id\\\": No address associated with hostname\"",
        )
        val probe = SuwayomiExtensionProbe(
            name = "fixture",
            prepareJar = { Path.of("fixture.jar") },
            runProcess = { _, _, _ -> ProbeProcessResult.Completed(response, 12) },
        )

        val result = probe.validate(ValidationConfig("fixture", "https://example.test/fixture.jar", Path.of("report.md")))

        val pages = result.evidence?.operations?.last()
        assertEquals("java.net.UnknownHostException", pages?.exceptionClass)
        assertEquals("Unable to resolve host \"www.tooncubus-read.my.id\": No address associated with hostname", pages?.exceptionMessage)
    }

    @Test
    fun `targeted response mutations change only responsible check statuses`() = runBlocking {
        val baseline = validate(RESPONSE)
        val listingMutations = listOf(
            MutationCase(
                "popular page 2 error",
                mutate(
                    RESPONSE,
                    "\"operation\":\"popular_next\",\"status\":\"success\"",
                    "\"operation\":\"popular_next\",\"status\":\"error\"",
                ),
                mapOf("popular_next operation" to CheckStatus.ERROR, "popular pagination" to CheckStatus.SKIP),
            ),
            MutationCase(
                "popular page 2 timeout",
                mutate(
                    RESPONSE,
                    "\"operation\":\"popular_next\",\"status\":\"success\"",
                    "\"operation\":\"popular_next\",\"status\":\"timeout\"",
                ),
                mapOf("popular_next operation" to CheckStatus.TIMEOUT, "popular pagination" to CheckStatus.SKIP),
            ),
            MutationCase(
                "advertised empty popular page 2",
                mutate(
                    RESPONSE,
                    "\"mangas\":[{\"title\":\"Fixture 2\",\"url\":\"/fixture-2\",\"thumbnailUrl\":\"https://example.test/cover-2\"}]",
                    "\"mangas\":[]",
                ),
                mapOf("popular pagination" to CheckStatus.FAIL),
            ),
            MutationCase(
                "duplicate popular URL under a changed title",
                mutate(
                    RESPONSE,
                    "\"mangas\":[{\"title\":\"Fixture\",\"url\":\"/fixture\",\"thumbnailUrl\":\"https://example.test/cover\"}]",
                    "\"mangas\":[{\"title\":\"Fixture\",\"url\":\"/fixture\",\"thumbnailUrl\":\"https://example.test/cover\"},{\"title\":\"Renamed Fixture\",\"url\":\"/fixture\",\"thumbnailUrl\":\"https://example.test/renamed-cover\"}]",
                ),
                mapOf("listing duplicates" to CheckStatus.FAIL),
            ),
            MutationCase(
                "partial popular pagination repetition by URL",
                mutate(
                    RESPONSE,
                    "\"mangas\":[{\"title\":\"Fixture 2\",\"url\":\"/fixture-2\",\"thumbnailUrl\":\"https://example.test/cover-2\"}]",
                    "\"mangas\":[{\"title\":\"Renamed Fixture\",\"url\":\"/fixture\",\"thumbnailUrl\":\"https://example.test/renamed-cover\"},{\"title\":\"Fixture 2\",\"url\":\"/fixture-2\",\"thumbnailUrl\":\"https://example.test/cover-2\"}]",
                ),
                mapOf("popular pagination" to CheckStatus.UNUSUAL),
            ),
            MutationCase(
                "complete popular pagination repetition by URL",
                mutate(RESPONSE, "\"title\":\"Fixture 2\",\"url\":\"/fixture-2\"", "\"title\":\"Renamed Fixture\",\"url\":\"/fixture\""),
                mapOf("popular pagination" to CheckStatus.FAIL),
            ),
            MutationCase(
                "search URL match with changed title",
                mutateSearchManga(RESPONSE, title = "Renamed Fixture"),
                emptyMap(),
            ),
            MutationCase(
                "search title-only match",
                mutateSearchManga(RESPONSE, url = "/canonical", thumbnailUrl = "https://example.test/canonical-cover"),
                mapOf("search listing" to CheckStatus.LINT),
            ),
            MutationCase(
                "complete search miss",
                mutateSearchManga(
                    RESPONSE,
                    title = "Other",
                    url = "/other",
                    thumbnailUrl = "https://example.test/other-cover",
                ),
                mapOf("search listing" to CheckStatus.FAIL),
            ),
        )
        val mangaMetadataMutations = listOf(
            MutationCase(
                "manga URL with whitespace",
                mutate(RESPONSE, "\"url\":\"/fixture\"", "\"url\":\"/with space\""),
                emptyMap(),
            ),
            MutationCase(
                "manga URL with control character",
                mutate(RESPONSE, "\"url\":\"/fixture\"", "\"url\":\"/with\\u0001control\""),
                mapOf("manga title and URL" to CheckStatus.FAIL),
            ),
            MutationCase(
                "manga URL with malformed percent escape",
                mutate(RESPONSE, "\"url\":\"/fixture\"", "\"url\":\"/bad%2Gescape\""),
                mapOf("manga title and URL" to CheckStatus.FAIL),
            ),
            MutationCase(
                "manga URL with unsupported scheme",
                mutate(RESPONSE, "\"url\":\"/fixture\"", "\"url\":\"ftp://example.test/private\""),
                mapOf("manga title and URL" to CheckStatus.FAIL),
            ),
        )
        val detailsMutations = listOf(
            MutationCase(
                "details changed identity",
                mutateManga(RESPONSE, "details", url = "/canonical"),
                mapOf("details identity" to CheckStatus.UNUSUAL),
            ),
        )
        val chapterMutations = listOf(
            MutationCase(
                "blank chapter URL",
                mutate(RESPONSE, "\"url\":\"/chapter-2\"", "\"url\":\" \""),
                mapOf("chapter URLs" to CheckStatus.FAIL),
            ),
            MutationCase(
                "chapter URL with whitespace",
                mutate(RESPONSE, "\"url\":\"/chapter-2\"", "\"url\":\"/with space\""),
                emptyMap(),
            ),
            MutationCase(
                "chapter URL with control character",
                mutate(RESPONSE, "\"url\":\"/chapter-2\"", "\"url\":\"/with\\u0001control\""),
                mapOf("chapter URLs" to CheckStatus.FAIL),
            ),
            MutationCase(
                "chapter URL with malformed percent escape",
                mutate(RESPONSE, "\"url\":\"/chapter-2\"", "\"url\":\"/bad%2Gescape\""),
                mapOf("chapter URLs" to CheckStatus.FAIL),
            ),
            MutationCase(
                "chapter URL with unsupported scheme",
                mutate(RESPONSE, "\"url\":\"/chapter-2\"", "\"url\":\"file:///private/chapter\""),
                mapOf("chapter URLs" to CheckStatus.FAIL),
            ),
            MutationCase(
                "all chapter URLs unusable",
                mutateOperation(
                    mutate(
                        mutate(
                            mutate(
                                RESPONSE,
                                "\"url\":\"/chapter\"",
                                "\"url\":\"file:///private/chapter\"",
                            ),
                            "\"url\":\"/chapter-2\"",
                            "\"url\":\"/chapter has space\"",
                        ),
                        "\"operation\":\"pages\",\"status\":\"success\",\"exceptionClass\":null",
                        "\"operation\":\"pages\",\"status\":\"skipped\",\"exceptionClass\":null,\"message\":\"No usable chapter was available\"",
                    ),
                    "pages",
                    mapOf("pages" to JsonArray(emptyList())),
                ),
                mapOf(
                    "pages operation" to CheckStatus.FAIL,
                    "chapter URLs" to CheckStatus.FAIL,
                    "page indices" to CheckStatus.SKIP,
                    "page URLs" to CheckStatus.SKIP,
                    "duplicate page URLs" to CheckStatus.SKIP,
                    "page load" to CheckStatus.SKIP,
                ),
            ),
            MutationCase(
                "duplicate chapter URL",
                mutate(RESPONSE, "\"url\":\"/chapter-2\"", "\"url\":\"/chapter\""),
                mapOf("duplicate chapter URLs" to CheckStatus.FAIL),
            ),
        )
        val pageMutations = listOf(
            MutationCase(
                "blank page URL",
                mutatePage(RESPONSE, 1, " "),
                mapOf("page URLs" to CheckStatus.FAIL),
            ),
            MutationCase(
                "duplicate page URL",
                mutatePage(RESPONSE, 1, "https://example.test/page.jpg"),
                mapOf("duplicate page URLs" to CheckStatus.UNUSUAL),
            ),
        )
        val imageMutations = listOf(
            MutationCase(
                "small thumbnail width",
                mutate(RESPONSE, "\"width\":100,\"height\":200,\"statusCode\":200", "\"width\":16,\"height\":200,\"statusCode\":200"),
                mapOf("thumbnail" to CheckStatus.UNUSUAL),
            ),
            MutationCase(
                "small page image height",
                mutate(
                    RESPONSE,
                    "\"width\":100,\"height\":200,\"exceptionClass\":null",
                    "\"width\":100,\"height\":16,\"exceptionClass\":null",
                ),
                mapOf("page load" to CheckStatus.UNUSUAL),
            ),
        )
        val cases = listingMutations + mangaMetadataMutations + detailsMutations + chapterMutations + pageMutations + imageMutations
        val coveredCheckNames = baseline.filterValues { it == CheckStatus.PASS }.keys +
            cases.flatMap { it.expectedChanges.keys }

        assertEquals(baseline.keys, coveredCheckNames, "Every registered check must pass the baseline or have a mutation expectation")

        cases.forEach { case ->
            val mutated = validate(case.response)
            val changedStatuses = mutated.filter { (name, status) -> baseline.getValue(name) != status }

            assertEquals(case.expectedChanges, changedStatuses, case.name)
        }
    }

    private suspend fun validate(response: String): Map<String, CheckStatus> {
        val probe = SuwayomiExtensionProbe(
            name = "fixture",
            prepareJar = { Path.of("fixture.jar") },
            runProcess = { _, _, _ -> ProbeProcessResult.Completed(response, 12) },
        )
        return probe.validate(ValidationConfig("fixture", "https://example.test/fixture.jar", Path.of("report.md")))
            .checks
            .associate { it.name to it.status }
    }

    private fun mutate(response: String, oldValue: String, newValue: String): String {
        check(oldValue in response) { "Mutation target not found: $oldValue" }
        return response.replace(oldValue, newValue)
    }

    private fun mutateSearchManga(
        response: String,
        title: String? = null,
        url: String? = null,
        thumbnailUrl: String? = null,
    ): String = mutateManga(response, "search", title, url, thumbnailUrl)

    private fun mutateManga(
        response: String,
        operation: String,
        title: String? = null,
        url: String? = null,
        thumbnailUrl: String? = null,
    ): String {
        val root = Json.parseToJsonElement(response).jsonObject
        val results = root.getValue("results").jsonArray.map { resultElement ->
            val result = resultElement.jsonObject
            if (result["operation"]?.jsonPrimitive?.content != operation) return@map resultElement
            val mangas = result.getValue("mangas").jsonArray
            val manga = mangas.first().jsonObject.toMutableMap().apply {
                title?.let { this["title"] = JsonPrimitive(it) }
                url?.let { this["url"] = JsonPrimitive(it) }
                thumbnailUrl?.let { this["thumbnailUrl"] = JsonPrimitive(it) }
            }
            JsonObject(result + ("mangas" to JsonArray(listOf(JsonObject(manga)))))
        }
        return JsonObject(root + ("results" to JsonArray(results))).toString()
    }

    private fun mutateOperation(response: String, operation: String, changes: Map<String, kotlinx.serialization.json.JsonElement>): String {
        val root = Json.parseToJsonElement(response).jsonObject
        val results = root.getValue("results").jsonArray.map { resultElement ->
            val result = resultElement.jsonObject
            if (result["operation"]?.jsonPrimitive?.content == operation) JsonObject(result + changes) else resultElement
        }
        return JsonObject(root + ("results" to JsonArray(results))).toString()
    }

    private fun mutatePage(response: String, index: Int, url: String): String {
        val root = Json.parseToJsonElement(response).jsonObject
        val results = root.getValue("results").jsonArray.map { resultElement ->
            val result = resultElement.jsonObject
            if (result["operation"]?.jsonPrimitive?.content != "pages") return@map resultElement
            val pages = result.getValue("pages").jsonArray.map { pageElement ->
                val page = pageElement.jsonObject
                if (page["index"]?.jsonPrimitive?.content == index.toString()) {
                    JsonObject(page + mapOf("url" to JsonPrimitive(url), "imageUrl" to JsonPrimitive(url)))
                } else {
                    pageElement
                }
            }
            JsonObject(result + ("pages" to JsonArray(pages)))
        }
        return JsonObject(root + ("results" to JsonArray(results))).toString()
    }

    private data class MutationCase(
        val name: String,
        val response: String,
        val expectedChanges: Map<String, CheckStatus>,
    )

    private companion object {
        val RESPONSE = """
            {
                "metadata": {"extensionLibraryVersion":"1.6","entryPointClass":"keiyoushi.source.Generated",
                    "sourceImplementationClass":"example.FixtureSource"},
                "sources": [{"id":123,"name":"Fixture","lang":"en","supportsLatest":true}],
                "selectedManga": {"operation":"popular","offset":0,"title":"Fixture","url":"/fixture"},
                "results": [
                    {"operation":"popular","status":"success","exceptionClass":null,"elapsedTimeMillis":10,"hasNextPage":true,
                        "mangas":[{"title":"Fixture","url":"/fixture","thumbnailUrl":"https://example.test/cover"}],
                        "thumbnailImage":{"contentType":"image/jpeg","byteSize":123,"width":100,"height":200,"statusCode":200}},
                    {"operation":"popular_next","status":"success","exceptionClass":null,"elapsedTimeMillis":11,
                        "mangas":[{"title":"Fixture 2","url":"/fixture-2","thumbnailUrl":"https://example.test/cover-2"}]},
                    {"operation":"latest","status":"success","exceptionClass":null,"elapsedTimeMillis":12,"hasNextPage":true,
                        "mangas":[{"title":"Latest","url":"/latest","thumbnailUrl":"https://example.test/latest"}]},
                    {"operation":"latest_next","status":"success","exceptionClass":null,"elapsedTimeMillis":13,
                        "mangas":[{"title":"Latest 2","url":"/latest-2","thumbnailUrl":"https://example.test/latest-2"}]},
                    {"operation":"search","status":"success","exceptionClass":null,"elapsedTimeMillis":14,"searchQuery":"Fixture",
                        "mangas":[{"title":"Fixture","url":"/fixture","thumbnailUrl":"https://example.test/cover"}]},
                    {"operation":"details","status":"success","exceptionClass":null,"elapsedTimeMillis":15,"mangas":[{"title":"Fixture",
                        "url":"/fixture","thumbnailUrl":"https://example.test/cover","author":"Author","artist":"Artist",
                        "description":"Description","status":1}]},
                    {"operation":"chapters","status":"success","exceptionClass":null,"elapsedTimeMillis":0,"mangas":[],
                        "chapters":[{"url":"/chapter","name":"Chapter 1","dateUpload":1},{"url":"/chapter-2","name":"Chapter 2",
                        "dateUpload":2}],"selectedChapter":{"url":"/chapter","name":"Chapter 1"}},
                    {"operation":"pages","status":"success","exceptionClass":null,"elapsedTimeMillis":16,"mangas":[],"pages":[{"index":0,
                        "url":"https://example.test/page.jpg","imageUrl":"https://example.test/page.jpg"},{"index":1,
                        "url":"https://example.test/page-2.jpg","imageUrl":"https://example.test/page-2.jpg"}],
                        "firstPageImage":{"contentType":"image/jpeg","byteSize":123,"width":100,"height":200,"exceptionClass":null,
                        "message":null}}
                ]
            }
        """.trimIndent()
    }
}
