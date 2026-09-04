package dev.vetle.extstats.runtime

import eu.kanade.tachiyomi.network.HttpException
import eu.kanade.tachiyomi.network.NetworkFailureEvidence
import eu.kanade.tachiyomi.network.NetworkFailureIOException
import eu.kanade.tachiyomi.network.awaitSuccess
import eu.kanade.tachiyomi.network.newCachelessCallWithProgress
import eu.kanade.tachiyomi.source.model.MangasPage
import eu.kanade.tachiyomi.source.model.Page
import eu.kanade.tachiyomi.source.model.SChapter
import eu.kanade.tachiyomi.source.model.SManga
import eu.kanade.tachiyomi.source.online.HttpSource
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.runInterruptible
import kotlinx.coroutines.withTimeout
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.buildJsonArray
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.put
import okhttp3.HttpUrl.Companion.toHttpUrlOrNull
import okhttp3.Request
import rx.Observable
import java.awt.image.BufferedImage
import java.io.DataInputStream
import java.io.DataOutputStream
import java.io.InputStream
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption
import java.security.DigestInputStream
import java.security.MessageDigest
import java.util.concurrent.atomic.AtomicInteger
import javax.imageio.ImageIO
import kotlin.coroutines.cancellation.CancellationException

object ExtensionProbeRunner {
    private const val IMAGE_MAGIC_BYTES = 16L

    @JvmStatic
    fun main(args: Array<String>) {
        measureProbeStage("probe runner main") {
            val input = DataInputStream(System.`in`)
            val output = DataOutputStream(System.out)
            while (true) {
                val requestSize = runCatching { input.readInt() }.getOrNull() ?: break
                val request = measureProbeStage("read probe request") {
                    String(input.readNBytes(requestSize), Charsets.UTF_8)
                }
                val response = try {
                    createResponse(request).toByteArray(Charsets.UTF_8)
                } finally {
                    RuntimeInitializer.shutdown()
                }
                measureProbeStage("write probe response") {
                    output.writeInt(response.size)
                    output.write(response)
                    output.flush()
                }
            }
        }
    }

    internal fun writeResponse(
        input: String,
        executeRequest: (String) -> ExtensionProbeResponse = ::runRequest,
    ) {
        val responseOutput = System.out
        val response = createResponse(input, executeRequest)
        measureProbeStage("write probe response") { responseOutput.println(response) }
    }

    private fun createResponse(
        input: String,
        executeRequest: (String) -> ExtensionProbeResponse = ::runRequest,
    ): String {
        val responseOutput = System.out
        val response = try {
            System.setOut(System.err)
            measureProbeStage("execute probe request") { executeRequest(input) }
        } finally {
            System.setOut(responseOutput)
        }
        return measureProbeStage("serialize probe response") { response.toJson() }
    }

    internal fun runRequest(
        input: String,
        initializeAndroidCompat: () -> Unit = RuntimeInitializer::initializeAndroidCompatOnce,
        loadExtension: (Path, Long?) -> LoadedExtension = SuwayomiExtensionRuntime()::load,
        executeOperation: suspend (
            LoadedExtension,
            ProbeOperation,
            SManga?,
            SChapter?,
            (List<SChapter>) -> Unit,
        ) -> ProbeOperationData = ::executeOperation,
    ): ExtensionProbeResponse {
        val request = measureProbeStage("parse probe request") { parseRequest(input) }
        measureProbeStage("initialize Android compatibility") { initializeAndroidCompat() }
        val extension = measureProbeStage("load extension") {
            loadExtension(Path.of(request.jarPath), request.sourceId)
        }
        extension.use {
            val execution = measureProbeStage("execute probe operations") {
                runBlocking {
                    executeOperations(extension, request, executeOperation)
                }
            }
            return ExtensionProbeResponse(
                metadata = extension.metadata,
                sources = extension.sources.map { source ->
                    ProbeSource(
                        id = source.id,
                        name = source.name,
                        lang = source.lang,
                        supportsLatest = source.supportsLatest,
                    )
                },
                selectedManga = execution.selectedManga?.toProbeSelectedManga(),
                results = execution.results,
            )
        }
    }

