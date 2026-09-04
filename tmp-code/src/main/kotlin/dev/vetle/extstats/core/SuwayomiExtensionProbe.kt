package dev.vetle.extstats.core

import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonArray
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.contentOrNull
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.long
import kotlinx.serialization.json.put
import java.nio.file.Path

internal class SuwayomiExtensionProbe(
    override val name: String,
    private val prepareJar: (ValidationConfig) -> Path = ExtensionDiscovery()::prepareJar,
    private val runProcess: (String, Long, Long) -> ProbeProcessResult = ExtensionProbeProcess()::run,
) : ExtensionProbe {
    override suspend fun validate(config: ValidationConfig): ProbeValidationResult {
        val jar = TimingLog.measure("prepare extension JAR") { prepareJar(config) }
        val request = buildRequest(jar, config)
        val processResult =
            TimingLog.measure("run extension probe process") {
                runProcess(request, config.timeoutMillis, RESPONSE_SIZE_BYTES)
            }
        return when (processResult) {
            is ProbeProcessResult.Completed -> {
                ProbeValidationResult(
                    checks = evaluate(processResult.response, config.redactionMode),
                    evidence = TimingLog.measure("extract report evidence") { extractEvidence(processResult.response) },
                )
            }
            is ProbeProcessResult.TimedOut -> {
                ProbeValidationResult(
                    listOf(
                        CheckResult(
                            "extension probe",
                            CheckStatus.TIMEOUT,
                            "Probe process timed out after ${processResult.elapsedTimeMillis} ms",
                            blocksBuild = true,
                            retryAdvice = ProbeValidationPolicy.probeTimeoutAdvice(),
                        ),
                    ),
                )
            }
            is ProbeProcessResult.ResponseTooLarge -> {
                ProbeValidationResult(
                    listOf(
                        CheckResult(
                            "extension probe",
                            CheckStatus.ERROR,
                            "Probe response exceeded ${processResult.limitBytes} bytes",
                            blocksBuild = true,
                            retryAdvice = ProbeValidationPolicy.malformedOutputAdvice(),
                        ),
                    ),
                )
            }
            is ProbeProcessResult.Error -> {
                ProbeValidationResult(
                    listOf(CheckResult("extension probe", CheckStatus.ERROR, processErrorMessage(processResult), blocksBuild = true)),
                )
            }
        }
    }

    private fun processErrorMessage(result: ProbeProcessResult.Error): String {
        val exception =
            result.stderr
                .lineSequence()
                .map(String::trim)
                .lastOrNull { line -> "Error:" in line || line.startsWith("Exception in thread") }
        return listOfNotNull(exception, "Probe process exited with code ${result.exitCode}").joinToString("; ")
    }

    private fun evaluate(
        response: String,
        redactionMode: RedactionMode,
    ): List<CheckResult> {
        val policyRedactionMode = if (redactionMode == RedactionMode.URLS_AND_SENSITIVE) RedactionMode.SENSITIVE else redactionMode
        return listOf(
            timedCheck("popular operation") { ProbeValidationPolicy.evaluateOperationOutcome(response, "popular") },
            timedCheck("popular next operation") { ProbeValidationPolicy.evaluateOperationOutcome(response, "popular_next") },
            timedCheck("latest operation") { ProbeValidationPolicy.evaluateOperationOutcome(response, "latest") },
            timedCheck("latest next operation") { ProbeValidationPolicy.evaluateOperationOutcome(response, "latest_next") },
            timedCheck("search operation") { ProbeValidationPolicy.evaluateOperationOutcome(response, "search") },
            timedCheck("details operation") { ProbeValidationPolicy.evaluateOperationOutcome(response, "details") },
            timedCheck("chapters operation") { ProbeValidationPolicy.evaluateOperationOutcome(response, "chapters") },
            timedCheck("pages operation") { ProbeValidationPolicy.evaluateOperationOutcome(response, "pages") },
            timedCheck("popular listing") { ProbeValidationPolicy.evaluatePopular(response) },
            timedCheck("latest listing") { ProbeValidationPolicy.evaluateLatest(response) },
            timedCheck("search listing") { ProbeValidationPolicy.evaluateSearch(response, policyRedactionMode) },
            timedCheck("latest differs from popular") { ProbeValidationPolicy.evaluateLatestDistinct(response) },
            timedCheck("popular pagination") { ProbeValidationPolicy.evaluatePagination(response, "popular", policyRedactionMode) },
            timedCheck("latest pagination") { ProbeValidationPolicy.evaluatePagination(response, "latest", policyRedactionMode) },
            timedCheck("listing duplicates") { ProbeValidationPolicy.evaluateListingDuplicates(response, policyRedactionMode) },
            timedCheck("manga title and URL") { ProbeValidationPolicy.evaluateMangaIdentity(response, policyRedactionMode) },
            timedCheck("thumbnail URLs") { ProbeValidationPolicy.evaluateThumbnails(response) },
            timedCheck("duplicate thumbnail URLs") { ProbeValidationPolicy.evaluateDuplicateThumbnails(response, policyRedactionMode) },
            timedCheck("thumbnail") { ProbeValidationPolicy.evaluateThumbnail(response, policyRedactionMode) },
            timedCheck("details identity") { ProbeValidationPolicy.evaluateDetailsIdentity(response, policyRedactionMode) },
            timedCheck("details thumbnail URL") { ProbeValidationPolicy.evaluateDetailsThumbnail(response, policyRedactionMode) },
            timedCheck("details author") { ProbeValidationPolicy.evaluateDetailsAuthor(response) },
            timedCheck("details artist") { ProbeValidationPolicy.evaluateDetailsArtist(response) },
            timedCheck("details genres") { ProbeValidationPolicy.evaluateDetailsGenres(response) },
            timedCheck("details status") { ProbeValidationPolicy.evaluateDetailsStatus(response) },
            timedCheck("details description") { ProbeValidationPolicy.evaluateDetailsDescription(response) },
            timedCheck("metadata trimming") { ProbeValidationPolicy.evaluateMetadataTrimming(response) },
            timedCheck("chapters") { ProbeValidationPolicy.evaluateChapters(response) },
            timedCheck("chapter dates") { ProbeValidationPolicy.evaluateChapterDates(response) },
            timedCheck("chapter titles") { ProbeValidationPolicy.evaluateChapterTitles(response) },
            timedCheck("chapter URLs") { ProbeValidationPolicy.evaluateChapterUrls(response, policyRedactionMode) },
            timedCheck("duplicate chapter URLs") { ProbeValidationPolicy.evaluateDuplicateChapterUrls(response, policyRedactionMode) },
            timedCheck("page indices") { ProbeValidationPolicy.evaluatePageIndices(response) },
            timedCheck("page URLs") { ProbeValidationPolicy.evaluatePageUrls(response, policyRedactionMode) },
            timedCheck("duplicate page URLs") { ProbeValidationPolicy.evaluateDuplicatePageUrls(response, policyRedactionMode) },
            timedCheck("page load") { ProbeValidationPolicy.evaluatePageLoad(response, policyRedactionMode) },
        ).map(ProbeValidationPolicy::assignRetryAdvice)
    }

    private fun timedCheck(
        name: String,
        check: () -> CheckResult,
    ): CheckResult = TimingLog.measure("evaluate check: $name", check)

    private fun extractEvidence(response: String): ReportEvidence {
        val root =
            kotlinx.serialization.json.Json
                .parseToJsonElement(response)
                .jsonObject
        val metadata = root.getValue("metadata").jsonObject
        val extensionLibraryVersion = metadata.getValue("extensionLibraryVersion").jsonPrimitive.content
        val methodNames = if (extensionLibraryVersion == "1.4") LEGACY_METHOD_NAMES else METHOD_NAMES
        val source =
            root
                .getValue("sources")
                .jsonArray
                .first()
                .jsonObject
        return ReportEvidence(
            extensionLibraryVersion = extensionLibraryVersion,
            entryPointClass = metadata.getValue("entryPointClass").jsonPrimitive.content,
            sourceImplementationClass = metadata.getValue("sourceImplementationClass").jsonPrimitive.content,
            sourceId = source.getValue("id").jsonPrimitive.long,
            sourceName = source.getValue("name").jsonPrimitive.content,
            sourceLanguage = source.getValue("lang").jsonPrimitive.content,
            selectedManga =
            root["selectedManga"]?.jsonObject?.let { manga ->
                SelectedMangaEvidence(
                    operation = manga.getValue("operation").jsonPrimitive.content,
                    offset =
                    manga
                        .getValue("offset")
                        .jsonPrimitive.content
                        .toInt(),
                    title = manga["title"]?.jsonPrimitive?.contentOrNull,
                    url = manga["url"]?.jsonPrimitive?.contentOrNull,
                )
            },
            operations =
            root.getValue("results").jsonArray.map { element ->
                val operation = element.jsonObject
                val operationName = operation.getValue("operation").jsonPrimitive.content
                val manga =
                    operation
                        .getValue("mangas")
                        .jsonArray
                        .firstOrNull()
                        ?.jsonObject
                val chapter = operation["selectedChapter"]?.jsonObject
                val entryField =
                    when (operationName) {
                        "chapters" -> "chapters"
                        "pages" -> "pages"
                        else -> "mangas"
                    }
                OperationEvidence(
                    operation = operationName,
                    method = methodNames.getValue(operationName),
                    status = operation.getValue("status").jsonPrimitive.content,
                    entryCount = operation.getValue(entryField).jsonArray.size,
                    selectedTitle =
                    manga?.get("title")?.jsonPrimitive?.contentOrNull
                        ?: chapter?.get("name")?.jsonPrimitive?.contentOrNull,
                    selectedUrl =
                    manga?.get("url")?.jsonPrimitive?.contentOrNull
                        ?: chapter?.get("url")?.jsonPrimitive?.contentOrNull,
                    exceptionClass = operation["exceptionClass"]?.jsonPrimitive?.contentOrNull,
                    exceptionMessage = operation["message"]?.jsonPrimitive?.contentOrNull,
                    elapsedTimeMillis = operation.getValue("elapsedTimeMillis").jsonPrimitive.long,
                )
            },
        )
    }

    private fun buildRequest(
        jar: Path,
        config: ValidationConfig,
    ): String = buildJsonObject {
        put("jarPath", jar.toString())
        put(
            "artifactDirectory",
            (config.reportPath.parent ?: Path.of("."))
                .resolve("artifacts")
                .resolve(config.extensionName)
                .toString(),
        )
        put("sourceId", config.sourceId?.let(::JsonPrimitive) ?: JsonNull)
        put("chapterOffsetFromOldest", System.getProperty("extstats.validationChapterOffsetFromOldest")?.toIntOrNull() ?: 0)
        put(
            "operations",
            buildJsonArray {
                (
                    System
                        .getProperty("extstats.validationOperations")
                        ?.split(',')
                        ?.map(String::trim)
                        ?.filter(String::isNotEmpty)
                        ?: listOf("popular", "popular_next", "latest", "latest_next", "search", "details", "chapters", "pages")
                    ).map(::JsonPrimitive)
                    .forEach(::add)
            },
        )
        put(
            "limits",
            buildJsonObject {
                put("operationTimeoutMillis", OPERATION_TIMEOUT_MILLIS)
                put("responseSizeBytes", RESPONSE_SIZE_BYTES)
            },
        )
    }.toString()

    companion object {
        private const val OPERATION_TIMEOUT_MILLIS = 30_000L
        private const val RESPONSE_SIZE_BYTES = 1_048_576L
        private val METHOD_NAMES =
            mapOf(
                "popular" to "getPopularManga(1)",
                "popular_next" to "getPopularManga(2)",
                "latest" to "getLatestUpdates(1)",
                "latest_next" to "getLatestUpdates(2)",
                "search" to "getSearchManga(1, query, getFilterList())",
                "details" to "getMangaUpdate(manga, emptyList(), true, false)",
                "chapters" to "reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)",
                "pages" to "getPageList(chapter)",
            )
        private val LEGACY_METHOD_NAMES =
            mapOf(
                "popular" to "fetchPopularManga(1)",
                "popular_next" to "fetchPopularManga(2)",
                "latest" to "fetchLatestUpdates(1)",
                "latest_next" to "fetchLatestUpdates(2)",
                "search" to "fetchSearchManga(1, query, getFilterList())",
                "details" to "fetchMangaDetails(manga)",
                "chapters" to "fetchChapterList(manga)",
                "pages" to "fetchPageList(chapter)",
            )
    }
}
