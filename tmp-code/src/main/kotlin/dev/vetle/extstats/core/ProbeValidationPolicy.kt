package dev.vetle.extstats.core

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.contentOrNull
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import okhttp3.HttpUrl.Companion.toHttpUrlOrNull
import java.net.URI
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

internal data class ImageEvidence(
    val contentType: String?,
    val byteSize: Int,
    val width: Int?,
    val height: Int?,
    val rgbChannelRange: Int? = null,
    val sha256: String? = null,
    val artifactPath: String? = null,
    val statusCode: Int? = null,
    val exceptionClass: String? = null,
    val message: String? = null,
    val stubbedApi: String? = null,
    val serverContentType: String? = null,
    val format: String? = null,
)

private data class MangaIdentity(val title: String?, val url: String)

private val KNOWN_PLACEHOLDER_SHA256 = mapOf(
    "c0ff95f9ec7fea007b8236e8efddfcc6c0dfdd56f8e4c38c8ffed8fde655d8a7" to
        "imgbox: Thumbnail Temporarily Unavailable",
)

internal fun formatMarkdownUrl(value: String, redact: Boolean = true): String {
    if (!redact) return "`$value`"
    val uri = runCatching { URI(value) }.getOrNull() ?: return "`<malformed URL>`"
    val scheme = uri.scheme?.lowercase()
    if (scheme != null && scheme !in setOf("http", "https", "file")) return "`$scheme:<redacted>`"

    val lastSegment = uri.path?.split('/')?.lastOrNull(String::isNotBlank)
    val displayScheme = scheme ?: "https"
    val formatted = when {
        uri.host != null && lastSegment != null -> "$displayScheme://${uri.host}/<redacted>/$lastSegment"
        uri.host != null -> "$displayScheme://${uri.host}"
        scheme == "file" && lastSegment != null -> "file:///<redacted>/$lastSegment"
        scheme == "file" -> "file:<redacted>"
        scheme in setOf("http", "https") -> "$scheme://<invalid URL>"
        lastSegment != null -> "/<redacted>/$lastSegment"
        else -> "<redacted URL>"
    }
    return "`$formatted`"
}

internal object ProbeValidationPolicy {
    fun evaluateOperationOutcome(response: String, operation: String): CheckResult {
        val name = "$operation operation"
        val result = operationResult(response, operation)
            ?: return malformedOutput(name, "$operation result was not returned")
        val status = result["status"]?.jsonPrimitive?.contentOrNull
            ?: return malformedOutput(name, "$operation result has no status")
        val message = result["message"]?.jsonPrimitive?.contentOrNull
        val exceptionClass = result["exceptionClass"]?.jsonPrimitive?.contentOrNull
        val statusCode = result["statusCode"]?.jsonPrimitive?.contentOrNull?.toIntOrNull()
        val host = result["host"]?.jsonPrimitive?.contentOrNull
        val retryAfter = result["retryAfter"]?.jsonPrimitive?.contentOrNull
        val failure = listOfNotNull(
            exceptionClass,
            message,
        ).joinToString(": ")

        return when (status) {
            "success" -> CheckResult(name, CheckStatus.PASS, "")
            "error" -> if (
                (exceptionClass == "java.lang.Exception" && message == "Stub!") ||
                (operation == "search" && exceptionClass == "java.lang.UnsupportedOperationException")
            ) {
                CheckResult(name, CheckStatus.SKIP, message ?: exceptionClass.orEmpty())
            } else {
                CheckResult(
                    name,
                    CheckStatus.ERROR,
                    failure.ifEmpty { "$operation operation failed" },
                    blocksBuild = isCompatibilityFailure(exceptionClass, message),
                    retryAdvice = classifyRetryAdvice(
                        exceptionClass = exceptionClass,
                        message = message,
                        statusCode = statusCode,
                        host = host,
                        retryAfter = retryAfter,
                    ),
                )
            }
            "timeout" -> CheckResult(
                name,
                CheckStatus.TIMEOUT,
                failure.ifEmpty { "$operation operation timed out" },
                retryAdvice = classifyRetryAdvice(timedOut = true),
            )
            "skipped" -> if (message in EXPECTED_OPERATION_SKIPS[operation].orEmpty()) {
                if (operation == "pages" && chapters(response).isNotEmpty()) {
                    CheckResult(name, CheckStatus.FAIL, unusableChapterDetails(response))
                } else {
                    CheckResult(name, CheckStatus.SKIP, message!!)
                }
            } else {
                malformedOutput(name, "Unexpected skip: ${message ?: "<no reason>"}")
            }
            else -> malformedOutput(name, "Unexpected operation status: $status")
        }
    }

    fun assignRetryAdvice(result: CheckResult): CheckResult = if (
        result.status == CheckStatus.FAIL && result.retryAdvice == RetryAdvice.review()
    ) {
        result.copy(retryAdvice = classifyRetryAdvice(deterministic = true))
    } else {
        result
    }

    fun probeTimeoutAdvice(): RetryAdvice = classifyRetryAdvice(timedOut = true)

    fun malformedOutputAdvice(): RetryAdvice = classifyRetryAdvice(malformed = true)

    private fun malformedOutput(name: String, details: String) = CheckResult(
        name,
        CheckStatus.ERROR,
        details,
        blocksBuild = true,
        retryAdvice = classifyRetryAdvice(malformed = true),
    )

    private fun classifyRetryAdvice(
        timedOut: Boolean = false,
        exceptionClass: String? = null,
        message: String? = null,
        statusCode: Int? = null,
        host: String? = null,
        retryAfter: String? = null,
        malformed: Boolean = false,
        deterministic: Boolean = false,
    ): RetryAdvice = when {
        timedOut || exceptionClass in TIMEOUT_FAILURE_CLASSES ->
            RetryAdvice(RetryDisposition.RETRY_NOW, RetryReason.TIMEOUT)
        exceptionClass == "java.net.ConnectException" ||
            (exceptionClass == "java.net.SocketException" && message in TEMPORARY_SOCKET_FAILURE_MESSAGES) ->
            RetryAdvice(RetryDisposition.RETRY_NOW, RetryReason.TEMPORARY_CONNECTION_FAILURE)
        statusCode == 429 && retryAfter?.takeIf(::isValidRetryAfter) != null -> RetryAdvice(
            RetryDisposition.RETRY_WHEN,
            RetryReason.RATE_LIMITED,
            RetryCondition(RetryConditionType.RETRY_TIME_REACHED, retryAfter),
        )
        exceptionClass == "java.net.UnknownHostException" && !host.isNullOrBlank() -> RetryAdvice(
            RetryDisposition.RETRY_WHEN,
            RetryReason.DNS_LOOKUP_FAILURE,
            RetryCondition(RetryConditionType.HOST_RESOLVES, host),
        )
        exceptionClass in TLS_FAILURE_CLASSES && !host.isNullOrBlank() -> RetryAdvice(
            RetryDisposition.RETRY_WHEN,
            RetryReason.TLS_FAILURE,
            RetryCondition(RetryConditionType.TLS_HANDSHAKE_SUCCEEDS, host),
        )
        statusCode in 500..599 -> RetryAdvice(RetryDisposition.RETRY_NOW, RetryReason.HTTP_SERVER_ERROR)
        isCompatibilityFailure(exceptionClass, message) -> RetryAdvice(
            RetryDisposition.RETRY_WHEN,
            RetryReason.HARNESS_COMPATIBILITY_FAILURE,
            RetryCondition(RetryConditionType.HARNESS_REVISION_CHANGES, exceptionClass.orEmpty()),
        )
        malformed -> RetryAdvice(RetryDisposition.DO_NOT_RETRY, RetryReason.MALFORMED_OUTPUT)
        deterministic -> RetryAdvice(RetryDisposition.DO_NOT_RETRY, RetryReason.DETERMINISTIC_FAILURE)
        else -> RetryAdvice.review()
    }

    private fun isValidRetryAfter(value: String): Boolean = value.toLongOrNull()?.let { it >= 0 } == true ||
        runCatching { ZonedDateTime.parse(value, DateTimeFormatter.RFC_1123_DATE_TIME) }.isSuccess

    private fun isCompatibilityFailure(
        exceptionClass: String?,
        message: String?,
    ): Boolean = exceptionClass in COMPATIBILITY_FAILURE_CLASSES ||
        (exceptionClass == "java.lang.RuntimeException" && message == "Stub!")