    private suspend fun executeOperations(
        extension: LoadedExtension,
        request: ExtensionProbeRequest,
        executeOperation: suspend (LoadedExtension, ProbeOperation, SManga?, SChapter?, (List<SChapter>) -> Unit) -> ProbeOperationData,
    ): ProbeExecution = coroutineScope {
        val operations = request.operations.toSet()
        val selectedManga = CompletableDeferred<SelectedManga?>()
        val selectedChapter = CompletableDeferred<SChapter?>()
        val listingOperations = setOf(ProbeOperation.POPULAR, ProbeOperation.LATEST).filter { it in operations }
        val remainingListings = AtomicInteger(listingOperations.size)
        val executions = mutableMapOf<ProbeOperation, Deferred<ProbeOperationExecution>>()

        listingOperations.forEach { operation ->
            executions[operation] = async {
                val skipMessage = if (operation == ProbeOperation.LATEST && !extension.sources.single().supportsLatest) {
                    "supportsLatest = false"
                } else {
                    null
                }
                executeProbeOperation(extension, operation, request, executeOperation, skipMessage = skipMessage).also { execution ->
                    val offset = execution.data.mangas.indexOfFirst(::isUsableManga)
                    if (offset >= 0) selectedManga.complete(SelectedManga(operation, offset, execution.data.mangas[offset]))
                    if (remainingListings.decrementAndGet() == 0) selectedManga.complete(null)
                }
            }
        }
        if (listingOperations.isEmpty()) selectedManga.complete(null)

        request.operations
            .filterNot { it in listingOperations }
            .sortedBy { if (it == ProbeOperation.CHAPTERS) 1 else 0 }
            .forEach { operation ->
                executions[operation] = async {
                    when (operation) {
                        ProbeOperation.POPULAR_NEXT -> {
                            val popular = executions[ProbeOperation.POPULAR]?.await()
                            val skipMessage = if (popular?.data?.hasNextPage == true) {
                                null
                            } else {
                                "hasNextPage = false"
                            }
                            executeProbeOperation(extension, operation, request, executeOperation, skipMessage = skipMessage)
                        }
                        ProbeOperation.LATEST_NEXT -> {
                            val latest = executions[ProbeOperation.LATEST]?.await()
                            val skipMessage = when {
                                !extension.sources.single().supportsLatest -> "supportsLatest = false"
                                latest?.data?.hasNextPage != true -> "hasNextPage = false"
                                else -> null
                            }
                            executeProbeOperation(extension, operation, request, executeOperation, skipMessage = skipMessage)
                        }
                        ProbeOperation.SEARCH, ProbeOperation.DETAILS -> {
                            val selection = selectedManga.await()
                            executeProbeOperation(
                                extension,
                                operation,
                                request,
                                executeOperation,
                                selectedManga = selection?.manga,
                                skipMessage = if (selection == null) "No manga was returned by popular or latest" else null,
                            )
                        }
                        ProbeOperation.CHAPTERS -> {
                            val selection = selectedManga.await()
                            val details = executions[ProbeOperation.DETAILS]
                                ?.takeIf { extension.metadata.extensionLibraryVersion != "1.4" }
                                ?.await()
                            if (details?.result?.status == ProbeStatus.SUCCESS && details.data.chapters.isNotEmpty()) {
                                selectedChapter.complete(selectChapter(details.data.chapters, request.chapterOffsetFromOldest))
                                reusedChaptersExecution(details.data.chapters, request.chapterOffsetFromOldest)
                            } else {
                                executeProbeOperation(
                                    extension,
                                    operation,
                                    request,
                                    executeOperation,
                                    selectedManga = selection?.manga,
                                    skipMessage = if (selection == null) "No manga was returned by popular or latest" else null,
                                    onChapters = { chapters ->
                                        selectedChapter.complete(selectChapter(chapters, request.chapterOffsetFromOldest))
                                    },
                                )
                            }
                        }
                        ProbeOperation.PAGES -> {
                            val chapter = selectedChapter.await()
                            executeProbeOperation(
                                extension,
                                operation,
                                request,
                                executeOperation,
                                selectedChapter = chapter,
                                skipMessage = if (chapter == null) "No usable chapter was available" else null,
                            )
                        }
                        else -> error("Listing operation was not scheduled as a root: $operation")
                    }
                }
            }
        if (ProbeOperation.CHAPTERS !in operations) selectedChapter.complete(null)

        val orderedExecutions = request.operations.map { operation -> executions.getValue(operation).await() }
        val selection = selectedManga.await()
        val selectedListing = selection?.let { selected ->
            orderedExecutions.firstOrNull { it.result.operation == selected.operation }
        }
        val thumbnailListing = selectedListing ?: orderedExecutions.firstOrNull { execution ->
            execution.result.operation in setOf(ProbeOperation.POPULAR, ProbeOperation.LATEST) &&
                execution.result.status == ProbeStatus.SUCCESS && execution.data.mangas.isNotEmpty()
        }
        val thumbnailOffset = selection?.offset ?: 0
        val thumbnailUrl = thumbnailListing?.data?.mangas?.getOrNull(thumbnailOffset)?.thumbnail_url
        val thumbnailImage = thumbnailUrl?.takeUnless(String::isBlank)?.let { url ->
            async {
                try {
                    withTimeout(request.limits.operationTimeoutMillis) {
                        downloadImage(
                            extension.sources.single(),
                            Page(0, imageUrl = url),
                            request.artifactDirectory().resolve("thumbnail"),
                            analyzeColors = true,
                            directImageUrl = url,
                        )
                    }
                } catch (exception: kotlinx.coroutines.TimeoutCancellationException) {
                    ProbeImageEvidence(exceptionClass = exception::class.java.name, message = exception.message)
                }
            }
        }
        val details = orderedExecutions.firstOrNull { it.result.operation == ProbeOperation.DETAILS }
        val detailsThumbnailUrl = details?.data?.mangas?.singleOrNull()?.thumbnail_url
        val detailsThumbnailImage = detailsThumbnailUrl
            ?.takeUnless { it.isBlank() || it == thumbnailUrl }
            ?.let { url ->
                async {
                    try {
                        withTimeout(request.limits.operationTimeoutMillis) {
                            downloadImage(
                                extension.sources.single(),
                                Page(0, imageUrl = url),
                                request.artifactDirectory().resolve("details-thumbnail"),
                                analyzeColors = true,
                                directImageUrl = url,
                            )
                        }
                    } catch (exception: kotlinx.coroutines.TimeoutCancellationException) {
                        ProbeImageEvidence(exceptionClass = exception::class.java.name, message = exception.message)
                    }
                }
            }
        val results = orderedExecutions.map { execution ->
            when (execution) {
                thumbnailListing -> execution.result.copy(thumbnailImage = thumbnailImage?.await())
                details -> execution.result.copy(thumbnailImage = detailsThumbnailImage?.await())
                else -> execution.result
            }
        }
        ProbeExecution(results, selection)
    }

