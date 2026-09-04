package dev.vetle.extstats.runtime

import eu.kanade.tachiyomi.network.HttpException
import eu.kanade.tachiyomi.network.NetworkFailureEvidence
import eu.kanade.tachiyomi.source.model.FilterList
import eu.kanade.tachiyomi.source.model.MangasPage
import eu.kanade.tachiyomi.source.model.Page
import eu.kanade.tachiyomi.source.model.SChapter
import eu.kanade.tachiyomi.source.model.SManga
import eu.kanade.tachiyomi.source.model.SMangaUpdate
import eu.kanade.tachiyomi.source.online.HttpSource
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.awaitCancellation
import kotlinx.serialization.json.Json
import okhttp3.Headers
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Protocol
import okhttp3.Request
import okhttp3.Response
import okhttp3.ResponseBody.Companion.toResponseBody
import org.junit.jupiter.api.io.TempDir
import rx.Observable
import rx.exceptions.OnErrorThrowable
import java.awt.image.BufferedImage
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.DataInputStream
import java.io.DataOutputStream
import java.io.PrintStream
import java.lang.reflect.Modifier
import java.nio.file.Path
import javax.imageio.ImageIO
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertSame
import kotlin.test.assertTrue

class ExtensionProbeRunnerTest {
    @Test
    fun `identifies stubbed Android API from nested failure`() {
        val stub = RuntimeException("Stub!").apply {
            stackTrace = arrayOf(StackTraceElement("android.graphics.BitmapFactory\$Options", "<init>", "BitmapFactory.java", 51))
        }
        val failure = java.io.IOException(stub)

        assertEquals("android.graphics.BitmapFactory.Options.<init>", failure.stubbedApi())
    }

    @Test
    fun `exposes a static JVM main method`() {
        val main = ExtensionProbeRunner::class.java.getMethod("main", Array<String>::class.java)

        assertTrue(Modifier.isPublic(main.modifiers))
        assertTrue(Modifier.isStatic(main.modifiers))
    }

    @Test
    fun `parses a structured probe request`() {
        val request = ExtensionProbeRunner.parseRequest(
            """{"jarPath":"build/extensions/example.jar","artifactDirectory":"build/reports/extension-validation/artifacts/example","sourceId":42,"operations":["popular","details"],"limits":{"operationTimeoutMillis":5000,"responseSizeBytes":1048576}}""",
        )

        assertEquals("build/extensions/example.jar", request.jarPath)
        assertEquals("build/reports/extension-validation/artifacts/example", request.artifactDirectory)
        assertEquals(42, request.sourceId)
        assertEquals(listOf(ProbeOperation.POPULAR, ProbeOperation.DETAILS), request.operations)
        assertEquals(ProbeLimits(operationTimeoutMillis = 5_000, responseSizeBytes = 1_048_576), request.limits)
    }

    @Test
    fun `detects common image formats from file signatures`() {
        val signatures = listOf(
            "image/jpeg" to byteArrayOf(0xFF.toByte(), 0xD8.toByte(), 0xFF.toByte()),
            "image/gif" to "GIF89a".toByteArray(),
            "image/avif" to byteArrayOf(0, 0, 0, 12, 0x66, 0x74, 0x79, 0x70, 0x61, 0x76, 0x69, 0x66),
            "image/heic" to byteArrayOf(0, 0, 0, 16, 0x66, 0x74, 0x79, 0x70, 0x68, 0x65, 0x69, 0x63),
            "image/heif" to byteArrayOf(0, 0, 0, 16, 0x66, 0x74, 0x79, 0x70, 0x6D, 0x69, 0x66, 0x31),
            "image/jxl" to byteArrayOf(0, 0, 0, 12, 0x4A, 0x58, 0x4C, 0x20, 0x0D, 0x0A, 0x87.toByte(), 0x0A),
            "image/jxl" to byteArrayOf(0xFF.toByte(), 0x0A),
            "image/jp2" to byteArrayOf(0, 0, 0, 12, 0x6A, 0x50, 0x20, 0x20, 0x0D, 0x0A, 0x87.toByte(), 0x0A),
            "image/j2c" to byteArrayOf(0xFF.toByte(), 0x4F, 0xFF.toByte(), 0x51),
            "image/webp" to "RIFF0000WEBPVP8 ".toByteArray(),
            "image/webp" to "RIFF0000WEBPVP8L".toByteArray(),
            "image/webp" to "RIFF0000WEBPVP8X".toByteArray(),
            "image/tiff" to byteArrayOf(0x49, 0x49, 0x2A, 0),
            "image/x-icon" to byteArrayOf(0, 0, 1, 0),
        )

        signatures.forEach { (contentType, signature) ->
            assertEquals(contentType, ExtensionProbeRunner.detectImageContentType(signature), contentType)
        }
    }

    @Test
    fun `uses image-specific artifact extensions`() {
        mapOf(
            "image/avif" to "avif",
            "image/heic" to "heic",
            "image/heif" to "heif",
            "image/jxl" to "jxl",
            "image/jp2" to "jp2",
            "image/j2c" to "j2c",
            "image/webp" to "webp",
            "image/tiff" to "tiff",
            "image/x-icon" to "ico",
        ).forEach { (contentType, extension) ->
            assertEquals(extension, ExtensionProbeRunner.fileExtension(contentType), contentType)
        }
    }

    @Test
    fun `detects image format details`() {
        listOf("avif", "avis", "heic", "heix", "hevc", "hevx", "mif1", "msf1").forEach { brand ->
            val header = byteArrayOf(0, 0, 0, 12, 0x66, 0x74, 0x79, 0x70) + brand.toByteArray()
            assertEquals(brand, ExtensionProbeRunner.detectImageFormat(header))
        }
        assertEquals(
            "container",
            ExtensionProbeRunner.detectImageFormat(
                byteArrayOf(0, 0, 0, 12, 0x4A, 0x58, 0x4C, 0x20, 0x0D, 0x0A, 0x87.toByte(), 0x0A),
            ),
        )
        assertEquals(
            "codestream",
            ExtensionProbeRunner.detectImageFormat(byteArrayOf(0xFF.toByte(), 0x0A)),
        )
        mapOf(
            "GIF87a" to "87a",
            "GIF89a" to "89a",
            "RIFF0000WEBPVP8 " to "lossy",
            "RIFF0000WEBPVP8L" to "lossless",
            "RIFF0000WEBPVP8X" to "extended",
        ).forEach { (header, format) ->
            assertEquals(format, ExtensionProbeRunner.detectImageFormat(header.toByteArray()))
        }
        mapOf(
            byteArrayOf(0x49, 0x49, 0x2A, 0x00) to "classic-little-endian",
            byteArrayOf(0x4D, 0x4D, 0x00, 0x2A) to "classic-big-endian",
            byteArrayOf(0x49, 0x49, 0x2B, 0x00) to "bigtiff-little-endian",
            byteArrayOf(0x4D, 0x4D, 0x00, 0x2B) to "bigtiff-big-endian",
        ).forEach { (header, format) ->
            assertEquals(format, ExtensionProbeRunner.detectImageFormat(header))
        }
    }