    fun evaluatePopular(response: String): CheckResult = evaluateListing(response, "popular")

    fun evaluateLatest(response: String): CheckResult = evaluateListing(response, "latest")

    fun evaluateSearch(response: String, redactionMode: RedactionMode = RedactionMode.URLS_AND_SENSITIVE): CheckResult {
        val redactUrls = redactionMode == RedactionMode.URLS_AND_SENSITIVE
        val listing = evaluateListing(response, "search")
        if (listing.status != CheckStatus.PASS) return listing

        val selected = selectedManga(response)
            ?: return skipped("search listing", "No selected manga provenance to compare")
        val selectedTitle = selected["title"]?.jsonPrimitive?.contentOrNull
        val selectedUrl = selected["url"]?.jsonPrimitive?.contentOrNull
        val search = operationResult(response, "search")
        val mangas = search?.get("mangas")?.jsonArray.orEmpty()
        val urlMatch = selectedUrl?.let { url ->
            mangas.indexOfFirst { it.jsonObject["url"]?.jsonPrimitive?.contentOrNull == url }
        } ?: -1
        val titleMatch = selectedTitle?.let { title ->
            mangas.indexOfFirst { it.jsonObject["title"]?.jsonPrimitive?.contentOrNull == title }
        } ?: -1
        val matchingOffset = if (urlMatch >= 0) urlMatch else titleMatch
        val matchType = if (urlMatch >= 0) "URL" else "title"
        return CheckResult(
            name = "search listing",
            status = when {
                urlMatch >= 0 -> CheckStatus.PASS
                titleMatch >= 0 -> CheckStatus.LINT
                else -> CheckStatus.FAIL
            },
            details = if (matchingOffset >= 0) {
                val manga = mangas[matchingOffset].jsonObject
                val formattedManga =
                    formatManga(
                        manga["title"]?.jsonPrimitive?.contentOrNull to manga["url"]?.jsonPrimitive?.contentOrNull,
                        redactUrls,
                    )
                "Matched selected manga by $matchType at result offset $matchingOffset: $formattedManga"
            } else {
                "No search result matched the selected manga URL or exact title; search result count: ${mangas.size}"
            },
        )
    }

    fun evaluateDetailsIdentity(response: String, redactionMode: RedactionMode = RedactionMode.URLS_AND_SENSITIVE): CheckResult {
        val redactUrls = redactionMode == RedactionMode.URLS_AND_SENSITIVE
        val selected = selectedManga(response)
        val details = operationManga(response, "details")
        val selectedUrl = selected?.get("url")?.jsonPrimitive?.contentOrNull
            ?.takeUnless(String::isBlank)
            ?: return skipped("details identity", "No selected manga URL to compare")
        val detailsUrl = details?.get("url")?.jsonPrimitive?.contentOrNull
            ?.takeUnless(String::isBlank)
            ?: return skipped("details identity", "No details manga URL to compare")
        val selectedTitle = selected["title"]?.jsonPrimitive?.contentOrNull?.takeUnless(String::isBlank)
        val detailsTitle = details["title"]?.jsonPrimitive?.contentOrNull?.takeUnless(String::isBlank)
        val titleChanged = selectedTitle != null && detailsTitle != null && selectedTitle != detailsTitle
        val urlChanged = selectedUrl != detailsUrl
        return CheckResult(
            name = "details identity",
            status = if (titleChanged || urlChanged) CheckStatus.UNUSUAL else CheckStatus.PASS,
            details = when {
                titleChanged && urlChanged ->
                    "Details changed selected title $selectedTitle to $detailsTitle and URL " +
                        "${formatMarkdownUrl(selectedUrl, redactUrls)} to ${formatMarkdownUrl(detailsUrl, redactUrls)}"
                titleChanged -> "Details changed selected title $selectedTitle to $detailsTitle"
                urlChanged ->
                    "Details changed selected URL ${formatMarkdownUrl(selectedUrl, redactUrls)} to " +
                        formatMarkdownUrl(detailsUrl, redactUrls)
                else -> {
                    "Details preserved selected URL ${formatMarkdownUrl(selectedUrl, redactUrls)}"
                }
            },
        )
    }

    fun evaluateDetailsThumbnail(
        response: String,
        redactionMode: RedactionMode = RedactionMode.URLS_AND_SENSITIVE,
    ): CheckResult {
        val redactUrls = redactionMode == RedactionMode.URLS_AND_SENSITIVE
        val manga = operationManga(response, "details")
            ?: return skipped("details thumbnail URL", "No details manga to check")
        val thumbnailUrl = manga["thumbnailUrl"]?.jsonPrimitive?.contentOrNull
        return when {
            thumbnailUrl == null -> CheckResult("details thumbnail URL", CheckStatus.PASS, "null")
            thumbnailUrl.isEmpty() -> CheckResult(
                "details thumbnail URL",
                CheckStatus.LINT,
                "Thumbnail URL is empty; use null when unknown",
            )
            thumbnailUrl.isBlank() -> CheckResult(
                "details thumbnail URL",
                CheckStatus.LINT,
                "Thumbnail URL is blank; use null when unknown",
            )
            !isHttpUrl(thumbnailUrl) -> CheckResult(
                "details thumbnail URL",
                CheckStatus.FAIL,
                "Thumbnail URL ${formatMarkdownUrl(thumbnailUrl, redactUrls)} is not an absolute HTTP(S) URL " +
                    "(${invalidUrlReason(thumbnailUrl)})",
            )
            else -> {
                val listingThumbnailUrl = selectedListing(response)
                    ?.second
                    ?.get("thumbnailUrl")
                    ?.jsonPrimitive
                    ?.contentOrNull
                if (listingThumbnailUrl == null || listingThumbnailUrl == thumbnailUrl) {
                    CheckResult("details thumbnail URL", CheckStatus.PASS, formatMarkdownUrl(thumbnailUrl, redactUrls))
                } else {
                    val evidence = operationResult(response, "details")
                        ?.get("thumbnailImage")
                        ?.jsonObject
                        ?.let(::imageEvidence)
                    evaluateThumbnailImage(
                        name = "details thumbnail URL",
                        thumbnailUrl = thumbnailUrl,
                        evidence = evidence,
                        redactUrls = redactUrls,
                        validStatus = CheckStatus.UNUSUAL,
                        missingEvidenceStatus = CheckStatus.UNUSUAL,
                        prefix = "Differs from selected listing thumbnail; ",
                    )
                }
            }
        }
    }

    fun evaluateLatestDistinct(response: String): CheckResult {
        if (operationResult(response, "latest")?.get("status")?.jsonPrimitive?.contentOrNull == "skipped") {
            return CheckResult("latest differs from popular", CheckStatus.SKIP, "supportsLatest = false")
        }
        if (mangaIdentityList(response, "popular").isEmpty() || mangaIdentityList(response, "latest").isEmpty()) {
            return skipped("latest differs from popular", "Popular or latest has no manga to compare")
        }
        val distinct = mangaIdentityList(response, "popular").map { it.url } != mangaIdentityList(response, "latest").map { it.url }
        return lint("latest differs from popular", distinct, "Latest page 1 exactly matches popular page 1; verify supportsLatest")
    }