    private suspend fun executeProbeOperation(
        extension: LoadedExtension,
        operation: ProbeOperation,
        request: ExtensionProbeRequest,
        executeOperation: suspend (LoadedExtension, ProbeOperation, SManga?, SChapter?, (List<SChapter>) -> Unit) -> ProbeOperationData,
        selectedManga: SManga? = null,
        selectedChapter: SChapter? = null,
        skipMessage: String? = null,
        onChapters: (List<SChapter>) -> Unit = {},
    ): ProbeOperationExecution {
        val startedAt = System.nanoTime()
        var exceptionClass: String? = null
        var message = skipMessage
        var statusCode: Int? = null
        var host: String? = null
        var retryAfter: String? = null
        var data = ProbeOperationData()
        val status = try {
            if (skipMessage != null) {
                ProbeStatus.SKIPPED
            } else {
                withTimeout(request.limits.operationTimeoutMillis) {
                    data = executeOperation(extension, operation, selectedManga, selectedChapter, onChapters)
                }
                if (operation == ProbeOperation.PAGES) {
                    data = try {
                        withTimeout(request.limits.operationTimeoutMillis) {
                            data.withFirstPageImage(
                                extension.sources.single(),
                                request.artifactDirectory(),
                                extension.metadata.extensionLibraryVersion == "1.4",
                            )
                        }
                    } catch (exception: kotlinx.coroutines.TimeoutCancellationException) {
                        data.copy(
                            firstPageImage = ProbeImageEvidence(
                                exceptionClass = exception::class.java.name,
                                message = exception.message,
                            ),
                        )
                    }
                }
                ProbeStatus.SUCCESS
            }
        } catch (exception: kotlinx.coroutines.TimeoutCancellationException) {
            exceptionClass = exception::class.java.name
            message = exception.message
            ProbeStatus.TIMEOUT
        } catch (exception: Exception) {
            val cause = exception.rootCause()
            val networkEvidence = exception.networkFailureEvidence()
            statusCode = networkEvidence?.statusCode ?: exception.httpStatusCode()
            host = networkEvidence?.host
            retryAfter = networkEvidence?.retryAfter
            val timedOut = cause is InterruptedException && elapsedMillisSince(startedAt) >= request.limits.operationTimeoutMillis
            if (timedOut) {
                exceptionClass = kotlinx.coroutines.TimeoutCancellationException::class.java.name
                message = "Timed out waiting for ${request.limits.operationTimeoutMillis} ms"
                ProbeStatus.TIMEOUT
            } else {
                exception.printStackTrace(System.err)
                exceptionClass = cause::class.java.name
                message = cause.message
                ProbeStatus.ERROR
            }
        } catch (error: LinkageError) {
            error.printStackTrace(System.err)
            val cause = error.rootCause()
            exceptionClass = cause::class.java.name
            message = cause.message
            ProbeStatus.ERROR
        }
        if (operation == ProbeOperation.CHAPTERS) onChapters(data.chapters)
        val elapsedTimeMillis = (System.nanoTime() - startedAt) / 1_000_000
        System.err.println("[timing] probe operation ${operation.name.lowercase()}: $elapsedTimeMillis ms ($status)")
        return ProbeOperationExecution(
            result = ProbeOperationResult(
                operation = operation,
                status = status,
                exceptionClass = exceptionClass,
                message = message,
                elapsedTimeMillis = elapsedTimeMillis,
                statusCode = statusCode,
                host = host,
                retryAfter = retryAfter,
                searchQuery = if (operation == ProbeOperation.SEARCH) selectedManga?.title else null,
                hasNextPage = data.hasNextPage,
                mangas = data.mangas.map(::toProbeManga),
                chapters = data.chapters.map(::toProbeChapter),
                selectedChapter = selectChapter(data.chapters, request.chapterOffsetFromOldest)?.let(::toProbeChapter),
                pages = data.pages.map(::toProbePage),
                firstPageImage = data.firstPageImage,
            ),
            data = data,
        )
    }

    private fun isUsableManga(manga: SManga): Boolean =
        runCatching { manga.title.isNotBlank() && manga.url.isNotBlank() }.getOrDefault(false)

    private fun reusedChaptersExecution(chapters: List<SChapter>, chapterOffsetFromOldest: Int) =
        ProbeOperationExecution(
            result = ProbeOperationResult(
                operation = ProbeOperation.CHAPTERS,
                status = ProbeStatus.SUCCESS,
                exceptionClass = null,
                message = null,
                elapsedTimeMillis = 0,
                chapters = chapters.map(::toProbeChapter),
                selectedChapter = selectChapter(chapters, chapterOffsetFromOldest)?.let(::toProbeChapter),
            ),
            data = ProbeOperationData(chapters = chapters),
        )

    private fun selectChapter(chapters: List<SChapter>, offsetFromOldest: Int) = chapters
        .asReversed()
        .asSequence()
        .filter(::isUsableChapter)
        .drop(offsetFromOldest)
        .firstOrNull()

    private fun isUsableChapter(chapter: SChapter): Boolean = runCatching { chapter.url }
        .getOrNull()
        ?.takeUnless(String::isBlank)
        ?.let { requestabilityIssue(it) == null }
        ?: false

    private fun requestabilityIssue(value: String): String? {
        if (value.any(Char::isISOControl)) return "contains control characters"
        if (
            value.indices.any { offset ->
                value[offset] == '%' &&
                    (offset + 2 >= value.length || value.substring(offset + 1, offset + 3).any { it.digitToIntOrNull(16) == null })
            }
        ) {
            return "has malformed percent escape"
        }
        val explicitScheme = EXPLICIT_URL_SCHEME.find(value)?.groupValues?.get(1)?.lowercase()
        if (explicitScheme != null && explicitScheme !in setOf("http", "https")) return "uses unsupported $explicitScheme scheme"
        if (!isUrlReference(value)) return null
        val resolved = when {
            value.startsWith("http://", ignoreCase = true) || value.startsWith("https://", ignoreCase = true) -> value
            value.startsWith("//") -> "https:$value"
            else -> "https://example.test$value"
        }
        return if (resolved.toHttpUrlOrNull() == null) "is malformed" else null
    }

