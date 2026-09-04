package dev.vetle.extstats.runtime

import eu.kanade.tachiyomi.network.DELETE
import eu.kanade.tachiyomi.network.GET
import eu.kanade.tachiyomi.network.POST
import eu.kanade.tachiyomi.network.PUT
import okhttp3.CacheControl
import okhttp3.FormBody
import okhttp3.Headers
import okhttp3.HttpUrl.Companion.toHttpUrl
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class RequestsTest {
    @Test
    fun `builds legacy get requests from string and HttpUrl`() {
        val url = "https://example.test/manga"

        assertEquals(url, GET(url).url.toString())
        assertEquals(url, GET(url.toHttpUrl()).url.toString())
    }

    @Test
    fun `builds requests with Mihon defaults`() {
        listOf(
            "POST" to POST("https://example.test/post"),
            "PUT" to PUT("https://example.test/put"),
            "DELETE" to DELETE("https://example.test/delete"),
        ).forEach { (method, request) ->
            assertEquals(method, request.method)
            assertNotNull(request.body)
            assertEquals("max-age=600", request.header("Cache-Control"))
            assertNull(request.tag())
        }
    }

    @Test
    fun `preserves explicit headers bodies and cache directives`() {
        val headers = Headers.Builder().add("X-Test", "value").build()
        val body = FormBody.Builder().add("query", "manga").build()
        val cache = CacheControl.Builder().noStore().build()
        val request = POST("https://example.test/search", headers, body, cache)

        assertEquals("value", request.header("X-Test"))
        assertEquals(body, request.body)
        assertEquals("no-store", request.header("Cache-Control"))
    }
}