    fun evaluatePagination(
        response: String,
        operation: String,
        redactionMode: RedactionMode = RedactionMode.URLS_AND_SENSITIVE,
    ): CheckResult {
        val redactUrls = redactionMode == RedactionMode.URLS_AND_SENSITIVE
        val first = operationResult(response, operation)
        if (first?.get("status")?.jsonPrimitive?.contentOrNull != "success") {
            return skipped("$operation pagination", operationUnavailableDetails(first, operation))
        }
        if (mangaIdentityList(response, operation).isEmpty()) {
            return skipped("$operation pagination", "Page 1 has no manga to check")
        }
        val hasNextPage = first["hasNextPage"]?.jsonPrimitive?.contentOrNull?.toBooleanStrictOrNull() == true
        if (!hasNextPage) return skipped("$operation pagination", "Page 1 does not advertise a next page")
        val firstPage = mangaIdentityList(response, operation)
        val secondOperation = "${operation}_next"
        val second = operationResult(response, secondOperation)
        if (second?.get("status")?.jsonPrimitive?.contentOrNull != "success") {
            return skipped("$operation pagination", operationUnavailableDetails(second, secondOperation))
        }
        val secondPage = mangaIdentityList(response, secondOperation)
        if (secondPage.isEmpty()) {
            return CheckResult(
                "$operation pagination",
                CheckStatus.FAIL,
                "Page 2 is empty despite page 1 advertising a next page",
            )
        }
        val firstOffsetsByUrl = firstPage.withIndex().groupBy({ it.value.url }, { it.index })
        val secondOffsetsByUrl = secondPage.withIndex().groupBy({ it.value.url }, { it.index })
        val overlap = firstOffsetsByUrl.keys.intersect(secondOffsetsByUrl.keys).map { url ->
            val manga = firstPage[firstOffsetsByUrl.getValue(url).first()]
            "${formatManga(manga.title to manga.url, redactUrls)} at " +
                "${formatPageOffsets(1, firstOffsetsByUrl.getValue(url))} and " +
                formatPageOffsets(2, secondOffsetsByUrl.getValue(url))
        }
        val pagesMatch = firstPage.isNotEmpty() && firstOffsetsByUrl.keys == secondOffsetsByUrl.keys
        return when {
            firstPage == secondPage -> CheckResult("$operation pagination", CheckStatus.FAIL, "Page 2 matches page 1 exactly")
            pagesMatch -> CheckResult("$operation pagination", CheckStatus.FAIL, "Page 2 repeats page 1: ${overlap.joinToString()}")
            overlap.isNotEmpty() -> CheckResult(
                "$operation pagination",
                CheckStatus.UNUSUAL,
                "Overlapping manga: ${overlap.joinToString()}",
            )
            else -> CheckResult("$operation pagination", CheckStatus.PASS, "")
        }
    }

    fun evaluateListingDuplicates(
        response: String,
        redactionMode: RedactionMode = RedactionMode.URLS_AND_SENSITIVE,
    ): CheckResult {
        val redactUrls = redactionMode == RedactionMode.URLS_AND_SENSITIVE
        val listingMangas = listOf("popular", "popular_next", "latest", "latest_next")
            .flatMap { operation -> successfulOperationResult(response, operation)?.get("mangas")?.jsonArray.orEmpty() }
        if (listingMangas.size <= 1) return skipped("listing duplicates", "Fewer than 2 manga to check")

        val duplicateCounts = listOf(
            "popular" to "Popular page 1",
            "popular_next" to "Popular page 2",
            "latest" to "Latest page 1",
            "latest_next" to "Latest page 2",
        ).mapNotNull { (operation, label) ->
            val duplicates = mangaIdentityList(response, operation).groupBy { it.url }.values.filter { it.size > 1 }
            val count = duplicates.sumOf { it.size - 1 }
            count.takeIf { it > 0 }?.let { Triple(label, count, duplicates.map(List<MangaIdentity>::first)) }
        }
        if (duplicateCounts.isNotEmpty() && listOf("popular", "latest").all { paginationFullyOverlaps(response, it) }) {
            return skipped("listing duplicates", "Covered by popular and latest pagination failures")
        }
        return check(
            "listing duplicates",
            duplicateCounts.isEmpty(),
            duplicateCounts.joinToString("; ") { (label, count, mangas) ->
                "$label repeats $count manga ${if (count == 1) "entry" else "entries"}" +
                    if (count < 3) ": ${mangas.joinToString { formatManga(it.title to it.url, redactUrls) }}" else ""
            },
        )
    }

    fun evaluateMangaIdentity(response: String, redactionMode: RedactionMode = RedactionMode.URLS_AND_SENSITIVE): CheckResult {
        val redactUrls = redactionMode == RedactionMode.URLS_AND_SENSITIVE
        val mangas = successfulOperationResults(response)
            .filter { it["operation"]?.jsonPrimitive?.contentOrNull in MANGA_URL_OPERATIONS }
            .flatMap { result ->
                val operation = result.getValue("operation").jsonPrimitive.content
                result["mangas"]?.jsonArray.orEmpty().mapIndexed { offset, manga ->
                    Triple(operation, offset, manga.jsonObject)
                }
            }
        val invalid = mangas.filter { (operation, _, manga) ->
            manga["title"]?.jsonPrimitive?.contentOrNull.isNullOrBlank() ||
                manga["url"]?.jsonPrimitive?.contentOrNull.isNullOrBlank()
        }
        if (mangas.isEmpty()) return skipped("manga title and URL", "No manga to check")
        if (invalid.isNotEmpty()) {
            val details = invalid.joinToString(prefix = "Invalid manga: ") { (operation, offset, manga) ->
                val identity = manga["title"]?.jsonPrimitive?.contentOrNull to
                    manga["url"]?.jsonPrimitive?.contentOrNull
                "$operation entry ${offset + 1}: ${formatManga(identity, redactUrls)}"
            }
            return CheckResult("manga title and URL", CheckStatus.FAIL, details)
        }

        val malformed = mangas.mapNotNull { (operation, offset, manga) ->
            val url = manga["url"]?.jsonPrimitive?.contentOrNull
            if (url == null) return@mapNotNull null
            requestabilityIssue(url)?.let { issue ->
                val value = if (redactUrls) "" else " ${formatMarkdownUrl(url, false)}"
                "$operation entry ${offset + 1}:$value $issue"
            }
        }
        if (malformed.isNotEmpty()) {
            return CheckResult("manga title and URL", CheckStatus.FAIL, "Malformed manga URLs: ${malformed.joinToString()}")
        }

        val classifiable = mangas.filter { (_, _, manga) ->
            manga["url"]?.jsonPrimitive?.contentOrNull?.contains('|') == false
        }
        val absolute = classifiable.filter { (_, _, manga) ->
            manga["url"]?.jsonPrimitive?.contentOrNull?.let(::isAbsoluteUrl) == true
        }
        val relativeCount = classifiable.size - absolute.size
        val singleOperation = mangas.map { it.first }.distinct().singleOrNull()
        val absoluteDetails = absolute.take(3).joinToString(
            prefix = if (singleOperation == null) "Absolute URL examples: " else "examples: ",
        ) { (operation, offset, manga) ->
            val operationLabel = if (singleOperation == null) "$operation " else ""
            val url = formatMarkdownUrl(manga["url"]!!.jsonPrimitive.content, redactUrls)
            "${operationLabel}entry ${offset + 1}: $url"
        }
        val skipped = mangas.count { (_, _, manga) ->
            manga["url"]?.jsonPrimitive?.contentOrNull?.contains('|') == true
        }
        val skippedLabel = if (skipped == 1) "1 pipe-containing URL" else "$skipped pipe-containing URLs"
        val classifications = mangas.groupBy { it.first }.mapNotNull { (operation, operationMangas) ->
            val operationClassifiable = operationMangas.filter { (_, _, manga) ->
                manga["url"]?.jsonPrimitive?.contentOrNull?.contains('|') == false
            }
            val operationAbsolute = operationClassifiable.count { (_, _, manga) ->
                manga["url"]?.jsonPrimitive?.contentOrNull?.let(::isAbsoluteUrl) == true
            }
            val operationRelative = operationClassifiable.size - operationAbsolute
            val counts = listOfNotNull(
                operationAbsolute.takeIf { it > 0 }?.let { count ->
                    if (count == operationMangas.size) "all absolute" else "$count/${operationMangas.size} absolute"
                },
                operationRelative.takeIf { it > 0 }?.let { count ->
                    if (count == operationMangas.size) "all relative" else "$count/${operationMangas.size} relative"
                },
            )
            counts.takeIf { it.isNotEmpty() }?.let { "$operation: ${it.joinToString(", ")}" }
        }
        val skippedDetails = skippedLabel.takeIf { skipped > 0 }?.let { "$it skipped from classification" }
        val summary = if (singleOperation != null) {
            val counts = listOfNotNull(
                relativeCount.takeIf { it > 0 }?.let { if (it == mangas.size) "all relative" else "$it relative" },
                absolute.size.takeIf { it > 0 }?.let { if (it == mangas.size) "all absolute" else "$it absolute" },
            )
            val summaryParts = listOfNotNull(counts.joinToString(", ").takeIf(String::isNotEmpty), skippedDetails)
            "${mangas.size}/${mangas.size} $singleOperation manga have titles and URLs; ${summaryParts.joinToString("; ")}"
        } else {
            val summaryParts = classifications + listOfNotNull(skippedDetails)
            "${mangas.size}/${mangas.size} listing manga have titles and URLs; ${summaryParts.joinToString("; ")}"
        }
        return CheckResult(
            "manga title and URL",
            when {
                absolute.isEmpty() -> CheckStatus.PASS
                relativeCount > 0 -> CheckStatus.UNUSUAL
                else -> CheckStatus.LINT
            },
            when {
                absolute.isNotEmpty() -> if (singleOperation == null) "$summary; $absoluteDetails" else "$summary ($absoluteDetails)"
                skipped > 0 -> summary
                singleOperation != null -> "${mangas.size}/${mangas.size} $singleOperation manga have titles and relative URLs"
                else -> "${mangas.size}/${mangas.size} listing manga have titles and relative URLs"
            },
        )
    }

