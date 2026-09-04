package dev.vetle.extstats.runtime

import eu.kanade.tachiyomi.network.interceptor.UserAgentInterceptor
import mockwebserver3.MockResponse
import mockwebserver3.MockWebServer
import okhttp3.OkHttpClient
import okhttp3.Request
import kotlin.test.Test
import kotlin.test.assertEquals

class UserAgentInterceptorTest {
    private val defaultUserAgent = "default-user-agent"

    @Test
    fun `preserves an extension-provided user agent`() {
        assertUserAgent("extension-user-agent", "extension-user-agent")
    }

    @Test
    fun `adds the default user agent when absent`() {
        assertUserAgent(null, defaultUserAgent)
    }

    @Test
    fun `replaces an empty user agent with the default`() {
        assertUserAgent("", defaultUserAgent)
    }

    private fun assertUserAgent(requestUserAgent: String?, expectedUserAgent: String) {
        val server = MockWebServer()
        server.enqueue(MockResponse())
        server.start()
        val client = OkHttpClient.Builder()
            .addInterceptor(UserAgentInterceptor { defaultUserAgent })
            .build()
        val request = Request.Builder()
            .url(server.url("/request"))
            .apply { requestUserAgent?.let { header("User-Agent", it) } }
            .build()

        try {
            client.newCall(request).execute().close()

            assertEquals(expectedUserAgent, server.takeRequest().headers["User-Agent"])
        } finally {
            client.dispatcher.executorService.shutdown()
            client.connectionPool.evictAll()
            server.close()
        }
    }
}
