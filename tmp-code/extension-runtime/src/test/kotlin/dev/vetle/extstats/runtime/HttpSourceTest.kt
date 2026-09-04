package dev.vetle.extstats.runtime

import eu.kanade.tachiyomi.network.HttpException
import eu.kanade.tachiyomi.network.NetworkFailureEvidence
import eu.kanade.tachiyomi.network.NetworkFailureIOException
import eu.kanade.tachiyomi.network.awaitSuccess
import eu.kanade.tachiyomi.source.model.MangasPage
import eu.kanade.tachiyomi.source.model.Page
import eu.kanade.tachiyomi.source.model.SChapter
import eu.kanade.tachiyomi.source.model.SManga
import eu.kanade.tachiyomi.source.online.HttpSource
import kotlinx.coroutines.runBlocking
import mockwebserver3.MockResponse
import mockwebserver3.MockWebServer
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import java.io.IOException
import java.nio.file.Files
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertNull

class HttpSourceTest {
    @Test
    fun `URL helpers match Mihon URI handling`() {
        val client = OkHttpClient()
        val source = TestHttpSource(client, "https://example.com/")
        val manga = SManga.create()
        val chapter = SChapter.create()

        try {
            source.run {
                manga.setUrlWithoutDomain("https://example.com/manga%20title?lang=en%20us#part%201")
                chapter.setUrlWithoutDomain("chapters/chapter 1?quality=high")
            }

            assertEquals("/manga title?lang=en us#part 1", manga.url)
            assertEquals("chapters/chapter 1?quality=high", chapter.url)

            source.run {
                manga.setUrlWithoutDomain("https://example.com/%zz")
                chapter.setUrlWithoutDomain("chapter[1]")
            }

            assertEquals("https://example.com/%zz", manga.url)
            assertEquals("chapter[1]", chapter.url)
        } finally {
            client.dispatcher.executorService.shutdown()
            client.connectionPool.evictAll()
        }
    }

    @Test
    fun `public URLs use overridable request methods`() {
        val client = OkHttpClient()
        val source = TestHttpSource(client, "https://example.com/").apply {
            mangaDetailsRequestUrl = "https://manga.example/overridden"
            pageListRequestUrl = "https://chapter.example/overridden"
        }
        val chapter = SChapter.create().apply { url = "/chapter" }

        try {
            assertEquals("https://manga.example/overridden", source.getMangaUrl(testManga()))
            assertEquals("https://chapter.example/overridden", source.getChapterUrl(chapter))
        } finally {
            client.dispatcher.executorService.shutdown()
            client.connectionPool.evictAll()
        }
    }

    @Test
    fun `legacy manga details are initialized only after successful parsing`() {
        val server = MockWebServer()
        repeat(2) { server.enqueue(MockResponse.Builder().code(200).build()) }
        server.start()
        val client = OkHttpClient()
        val source = TestHttpSource(client, server.url("/").toString())

        try {
            @Suppress("DEPRECATION")
            val details = source.fetchMangaDetails(testManga()).toBlocking().single()
            assertEquals(true, details.initialized)

            source.parsedDetails.initialized = false
            source.detailParserFailure = IllegalStateException("parse failed")
            assertFailsWith<IllegalStateException> {
                @Suppress("DEPRECATION")
                source.fetchMangaDetails(testManga()).toBlocking().single()
            }
            assertFalse(source.parsedDetails.initialized)
        } finally {
            client.dispatcher.executorService.shutdown()
            client.connectionPool.evictAll()
            server.close()
        }
    }

    @Test
    fun `legacy observable rejects non-success response before parsing`() {
        val server = MockWebServer()
        server.enqueue(MockResponse.Builder().code(404).addHeader("Retry-After", "120").build())
        server.start()
        val client = OkHttpClient()
        val source = TestHttpSource(client, server.url("/").toString())

        try {
            val error = assertFailsWith<HttpException> {
                @Suppress("DEPRECATION")
                source.fetchPopularManga(1).toBlocking().single()
            }

            assertEquals(404, error.code)
            val evidence = error.suppressed.filterIsInstance<NetworkFailureEvidence>().single()
            assertEquals(404, evidence.statusCode)
            assertEquals(server.hostName, evidence.host)
            assertEquals("120", evidence.retryAfter)
            assertFalse(source.parserCalled)
        } finally {
            client.dispatcher.executorService.shutdown()
            client.connectionPool.evictAll()
            server.close()
        }
    }

    @Test
    fun `suspend call preserves host on transport failure`() {
        val server = MockWebServer()
        server.start()
        val requestUrl = server.url("/unavailable")
        val host = server.hostName
        server.close()
        val client = OkHttpClient()

        try {
            val error = assertFailsWith<IOException> {
                runBlocking { client.newCall(Request.Builder().url(requestUrl).build()).awaitSuccess() }
            }

            val evidence = (error as NetworkFailureIOException).evidence
            assertEquals(host, evidence.host)
            assertEquals(null, evidence.statusCode)
            assertEquals(null, evidence.retryAfter)
        } finally {
            client.dispatcher.executorService.shutdown()
            client.connectionPool.evictAll()
        }
    }