    fun evaluateThumbnails(response: String): CheckResult {
        val mangas = successfulOperationResults(response)
            .filter { it["operation"]?.jsonPrimitive?.contentOrNull in MANGA_URL_OPERATIONS }
            .flatMap { it["mangas"]?.jsonArray.orEmpty() }
        if (mangas.isEmpty()) return skipped("thumbnail URLs", "No manga to check")
        val present = mangas.count { !it.jsonObject["thumbnailUrl"]?.jsonPrimitive?.contentOrNull.isNullOrBlank() }
        return CheckResult(
            "thumbnail URLs",
            when (present) {
                mangas.size -> CheckStatus.PASS
                0 -> CheckStatus.LINT
                else -> CheckStatus.UNUSUAL
            },
            "$present/${mangas.size} manga have thumbnail URLs",
        )
    }

    fun evaluateDuplicateThumbnails(response: String, redactionMode: RedactionMode = RedactionMode.URLS_AND_SENSITIVE): CheckResult {
        val redactUrls = redactionMode == RedactionMode.URLS_AND_SENSITIVE
        val mangas = successfulOperationResults(response)
            .filter { it["operation"]?.jsonPrimitive?.contentOrNull in THUMBNAIL_LISTING_OPERATIONS }
            .flatMap { it["mangas"]?.jsonArray.orEmpty() }
        if (mangas.isEmpty()) return skipped("duplicate thumbnail URLs", "No manga to check")
        val thumbnailMangaUrls = mangas
            .mapNotNull { manga ->
                manga.jsonObject.let {
                    it["thumbnailUrl"]?.jsonPrimitive?.contentOrNull to it["url"]?.jsonPrimitive?.contentOrNull
                }
            }
            .filter { (thumbnailUrl, mangaUrl) -> !thumbnailUrl.isNullOrBlank() && !mangaUrl.isNullOrBlank() }
        val totalMangaUrls = thumbnailMangaUrls.map { it.second!! }.distinct().size
        val duplicates = thumbnailMangaUrls
            .groupBy({ it.first!! }, { it.second!! })
            .mapValues { (_, mangaUrls) -> mangaUrls.distinct() }
            .filterValues { it.size > 1 }
        val details = duplicates.entries.joinToString(prefix = "Thumbnail URLs used by different manga URLs: ") { (
            thumbnailUrl,
            mangaUrls,
        ),
            ->
            val usage = if (mangaUrls.size == totalMangaUrls) "all ${mangaUrls.size}" else mangaUrls.size.toString()
            val examples = mangaUrls.take(MAX_DUPLICATE_THUMBNAIL_EXAMPLES)
                .joinToString { formatMarkdownUrl(it, redactUrls) }
            "${formatMarkdownUrl(thumbnailUrl, redactUrls)} -> $usage manga URLs (examples: $examples)"
        }
        return unusual("duplicate thumbnail URLs", duplicates.isEmpty(), details)
    }

    fun evaluateThumbnail(response: String, redactionMode: RedactionMode = RedactionMode.URLS_AND_SENSITIVE): CheckResult {
        val redactUrls = redactionMode == RedactionMode.URLS_AND_SENSITIVE
        val (listing, manga) = selectedListing(response)
            ?: return skipped("thumbnail", "No manga to check")
        val thumbnailUrl = manga
            .get("thumbnailUrl")
            ?.jsonPrimitive
            ?.contentOrNull
        if (thumbnailUrl.isNullOrBlank()) return skipped("thumbnail", "No thumbnail URL to load")
        val evidence = listing["thumbnailImage"]?.jsonObject?.let(::imageEvidence)
        return evaluateThumbnailImage("thumbnail", thumbnailUrl, evidence, redactUrls)
    }

    private fun evaluateThumbnailImage(
        name: String,
        thumbnailUrl: String,
        evidence: ImageEvidence?,
        redactUrls: Boolean,
        validStatus: CheckStatus = CheckStatus.PASS,
        missingEvidenceStatus: CheckStatus = CheckStatus.FAIL,
        prefix: String = "",
    ): CheckResult {
        val valid = evidence?.isValidImage() == true
        val placeholder = evidence?.knownPlaceholderType().takeIf { valid }
        val nearlySolid = valid && evidence.isNearlySolid()
        val implausiblySmall = valid && evidence.isImplausiblySmall()
        val details = prefix + when {
            placeholder != null ->
                "${formatMarkdownUrl(thumbnailUrl, redactUrls)} (${requireNotNull(evidence).describe()}); " +
                    "known placeholder: $placeholder"
            nearlySolid ->
                "${formatMarkdownUrl(thumbnailUrl, redactUrls)} (${evidence.describe()}); image is solid or nearly solid " +
                    "(pixel colors vary by at most ${evidence.rgbChannelRange} on the 0-255 RGB scale; " +
                    "fails at $MAX_NEARLY_SOLID_RGB_CHANNEL_RANGE or less)"
            implausiblySmall ->
                "${formatMarkdownUrl(thumbnailUrl, redactUrls)} (${evidence.describe()}); " +
                    "image dimensions are implausibly small"
            valid -> "${formatMarkdownUrl(thumbnailUrl, redactUrls)} (${evidence.describe()})"
            else -> imageFailure("Thumbnail URL", thumbnailUrl, evidence, redactUrls)
        }

        return CheckResult(
            name = name,
            status = when {
                evidence == null -> missingEvidenceStatus
                !valid -> CheckStatus.FAIL
                placeholder != null -> CheckStatus.FAIL
                nearlySolid -> CheckStatus.FAIL
                implausiblySmall -> CheckStatus.UNUSUAL
                else -> validStatus
            },
            details = details,
            blocksBuild = isCompatibilityFailure(evidence?.exceptionClass, evidence?.message),
            retryAdvice = classifyRetryAdvice(
                exceptionClass = evidence?.exceptionClass,
                message = evidence?.message,
                statusCode = evidence?.statusCode,
            ),
        )
    }

    fun evaluateDetailsAuthor(response: String): CheckResult {
        val manga = operationManga(response, "details")
            ?: return skipped("details author", "No details manga to check")
        val author = manga["author"]?.jsonPrimitive?.contentOrNull
        return optionalMetadata("details author", "Author", author)
    }

    fun evaluateDetailsArtist(response: String): CheckResult {
        val manga = operationManga(response, "details")
            ?: return skipped("details artist", "No details manga to check")
        val artist = manga["artist"]?.jsonPrimitive?.contentOrNull
        return optionalMetadata("details artist", "Artist", artist)
    }

    fun evaluateDetailsGenres(response: String): CheckResult {
        val manga = operationManga(response, "details")
            ?: return skipped("details genres", "No details manga to check")
        val genres = manga["genre"]?.jsonPrimitive?.contentOrNull
        return optionalMetadata("details genres", "Genres", genres)
    }

    fun evaluateDetailsDescription(response: String): CheckResult {
        val manga = operationManga(response, "details")
            ?: return skipped("details description", "No details manga to check")
        val description = manga["description"]?.jsonPrimitive?.contentOrNull
        return optionalMetadata("details description", "Description", description)
    }

    fun evaluateMetadataTrimming(response: String): CheckResult {
        val details = successfulOperationResult(response, "details")
        val chapters = successfulOperationResult(response, "chapters")
        if (details == null && chapters == null) return skipped("metadata trimming", "No details metadata to check")
        val manga = details?.get("mangas")?.jsonArray?.firstOrNull()?.jsonObject
        val chapterMetadata = chapters?.get("chapters")?.jsonArray.orEmpty()
        if (manga == null && chapterMetadata.isEmpty()) {
            return skipped("metadata trimming", "No details metadata to check")
        }
        val untrimmedManga = listOf("title", "artist", "author", "genre", "description").filter { field ->
            if (manga == null) return@filter false
            val value = manga[field]?.jsonPrimitive?.contentOrNull ?: return@filter false
            value != value.trim() || (field in setOf("title", "artist", "author", "genre") && "  " in value)
        }
        val untrimmedChapters = chapterMetadata.flatMapIndexed { offset, chapter ->
            listOf("name", "scanlator").mapNotNull { field ->
                val value = chapter.jsonObject[field]?.jsonPrimitive?.contentOrNull ?: return@mapNotNull null
                if (value != value.trim() || "  " in value) "chapter ${offset + 1} $field" else null
            }
        }
        val untrimmed = untrimmedManga + untrimmedChapters
        return lint("metadata trimming", untrimmed.isEmpty(), "Untrimmed fields: ${untrimmed.joinToString()}")
    }