    private fun isUrlReference(value: String) =
        value.startsWith('/') ||
            value.startsWith("http://", ignoreCase = true) ||
            value.startsWith("https://", ignoreCase = true)

    private val EXPLICIT_URL_SCHEME = Regex("^([A-Za-z][A-Za-z0-9+.-]*):/{2}")

    private suspend fun executeOperation(
        extension: LoadedExtension,
        operation: ProbeOperation,
        selectedManga: SManga?,
        selectedChapter: SChapter?,
        onChapters: (List<SChapter>) -> Unit,
    ): ProbeOperationData {
        val source = extension.sources.single()
        if (extension.metadata.extensionLibraryVersion == "1.4") {
            return executeLegacyOperation(source, operation, selectedManga, selectedChapter, onChapters)
        }
        return when (operation) {
            ProbeOperation.POPULAR -> source.getPopularManga(1).toProbeData()
            ProbeOperation.POPULAR_NEXT -> source.getPopularManga(2).toProbeData()
            ProbeOperation.LATEST -> source.getLatestUpdates(1).toProbeData()
            ProbeOperation.LATEST_NEXT -> source.getLatestUpdates(2).toProbeData()
            ProbeOperation.SEARCH -> source.getSearchManga(
                1,
                requireNotNull(selectedManga) { "Search requires a manga from popular or latest" }.title,
                source.getFilterList(),
            ).toProbeData()
            ProbeOperation.DETAILS -> {
                val manga = requireNotNull(selectedManga) { "Details requires a manga from popular or latest" }
                source.getMangaUpdate(
                    manga,
                    emptyList(),
                    true,
                    false,
                ).let {
                    if (runCatching { it.manga.title.isBlank() }.getOrDefault(true)) it.manga.title = manga.title
                    if (runCatching { it.manga.url.isBlank() }.getOrDefault(true)) it.manga.url = manga.url
                    ProbeOperationData(mangas = listOf(it.manga), chapters = it.chapters)
                }
            }
            ProbeOperation.CHAPTERS -> {
                val manga = requireNotNull(selectedManga) { "Chapters require a manga from popular or latest" }
                source.getMangaUpdate(manga, emptyList(), false, true).let {
                    onChapters(it.chapters)
                    ProbeOperationData(chapters = it.chapters)
                }
            }
            ProbeOperation.PAGES -> ProbeOperationData(
                pages = source.getPageList(requireNotNull(selectedChapter) { "Pages require a chapter from chapters" }),
            )
        }
    }

    private suspend fun ProbeOperationData.withFirstPageImage(
        source: HttpSource,
        artifactDirectory: Path,
        useLegacyApi: Boolean,
    ): ProbeOperationData {
        val page = pages.firstOrNull() ?: return this
        return copy(firstPageImage = downloadImage(source, page, artifactDirectory.resolve("page-1"), useLegacyApi = useLegacyApi))
    }

    @Suppress("DEPRECATION")
    private suspend fun downloadImage(
        source: HttpSource,
        page: Page,
        targetBase: Path,
        analyzeColors: Boolean = false,
        useLegacyApi: Boolean = false,
        directImageUrl: String? = null,
    ): ProbeImageEvidence {
        val evidence = runCatching {
            if (page.imageUrl.isNullOrEmpty()) {
                page.imageUrl = if (useLegacyApi) {
                    awaitSingleInterruptibly { source.fetchImageUrl(page) }
                } else {
                    source.getImageUrl(page)
                }
            }
            val response = when {
                directImageUrl != null -> {
                    val request = Request.Builder().url(directImageUrl).headers(source.headers).build()
                    source.client.newCachelessCallWithProgress(request, page).awaitSuccess()
                }
                useLegacyApi -> awaitSingleInterruptibly { source.fetchImage(page) }
                else -> source.getImage(page)
            }
            response.use {
                val body = requireNotNull(response.body)
                val imageHeader = response.peekBody(IMAGE_MAGIC_BYTES).use { peekedBody ->
                    peekedBody.bytes()
                }
                val detectedContentType = detectImageContentType(imageHeader)
                val detectedFormat = detectImageFormat(imageHeader)
                val temporaryArtifactPath = targetBase.resolveSibling("${targetBase.fileName}.bin")
                Files.createDirectories(temporaryArtifactPath.parent)
                val digest = MessageDigest.getInstance("SHA-256")
                val byteSize = DigestInputStream(body.byteStream(), digest).use { input ->
                    Files.copy(input, temporaryArtifactPath, StandardCopyOption.REPLACE_EXISTING)
                }
                val inspectedImage = Files.newInputStream(temporaryArtifactPath).use { input ->
                    inspectImage(input, analyzeColors)
                }
                val artifactPath = targetBase.resolveSibling(
                    "${targetBase.fileName}.${fileExtension(detectedContentType ?: inspectedImage?.contentType)}",
                )
                if (artifactPath != temporaryArtifactPath) {
                    Files.move(temporaryArtifactPath, artifactPath, StandardCopyOption.REPLACE_EXISTING)
                }
                ProbeImageEvidence(
                    contentType = detectedContentType ?: inspectedImage?.contentType,
                    format = detectedFormat,
                    serverContentType = response.header("Content-Type"),
                    byteSize = byteSize.toInt(),
                    width = inspectedImage?.width,
                    height = inspectedImage?.height,
                    rgbChannelRange = inspectedImage?.rgbChannelRange,
                    sha256 = digest.digest().toHexString(),
                    artifactPath = artifactPath.toString(),
                    statusCode = response.code,
                )
            }
        }.fold(
            onSuccess = { it },
            onFailure = { exception ->
                if (exception is CancellationException) throw exception
                exception.printStackTrace(System.err)
                val cause = exception.rootCause()
                ProbeImageEvidence(
                    exceptionClass = cause::class.java.name,
                    message = cause.message,
                    stubbedApi = exception.stubbedApi(),
                )
            },
        )
        return evidence
    }