    @Test
    fun `main handles multiple fixture requests`() {
        val jar = System.getProperty("directFixtureJar")
        val input = """{"jarPath":"$jar","sourceId":null,"operations":["popular","latest","search","details"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}"""
        val output = ByteArrayOutputStream()
        val errors = ByteArrayOutputStream()
        val originalOutput = System.out
        val originalError = System.err
        val framedInput = ByteArrayOutputStream().also { bytes ->
            DataOutputStream(bytes).use { stream ->
                val request = input.toByteArray()
                repeat(2) {
                    stream.writeInt(request.size)
                    stream.write(request)
                }
            }
        }

        System.setIn(ByteArrayInputStream(framedInput.toByteArray()))
        System.setOut(PrintStream(output))
        System.setErr(PrintStream(errors))

        try {
            ExtensionProbeRunner.main(emptyArray())
        } finally {
            System.setOut(originalOutput)
            System.setErr(originalError)
        }

        val responses = DataInputStream(ByteArrayInputStream(output.toByteArray())).use { stream ->
            List(2) { String(stream.readNBytes(stream.readInt())) }
        }
        responses.forEach { response ->
            Json.parseToJsonElement(response)
            assertTrue(response.contains("\"name\":\"Direct Fixture\""))
            assertTrue(response.contains("\"title\":\"Popular Fixture\""))
            assertTrue(response.contains("\"title\":\"Latest Fixture\""))
            assertTrue(response.contains("\"title\":\"Search for Popular Fixture\""))
            assertTrue(response.contains("\"title\":\"Detailed Popular Fixture\""))
            assertTrue(response.contains("\"author\":\"Fixture Author\""))
        }
        assertTrue(errors.toString().contains("fixture stdout"))
        assertTrue(errors.toString().contains("fixture stderr"))
    }

    @Test
    fun `writes only JSON to stdout when request execution logs`() {
        val output = ByteArrayOutputStream()
        val errors = ByteArrayOutputStream()
        val originalOutput = System.out
        val originalError = System.err

        System.setOut(PrintStream(output))
        System.setErr(PrintStream(errors))

        try {
            ExtensionProbeRunner.writeResponse("request") {
                println("extension stdout")
                System.err.println("extension stderr")
                ExtensionProbeResponse(TEST_METADATA, emptyList(), emptyList())
            }
        } finally {
            System.setOut(originalOutput)
            System.setErr(originalError)
        }

        assertEquals(
            "{\"metadata\":{\"extensionLibraryVersion\":\"1.6\",\"entryPointClass\":\"fixture.Generated\",\"sourceImplementationClass\":\"fixture.Source\"},\"sources\":[],\"results\":[]}${System.lineSeparator()}",
            output.toString(),
        )
        val errorOutput = errors.toString()
        assertTrue(errorOutput.contains("extension stdout${System.lineSeparator()}extension stderr"))
        assertTrue(errorOutput.contains("[timing] execute probe request:"))
        assertTrue(errorOutput.contains("[timing] serialize probe response:"))
    }

    @Test
    fun `serializes the extension provided page index`() {
        val response = ExtensionProbeResponse(
            metadata = TEST_METADATA,
            sources = emptyList(),
            results = listOf(
                ProbeOperationResult(
                    operation = ProbeOperation.PAGES,
                    status = ProbeStatus.SUCCESS,
                    exceptionClass = null,
                    message = null,
                    elapsedTimeMillis = 1,
                    pages = listOf(ProbePage(index = 7, url = null, imageUrl = "https://example.test/page.jpg")),
                ),
            ),
        )

        assertTrue(response.toJson().contains("\"index\":7"))
    }

    @Test
    fun `serializes chapter scanlator`() {
        val response = ExtensionProbeResponse(
            metadata = TEST_METADATA,
            sources = emptyList(),
            results = listOf(
                ProbeOperationResult(
                    operation = ProbeOperation.DETAILS,
                    status = ProbeStatus.SUCCESS,
                    exceptionClass = null,
                    message = null,
                    elapsedTimeMillis = 1,
                    chapters = listOf(ProbeChapter(url = "/chapter/1", name = "Chapter 1", dateUpload = 1, scanlator = "Group Name")),
                ),
            ),
        )

        assertTrue(response.toJson().contains("\"scanlator\":\"Group Name\""))
    }

    @Test
    fun `initializes AndroidCompat once while accepting a request`() {
        var initializationCount = 0
        val input = """{"jarPath":"example.jar","sourceId":null,"operations":["popular"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}"""

        ExtensionProbeRunner.runRequest(
            input,
            initializeAndroidCompat = { initializationCount++ },
            loadExtension = { _, _ -> TestLoadedExtension() },
        )

        assertEquals(1, initializationCount)
    }

    @Test
    fun `loads exactly one extension artifact`() {
        var loadedJar: Path? = null
        var loadedSourceId: Long? = null
        var loadCount = 0
        val loadedExtension = TestLoadedExtension()
        val input = """{"jarPath":"example.jar","sourceId":42,"operations":["popular"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}"""

        ExtensionProbeRunner.runRequest(
            input,
            initializeAndroidCompat = {},
            loadExtension = { jar, sourceId ->
                loadCount++
                loadedJar = jar
                loadedSourceId = sourceId
                loadedExtension
            },
        )

        assertEquals(1, loadCount)
        assertEquals(Path.of("example.jar"), loadedJar)
        assertEquals(42, loadedSourceId)
        assertTrue(loadedExtension.closed)
    }

    @Test
    fun `executes each operation under its timeout`() {
        val executedOperations = java.util.Collections.synchronizedList(mutableListOf<ProbeOperation>())
        val input = """{"jarPath":"example.jar","sourceId":null,"operations":["popular","latest"],"limits":{"operationTimeoutMillis":10,"responseSizeBytes":4096}}"""

        val response = ExtensionProbeRunner.runRequest(
            input,
            initializeAndroidCompat = {},
            loadExtension = { _, _ -> TestLoadedExtension(listOf(TestSource(supportsLatest = true))) },
            executeOperation = { _, operation, _, _, _ ->
                executedOperations += operation
                awaitCancellation()
            },
        )

        assertEquals(setOf(ProbeOperation.POPULAR, ProbeOperation.LATEST), executedOperations.toSet())
        assertTrue(response.results.all { it.status == ProbeStatus.TIMEOUT })
        assertTrue(response.results.all { it.exceptionClass == "kotlinx.coroutines.TimeoutCancellationException" })
        assertTrue(response.results.all { it.elapsedTimeMillis >= 0 })
    }

    @Test
    fun `preserves structured exception details`() {
        val input = """{"jarPath":"example.jar","sourceId":null,"operations":["popular"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}"""

        val response = ExtensionProbeRunner.runRequest(
            input,
            initializeAndroidCompat = {},
            loadExtension = { _, _ -> TestLoadedExtension() },
            executeOperation = { _, _, _, _, _ -> error("fixture failure") },
        )

        val result = response.results.single()
        assertEquals(ProbeOperation.POPULAR, result.operation)
        assertEquals(ProbeStatus.ERROR, result.status)
        assertEquals("java.lang.IllegalStateException", result.exceptionClass)
        assertEquals("fixture failure", result.message)
        assertTrue(result.elapsedTimeMillis >= 0)
    }

    @Test
    fun `preserves structured network failure evidence`() {
        val input = """{"jarPath":"example.jar","sourceId":null,"operations":["popular"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}"""
        val failure = HttpException(429).apply {
            addSuppressed(NetworkFailureEvidence(429, "example.test", "120"))
        }

        val response = ExtensionProbeRunner.runRequest(
            input,
            initializeAndroidCompat = {},
            loadExtension = { _, _ -> TestLoadedExtension() },
            executeOperation = { _, _, _, _, _ -> throw failure },
        )

        val result = response.results.single()
        assertEquals(429, result.statusCode)
        assertEquals("example.test", result.host)
        assertEquals("120", result.retryAfter)
        assertTrue(response.toJson().contains("\"statusCode\":429,\"host\":\"example.test\",\"retryAfter\":\"120\""))
    }

    @Test
    fun `reports the root cause of a wrapped operation failure`() {
        val input = """{"jarPath":"example.jar","sourceId":null,"operations":["popular"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}"""

        val response = ExtensionProbeRunner.runRequest(
            input,
            initializeAndroidCompat = {},
            loadExtension = { _, _ -> TestLoadedExtension() },
            executeOperation = { _, _, _, _, _ -> throw RuntimeException(IllegalStateException("root failure")) },
        )

        assertEquals("java.lang.IllegalStateException", response.results.single().exceptionClass)
        assertEquals("root failure", response.results.single().message)
    }