    fun evaluateChapters(response: String): CheckResult {
        val chaptersResult = operationResult(response, "chapters")
        if (chaptersResult?.get("status")?.jsonPrimitive?.contentOrNull != "success") {
            return skipped("chapters", "Chapters did not run successfully")
        }
        val chapters = chaptersResult["chapters"]?.jsonArray.orEmpty()
        return CheckResult("chapters", if (chapters.isNotEmpty()) CheckStatus.PASS else CheckStatus.FAIL, "${chapters.size} chapters")
    }

    fun evaluateChapterDates(response: String): CheckResult {
        val dates = chapters(response).map { it["dateUpload"]?.jsonPrimitive?.contentOrNull?.toLongOrNull() }
        if (dates.isEmpty()) return skipped("chapter dates", "No chapters to check")
        val invalidDates = dates.filter { it == null || it <= 0L }
        if (invalidDates.isEmpty()) return CheckResult("chapter dates", CheckStatus.PASS, "${dates.size} positive upload dates")

        val affected = if (invalidDates.size == dates.size) "All ${dates.size}" else "${invalidDates.size} of ${dates.size}"
        val values = invalidDates.groupingBy { it }.eachCount().entries.joinToString { (value, count) ->
            when (value) {
                null -> "null (date could not be read)=$count"
                0L -> "0 (not provided or parsing failed; host uses a default date)=$count"
                -1L -> "-1 (sentinel value)=$count"
                -2L -> "-2 (sentinel value)=$count"
                else -> "$value (unexpected negative value)=$count"
            }
        }
        return CheckResult("chapter dates", CheckStatus.LINT, "$affected chapters lack a usable source upload timestamp: $values")
    }

    fun evaluateChapterTitles(response: String): CheckResult {
        val chapters = chapters(response)
        if (chapters.isEmpty()) return skipped("chapter titles", "No chapters to check")
        val valid = chapters.all { !it["name"]?.jsonPrimitive?.contentOrNull.isNullOrBlank() }
        return lint("chapter titles", valid, "One or more chapters have no title")
    }

    fun evaluateChapterUrls(response: String, redactionMode: RedactionMode = RedactionMode.URLS_AND_SENSITIVE): CheckResult {
        val redactUrls = redactionMode == RedactionMode.URLS_AND_SENSITIVE
        val chapters = chapters(response)
        if (chapters.isEmpty()) return skipped("chapter URLs", "No chapters to check")
        val blank = chapters.mapIndexedNotNull { offset, chapter ->
            if (chapter["url"]?.jsonPrimitive?.contentOrNull.isNullOrBlank()) offset else null
        }
        if (blank.isNotEmpty()) {
            return CheckResult("chapter URLs", CheckStatus.FAIL, "Blank chapter URLs at offsets: ${blank.joinToString()}")
        }
        val malformed = chapters.mapIndexedNotNull { offset, chapter ->
            val url = chapter["url"]?.jsonPrimitive?.contentOrNull ?: return@mapIndexedNotNull null
            requestabilityIssue(url, ignoreFragment = true)?.let { issue ->
                val value = if (redactUrls) "" else " ${formatMarkdownUrl(url, false)}"
                "offset $offset:$value $issue"
            }
        }
        if (malformed.isNotEmpty()) {
            return CheckResult("chapter URLs", CheckStatus.FAIL, "Malformed chapter URLs: ${malformed.joinToString()}")
        }
        val absolute = chapters.mapIndexedNotNull { offset, chapter ->
            chapter["url"]?.jsonPrimitive?.contentOrNull?.takeIf(::isAbsoluteUrl)?.let {
                "offset $offset: ${formatMarkdownUrl(it, redactUrls)}"
            }
        }
        if (absolute.isEmpty()) return CheckResult("chapter URLs", CheckStatus.PASS, "")
        val allAbsolute = absolute.size == chapters.size
        val details = if (allAbsolute) {
            "All ${chapters.size} chapter URLs are absolute"
        } else {
            val examples = absolute.take(MAX_CHAPTER_URL_EXAMPLES).joinToString()
            val omitted = absolute.size - MAX_CHAPTER_URL_EXAMPLES
            val suffix = if (omitted > 0) ", and $omitted more" else ""
            "${absolute.size} of ${chapters.size} chapter URLs are absolute: $examples$suffix"
        }
        val status = if (allAbsolute) CheckStatus.UNUSUAL else CheckStatus.FAIL
        return CheckResult("chapter URLs", status, details)
    }

    fun evaluateDuplicateChapterUrls(
        response: String,
        redactionMode: RedactionMode = RedactionMode.URLS_AND_SENSITIVE,
    ): CheckResult {
        val redactUrls = redactionMode == RedactionMode.URLS_AND_SENSITIVE
        val chapters = chapters(response)
        if (chapters.isEmpty()) return skipped("duplicate chapter URLs", "No chapters to check")
        val duplicates = duplicateUrlOffsets(chapters) { chapter -> chapter["url"]?.jsonPrimitive?.contentOrNull }
        return check(
            "duplicate chapter URLs",
            duplicates.isEmpty(),
            "Duplicate chapter URLs: ${formatDuplicateUrls(duplicates, redactUrls)}",
        )
    }

    fun evaluatePageIndices(response: String): CheckResult {
        val pages = pages(response)
        if (pages.isEmpty()) return skipped("page indices", "No pages to check")
        val indices = pages.map { page -> page["index"]?.jsonPrimitive?.contentOrNull?.toIntOrNull() }
        val mismatches = indices.withIndex().filter { (position, index) -> index != position }
        if (mismatches.isEmpty()) return CheckResult("page indices", CheckStatus.PASS, "")

        val offsets = indices.mapIndexed { position, index -> index?.minus(position) }
        val details = when {
            indices == indices.indices.reversed().toList() -> "Page indices are in reverse order"
            offsets.all { it == 1 } -> "Page indices are 1-indexed, but should be 0-indexed"
            offsets.first() != null && offsets.all { it == offsets.first() } -> {
                val offset = offsets.first()!!
                val difference = if (offset > 0) "$offset greater than" else "${-offset} less than"
                "Each page index is $difference its 0-based list position"
            }
            else -> {
                val groups = mismatches.groupBy({ it.value }) { it.index + 1 }.entries.joinToString(". ", postfix = ".") { (
                    index,
                    positions,
                ),
                    ->
                    "${formatPagePositions(positions)} ${if (positions.size == 1) "uses" else "use"} index ${index ?: "null"}"
                }
                "Page indices must start at 0 and increase by 1. $groups"
            }
        }
        val preservesOrder = indices.all { it != null } && indices.zipWithNext().all { (first, second) -> first!! <= second!! }
        return CheckResult("page indices", if (preservesOrder) CheckStatus.LINT else CheckStatus.FAIL, details)
    }

    private fun formatPagePositions(positions: List<Int>): String {
        if (positions.size >= 3) {
            val step = positions[1] - positions[0]
            if (positions.zipWithNext().all { (first, second) -> second - first == step }) {
                return when (step) {
                    1 -> "Pages ${positions.first()} through ${positions.last()}"
                    2 -> {
                        val parity = if (positions.first() % 2 == 0) "Even" else "Odd"
                        "$parity-numbered pages ${positions.first()} through ${positions.last()}"
                    }
                    else -> "Pages ${positions.first()} through ${positions.last()}, every $step pages,"
                }
            }
        }
        return if (positions.size == 1) "Page ${positions.single()}" else "Pages ${positions.joinToString()}"
    }