    internal fun detectImageContentType(header: ByteArray): String? = when {
        header.matches(0xFF, 0xD8, 0xFF) -> "image/jpeg"
        header.matches(0x89, 0x50, 0x4E, 0x47, 0x0D, 0x0A, 0x1A, 0x0A) -> "image/png"
        header.matches(0x47, 0x49, 0x46, 0x38, 0x37, 0x61) ||
            header.matches(0x47, 0x49, 0x46, 0x38, 0x39, 0x61) -> "image/gif"
        header.matches(0x52, 0x49, 0x46, 0x46) && header.matchesAt(8, 0x57, 0x45, 0x42, 0x50) -> "image/webp"
        header.matches(0x42, 0x4D) -> "image/bmp"
        header.matches(0x00, 0x00, 0x00, 0x0C, 0x4A, 0x58, 0x4C, 0x20, 0x0D, 0x0A, 0x87, 0x0A) ||
            header.matches(0xFF, 0x0A) -> "image/jxl"
        header.matches(0x00, 0x00, 0x00, 0x0C, 0x6A, 0x50, 0x20, 0x20, 0x0D, 0x0A, 0x87, 0x0A) -> "image/jp2"
        header.matches(0xFF, 0x4F, 0xFF, 0x51) -> "image/j2c"
        header.matches(0x49, 0x49, 0x2A, 0x00) || header.matches(0x4D, 0x4D, 0x00, 0x2A) ||
            header.matches(0x49, 0x49, 0x2B, 0x00) || header.matches(0x4D, 0x4D, 0x00, 0x2B) -> "image/tiff"
        header.matches(0x00, 0x00, 0x01, 0x00) -> "image/x-icon"
        header.isoBmffContentType() != null -> header.isoBmffContentType()
        else -> null
    }

    internal fun detectImageFormat(header: ByteArray): String? = when {
        header.isoBmffImageBrand() != null -> header.isoBmffImageBrand()
        header.matches(0x47, 0x49, 0x46, 0x38, 0x37, 0x61) -> "87a"
        header.matches(0x47, 0x49, 0x46, 0x38, 0x39, 0x61) -> "89a"
        header.matches(0x00, 0x00, 0x00, 0x0C, 0x4A, 0x58, 0x4C, 0x20, 0x0D, 0x0A, 0x87, 0x0A) -> "container"
        header.matches(0xFF, 0x0A) -> "codestream"
        header.matches(0x49, 0x49, 0x2A, 0x00) -> "classic-little-endian"
        header.matches(0x4D, 0x4D, 0x00, 0x2A) -> "classic-big-endian"
        header.matches(0x49, 0x49, 0x2B, 0x00) -> "bigtiff-little-endian"
        header.matches(0x4D, 0x4D, 0x00, 0x2B) -> "bigtiff-big-endian"
        !header.matches(0x52, 0x49, 0x46, 0x46) || !header.matchesAt(8, 0x57, 0x45, 0x42, 0x50) -> null
        header.matchesAt(12, 0x56, 0x50, 0x38, 0x20) -> "lossy"
        header.matchesAt(12, 0x56, 0x50, 0x38, 0x4C) -> "lossless"
        header.matchesAt(12, 0x56, 0x50, 0x38, 0x58) -> "extended"
        else -> null
    }

    private fun ByteArray.matches(vararg expected: Int): Boolean = matchesAt(0, *expected)

    private fun ByteArray.matchesAt(offset: Int, vararg expected: Int): Boolean =
        size >= offset + expected.size &&
            expected.indices.all { index -> this[offset + index].toInt() and 0xFF == expected[index] }

    private fun ByteArray.isoBmffContentType(): String? = when (isoBmffImageBrand()) {
        "avif", "avis" -> "image/avif"
        "heic", "heix", "hevc", "hevx" -> "image/heic"
        "mif1", "msf1" -> "image/heif"
        else -> null
    }

    private fun ByteArray.isoBmffImageBrand(): String? {
        if (size < 12 || !matchesAt(4, 0x66, 0x74, 0x79, 0x70)) return null
        return String(this, 8, 4, Charsets.US_ASCII)
            .takeIf { it in setOf("avif", "avis", "heic", "heix", "hevc", "hevx", "mif1", "msf1") }
    }

    private fun inspectImage(body: InputStream, analyzeColors: Boolean): InspectedImage? = runCatching {
        ImageIO.createImageInputStream(body)?.use { input ->
            val readers = ImageIO.getImageReaders(input)
            if (!readers.hasNext()) return@use null
            readers.next().let { reader ->
                try {
                    reader.input = input
                    InspectedImage(
                        contentType = when (reader.formatName.lowercase()) {
                            "jpg", "jpeg" -> "image/jpeg"
                            else -> "image/${reader.formatName.lowercase()}"
                        },
                        width = reader.getWidth(0),
                        height = reader.getHeight(0),
                        rgbChannelRange = reader.takeIf { analyzeColors }?.read(0)?.rgbChannelRange(),
                    )
                } finally {
                    reader.dispose()
                }
            }
        }
    }.getOrNull()