    @Test
    fun `legacy observable creates a new call when retried`() {
        val server = MockWebServer()
        server.enqueue(MockResponse.Builder().code(503).build())
        server.enqueue(MockResponse.Builder().code(200).build())
        server.start()
        val client = OkHttpClient()
        val source = TestHttpSource(client, server.url("/").toString())

        try {
            @Suppress("DEPRECATION")
            source.fetchPopularManga(1).retry(1).toBlocking().single()

            assertEquals(2, server.requestCount)
        } finally {
            client.dispatcher.executorService.shutdown()
            client.connectionPool.evictAll()
            server.close()
        }
    }

    @Test
    fun `image APIs bypass the HTTP cache`() {
        val server = MockWebServer()
        repeat(4) { index ->
            server.enqueue(
                MockResponse.Builder()
                    .code(200)
                    .addHeader("Cache-Control", "public, max-age=3600")
                    .body("response-$index")
                    .build(),
            )
        }
        server.start()
        val client = OkHttpClient.Builder()
            .cache(Cache(Files.createTempDirectory("image-cache").toFile(), 1024 * 1024))
            .build()
        val source = TestHttpSource(client, server.url("/").toString())
        val page = Page(0, imageUrl = server.url("/image").toString())

        try {
            val observable = source.fetchImage(page)
            observable.toBlocking().single().close()
            observable.toBlocking().single().close()
            runBlocking {
                source.getImage(page).close()
                source.getImage(page).close()
            }

            assertEquals(4, server.requestCount)
        } finally {
            client.cache?.delete()
            client.dispatcher.executorService.shutdown()
            client.connectionPool.evictAll()
            server.close()
        }
    }

    @Test
    fun `image APIs reject non-success responses`() {
        val server = MockWebServer()
        repeat(2) { server.enqueue(MockResponse.Builder().code(404).build()) }
        server.start()
        val client = OkHttpClient()
        val source = TestHttpSource(client, server.url("/").toString())
        val page = Page(0, imageUrl = server.url("/image").toString())

        try {
            val legacyError = assertFailsWith<HttpException> {
                source.fetchImage(page).toBlocking().single()
            }
            val suspendError = assertFailsWith<HttpException> {
                runBlocking { source.getImage(page).close() }
            }

            assertEquals(404, legacyError.code)
            assertEquals(404, suspendError.code)
        } finally {
            client.dispatcher.executorService.shutdown()
            client.connectionPool.evictAll()
            server.close()
        }
    }

    @Test
    fun `image APIs report progress and resume partial downloads`() {
        val server = MockWebServer()
        server.enqueue(MockResponse.Builder().code(200).body("legacy").build())
        server.enqueue(MockResponse.Builder().code(206).body("resume").build())
        server.start()
        val client = OkHttpClient()
        val source = TestHttpSource(client, server.url("/").toString())
        val page = Page(0, imageUrl = server.url("/image").toString())

        try {
            source.fetchImage(page).toBlocking().single().use { it.body.bytes() }
            assertEquals(100, page.progress)

            page.progress = 0
            runBlocking { source.getImage(page, existingSize = 4).use { it.body.bytes() } }

            assertNull(server.takeRequest().headers["Range"])
            assertEquals("bytes=4-", server.takeRequest().headers["Range"])
            assertEquals(100, page.progress)
        } finally {
            client.dispatcher.executorService.shutdown()
            client.connectionPool.evictAll()
            server.close()
        }
    }
}

private fun testManga() = SManga.create().apply {
    url = "/manga"
    title = "Manga"
}

private class TestHttpSource(
    override val client: OkHttpClient,
    override val baseUrl: String,
) : HttpSource() {
    override val name = "HTTP source fixture"
    override val lang = "en"
    override val supportsLatest = false
    var parserCalled = false
    val parsedDetails = SManga.create()
    var detailParserFailure: RuntimeException? = null
    var mangaDetailsRequestUrl: String? = null
    var pageListRequestUrl: String? = null

    override fun mangaDetailsRequest(manga: SManga): Request = Request.Builder().url(mangaDetailsRequestUrl ?: baseUrl + manga.url).build()

    override fun pageListRequest(chapter: SChapter): Request = Request.Builder().url(pageListRequestUrl ?: baseUrl + chapter.url).build()

    override fun mangaDetailsParse(response: Response): SManga {
        detailParserFailure?.let { throw it }
        return parsedDetails
    }

    override fun popularMangaRequest(page: Int): Request = Request.Builder().url(baseUrl).build()

    override fun popularMangaParse(response: Response): MangasPage {
        parserCalled = true
        return MangasPage(emptyList(), false)
    }
}