    fun evaluatePageUrls(response: String, redactionMode: RedactionMode = RedactionMode.URLS_AND_SENSITIVE): CheckResult {
        val redactUrls = redactionMode == RedactionMode.URLS_AND_SENSITIVE
        val pages = pages(response)
        if (pages.isEmpty()) {
            val operation = operationResult(response, "pages")
            if (operation?.get("status")?.jsonPrimitive?.contentOrNull != "success") {
                return skipped("page URLs", operationUnavailableDetails(operation, "pages"))
            }
            return CheckResult("page URLs", CheckStatus.FAIL, "Page list is empty (0 pages)")
        }

        val invalid = pages.mapIndexedNotNull { position, page ->
            val url = pageUrl(page)
            if (url?.let(::isHttpUrl) == true) null else "page ${position + 1}: ${describePageUrl(page, redactUrls)}"
        }
        if (invalid.isEmpty()) return CheckResult("page URLs", CheckStatus.PASS, "${pages.size} HTTP page URLs")

        val examples = invalid.take(MAX_PAGE_URL_EXAMPLES).joinToString()
        val omitted = invalid.size - MAX_PAGE_URL_EXAMPLES
        val suffix = if (omitted > 0) ", and $omitted more" else ""
        return CheckResult("page URLs", CheckStatus.FAIL, "${invalid.size} of ${pages.size} pages have invalid URLs: $examples$suffix")
    }

    fun evaluateDuplicatePageUrls(response: String, redactionMode: RedactionMode = RedactionMode.URLS_AND_SENSITIVE): CheckResult {
        val redactUrls = redactionMode == RedactionMode.URLS_AND_SENSITIVE
        val pages = pages(response)
        if (pages.isEmpty()) return skipped("duplicate page URLs", "No pages to check")
        val duplicates = duplicateUrlOffsets(pages, ::pageUrl)
        return unusual(
            "duplicate page URLs",
            duplicates.isEmpty(),
            "Duplicate page URLs: ${formatDuplicatePageUrls(duplicates, redactUrls)}",
        ) // may deduplicate identical images, such as blank ones
    }

    fun evaluatePageLoad(response: String, redactionMode: RedactionMode = RedactionMode.URLS_AND_SENSITIVE): CheckResult {
        val redactUrls = redactionMode == RedactionMode.URLS_AND_SENSITIVE
        val firstPage = pages(response).firstOrNull()
            ?: return CheckResult("page load", CheckStatus.SKIP, "No pages to load")
        val url = pageUrl(firstPage)
        val image = operationResult(response, "pages")?.get("firstPageImage")?.jsonObject
        val evidence = image?.let {
            ImageEvidence(
                contentType = it["contentType"]?.jsonPrimitive?.contentOrNull,
                format = it["format"]?.jsonPrimitive?.contentOrNull,
                serverContentType = it["serverContentType"]?.jsonPrimitive?.contentOrNull,
                byteSize = it["byteSize"]?.jsonPrimitive?.contentOrNull?.toIntOrNull() ?: 0,
                width = it["width"]?.jsonPrimitive?.contentOrNull?.toIntOrNull(),
                height = it["height"]?.jsonPrimitive?.contentOrNull?.toIntOrNull(),
                sha256 = it["sha256"]?.jsonPrimitive?.contentOrNull,
                artifactPath = it["artifactPath"]?.jsonPrimitive?.contentOrNull,
                statusCode = it["statusCode"]?.jsonPrimitive?.contentOrNull?.toIntOrNull(),
                exceptionClass = it["exceptionClass"]?.jsonPrimitive?.contentOrNull,
                message = it["message"]?.jsonPrimitive?.contentOrNull,
                stubbedApi = it["stubbedApi"]?.jsonPrimitive?.contentOrNull,
            )
        }
        if ((url == null || !isHttpUrl(url)) && evidence == null) {
            return CheckResult(
                "page load",
                CheckStatus.FAIL,
                "First page was not requested: ${describePageUrl(firstPage, redactUrls)}",
            )
        }
        requireNotNull(url)
        val valid = evidence?.isValidImage() == true
        val placeholder = evidence?.knownPlaceholderType().takeIf { valid }
        val implausiblySmall = valid && evidence.isImplausiblySmall()
        val details = when {
            placeholder != null ->
                "${formatMarkdownPageUrl(url, redactUrls)} (${requireNotNull(evidence).describe()}); " +
                    "known placeholder: $placeholder"
            implausiblySmall ->
                "${formatMarkdownPageUrl(url, redactUrls)} (${evidence.describe()}); " +
                    "image dimensions are implausibly small"
            valid -> "${formatMarkdownPageUrl(url, redactUrls)} (${evidence.describe()})"
            else -> imageFailure("First page URL", url, evidence, redactUrls)
        }
        val status = when {
            !valid -> CheckStatus.FAIL
            placeholder != null -> CheckStatus.FAIL
            implausiblySmall -> CheckStatus.UNUSUAL
            else -> CheckStatus.PASS
        }
        return CheckResult(
            "page load",
            status,
            details,
            blocksBuild = isCompatibilityFailure(evidence?.exceptionClass, evidence?.message),
            retryAdvice = classifyRetryAdvice(
                exceptionClass = evidence?.exceptionClass,
                message = evidence?.message,
                statusCode = evidence?.statusCode,
            ),
        )
    }

    private fun ImageEvidence.isValidImage(): Boolean = exceptionClass == null && statusCode?.let { it in 200..299 } != false &&
        byteSize > 0 && width != null && width > 0 && height != null && height > 0

    private fun ImageEvidence.isImplausiblySmall(): Boolean = (width != null && width < MIN_PLAUSIBLE_IMAGE_DIMENSION) ||
        (height != null && height < MIN_PLAUSIBLE_IMAGE_DIMENSION)

    private fun ImageEvidence.isNearlySolid(): Boolean = rgbChannelRange != null && rgbChannelRange <= MAX_NEARLY_SOLID_RGB_CHANNEL_RANGE

    private fun ImageEvidence.knownPlaceholderType(): String? = KNOWN_PLACEHOLDER_SHA256[sha256]

    private fun imageFailure(subject: String, url: String, evidence: ImageEvidence?, redactUrls: Boolean): String = when {
        evidence == null -> "$subject ${formatMarkdownPageUrl(url, redactUrls)} was not downloaded"
        evidence.exceptionClass != null -> {
            val message = evidence.message?.let { ": $it" }.orEmpty()
            "$subject ${formatMarkdownPageUrl(url, redactUrls)} could not be downloaded: " +
                "${evidence.exceptionClass}$message" +
                evidence.stubbedApi?.let { "; stubbed API `$it`" }.orEmpty()
        }
        evidence.statusCode?.let { it !in 200..299 } == true ->
            "$subject ${formatMarkdownPageUrl(url, redactUrls)} returned HTTP ${evidence.statusCode}"
        evidence.byteSize == 0 -> "$subject ${formatMarkdownPageUrl(url, redactUrls)} returned an empty response body"
        else -> "$subject ${formatMarkdownPageUrl(url, redactUrls)} did not contain a decodable image (${evidence.byteSize} bytes)"
    }

    private fun ImageEvidence.describe(): String = buildString {
        append(contentType)
        when (format) {
            "lossy", "lossless" -> append(" (encoding: $format)")
            "extended" -> append(" (container: extended)")
            null -> Unit
            else -> append(" (format: $format)")
        }
        append(", $byteSize bytes, ${width}x$height")
        if (serverContentType?.substringBefore(';')?.trim()?.equals(contentType, ignoreCase = true) == false) {
            append("; server Content-Type: $serverContentType")
        }
    }

    fun evaluateDetailsStatus(response: String): CheckResult {
        val manga = operationManga(response, "details")
            ?: return skipped("details status", "No details manga to check")
        val mangaStatus = manga["status"]?.jsonPrimitive?.contentOrNull?.toIntOrNull()
        val statusName = MANGA_STATUS_NAMES[mangaStatus]
        val valid = mangaStatus in KNOWN_MANGA_STATUSES

        return CheckResult(
            name = "details status",
            status = when {
                valid -> CheckStatus.PASS
                mangaStatus == null || mangaStatus == 0 -> CheckStatus.LINT
                else -> CheckStatus.FAIL
            },
            details = when {
                valid -> "$statusName ($mangaStatus)"
                mangaStatus == 0 -> "UNKNOWN (0); use a concrete status when known"
                mangaStatus == null -> "Details require a recognized status"
                else -> "Unrecognized status: $mangaStatus"
            },
        )
    }