    private data class InspectedImage(
        val contentType: String,
        val width: Int,
        val height: Int,
        val rgbChannelRange: Int?,
    )

    private fun BufferedImage.rgbChannelRange(): Int {
        var minRed = 255
        var minGreen = 255
        var minBlue = 255
        var maxRed = 0
        var maxGreen = 0
        var maxBlue = 0
        val row = IntArray(width)
        for (y in 0 until height) {
            getRGB(0, y, width, 1, row, 0, width)
            for (rgb in row) {
                val red = rgb shr 16 and 0xff
                val green = rgb shr 8 and 0xff
                val blue = rgb and 0xff
                minRed = minOf(minRed, red)
                minGreen = minOf(minGreen, green)
                minBlue = minOf(minBlue, blue)
                maxRed = maxOf(maxRed, red)
                maxGreen = maxOf(maxGreen, green)
                maxBlue = maxOf(maxBlue, blue)
            }
        }
        return maxOf(maxRed - minRed, maxGreen - minGreen, maxBlue - minBlue)
    }

    private fun ExtensionProbeRequest.artifactDirectory(): Path {
        artifactDirectory?.let { return Path.of(it) }
        val jar = Path.of(jarPath)
        val extensionName = jar.fileName.toString().substringBeforeLast('.')
        return Path.of(System.getProperty("java.io.tmpdir"), "ext-stats-artifacts", extensionName)
    }

    internal fun fileExtension(contentType: String?): String = when (contentType?.substringBefore(';')?.lowercase()) {
        "image/jpeg", "image/jpg" -> "jpg"
        "image/png" -> "png"
        "image/webp" -> "webp"
        "image/gif" -> "gif"
        "image/avif" -> "avif"
        "image/heic" -> "heic"
        "image/heif" -> "heif"
        "image/jxl" -> "jxl"
        "image/jp2" -> "jp2"
        "image/j2c" -> "j2c"
        "image/bmp" -> "bmp"
        "image/tiff" -> "tiff"
        "image/x-icon", "image/vnd.microsoft.icon" -> "ico"
        "text/html" -> "html"
        else -> "bin"
    }

    @Suppress("DEPRECATION")
    private suspend fun executeLegacyOperation(
        source: eu.kanade.tachiyomi.source.online.HttpSource,
        operation: ProbeOperation,
        selectedManga: SManga?,
        selectedChapter: SChapter?,
        onChapters: (List<SChapter>) -> Unit,
    ): ProbeOperationData = when (operation) {
        ProbeOperation.POPULAR -> awaitSingleInterruptibly { source.fetchPopularManga(1) }.toProbeData()
        ProbeOperation.POPULAR_NEXT -> awaitSingleInterruptibly { source.fetchPopularManga(2) }.toProbeData()
        ProbeOperation.LATEST -> awaitSingleInterruptibly { source.fetchLatestUpdates(1) }.toProbeData()
        ProbeOperation.LATEST_NEXT -> awaitSingleInterruptibly { source.fetchLatestUpdates(2) }.toProbeData()
        ProbeOperation.SEARCH -> awaitSingleInterruptibly {
            source.fetchSearchManga(
                1,
                requireNotNull(selectedManga) { "Search requires a manga from popular or latest" }.title,
                source.getFilterList(),
            )
        }.toProbeData()
        ProbeOperation.DETAILS -> {
            val manga = requireNotNull(selectedManga) { "Details requires a manga from popular or latest" }
            val details = awaitSingleInterruptibly { source.fetchMangaDetails(manga) }
            if (runCatching { details.title.isBlank() }.getOrDefault(true)) details.title = manga.title
            if (runCatching { details.url.isBlank() }.getOrDefault(true)) details.url = manga.url
            ProbeOperationData(mangas = listOf(details))
        }
        ProbeOperation.CHAPTERS -> {
            val manga = requireNotNull(selectedManga) { "Chapters require a manga from popular or latest" }
            val chapters = awaitSingleInterruptibly { source.fetchChapterList(manga) }.also(onChapters)
            ProbeOperationData(chapters = chapters)
        }
        ProbeOperation.PAGES -> ProbeOperationData(
            pages = awaitSingleInterruptibly {
                source.fetchPageList(
                    requireNotNull(selectedChapter) { "Pages require a chapter from chapters" },
                )
            },
        )
    }

    private suspend fun <T> awaitSingleInterruptibly(observable: () -> Observable<T>): T =
        runInterruptible(Dispatchers.IO) { observable().toBlocking().single() }

    private fun MangasPage.toProbeData() = ProbeOperationData(mangas = mangas, hasNextPage = hasNextPage)

    private fun toProbeManga(manga: SManga) = ProbeManga(
        url = runCatching { manga.url }.getOrNull(),
        title = runCatching { manga.title }.getOrNull(),
        thumbnailUrl = runCatching { manga.thumbnail_url }.getOrNull(),
        author = runCatching { manga.author }.getOrNull(),
        artist = runCatching { manga.artist }.getOrNull(),
        genre = runCatching { manga.genre }.getOrNull(),
        status = runCatching { manga.status }.getOrNull(),
        description = runCatching { manga.description }.getOrNull(),
    )