    @Test
    fun `ignores Rx value markers when reporting an operation failure`() {
        val input = """{"jarPath":"example.jar","sourceId":null,"operations":["popular"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}"""
        val failure = IllegalStateException("parse failure").also {
            OnErrorThrowable.addValueAsLastCause(it, "response")
        }

        val response = ExtensionProbeRunner.runRequest(
            input,
            initializeAndroidCompat = {},
            loadExtension = { _, _ -> TestLoadedExtension() },
            executeOperation = { _, _, _, _, _ -> throw failure },
        )

        assertEquals("java.lang.IllegalStateException", response.results.single().exceptionClass)
        assertEquals("parse failure", response.results.single().message)
    }

    @Test
    fun `reports linkage errors without terminating the probe`() {
        val input = """{"jarPath":"example.jar","sourceId":null,"operations":["popular"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}"""

        val response = ExtensionProbeRunner.runRequest(
            input,
            initializeAndroidCompat = {},
            loadExtension = { _, _ -> TestLoadedExtension() },
            executeOperation = { _, _, _, _, _ -> throw NoSuchMethodError("missing compatibility method") },
        )

        val result = response.results.single()
        assertEquals(ProbeStatus.ERROR, result.status)
        assertEquals("java.lang.NoSuchMethodError", result.exceptionClass)
        assertEquals("missing compatibility method", result.message)
    }

    @Test
    fun `popular invokes suspend API with first page and returns manga`() {
        val source = TestSource()
        val input = """{"jarPath":"example.jar","sourceId":null,"operations":["popular"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}"""

        val response = ExtensionProbeRunner.runRequest(
            input,
            initializeAndroidCompat = {},
            loadExtension = { _, _ -> TestLoadedExtension(listOf(source)) },
        )

        assertEquals(1, source.popularPage)
        assertEquals(
            listOf(ProbeManga(url = "/manga/fixture", title = "Fixture Manga", thumbnailUrl = "https://example.test/cover.jpg",
                status = 0)),
            response.results.single().mangas,
        )
        assertEquals(TEST_METADATA, response.metadata)
    }

    @Test
    fun `thumbnail uses source client and headers without page image request`(@TempDir tempDir: Path) {
        val source = ThumbnailTestSource(serverContentType = "image")
        val input = """{"jarPath":"build/extensions/example.jar","artifactDirectory":"$tempDir","sourceId":null,"operations":["popular"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}"""

        val response = ExtensionProbeRunner.runRequest(
            input,
            initializeAndroidCompat = {},
            loadExtension = { _, _ -> TestLoadedExtension(listOf(source)) },
        )

        assertEquals(null, source.request?.header("X-Image-Request"))
        assertEquals("test", source.request?.header("User-Agent"))
        assertEquals(null, source.requestedPage)
        assertEquals("https://example.test/cover.jpg", source.request?.url.toString())
        assertEquals(200, response.results.single().thumbnailImage?.statusCode)
        assertEquals("image/png", response.results.single().thumbnailImage?.contentType)
        assertEquals("image", response.results.single().thumbnailImage?.serverContentType)
        assertEquals(1, response.results.single().thumbnailImage?.width)
        assertEquals(0, response.results.single().thumbnailImage?.rgbChannelRange)
        assertTrue(response.results.single().thumbnailImage?.sha256?.matches(Regex("[0-9a-f]{64}")) == true)
        assertTrue(response.results.single().thumbnailImage?.artifactPath?.startsWith(tempDir.toString()) == true)
    }

    @Test
    fun `thumbnail downloads when listing manga is not usable for deeper operations`(@TempDir tempDir: Path) {
        val source = ThumbnailTestSource()
        val manga = SManga.create().apply {
            url = "/manga/fixture"
            title = ""
            thumbnail_url = "https://example.test/cover.jpg"
        }
        val input = """{"jarPath":"build/extensions/example.jar","artifactDirectory":"$tempDir","sourceId":null,"operations":["popular"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}"""

        val response = ExtensionProbeRunner.runRequest(
            input,
            initializeAndroidCompat = {},
            loadExtension = { _, _ -> TestLoadedExtension(listOf(source)) },
            executeOperation = { _, operation, _, _, _ ->
                assertEquals(ProbeOperation.POPULAR, operation)
                ProbeOperationData(mangas = listOf(manga))
            },
        )

        assertEquals(null, response.selectedManga)
        assertEquals("https://example.test/cover.jpg", source.request?.url.toString())
        assertEquals(200, response.results.single().thumbnailImage?.statusCode)
    }

    @Test
    fun `thumbnail follows the first selected listing entry`(@TempDir tempDir: Path) {
        val source = ThumbnailTestSource(supportsLatest = true)
        val latestCompleted = CompletableDeferred<Unit>()
        fun manga(title: String, thumbnailUrl: String) = SManga.create().apply {
            url = "/manga/${title.lowercase()}"
            this.title = title
            thumbnail_url = thumbnailUrl
        }
        val popular = manga("Popular", "https://example.test/popular.jpg")
        val latest = manga("Latest", "https://example.test/latest.jpg")

        val response = ExtensionProbeRunner.runRequest(
            """{"jarPath":"build/extensions/example.jar","artifactDirectory":"$tempDir","sourceId":null,"operations":["popular","latest"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}""",
            initializeAndroidCompat = {},
            loadExtension = { _, _ -> TestLoadedExtension(listOf(source)) },
            executeOperation = { _, operation, _, _, _ ->
                when (operation) {
                    ProbeOperation.POPULAR -> {
                        latestCompleted.await()
                        ProbeOperationData(mangas = listOf(popular))
                    }
                    ProbeOperation.LATEST -> {
                        latestCompleted.complete(Unit)
                        ProbeOperationData(mangas = listOf(latest))
                    }
                    else -> error("Unexpected operation: $operation")
                }
            },
        )

        assertEquals(ProbeOperation.LATEST, response.selectedManga?.operation)
        assertEquals(listOf("https://example.test/latest.jpg"), source.requests.map { it.url.toString() })
        assertEquals(null, response.results.single { it.operation == ProbeOperation.POPULAR }.thumbnailImage)
        assertEquals(200, response.results.single { it.operation == ProbeOperation.LATEST }.thumbnailImage?.statusCode)
    }

    @Test
    fun `details thumbnail is downloaded only when it differs from selected listing`() {
        fun requestsFor(detailsThumbnailUrl: String): Pair<List<String>, ProbeOperationResult> {
            val source = ThumbnailTestSource()
            fun manga(thumbnailUrl: String) = SManga.create().apply {
                url = "/manga/fixture"
                title = "Fixture Manga"
                thumbnail_url = thumbnailUrl
            }
            val response = ExtensionProbeRunner.runRequest(
                """{"jarPath":"build/extensions/example.jar","sourceId":null,"operations":["popular","details"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}""",
                initializeAndroidCompat = {},
                loadExtension = { _, _ -> TestLoadedExtension(listOf(source)) },
                executeOperation = { _, operation, _, _, onChapters ->
                    when (operation) {
                        ProbeOperation.POPULAR -> ProbeOperationData(mangas = listOf(manga("https://example.test/listing.jpg")))
                        ProbeOperation.DETAILS -> {
                            onChapters(emptyList())
                            ProbeOperationData(mangas = listOf(manga(detailsThumbnailUrl)))
                        }
                        else -> error("Unexpected operation: $operation")
                    }
                },
            )
            return source.requests.map { it.url.toString() } to response.results.single { it.operation == ProbeOperation.DETAILS }
        }

        val (sameRequests, sameDetails) = requestsFor("https://example.test/listing.jpg")
        val (changedRequests, changedDetails) = requestsFor("https://example.test/details.jpg")

        assertEquals(listOf("https://example.test/listing.jpg"), sameRequests)
        assertEquals(null, sameDetails.thumbnailImage)
        assertEquals(listOf("https://example.test/listing.jpg", "https://example.test/details.jpg"), changedRequests)
        assertEquals(200, changedDetails.thumbnailImage?.statusCode)
    }