    private fun selectedListing(response: String): Pair<kotlinx.serialization.json.JsonObject, kotlinx.serialization.json.JsonObject>? {
        val root = Json.parseToJsonElement(response).jsonObject
        val listings = root.getValue("results").jsonArray
            .map { it.jsonObject }
            .filter { it.getValue("operation").jsonPrimitive.content in setOf("popular", "latest") }
            .filter { it.getValue("status").jsonPrimitive.content == "success" }
        val selected = root["selectedManga"]?.jsonObject
        val selectedOperation = selected?.get("operation")?.jsonPrimitive?.contentOrNull
        val selectedOffset = selected?.get("offset")?.jsonPrimitive?.contentOrNull?.toIntOrNull()
        val listing = listings.firstOrNull { it.getValue("operation").jsonPrimitive.content == selectedOperation }
        val manga = selectedOffset?.let { listing?.getValue("mangas")?.jsonArray?.getOrNull(it)?.jsonObject }
        if (listing != null && manga != null) return listing to manga

        val fallback = listings.firstOrNull { it.getValue("mangas").jsonArray.isNotEmpty() } ?: return null
        return fallback to fallback.getValue("mangas").jsonArray.first().jsonObject
    }

    private fun selectedManga(response: String) = Json.parseToJsonElement(response)
        .jsonObject["selectedManga"]
        ?.jsonObject

    private fun imageEvidence(image: kotlinx.serialization.json.JsonObject) = ImageEvidence(
        contentType = image["contentType"]?.jsonPrimitive?.contentOrNull,
        format = image["format"]?.jsonPrimitive?.contentOrNull,
        serverContentType = image["serverContentType"]?.jsonPrimitive?.contentOrNull,
        byteSize = image["byteSize"]?.jsonPrimitive?.contentOrNull?.toIntOrNull() ?: 0,
        width = image["width"]?.jsonPrimitive?.contentOrNull?.toIntOrNull(),
        height = image["height"]?.jsonPrimitive?.contentOrNull?.toIntOrNull(),
        rgbChannelRange = image["rgbChannelRange"]?.jsonPrimitive?.contentOrNull?.toIntOrNull(),
        sha256 = image["sha256"]?.jsonPrimitive?.contentOrNull,
        artifactPath = image["artifactPath"]?.jsonPrimitive?.contentOrNull,
        statusCode = image["statusCode"]?.jsonPrimitive?.contentOrNull?.toIntOrNull(),
        exceptionClass = image["exceptionClass"]?.jsonPrimitive?.contentOrNull,
        message = image["message"]?.jsonPrimitive?.contentOrNull,
        stubbedApi = image["stubbedApi"]?.jsonPrimitive?.contentOrNull,
    )

    private fun operationManga(response: String, operation: String) = Json.parseToJsonElement(response)
        .jsonObject
        .getValue("results")
        .jsonArray
        .firstOrNull {
            val result = it.jsonObject
            result.getValue("operation").jsonPrimitive.content == operation &&
                result.getValue("status").jsonPrimitive.content == "success"
        }
        ?.jsonObject
        ?.getValue("mangas")
        ?.jsonArray
        ?.firstOrNull()
        ?.jsonObject

    private fun operationResults(response: String) = Json.parseToJsonElement(response).jsonObject
        .getValue("results").jsonArray.map { it.jsonObject }

    private fun successfulOperationResults(response: String) = operationResults(response)
        .filter { it["status"]?.jsonPrimitive?.contentOrNull == "success" }

    private fun operationResult(response: String, operation: String) = operationResults(response)
        .firstOrNull { it.getValue("operation").jsonPrimitive.content == operation }

    private fun successfulOperationResult(response: String, operation: String) = successfulOperationResults(response)
        .firstOrNull { it.getValue("operation").jsonPrimitive.content == operation }

    private fun operationUnavailableDetails(
        result: kotlinx.serialization.json.JsonObject?,
        operation: String,
    ) = result?.get("message")?.jsonPrimitive?.contentOrNull ?: "$operation operation did not complete successfully"

    private fun mangaIdentityList(response: String, operation: String) = successfulOperationResult(response, operation)
        ?.get("mangas")?.jsonArray.orEmpty().map { manga ->
            manga.jsonObject.let { it["title"]?.jsonPrimitive?.contentOrNull to it["url"]?.jsonPrimitive?.contentOrNull }
        }.mapNotNull { (title, url) -> url?.takeUnless(String::isBlank)?.let { MangaIdentity(title, it) } }

    private fun paginationFullyOverlaps(response: String, operation: String): Boolean {
        val first = operationResult(response, operation)
        if (first?.get("status")?.jsonPrimitive?.contentOrNull != "success") return false
        if (first["hasNextPage"]?.jsonPrimitive?.contentOrNull?.toBooleanStrictOrNull() != true) return false
        val firstUrls = mangaIdentityList(response, operation).map { it.url }.toSet()
        val secondUrls = mangaIdentityList(response, "${operation}_next").map { it.url }.toSet()
        return firstUrls.isNotEmpty() && firstUrls == secondUrls
    }

    private fun formatManga(
        manga: Pair<String?, String?>,
        redactUrls: Boolean = true,
    ) = "title=${manga.first?.takeUnless(String::isBlank) ?: "<blank>"}, " +
        "URL=${manga.second?.takeUnless(String::isBlank)?.let { formatMarkdownUrl(it, redactUrls) } ?: "<blank>"}"

    private fun formatPageOffsets(
        page: Int,
        offsets: List<Int>,
    ) = "page $page offset${if (offsets.size == 1) "" else "s"} ${offsets.joinToString()}"

    private fun optionalMetadata(name: String, label: String, value: String?): CheckResult = when {
        value == null -> CheckResult(name, CheckStatus.PASS, "null")
        value.isEmpty() -> CheckResult(name, CheckStatus.LINT, "$label is empty; use null when unknown")
        value.isBlank() -> CheckResult(name, CheckStatus.LINT, "$label is blank; use null when unknown")
        else -> CheckResult(name, CheckStatus.PASS, value)
    }

    private fun chapters(response: String) = successfulOperationResult(
        response,
        "chapters",
    )?.get("chapters")?.jsonArray.orEmpty().map { it.jsonObject }

    private fun unusableChapterDetails(response: String): String {
        val issues = chapters(response).map { chapter ->
            val url = chapter["url"]?.jsonPrimitive?.contentOrNull
            when {
                url.isNullOrBlank() -> "blank"
                else -> requestabilityIssue(url, toleratePipes = false) ?: "rejected for an unknown reason"
            }
        }.groupingBy { it }.eachCount()
        val total = issues.values.sum()
        val breakdown = issues.entries.joinToString { (issue, count) ->
            "$issue ($count of $total)"
        }
        return "No returned chapter could be used for pages; rejection reasons: $breakdown"
    }

    private fun pages(response: String) = successfulOperationResult(
        response,
        "pages",
    )?.get("pages")?.jsonArray.orEmpty().map { it.jsonObject }

    private fun pageUrl(page: kotlinx.serialization.json.JsonObject) = sequenceOf("imageUrl", "url")
        .mapNotNull { page[it]?.jsonPrimitive?.contentOrNull }
        .firstOrNull { it.isNotBlank() }

    private fun duplicateUrlOffsets(
        items: List<kotlinx.serialization.json.JsonObject>,
        url: (kotlinx.serialization.json.JsonObject) -> String?,
    ) = items.mapIndexedNotNull { offset, item ->
        url(item)?.takeUnless(String::isBlank)?.let { it to offset }
    }.groupBy({ it.first }, { it.second }).filterValues { it.size > 1 }

    private fun formatDuplicateUrls(duplicates: Map<String, List<Int>>, redactUrls: Boolean) = duplicates.entries.joinToString { (
        url,
        offsets,
    ),
        ->
        "${formatMarkdownUrl(url, redactUrls)} at offsets ${offsets.joinToString()}"
    }

    private fun formatDuplicatePageUrls(duplicates: Map<String, List<Int>>, redactUrls: Boolean) = duplicates.entries.joinToString { (
        url,
        positions,
    ),
        ->
        "${formatMarkdownUrl(url, redactUrls)} at pages ${positions.joinToString { (it + 1).toString() }}"
    }