    private fun toProbeChapter(chapter: SChapter) = ProbeChapter(
        url = runCatching { chapter.url }.getOrNull(),
        name = runCatching { chapter.name }.getOrNull(),
        dateUpload = runCatching { chapter.date_upload }.getOrNull(),
        scanlator = runCatching { chapter.scanlator }.getOrNull(),
    )

    private fun toProbePage(page: Page) = ProbePage(
        index = page.index,
        url = page.url,
        imageUrl = page.imageUrl,
    )

    internal fun parseRequest(input: String): ExtensionProbeRequest {
        val request = Json.parseToJsonElement(input).jsonObject
        val sourceId = request["sourceId"]?.jsonPrimitive?.content?.toLongOrNull()

        return ExtensionProbeRequest(
            jarPath = request.getValue("jarPath").jsonPrimitive.content,
            artifactDirectory = request["artifactDirectory"]?.jsonPrimitive?.content,
            sourceId = sourceId,
            chapterOffsetFromOldest = request["chapterOffsetFromOldest"]?.jsonPrimitive?.content?.toIntOrNull() ?: 0,
            operations = request.getValue("operations").jsonArray.map {
                ProbeOperation.valueOf(it.jsonPrimitive.content.uppercase())
            },
            limits = request.getValue("limits").jsonObject.let { limits ->
                ProbeLimits(
                    operationTimeoutMillis = limits.getValue("operationTimeoutMillis").jsonPrimitive.content.toLong(),
                    responseSizeBytes = limits.getValue("responseSizeBytes").jsonPrimitive.content.toLong(),
                )
            },
        )
    }
}

private fun Throwable.rootCause(): Throwable = generateSequence(this) { it.cause }
    .filterNot { it is rx.exceptions.OnErrorThrowable.OnNextValue }
    .last()

internal fun Throwable.stubbedApi(): String? = generateSequence(this) { it.cause }
    .firstOrNull { it.message == "Stub!" }
    ?.stackTrace
    ?.firstOrNull { it.className.startsWith("android.") || it.className.startsWith("androidx.") }
    ?.let { frame -> "${frame.className.replace('$', '.')}.${frame.methodName}" }

private fun Throwable.networkFailureEvidence(): NetworkFailureEvidence? = generateSequence(this) { it.cause }
    .flatMap { cause ->
        sequenceOf((cause as? NetworkFailureIOException)?.evidence) +
            cause.suppressed.asSequence().filterIsInstance<NetworkFailureEvidence>()
    }
    .filterNotNull()
    .firstOrNull()

private fun Throwable.httpStatusCode(): Int? = generateSequence(this) { it.cause }
    .filterIsInstance<HttpException>()
    .firstOrNull()
    ?.code

private fun elapsedMillisSince(startedAt: Long): Long = (System.nanoTime() - startedAt) / 1_000_000

private inline fun <T> measureProbeStage(stage: String, action: () -> T): T {
    System.err.println("[timing] $stage: started")
    val startedAt = System.nanoTime()
    try {
        return action()
    } finally {
        val elapsedMillis = (System.nanoTime() - startedAt) / 1_000_000
        System.err.println("[timing] $stage: $elapsedMillis ms")
    }
}

internal data class ExtensionProbeRequest(
    val jarPath: String,
    val artifactDirectory: String?,
    val sourceId: Long?,
    val chapterOffsetFromOldest: Int,
    val operations: List<ProbeOperation>,
    val limits: ProbeLimits,
)

internal enum class ProbeOperation {
    POPULAR,
    POPULAR_NEXT,
    LATEST,
    LATEST_NEXT,
    SEARCH,
    DETAILS,
    CHAPTERS,
    PAGES,
}

internal data class ProbeLimits(
    val operationTimeoutMillis: Long,
    val responseSizeBytes: Long,
)

