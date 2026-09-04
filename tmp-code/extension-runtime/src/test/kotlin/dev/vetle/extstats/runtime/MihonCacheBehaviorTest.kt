package dev.vetle.extstats.runtime

import mockwebserver3.MockResponse
import mockwebserver3.MockWebServer
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.Request
import org.junit.jupiter.api.io.TempDir
import java.nio.file.Path
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class MihonCacheBehaviorTest {
    @Test
    fun `uses server cache directives for successes and redirects`(@TempDir tempDir: Path) {
        val server = MockWebServer()
        server.enqueue(
            MockResponse.Builder()
                .code(302)
                .addHeader("Location", "/target")
                .addHeader("Cache-Control", "public, max-age=3600")
                .build(),
        )
        server.enqueue(cacheableResponse("target"))
        server.start()
        val client = cachedClient(tempDir)
        val request = Request.Builder().url(server.url("/redirect")).build()

        try {
            repeat(2) {
                client.newCall(request).execute().use { response ->
                    assertEquals(200, response.code)
                    assertEquals("target", response.body.string())
                }
            }

            assertEquals(2, server.requestCount)
        } finally {
            close(client, server)
        }
    }

    @Test
    fun `does not force cache HTTP failures`(@TempDir tempDir: Path) {
        val server = MockWebServer()
        server.enqueue(MockResponse.Builder().code(503).body("first").build())
        server.enqueue(MockResponse.Builder().code(503).body("second").build())
        server.start()
        val client = cachedClient(tempDir)
        val request = Request.Builder().url(server.url("/failure")).build()

        try {
            client.newCall(request).execute().use { assertEquals("first", it.body.string()) }
            client.newCall(request).execute().use { assertEquals("second", it.body.string()) }

            assertEquals(2, server.requestCount)
        } finally {
            close(client, server)
        }
    }

    @Test
    fun `revalidates stale responses conditionally`(@TempDir tempDir: Path) {
        val server = MockWebServer()
        server.enqueue(
            MockResponse.Builder()
                .code(200)
                .addHeader("Cache-Control", "max-age=0")
                .addHeader("ETag", "v1")
                .body("cached")
                .build(),
        )
        server.enqueue(MockResponse.Builder().code(304).build())
        server.start()
        val client = cachedClient(tempDir)
        val request = Request.Builder().url(server.url("/conditional")).build()

        try {
            client.newCall(request).execute().close()
            client.newCall(request).execute().use { response ->
                assertEquals(200, response.code)
                assertEquals("cached", response.body.string())
                assertNotNull(response.cacheResponse)
                assertNotNull(response.networkResponse)
            }

            server.takeRequest()
            assertEquals("v1", server.takeRequest().headers["If-None-Match"])
        } finally {
            close(client, server)
        }
    }

    private fun cachedClient(directory: Path) = OkHttpClient.Builder()
        .cache(Cache(directory.toFile(), 1024 * 1024))
        .build()

    private fun cacheableResponse(body: String) = MockResponse.Builder()
        .code(200)
        .addHeader("Cache-Control", "public, max-age=3600")
        .body(body)
        .build()

    private fun close(client: OkHttpClient, server: MockWebServer) {
        client.cache?.close()
        client.dispatcher.executorService.shutdown()
        client.connectionPool.evictAll()
        server.close()
    }
}