    private fun describePageUrl(page: kotlinx.serialization.json.JsonObject, redactUrls: Boolean): String {
        val candidate = sequenceOf("imageUrl", "url")
            .map { field -> field to page[field]?.jsonPrimitive?.contentOrNull }
            .firstOrNull { (_, value) -> !value.isNullOrBlank() }
        if (candidate == null) {
            val imageUrl = formatNullableValue(page["imageUrl"]?.jsonPrimitive?.contentOrNull, redactUrls)
            val url = formatNullableValue(page["url"]?.jsonPrimitive?.contentOrNull, redactUrls)
            return "no nonblank URL (imageUrl=$imageUrl, url=$url)"
        }

        val (field, value) = candidate
        return "$field=${formatMarkdownUrl(value!!, redactUrls)} (${invalidUrlReason(value)})"
    }

    private fun formatNullableValue(value: String?, redactUrls: Boolean) = when {
        value == null -> "<null>"
        value.isEmpty() -> "<empty>"
        value.isBlank() -> "<blank>"
        else -> formatMarkdownUrl(value, redactUrls)
    }

    private fun invalidUrlReason(value: String): String {
        val uri = runCatching { URI(value) }.getOrNull() ?: return "malformed URL"
        return when {
            uri.scheme == null && uri.host != null -> "protocol-relative URL"
            uri.scheme == null -> "relative URL"
            uri.scheme !in setOf("http", "https") -> "${uri.scheme} scheme"
            uri.host == null -> "HTTP URL without host"
            else -> "invalid HTTP URL"
        }
    }

    private fun isHttpUrl(value: String) = value.toHttpUrlOrNull() != null

    private fun formatMarkdownPageUrl(value: String, redactUrls: Boolean): String {
        val url = value.toHttpUrlOrNull() ?: return formatMarkdownUrl(value, redactUrls)
        if (!redactUrls) return "`$url`"
        val lastSegment = url.pathSegments.lastOrNull(String::isNotBlank)
        return if (lastSegment == null) "`${url.scheme}://${url.host}`" else "`${url.scheme}://${url.host}/<redacted>/$lastSegment`"
    }

    private fun isRecognizedMangaUrl(value: String) = when {
        value.startsWith("//") -> true
        value.startsWith("/") -> true
        value.startsWith("http://", ignoreCase = true) -> true
        value.startsWith("https://", ignoreCase = true) -> true
        else -> false
    }

    private fun requestabilityIssue(
        value: String,
        ignoreFragment: Boolean = false,
        toleratePipes: Boolean = true,
    ): String? {
        val requestUrl = if (ignoreFragment) value.substringBefore('#') else value
        if (isJsonObjectIdentifier(requestUrl)) return null
        if (requestUrl.startsWith('{')) return "is malformed"
        if (requestUrl.any(Char::isISOControl)) return "contains control characters"
        if (requestUrl.indices.any { offset ->
                requestUrl[offset] == '%' && (
                    offset + 2 >= requestUrl.length || requestUrl.substring(
                        offset +
                            1,
                        offset + 3,
                    ).any { it.digitToIntOrNull(16) == null }
                    )
            }
        ) {
            return "has malformed percent escape"
        }
        val explicitScheme = EXPLICIT_URL_SCHEME.find(requestUrl)?.groupValues?.get(1)?.lowercase()
        if (explicitScheme != null && explicitScheme !in setOf("http", "https")) return "uses unsupported $explicitScheme scheme"
        if (!isUrlReference(requestUrl)) return null
        val resolved = when {
            requestUrl.startsWith("http://", ignoreCase = true) || requestUrl.startsWith("https://", ignoreCase = true) -> requestUrl
            requestUrl.startsWith("//") -> "https:$requestUrl"
            else -> "https://example.test$requestUrl"
        }
        val normalized = if (toleratePipes) resolved.replace("|", "%7C") else resolved
        return if (normalized.toHttpUrlOrNull() == null) "is malformed" else null
    }

    private fun isJsonObjectIdentifier(value: String) = value.startsWith('{') &&
        runCatching { Json.parseToJsonElement(value).jsonObject }.isSuccess

    private fun isUrlReference(value: String) = value.startsWith('/') || value.startsWith("http://", ignoreCase = true) ||
        value.startsWith("https://", ignoreCase = true)

    private fun isAbsoluteUrl(value: String) = value.startsWith("//") || value.startsWith("http://", ignoreCase = true) ||
        value.startsWith("https://", ignoreCase = true)

    private val EXPLICIT_URL_SCHEME = Regex("^([A-Za-z][A-Za-z0-9+.-]*):/{2}")

    private fun check(name: String, valid: Boolean, failure: String) = CheckResult(
        name,
        if (valid) CheckStatus.PASS else CheckStatus.FAIL,
        if (valid) "" else failure,
    )

    private fun lint(name: String, valid: Boolean, failure: String) = CheckResult(
        name,
        if (valid) CheckStatus.PASS else CheckStatus.LINT,
        if (valid) "" else failure,
    )

    private fun unusual(name: String, valid: Boolean, failure: String) = CheckResult(
        name,
        if (valid) CheckStatus.PASS else CheckStatus.UNUSUAL,
        if (valid) "" else failure,
    )

    private fun skipped(name: String, details: String) = CheckResult(name, CheckStatus.SKIP, details)

    private fun evaluateListing(response: String, operation: String): CheckResult {
        val result = Json.parseToJsonElement(response)
            .jsonObject
            .getValue("results")
            .jsonArray
            .firstOrNull { it.jsonObject.getValue("operation").jsonPrimitive.content == operation }
            ?: return skipped("$operation listing", "$operation result was not returned")
        val resultObject = result
            .jsonObject
        val status = resultObject.getValue("status").jsonPrimitive.content
        val name = "$operation listing"

        if (status != "success") {
            return skipped(name, operationUnavailableDetails(resultObject, operation))
        }

        val count = resultObject.getValue("mangas").jsonArray.size
        return CheckResult(
            name = name,
            status = if (count > 0) CheckStatus.PASS else CheckStatus.FAIL,
            details = "$count entries",
        )
    }

    private const val MAX_DUPLICATE_THUMBNAIL_EXAMPLES = 3
    private const val MAX_CHAPTER_URL_EXAMPLES = 5
    private const val MAX_PAGE_URL_EXAMPLES = 5
    private const val MIN_PLAUSIBLE_IMAGE_DIMENSION = 32
    private const val MAX_NEARLY_SOLID_RGB_CHANNEL_RANGE = 8
    private val KNOWN_MANGA_STATUSES = 1..6
    private val MANGA_STATUS_NAMES = mapOf(
        0 to "UNKNOWN",
        1 to "ONGOING",
        2 to "COMPLETED",
        3 to "LICENSED",
        4 to "PUBLISHING_FINISHED",
        5 to "CANCELLED",
        6 to "ON_HIATUS",
    )
    private val MANGA_URL_OPERATIONS = setOf("popular", "popular_next", "latest", "latest_next", "search")
    private val THUMBNAIL_LISTING_OPERATIONS = setOf("popular", "latest", "search")
    private val EXPECTED_OPERATION_SKIPS = mapOf(
        "popular_next" to setOf("hasNextPage = false"),
        "latest" to setOf("supportsLatest = false"),
        "latest_next" to setOf("supportsLatest = false", "hasNextPage = false"),
        "search" to setOf("No manga was returned by popular or latest"),
        "details" to setOf("No manga was returned by popular or latest"),
        "chapters" to setOf("No manga was returned by popular or latest"),
        "pages" to setOf("No usable chapter was available"),
    )
}

private val COMPATIBILITY_FAILURE_CLASSES = setOf(
    "java.lang.AbstractMethodError",
    "java.lang.BootstrapMethodError",
    "java.lang.ClassCircularityError",
    "java.lang.ClassFormatError",
    "java.lang.ExceptionInInitializerError",
    "java.lang.IllegalAccessError",
    "java.lang.IncompatibleClassChangeError",
    "java.lang.NoClassDefFoundError",
    "java.lang.NoSuchFieldError",
    "java.lang.NoSuchMethodError",
    "java.lang.UnsatisfiedLinkError",
    "java.lang.VerifyError",
    "kotlin.NotImplementedError",
)

private val TIMEOUT_FAILURE_CLASSES = setOf(
    "java.net.SocketTimeoutException",
    "kotlinx.coroutines.TimeoutCancellationException",
)

private val TEMPORARY_SOCKET_FAILURE_MESSAGES = setOf(
    "Connection reset",
    "Connection reset by peer",
)

private val TLS_FAILURE_CLASSES = setOf(
    "java.security.cert.CertificateException",
    "javax.net.ssl.SSLHandshakeException",
    "javax.net.ssl.SSLPeerUnverifiedException",
)
