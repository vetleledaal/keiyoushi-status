package dev.vetle.extstats.runtime

import eu.kanade.tachiyomi.network.interceptor.ResponseCacheInterceptor
import eu.kanade.tachiyomi.network.interceptor.ResponseCachePolicyInterceptor
import mockwebserver3.MockResponse
import mockwebserver3.MockWebServer
import okhttp3.Cache
import okhttp3.Dns
import okhttp3.OkHttpClient
import okhttp3.Request
import java.net.InetAddress
import java.nio.file.Files
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class ResponseCacheInterceptorTest {
    @Test
    fun `preserves request cache directives`() {
        val server = MockWebServer()
        server.enqueue(response(200, "success"))
        server.start()
        val client = OkHttpClient.Builder()
            .addInterceptor(ResponseCacheInterceptor())
            .build()

        try {
            client.newCall(
                Request.Builder()
                    .url(server.url("/request"))
                    .header("Cache-Control", "no-cache, no-store, max-age=0")
                    .header("Pragma", "no-cache")
                    .build(),
            ).execute().close()

            val request = server.takeRequest()
            assertEquals("no-cache, no-store, max-age=0", request.headers["Cache-Control"])
            assertEquals("no-cache", request.headers["Pragma"])
        } finally {
            client.dispatcher.executorService.shutdown()
            client.connectionPool.evictAll()
            server.close()
        }
    }

    @Test
    fun `caches successful and failing responses despite response cache directives`() {
        val cacheDirectory = Files.createTempDirectory("response-cache-test")
        val server = MockWebServer()
        server.enqueue(response(200, "success"))
        server.enqueue(response(500, "failure"))
        server.start()
        val client = OkHttpClient.Builder()
            .cache(Cache(cacheDirectory.toFile(), 1024 * 1024))
            .addInterceptor(ResponseCacheInterceptor())
            .addNetworkInterceptor(ResponseCachePolicyInterceptor())
            .build()

        try {
            assertResponse(client, server.url("/success").toString(), 200, "success", cached = false)
            assertResponse(client, server.url("/success").toString(), 200, "success", cached = true)
            assertResponse(client, server.url("/failure").toString(), 500, "failure", cached = false)
            assertResponse(client, server.url("/failure").toString(), 500, "failure", cached = true)
            assertEquals(2, server.requestCount)
        } finally {
            client.cache?.close()
            client.dispatcher.executorService.shutdown()
            client.connectionPool.evictAll()
            server.close()
            cacheDirectory.toFile().deleteRecursively()
        }
    }

    @Test
    fun `caches byte ranges independently`() {
        val cacheDirectory = Files.createTempDirectory("response-range-cache-test")
        val server = MockWebServer()
        server.enqueue(response(206, "first"))
        server.enqueue(response(206, "second"))
        server.start()
        val client = OkHttpClient.Builder()
            .cache(Cache(cacheDirectory.toFile(), 1024 * 1024))
            .addInterceptor(ResponseCacheInterceptor())
            .addNetworkInterceptor(ResponseCachePolicyInterceptor())
            .build()
        val url = server.url("/data").toString()

        try {
            assertRangeResponse(client, url, "bytes=0-4", "first", cached = false)
            assertRangeResponse(client, url, "bytes=0-4", "first", cached = true)
            assertRangeResponse(client, url, "bytes=5-10", "second", cached = false)
            assertRangeResponse(client, url, "bytes=5-10", "second", cached = true)
            assertRangeResponse(client, url, "bytes=0-4", "first", cached = true)
            assertEquals(2, server.requestCount)
        } finally {
            client.cache?.close()
            client.dispatcher.executorService.shutdown()
            client.connectionPool.evictAll()
            server.close()
            cacheDirectory.toFile().deleteRecursively()
        }
    }

    @Test
    fun `ignores Hitomi galleries index version cache buster`() {
        val cacheDirectory = Files.createTempDirectory("hitomi-response-cache-test")
        val server = MockWebServer()
        server.enqueue(response(200, "version"))
        server.start()
        val client = OkHttpClient.Builder()
            .cache(Cache(cacheDirectory.toFile(), 1024 * 1024))
            .dns(Dns { listOf(InetAddress.getLoopbackAddress()) })
            .addInterceptor(ResponseCacheInterceptor())
            .addNetworkInterceptor(ResponseCachePolicyInterceptor())
            .build()
        val baseUrl = server.url("/galleriesindex/version").newBuilder()
            .host("ltn.gold-usergeneratedcontent.net")
            .build()

        try {
            assertResponse(client, "$baseUrl?_=1000", 200, "version", cached = false)
            assertResponse(client, "$baseUrl?_=2000", 200, "version", cached = true)
            assertEquals(1, server.requestCount)
            assertEquals("/galleriesindex/version", server.takeRequest().url.encodedPath)
        } finally {
            client.cache?.close()
            client.dispatcher.executorService.shutdown()
            client.connectionPool.evictAll()
            server.close()
            cacheDirectory.toFile().deleteRecursively()
        }
    }

    private fun response(code: Int, body: String) = MockResponse.Builder()
        .code(code)
        .body(body)
        .addHeader("Cache-Control", "private, no-store, no-cache, must-revalidate")
        .build()

    private fun assertResponse(client: OkHttpClient, url: String, code: Int, body: String, cached: Boolean) {
        val request = Request.Builder()
            .url(url)
            .build()
        client.newCall(request).execute().use { response ->
            assertEquals(code, response.code)
            assertEquals(body, response.body.string())
            assertEquals(
                "public, max-age=${if (code in 200..299) 5_184_000 else 30}",
                response.header("Cache-Control"),
            )
            if (cached) assertNotNull(response.cacheResponse)
        }
    }

    private fun assertRangeResponse(client: OkHttpClient, url: String, range: String, body: String, cached: Boolean) {
        val request = Request.Builder()
            .url(url)
            .header("Range", range)
            .build()
        client.newCall(request).execute().use { response ->
            assertEquals(206, response.code)
            assertEquals(body, response.body.string())
            if (cached) assertNotNull(response.cacheResponse)
        }
    }
}