    @Test
    fun `thumbnail RGB range includes minority varied pixels`() {
        val image = BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB)
        for (y in 0 until image.height) {
            for (x in 0 until image.width) image.setRGB(x, y, 0xffffff)
        }
        for (x in 0 until image.width) image.setRGB(x, image.height - 1, x * 0x1c1c1c)

        val response = ExtensionProbeRunner.runRequest(
            """{"jarPath":"build/extensions/example.jar","sourceId":null,"operations":["popular"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}""",
            initializeAndroidCompat = {},
            loadExtension = { _, _ -> TestLoadedExtension(listOf(ThumbnailTestSource(image = image))) },
        )

        assertEquals(255, response.results.single().thumbnailImage?.rgbChannelRange)
    }

    @Test
    fun `popular page 2 is requested once only when advertised`() {
        val source = TestSource(hasPopularNextPage = true)
        val input = """{"jarPath":"example.jar","sourceId":null,"operations":["popular","popular_next"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}"""

        val response = ExtensionProbeRunner.runRequest(
            input,
            initializeAndroidCompat = {},
            loadExtension = { _, _ -> TestLoadedExtension(listOf(source)) },
        )

        assertEquals(listOf(1, 2), source.popularPages)
    }

    @Test
    fun `popular page 2 is skipped when not advertised`() {
        val source = TestSource()
        val input = """{"jarPath":"example.jar","sourceId":null,"operations":["popular","popular_next"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}"""

        val response = ExtensionProbeRunner.runRequest(
            input,
            initializeAndroidCompat = {},
            loadExtension = { _, _ -> TestLoadedExtension(listOf(source)) },
        )

        assertEquals(listOf(1), source.popularPages)
        assertEquals(ProbeStatus.SKIPPED, response.results.last().status)
    }

    @Test
    fun `latest invokes suspend API with first page when supported`() {
        val source = TestSource(supportsLatest = true)
        val input = """{"jarPath":"example.jar","sourceId":null,"operations":["latest"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}"""

        val response = ExtensionProbeRunner.runRequest(
            input,
            initializeAndroidCompat = {},
            loadExtension = { _, _ -> TestLoadedExtension(listOf(source)) },
        )

        assertEquals(1, source.latestPage)
        assertEquals(ProbeStatus.SUCCESS, response.results.single().status)
    }

    @Test
    fun `latest is skipped when unsupported`() {
        val source = TestSource()
        val input = """{"jarPath":"example.jar","sourceId":null,"operations":["latest"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}"""

        val response = ExtensionProbeRunner.runRequest(
            input,
            initializeAndroidCompat = {},
            loadExtension = { _, _ -> TestLoadedExtension(listOf(source)) },
        )

        assertEquals(null, source.latestPage)
        assertEquals(ProbeStatus.SKIPPED, response.results.single().status)
        assertEquals("supportsLatest = false", response.results.single().message)
    }

    @Test
    fun `dependent operations are skipped when listings return no manga`() {
        val source = TestSource(supportsLatest = true)
        val input = """{"jarPath":"example.jar","sourceId":null,"operations":["popular","latest","search","details","pages"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}"""
        val executedOperations = mutableListOf<ProbeOperation>()

        val response = ExtensionProbeRunner.runRequest(
            input,
            initializeAndroidCompat = {},
            loadExtension = { _, _ -> TestLoadedExtension(listOf(source)) },
            executeOperation = { _, operation, _, _, _ ->
                executedOperations += operation
                ProbeOperationData()
            },
        )

        assertEquals(listOf(ProbeOperation.POPULAR, ProbeOperation.LATEST), executedOperations)
        assertEquals(
            listOf(ProbeStatus.SUCCESS, ProbeStatus.SUCCESS, ProbeStatus.SKIPPED, ProbeStatus.SKIPPED, ProbeStatus.SKIPPED),
            response.results.map { it.status },
        )
        assertEquals("No manga was returned by popular or latest", response.results[2].message)
        assertEquals("No manga was returned by popular or latest", response.results[3].message)
        assertEquals("No usable chapter was available", response.results[4].message)
        assertEquals(null, response.selectedManga)
    }

    @Test
    fun `search uses a title from a prior listing with source default filters`() {
        val source = TestSource()
        val input = """{"jarPath":"example.jar","sourceId":null,"operations":["popular","search"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}"""

        val response = ExtensionProbeRunner.runRequest(
            input,
            initializeAndroidCompat = {},
            loadExtension = { _, _ -> TestLoadedExtension(listOf(source)) },
        )

        assertEquals(1, source.searchPage)
        assertEquals("Fixture Manga", source.searchQuery)
        assertSame(source.defaultSearchFilters, source.searchFilters)
        assertEquals("Fixture Manga", response.results.last().searchQuery)
        assertEquals(ProbeSelectedManga(ProbeOperation.POPULAR, 0, "Fixture Manga", "/manga/fixture"), response.selectedManga)
    }

    @Test
    fun `search selects first popular manga with initialized nonblank title and url`() {
        val invalidManga = SManga.create().apply { title = "" }
        val validManga = SManga.create().apply {
            url = "/manga/valid"
            title = "Valid Manga"
        }
        val source = TestSource(listOf(invalidManga, validManga))
        val input = """{"jarPath":"example.jar","sourceId":null,"operations":["popular","search"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}"""

        val response = ExtensionProbeRunner.runRequest(
            input,
            initializeAndroidCompat = {},
            loadExtension = { _, _ -> TestLoadedExtension(listOf(source)) },
        )

        assertEquals("Valid Manga", source.searchQuery)
        assertEquals(ProbeSelectedManga(ProbeOperation.POPULAR, 1, "Valid Manga", "/manga/valid"), response.selectedManga)
    }

    @Test
    fun `search uses latest fallback when popular has no usable manga`() {
        val source = TestSource(supportsLatest = true)
        val latestManga = SManga.create().apply {
            url = "/manga/latest"
            title = "Latest Manga"
        }
        var searchManga: SManga? = null
        val input = """{"jarPath":"example.jar","sourceId":null,"operations":["popular","latest","search"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}"""

        val response = ExtensionProbeRunner.runRequest(
            input,
            initializeAndroidCompat = {},
            loadExtension = { _, _ -> TestLoadedExtension(listOf(source)) },
            executeOperation = { _, operation, selectedManga, _, _ ->
                when (operation) {
                    ProbeOperation.POPULAR -> ProbeOperationData(mangas = listOf(SManga.create().apply { title = "" }))
                    ProbeOperation.LATEST -> ProbeOperationData(mangas = listOf(latestManga))
                    ProbeOperation.SEARCH -> {
                        searchManga = selectedManga
                        ProbeOperationData()
                    }
                    else -> error("Unexpected operation: $operation")
                }
            },
        )

        assertSame(latestManga, searchManga)
        assertEquals(ProbeSelectedManga(ProbeOperation.LATEST, 0, "Latest Manga", "/manga/latest"), response.selectedManga)
    }

    @Test
    fun `search and details use latest manga when latest finishes first`() {
        val source = TestSource(supportsLatest = true)
        val latestCompleted = CompletableDeferred<Unit>()
        val popularManga = SManga.create().apply {
            url = "/manga/popular"
            title = "Popular Manga"
        }
        val latestManga = SManga.create().apply {
            url = "/manga/latest"
            title = "Latest Manga"
        }
        var searchManga: SManga? = null
        var detailsManga: SManga? = null
        val input = """{"jarPath":"example.jar","sourceId":null,"operations":["popular","latest","search","details"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}"""

        val response = ExtensionProbeRunner.runRequest(
            input,
            initializeAndroidCompat = {},
            loadExtension = { _, _ -> TestLoadedExtension(listOf(source)) },
            executeOperation = { _, operation, selectedManga, _, _ ->
                when (operation) {
                    ProbeOperation.POPULAR -> {
                        latestCompleted.await()
                        ProbeOperationData(mangas = listOf(popularManga))
                    }
                    ProbeOperation.LATEST -> {
                        latestCompleted.complete(Unit)
                        ProbeOperationData(mangas = listOf(latestManga))
                    }
                    ProbeOperation.SEARCH -> {
                        searchManga = selectedManga
                        ProbeOperationData()
                    }
                    ProbeOperation.DETAILS -> {
                        detailsManga = selectedManga
                        ProbeOperationData()
                    }
                    else -> error("Unexpected operation: $operation")
                }
            },
        )

        assertSame(latestManga, searchManga)
        assertSame(latestManga, detailsManga)
        assertEquals(ProbeOperation.LATEST, response.selectedManga?.operation)
        assertEquals(0, response.selectedManga?.offset)
        assertEquals("Latest Manga", response.selectedManga?.title)
        assertEquals("/manga/latest", response.selectedManga?.url)
    }

    @Test
    fun `extension lib 1_6 reuses chapters returned by details`() {
        val source = TestSource(returnChaptersWithDetails = true)
        val input = """{"jarPath":"example.jar","sourceId":null,"operations":["popular","chapters","details"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}"""

        val response = ExtensionProbeRunner.runRequest(
            input,
            initializeAndroidCompat = {},
            loadExtension = { _, _ -> TestLoadedExtension(listOf(source)) },
        )

        assertSame(source.popularManga, source.detailsManga)
        assertTrue(source.detailsChapters?.isEmpty() == true)
        assertEquals(listOf(true to false), source.updateRequests)
        assertEquals("Detailed Fixture Manga", response.results.single { it.operation == ProbeOperation.DETAILS }.mangas.single().title)
        assertEquals("Chapter 1", response.results.single { it.operation == ProbeOperation.CHAPTERS }.chapters.single().name)
    }

    @Test
    fun `extension lib 1_6 requests chapters when details returns none`() {
        val source = TestSource()
        val input = """{"jarPath":"example.jar","sourceId":null,"operations":["popular","details","chapters"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}"""

        val response = ExtensionProbeRunner.runRequest(
            input,
            initializeAndroidCompat = {},
            loadExtension = { _, _ -> TestLoadedExtension(listOf(source)) },
        )

        assertEquals(listOf(true to false, false to true), source.updateRequests)
        assertEquals("Chapter 1", response.results[2].chapters.single().name)
    }

    @Test
    fun `combined details inherit blank identity from selected manga`() {
        val source = TestSource(blankDetailsIdentity = true)
        val input = """{"jarPath":"example.jar","sourceId":null,"operations":["popular","details"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}"""

        val response = ExtensionProbeRunner.runRequest(
            input,
            initializeAndroidCompat = {},
            loadExtension = { _, _ -> TestLoadedExtension(listOf(source)) },
        )

        assertEquals("Fixture Manga", response.results.last().mangas.single().title)
        assertEquals("/manga/fixture", response.results.last().mangas.single().url)
    }

    @Test
    fun `extension lib 1_4 uses legacy fetch API`() {
        val source = LegacyTestSource()
        val input = """{"jarPath":"example.jar","sourceId":null,"operations":["popular","latest","search","details","chapters","pages"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}"""

        val response = ExtensionProbeRunner.runRequest(
            input,
            initializeAndroidCompat = {},
            loadExtension = { _, _ -> TestLoadedExtension(listOf(source), LEGACY_TEST_METADATA) },
        )

        assertEquals(listOf("popular", "latest", "search", "details", "chapters", "pages", "image").sorted(), source.calls.sorted())
        assertTrue(response.results.all { it.status == ProbeStatus.SUCCESS })
        assertEquals("Legacy Manga", response.results.single { it.operation == ProbeOperation.DETAILS }.mangas.single().title)
        assertEquals("/manga/legacy", response.results.single { it.operation == ProbeOperation.DETAILS }.mangas.single().url)
        assertEquals("Chapter 1", response.results.single { it.operation == ProbeOperation.CHAPTERS }.chapters.single().name)
        assertEquals(0, response.results.single { it.operation == ProbeOperation.PAGES }.pages.single().index)
        assertEquals("https://example.test/page.jpg",
            response.results.single { it.operation == ProbeOperation.PAGES }.pages.single().imageUrl)
    }

    @Test
    fun `extension lib 1_4 reports interrupted blocking calls as timeouts`() {
        val source = object : HttpSource() {
            override val name = "Slow Legacy Test Source"
            override val lang = "en"
            override val baseUrl = "https://example.test"
            override val supportsLatest = false

            override fun fetchPopularManga(page: Int): Observable<MangasPage> = Observable.fromCallable {
                Thread.sleep(5_000)
                MangasPage(emptyList(), false)
            }
        }
        val input = """{"jarPath":"example.jar","sourceId":null,"operations":["popular"],"limits":{"operationTimeoutMillis":10,"responseSizeBytes":4096}}"""

        val response = ExtensionProbeRunner.runRequest(
            input,
            initializeAndroidCompat = {},
            loadExtension = { _, _ -> TestLoadedExtension(listOf(source), LEGACY_TEST_METADATA) },
        )

        assertEquals(ProbeStatus.TIMEOUT, response.results.single().status)
        assertEquals("kotlinx.coroutines.TimeoutCancellationException", response.results.single().exceptionClass)
    }

    @Test
    fun `full probe executes each necessary request once and skips unadvertised pages`() {
        val source = TestSource(supportsLatest = true)
        val manga = SManga.create().apply {
            url = "/manga/fixture"
            title = "Fixture Manga"
        }
        val chapter = SChapter.create().apply {
            url = "/chapter/fixture"
            name = "Chapter 1"
        }
        val executedOperations = mutableListOf<ProbeOperation>()
        var detailsManga: SManga? = null
        var pagesChapter: SChapter? = null
        val input = """{"jarPath":"example.jar","sourceId":null,"operations":["popular","popular_next","latest","latest_next","search","details","chapters","pages"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}"""

        val response = ExtensionProbeRunner.runRequest(
            input,
            initializeAndroidCompat = {},
            loadExtension = { _, _ -> TestLoadedExtension(listOf(source)) },
            executeOperation = { _, operation, selectedManga, selectedChapter, _ ->
                executedOperations += operation
                when (operation) {
                    ProbeOperation.POPULAR -> ProbeOperationData(mangas = listOf(manga), hasNextPage = false)
                    ProbeOperation.LATEST -> ProbeOperationData(hasNextPage = false)
                    ProbeOperation.SEARCH -> ProbeOperationData()
                    ProbeOperation.DETAILS -> {
                        detailsManga = selectedManga
                        ProbeOperationData(chapters = listOf(chapter))
                    }
                    ProbeOperation.PAGES -> {
                        pagesChapter = selectedChapter
                        ProbeOperationData()
                    }
                    else -> error("Page 2 should have been skipped")
                }
            },
        )

        assertEquals(
            listOf(
                ProbeOperation.POPULAR,
                ProbeOperation.LATEST,
                ProbeOperation.SEARCH,
                ProbeOperation.DETAILS,
                ProbeOperation.PAGES,
            ),
            executedOperations,
        )
        assertEquals(
            listOf(ProbeStatus.SKIPPED, ProbeStatus.SKIPPED),
            response.results.filter {
                it.operation in setOf(ProbeOperation.POPULAR_NEXT, ProbeOperation.LATEST_NEXT)
            }.map { it.status },
        )
        assertSame(manga, detailsManga)
        assertSame(chapter, pagesChapter)
    }

    @Test
    fun `pages use first usable chapter after invalid entry`() {
        val invalidChapter = SChapter.create().apply {
            url = "javascript:invalid"
            name = "Invalid Chapter"
        }
        val validChapter = SChapter.create().apply {
            url = "/chapter/valid"
            name = "Valid Chapter"
        }
        var pagesChapter: SChapter? = null
        val input = """{"jarPath":"example.jar","sourceId":null,"operations":["popular","details","chapters","pages"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}"""

        val response = ExtensionProbeRunner.runRequest(
            input,
            initializeAndroidCompat = {},
            loadExtension = { _, _ -> TestLoadedExtension(listOf(TestSource())) },
            executeOperation = { _, operation, _, selectedChapter, _ ->
                when (operation) {
                    ProbeOperation.POPULAR -> ProbeOperationData(mangas = listOf(fixtureManga()))
                    ProbeOperation.DETAILS -> ProbeOperationData()
                    ProbeOperation.CHAPTERS -> ProbeOperationData(chapters = listOf(invalidChapter, validChapter))
                    ProbeOperation.PAGES -> {
                        pagesChapter = selectedChapter
                        ProbeOperationData()
                    }
                    else -> error("Unexpected operation: $operation")
                }
            },
        )

        assertEquals(listOf("Invalid Chapter", "Valid Chapter"), response.results[2].chapters.map { it.name })
        assertEquals(ProbeChapter("/chapter/valid", "Valid Chapter", 0), response.results[2].selectedChapter)
        assertSame(validChapter, pagesChapter)
        assertEquals(ProbeStatus.SUCCESS, response.results[3].status)
    }

    @Test
    fun `pages can select a usable chapter offset from oldest`() {
        val newerChapter = SChapter.create().apply {
            url = "/chapter/newer"
            name = "Newer Chapter"
        }
        val oldestChapter = SChapter.create().apply {
            url = "/chapter/oldest"
            name = "Oldest Chapter"
        }
        var pagesChapter: SChapter? = null
        val input = """{"jarPath":"example.jar","sourceId":null,"chapterOffsetFromOldest":1,"operations":["popular","details","chapters","pages"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}"""

        val response = ExtensionProbeRunner.runRequest(
            input,
            initializeAndroidCompat = {},
            loadExtension = { _, _ -> TestLoadedExtension(listOf(TestSource())) },
            executeOperation = { _, operation, _, selectedChapter, _ ->
                when (operation) {
                    ProbeOperation.POPULAR -> ProbeOperationData(mangas = listOf(fixtureManga()))
                    ProbeOperation.DETAILS -> ProbeOperationData()
                    ProbeOperation.CHAPTERS -> ProbeOperationData(chapters = listOf(newerChapter, oldestChapter))
                    ProbeOperation.PAGES -> {
                        pagesChapter = selectedChapter
                        ProbeOperationData()
                    }
                    else -> error("Unexpected operation: $operation")
                }
            },
        )

        assertEquals(ProbeChapter("/chapter/newer", "Newer Chapter", 0), response.results[2].selectedChapter)
        assertSame(newerChapter, pagesChapter)
    }

    @Test
    fun `pages skip when all chapters are invalid`() {
        val chapters = listOf(
            SChapter.create().apply { url = "" },
            SChapter.create().apply { url = "/chapter/has\u0001control" },
        )
        var pagesExecuted = false
        val input = """{"jarPath":"example.jar","sourceId":null,"operations":["popular","details","chapters","pages"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}"""

        val response = ExtensionProbeRunner.runRequest(
            input,
            initializeAndroidCompat = {},
            loadExtension = { _, _ -> TestLoadedExtension(listOf(TestSource())) },
            executeOperation = { _, operation, _, _, _ ->
                when (operation) {
                    ProbeOperation.POPULAR -> ProbeOperationData(mangas = listOf(fixtureManga()))
                    ProbeOperation.DETAILS -> ProbeOperationData()
                    ProbeOperation.CHAPTERS -> ProbeOperationData(chapters = chapters)
                    ProbeOperation.PAGES -> {
                        pagesExecuted = true
                        ProbeOperationData()
                    }
                    else -> error("Unexpected operation: $operation")
                }
            },
        )

        assertEquals(2, response.results[2].chapters.size)
        assertEquals(false, pagesExecuted)
        assertEquals(ProbeStatus.SKIPPED, response.results[3].status)
        assertEquals("No usable chapter was available", response.results[3].message)
    }

    @Test
    fun `pages use oldest usable chapter from newest-first list`() {
        val newestChapter = SChapter.create().apply { url = "/chapter/2" }
        val firstChapter = SChapter.create().apply { url = "/chapter/1" }
        var pagesChapter: SChapter? = null
        val input = """{"jarPath":"example.jar","sourceId":null,"operations":["popular","details","chapters","pages"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}"""

        ExtensionProbeRunner.runRequest(
            input,
            initializeAndroidCompat = {},
            loadExtension = { _, _ -> TestLoadedExtension(listOf(TestSource())) },
            executeOperation = { _, operation, _, selectedChapter, _ ->
                when (operation) {
                    ProbeOperation.POPULAR -> ProbeOperationData(mangas = listOf(fixtureManga()))
                    ProbeOperation.DETAILS -> ProbeOperationData()
                    ProbeOperation.CHAPTERS -> ProbeOperationData(chapters = listOf(newestChapter, firstChapter))
                    ProbeOperation.PAGES -> {
                        pagesChapter = selectedChapter
                        ProbeOperationData()
                    }
                    else -> error("Unexpected operation: $operation")
                }
            },
        )

        assertSame(firstChapter, pagesChapter)
    }

    @Test
    fun `page image timeout does not discard successful page list`() {
        val manga = fixtureManga().apply { thumbnail_url = null }
        val chapter = SChapter.create().apply { url = "/chapter/fixture" }
        val page = Page(0, imageUrl = "https://example.test/page.jpg")
        val input = """{"jarPath":"example.jar","sourceId":null,"operations":["popular","details","chapters","pages"],"limits":{"operationTimeoutMillis":10,"responseSizeBytes":4096}}"""

        val response = ExtensionProbeRunner.runRequest(
            input,
            initializeAndroidCompat = {},
            loadExtension = { _, _ -> TestLoadedExtension(listOf(ThumbnailTestSource(imageDelayMillis = 100))) },
            executeOperation = { _, operation, _, _, _ ->
                when (operation) {
                    ProbeOperation.POPULAR -> ProbeOperationData(mangas = listOf(manga))
                    ProbeOperation.DETAILS -> ProbeOperationData()
                    ProbeOperation.CHAPTERS -> ProbeOperationData(chapters = listOf(chapter))
                    ProbeOperation.PAGES -> ProbeOperationData(pages = listOf(page))
                    else -> error("Unexpected operation: $operation")
                }
            },
        )

        val pages = response.results.single { it.operation == ProbeOperation.PAGES }
        assertEquals(ProbeStatus.SUCCESS, pages.status)
        assertEquals(listOf(ProbePage(0, "", page.imageUrl)), pages.pages)
        assertEquals("kotlinx.coroutines.TimeoutCancellationException", pages.firstPageImage?.exceptionClass)
    }

    @Test
    fun `page image resolves missing image URL through version-specific API`() {
        val resolvedImageUrl = "https://example.test/resolved.jpg"
        val input = """{"jarPath":"example.jar","sourceId":null,"operations":["popular","details","chapters","pages"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}"""
        listOf(
            TEST_METADATA to "getImageUrl",
            LEGACY_TEST_METADATA to "fetchImageUrl",
        ).forEach { (metadata, expectedResolver) ->
            val manga = fixtureManga().apply { thumbnail_url = null }
            val chapter = SChapter.create().apply { url = "/chapter/fixture" }
            val page = Page(0, url = "/page/fixture")
            val calls = mutableListOf<String>()
            val source = object : HttpSource() {
                override val name = "Deferred Image Test Source"
                override val lang = "en"
                override val baseUrl = "https://example.test"
                override val supportsLatest = false
                override val client = OkHttpClient.Builder()
                    .addInterceptor { chain ->
                        calls += "download:${chain.request().url}"
                        Response.Builder()
                            .request(chain.request())
                            .protocol(Protocol.HTTP_1_1)
                            .code(200)
                            .message("OK")
                            .body(ByteArray(0).toResponseBody("image/png".toMediaType()))
                            .build()
                    }
                    .build()

                override suspend fun getImageUrl(page: Page): String {
                    calls += "getImageUrl"
                    return resolvedImageUrl
                }

                @Suppress("DEPRECATION", "OVERRIDE_DEPRECATION")
                override fun fetchImageUrl(page: Page): Observable<String> {
                    calls += "fetchImageUrl"
                    return Observable.just(resolvedImageUrl)
                }
            }

            val response = ExtensionProbeRunner.runRequest(
                input,
                initializeAndroidCompat = {},
                loadExtension = { _, _ -> TestLoadedExtension(listOf(source), metadata) },
                executeOperation = { _, operation, _, _, _ ->
                    when (operation) {
                        ProbeOperation.POPULAR -> ProbeOperationData(mangas = listOf(manga))
                        ProbeOperation.DETAILS -> ProbeOperationData()
                        ProbeOperation.CHAPTERS -> ProbeOperationData(chapters = listOf(chapter))
                        ProbeOperation.PAGES -> ProbeOperationData(pages = listOf(page))
                        else -> error("Unexpected operation: $operation")
                    }
                },
            )

            val pages = response.results.single { it.operation == ProbeOperation.PAGES }
            assertEquals(listOf(expectedResolver, "download:$resolvedImageUrl"), calls)
            assertEquals(resolvedImageUrl, page.imageUrl)
            assertEquals(null, pages.firstPageImage?.exceptionClass)
        }
    }

    @Test
    fun `page image uses direct URL with source image request and client interceptor`() {
        val manga = fixtureManga().apply { thumbnail_url = null }
        val chapter = SChapter.create().apply { url = "/chapter/fixture" }
        val page = Page(7, url = "page-request-metadata", imageUrl = "https://example.test/direct.jpg")
        val source = ThumbnailTestSource()
        val input = """{"jarPath":"example.jar","sourceId":null,"operations":["popular","details","chapters","pages"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}"""

        val response = ExtensionProbeRunner.runRequest(
            input,
            initializeAndroidCompat = {},
            loadExtension = { _, _ -> TestLoadedExtension(listOf(source)) },
            executeOperation = { _, operation, _, _, _ ->
                when (operation) {
                    ProbeOperation.POPULAR -> ProbeOperationData(mangas = listOf(manga))
                    ProbeOperation.DETAILS -> ProbeOperationData()
                    ProbeOperation.CHAPTERS -> ProbeOperationData(chapters = listOf(chapter))
                    ProbeOperation.PAGES -> ProbeOperationData(pages = listOf(page))
                    else -> error("Unexpected operation: $operation")
                }
            },
        )

        val pages = response.results.single { it.operation == ProbeOperation.PAGES }
        assertSame(page, source.requestedPage)
        assertEquals(listOf(ProbePage(7, "page-request-metadata", page.imageUrl)), pages.pages)
        assertEquals(page.imageUrl, source.request?.url.toString())
        assertEquals(200, pages.firstPageImage?.statusCode)
        assertEquals(null, pages.firstPageImage?.exceptionClass)
    }

    @Test
    fun `page image rejects failed response`() {
        val manga = fixtureManga().apply { thumbnail_url = null }
        val chapter = SChapter.create().apply { url = "/chapter/fixture" }
        val page = Page(0, imageUrl = "https://example.test/missing.jpg")
        val source = ThumbnailTestSource(responseCode = 404)
        val input = """{"jarPath":"example.jar","sourceId":null,"operations":["popular","details","chapters","pages"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}"""

        val response = ExtensionProbeRunner.runRequest(
            input,
            initializeAndroidCompat = {},
            loadExtension = { _, _ -> TestLoadedExtension(listOf(source)) },
            executeOperation = { _, operation, _, _, _ ->
                when (operation) {
                    ProbeOperation.POPULAR -> ProbeOperationData(mangas = listOf(manga))
                    ProbeOperation.DETAILS -> ProbeOperationData()
                    ProbeOperation.CHAPTERS -> ProbeOperationData(chapters = listOf(chapter))
                    ProbeOperation.PAGES -> ProbeOperationData(pages = listOf(page))
                    else -> error("Unexpected operation: $operation")
                }
            },
        )

        val image = response.results.single { it.operation == ProbeOperation.PAGES }.firstPageImage
        assertEquals("eu.kanade.tachiyomi.network.HttpException", image?.exceptionClass)
        assertEquals(null, image?.statusCode)
    }

    @Test
    fun `operations start as soon as their dependencies complete`() {
        val manga = SManga.create().apply {
            url = "/manga/fixture"
            title = "Fixture Manga"
        }
        val chapter = SChapter.create().apply {
            url = "/chapter/fixture"
            name = "Chapter 1"
        }
        val latestStarted = CompletableDeferred<Unit>()
        val searchStarted = CompletableDeferred<Unit>()
        val popularNextStarted = CompletableDeferred<Unit>()
        val pagesStarted = CompletableDeferred<Unit>()
        val releaseLatest = CompletableDeferred<Unit>()
        val events = java.util.Collections.synchronizedList(mutableListOf<String>())
        val input = """{"jarPath":"example.jar","sourceId":null,"operations":["popular","popular_next","latest","latest_next","search","details","chapters","pages"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}"""

        val response = ExtensionProbeRunner.runRequest(
            input,
            initializeAndroidCompat = {},
            loadExtension = { _, _ -> TestLoadedExtension(listOf(TestSource(supportsLatest = true))) },
            executeOperation = { _, operation, _, selectedChapter, onChapters ->
                events += "$operation-start"
                when (operation) {
                    ProbeOperation.POPULAR -> {
                        latestStarted.await()
                        ProbeOperationData(mangas = listOf(manga), hasNextPage = true)
                    }
                    ProbeOperation.LATEST -> {
                        latestStarted.complete(Unit)
                        releaseLatest.await()
                        events += "$operation-finish"
                        ProbeOperationData(hasNextPage = true)
                    }
                    ProbeOperation.POPULAR_NEXT -> {
                        popularNextStarted.complete(Unit)
                        ProbeOperationData()
                    }
                    ProbeOperation.SEARCH -> {
                        searchStarted.complete(Unit)
                        ProbeOperationData()
                    }
                    ProbeOperation.DETAILS -> {
                        searchStarted.await()
                        popularNextStarted.await()
                        releaseLatest.complete(Unit)
                        ProbeOperationData()
                    }
                    ProbeOperation.CHAPTERS -> {
                        onChapters(listOf(chapter))
                        pagesStarted.await()
                        ProbeOperationData(chapters = listOf(chapter))
                    }
                    ProbeOperation.PAGES -> {
                        assertSame(chapter, selectedChapter)
                        pagesStarted.complete(Unit)
                        ProbeOperationData()
                    }
                    ProbeOperation.LATEST_NEXT -> ProbeOperationData()
                }
            },
        )

        assertTrue(events.indexOf("POPULAR-start") < events.indexOf("SEARCH-start"))
        assertTrue(events.indexOf("LATEST-start") < events.indexOf("SEARCH-start"))
        assertTrue(events.indexOf("SEARCH-start") < events.indexOf("LATEST-finish"))
        assertTrue(events.indexOf("POPULAR_NEXT-start") < events.indexOf("LATEST-finish"))
        assertTrue(events.indexOf("CHAPTERS-start") < events.indexOf("PAGES-start"))
        assertTrue(events.indexOf("LATEST-finish") < events.indexOf("LATEST_NEXT-start"))
        assertEquals(
            listOf("popular", "popular_next", "latest", "latest_next", "search", "details", "chapters", "pages"),
            response.results.map { it.operation.name.lowercase() },
        )
    }

    private class TestLoadedExtension(
        override val sources: List<HttpSource> = emptyList(),
        override val metadata: LoadedExtensionMetadata = TEST_METADATA,
    ) : LoadedExtension {
        var closed = false

        override fun close() {
            closed = true
        }
    }

    private fun fixtureManga() = SManga.create().apply {
        url = "/manga/fixture"
        title = "Fixture Manga"
    }

    @Suppress("DEPRECATION", "OVERRIDE_DEPRECATION")
    private class LegacyTestSource : HttpSource() {
        override val name = "Legacy Test Source"
        override val lang = "en"
        override val baseUrl = "https://example.test"
        override val supportsLatest = true
        val calls = java.util.Collections.synchronizedList(mutableListOf<String>())
        private val manga = SManga.create().apply {
            url = "/manga/legacy"
            title = "Legacy Manga"
        }
        private val chapter = SChapter.create().apply {
            url = "/chapter/legacy"
            name = "Chapter 1"
        }

        override fun fetchPopularManga(page: Int): Observable<MangasPage> {
            calls += "popular"
            return Observable.just(MangasPage(listOf(manga), false))
        }

        override fun fetchLatestUpdates(page: Int): Observable<MangasPage> {
            calls += "latest"
            return Observable.just(MangasPage(listOf(manga), false))
        }

        override fun getFilterList() = FilterList()

        override fun fetchSearchManga(page: Int, query: String, filters: FilterList): Observable<MangasPage> {
            calls += "search"
            return Observable.just(MangasPage(listOf(manga), false))
        }

        override fun fetchMangaDetails(manga: SManga): Observable<SManga> {
            calls += "details"
            return Observable.just(SManga.create())
        }

        override fun fetchChapterList(manga: SManga): Observable<List<SChapter>> {
            calls += "chapters"
            return Observable.just(listOf(chapter))
        }

        override fun fetchPageList(chapter: SChapter): Observable<List<Page>> {
            calls += "pages"
            return Observable.just(listOf(Page(0, imageUrl = "https://example.test/page.jpg")))
        }

        override fun fetchImage(page: Page): Observable<Response> {
            calls += "image"
            return Observable.just(
                Response.Builder()
                    .request(Request.Builder().url(requireNotNull(page.imageUrl)).build())
                    .protocol(Protocol.HTTP_1_1)
                    .code(200)
                    .message("OK")
                    .body(ByteArray(0).toResponseBody("image/png".toMediaType()))
                    .build(),
            )
        }
    }

    private class TestSource(
        private val returnedPopularMangas: List<SManga>? = null,
        override val supportsLatest: Boolean = false,
        private val hasPopularNextPage: Boolean = false,
        private val blankDetailsIdentity: Boolean = false,
        private val returnChaptersWithDetails: Boolean = false,
    ) : HttpSource() {
        override val name = "Test Source"
        override val lang = "en"
        override val baseUrl = "https://example.test"
        val popularPages = mutableListOf<Int>()
        val popularPage: Int? get() = popularPages.lastOrNull()
        var popularManga: SManga? = null
        var latestPage: Int? = null
        var searchPage: Int? = null
        var searchQuery: String? = null
        var searchFilters: FilterList? = null
        val defaultSearchFilters = FilterList()
        var detailsManga: SManga? = null
        var detailsChapters: List<SChapter>? = null
        var fetchDetails: Boolean? = null
        var fetchChapters: Boolean? = null
        val updateRequests = mutableListOf<Pair<Boolean, Boolean>>()

        override suspend fun getPopularManga(page: Int): MangasPage {
            popularPages += page
            val manga = SManga.create().apply {
                url = "/manga/fixture"
                title = "Fixture Manga"
                thumbnail_url = "https://example.test/cover.jpg"
            }
            popularManga = manga
            return MangasPage(returnedPopularMangas ?: listOf(manga), page == 1 && hasPopularNextPage)
        }

        override suspend fun getLatestUpdates(page: Int): MangasPage {
            latestPage = page
            return MangasPage(emptyList(), false)
        }

        override fun getFilterList() = defaultSearchFilters

        override suspend fun getSearchManga(page: Int, query: String, filters: FilterList): MangasPage {
            searchPage = page
            searchQuery = query
            searchFilters = filters
            return MangasPage(emptyList(), false)
        }

        override suspend fun getMangaUpdate(
            manga: SManga,
            chapters: List<SChapter>,
            fetchDetails: Boolean,
            fetchChapters: Boolean,
        ): SMangaUpdate {
            detailsManga = manga
            detailsChapters = chapters
            this.fetchDetails = fetchDetails
            this.fetchChapters = fetchChapters
            updateRequests += fetchDetails to fetchChapters
            val updatedManga = SManga.create().apply {
                url = if (blankDetailsIdentity) "" else manga.url
                title = if (blankDetailsIdentity) "" else "Detailed Fixture Manga"
                thumbnail_url = manga.thumbnail_url
            }
            val updatedChapters = if (fetchChapters || (fetchDetails && returnChaptersWithDetails)) {
                listOf(
                    SChapter.create().apply {
                        url = "/chapter/1"
                        name = "Chapter 1"
                    },
                )
            } else {
                emptyList()
            }
            return SMangaUpdate(updatedManga, updatedChapters)
        }
    }

    private class ThumbnailTestSource(
        private val imageDelayMillis: Long = 0,
        private val image: BufferedImage = BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB),
        private val responseCode: Int = 200,
        private val serverContentType: String = "image/png",
        override val supportsLatest: Boolean = false,
    ) : HttpSource() {
        override val name = "Thumbnail Test Source"
        override val lang = "en"
        override val baseUrl = "https://example.test"
        override fun headersBuilder() = Headers.Builder().add("User-Agent", "test")
        var request: Request? = null
        var requestedPage: Page? = null
        val requests = mutableListOf<Request>()
        override val client = OkHttpClient.Builder()
            .addInterceptor { chain ->
                request = chain.request()
                requests += chain.request()
                val deadline = System.nanoTime() + imageDelayMillis * 1_000_000
                while (System.nanoTime() < deadline) {
                    // Deliberately non-interruptible to exercise timeout evidence capture.
                }
                val output = ByteArrayOutputStream()
                ImageIO.write(image, "png", output)
                Response.Builder()
                    .request(chain.request())
                    .protocol(Protocol.HTTP_1_1)
                    .code(responseCode)
                    .message(if (responseCode in 200..299) "OK" else "Error")
                    .body(output.toByteArray().toResponseBody("image/png".toMediaType()))
                    .header("Content-Type", serverContentType)
                    .build()
            }
            .build()

        override suspend fun getPopularManga(page: Int) = MangasPage(
            listOf(
                SManga.create().apply {
                    url = "/manga/fixture"
                    title = "Fixture Manga"
                    thumbnail_url = "https://example.test/cover.jpg"
                },
            ),
            false,
        )

        override fun imageRequest(page: Page): Request {
            requestedPage = page
            return super.imageRequest(page).newBuilder().header("X-Image-Request", "used").build()
        }
    }

    private companion object {
        val TEST_METADATA = LoadedExtensionMetadata(
            extensionLibraryVersion = "1.6",
            entryPointClass = "fixture.Generated",
            sourceImplementationClass = "fixture.Source",
        )
        val LEGACY_TEST_METADATA = TEST_METADATA.copy(extensionLibraryVersion = "1.4")
    }
}