internal data class ExtensionProbeResponse(
    val metadata: LoadedExtensionMetadata,
    val sources: List<ProbeSource>,
    val results: List<ProbeOperationResult>,
    val selectedManga: ProbeSelectedManga? = null,
) {
    fun toJson(): String = buildJsonObject {
        put(
            "metadata",
            buildJsonObject {
                put("extensionLibraryVersion", metadata.extensionLibraryVersion)
                put("entryPointClass", metadata.entryPointClass)
                put("sourceImplementationClass", metadata.sourceImplementationClass)
            },
        )
        put(
            "sources",
            buildJsonArray {
                sources.forEach { source ->
                    add(
                        buildJsonObject {
                            put("id", source.id)
                            put("name", source.name)
                            put("lang", source.lang)
                            put("supportsLatest", source.supportsLatest)
                        },
                    )
                }
            },
        )
        selectedManga?.let { manga ->
            put(
                "selectedManga",
                buildJsonObject {
                    put("operation", manga.operation.name.lowercase())
                    put("offset", manga.offset)
                    put("title", manga.title)
                    put("url", manga.url)
                },
            )
        }
        put(
            "results",
            buildJsonArray {
                results.forEach { result ->
                    add(
                        buildJsonObject {
                            put("operation", result.operation.name.lowercase())
                            put("status", result.status.name.lowercase())
                            put("exceptionClass", result.exceptionClass)
                            put("message", result.message)
                            put("statusCode", result.statusCode)
                            put("host", result.host)
                            put("retryAfter", result.retryAfter)
                            put("elapsedTimeMillis", result.elapsedTimeMillis)
                            put("searchQuery", result.searchQuery)
                            put("hasNextPage", result.hasNextPage)
                            put(
                                "mangas",
                                buildJsonArray {
                                    result.mangas.forEach { manga ->
                                        add(
                                            buildJsonObject {
                                                put("url", manga.url)
                                                put("title", manga.title)
                                                put("thumbnailUrl", manga.thumbnailUrl)
                                                put("author", manga.author)
                                                put("artist", manga.artist)
                                                put("genre", manga.genre)
                                                put("status", manga.status)
                                                put("description", manga.description)
                                            },
                                        )
                                    }
                                },
                            )
                            put(
                                "chapters",
                                buildJsonArray {
                                    result.chapters.forEach { chapter ->
                                        add(
                                            buildJsonObject {
                                                put("url", chapter.url)
                                                put("name", chapter.name)
                                                put("dateUpload", chapter.dateUpload)
                                                put("scanlator", chapter.scanlator)
                                            },
                                        )
                                    }
                                },
                            )
                            result.selectedChapter?.let { chapter ->
                                put(
                                    "selectedChapter",
                                    buildJsonObject {
                                        put("url", chapter.url)
                                        put("name", chapter.name)
                                    },
                                )
                            }
                            put(
                                "pages",
                                buildJsonArray {
                                    result.pages.forEach { page ->
                                        add(
                                            buildJsonObject {
                                                put("index", page.index)
                                                put("url", page.url)
                                                put("imageUrl", page.imageUrl)
                                            },
                                        )
                                    }
                                },
                            )
                            result.firstPageImage?.let { image ->
                                put(
                                    "firstPageImage",
                                    buildJsonObject {
                                        put("contentType", image.contentType)
                                        put("format", image.format)
                                        put("serverContentType", image.serverContentType)
                                        put("byteSize", image.byteSize)
                                        put("width", image.width)
                                        put("height", image.height)
                                        put("rgbChannelRange", image.rgbChannelRange)
                                        put("sha256", image.sha256)
                                        put("artifactPath", image.artifactPath)
                                        put("exceptionClass", image.exceptionClass)
                                        put("message", image.message)
                                        put("stubbedApi", image.stubbedApi)
                                        put("statusCode", image.statusCode)
                                    },
                                )
                            }
                            result.thumbnailImage?.let { image ->
                                put(
                                    "thumbnailImage",
                                    buildJsonObject {
                                        put("contentType", image.contentType)
                                        put("format", image.format)
                                        put("serverContentType", image.serverContentType)
                                        put("byteSize", image.byteSize)
                                        put("width", image.width)
                                        put("height", image.height)
                                        put("rgbChannelRange", image.rgbChannelRange)
                                        put("sha256", image.sha256)
                                        put("artifactPath", image.artifactPath)
                                        put("exceptionClass", image.exceptionClass)
                                        put("message", image.message)
                                        put("stubbedApi", image.stubbedApi)
                                        put("statusCode", image.statusCode)
                                    },
                                )
                            }
                        },
                    )
                }
            },
        )
    }.toString()
}

private data class ProbeExecution(
    val results: List<ProbeOperationResult>,
    val selectedManga: SelectedManga?,
)

private data class SelectedManga(
    val operation: ProbeOperation,
    val offset: Int,
    val manga: SManga,
) {
    fun toProbeSelectedManga() = ProbeSelectedManga(
        operation = operation,
        offset = offset,
        title = runCatching { manga.title }.getOrNull(),
        url = runCatching { manga.url }.getOrNull(),
    )
}

internal data class ProbeSelectedManga(
    val operation: ProbeOperation,
    val offset: Int,
    val title: String?,
    val url: String?,
)

internal data class ProbeSource(
    val id: Long,
    val name: String,
    val lang: String,
    val supportsLatest: Boolean,
)

internal data class ProbeOperationResult(
    val operation: ProbeOperation,
    val status: ProbeStatus,
    val exceptionClass: String?,
    val message: String?,
    val elapsedTimeMillis: Long,
    val statusCode: Int? = null,
    val host: String? = null,
    val retryAfter: String? = null,
    val searchQuery: String? = null,
    val hasNextPage: Boolean? = null,
    val mangas: List<ProbeManga> = emptyList(),
    val chapters: List<ProbeChapter> = emptyList(),
    val selectedChapter: ProbeChapter? = null,
    val pages: List<ProbePage> = emptyList(),
    val firstPageImage: ProbeImageEvidence? = null,
    val thumbnailImage: ProbeImageEvidence? = null,
)

internal data class ProbeManga(
    val url: String?,
    val title: String?,
    val thumbnailUrl: String?,
    val author: String? = null,
    val artist: String? = null,
    val genre: String? = null,
    val status: Int? = null,
    val description: String? = null,
)

internal data class ProbeChapter(
    val url: String?,
    val name: String?,
    val dateUpload: Long?,
    val scanlator: String? = null,
)

internal data class ProbePage(val index: Int, val url: String?, val imageUrl: String?)

internal data class ProbeImageEvidence(
    val contentType: String? = null,
    val format: String? = null,
    val serverContentType: String? = null,
    val byteSize: Int = 0,
    val width: Int? = null,
    val height: Int? = null,
    val rgbChannelRange: Int? = null,
    val sha256: String? = null,
    val artifactPath: String? = null,
    val exceptionClass: String? = null,
    val message: String? = null,
    val stubbedApi: String? = null,
    val statusCode: Int? = null,
)

internal data class ProbeOperationData(
    val mangas: List<SManga> = emptyList(),
    val hasNextPage: Boolean? = null,
    val chapters: List<SChapter> = emptyList(),
    val pages: List<Page> = emptyList(),
    val firstPageImage: ProbeImageEvidence? = null,
)

private data class ProbeOperationExecution(
    val result: ProbeOperationResult,
    val data: ProbeOperationData,
)

internal enum class ProbeStatus {
    SUCCESS,
    SKIPPED,
    ERROR,
    TIMEOUT,
}
