package dev.vetle.extstats.runtime

import eu.kanade.tachiyomi.network.interceptor.NetworkRequestLoggingInterceptor
import okhttp3.Protocol
import okhttp3.Request
import okhttp3.Response
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.Test
import kotlin.test.assertEquals

class NetworkRequestLoggingInterceptorTest {
    @Test
    fun `logs method URL and network cache status to stderr`() {
        assertEquals(
            "[network] POST https://example.test/manga cache=false${System.lineSeparator()}",
            captureErrorOutput(cached = false),
        )
    }

    @Test
    fun `logs cached responses`() {
        assertEquals(
            "[network] POST https://example.test/manga cache=true${System.lineSeparator()}",
            captureErrorOutput(cached = true),
        )
    }

    @Test
    fun `logs request range when set`() {
        assertEquals(
            "[network] POST https://example.test/manga range=bytes=100-199 cache=false${System.lineSeparator()}",
            captureErrorOutput(cached = false, range = "bytes=100-199"),
        )
    }

    private fun captureErrorOutput(cached: Boolean, range: String? = null): String {
        val errors = ByteArrayOutputStream()
        val originalError = System.err
        val request = Request.Builder()
            .url("https://example.test/manga")
            .post(okhttp3.FormBody.Builder().build())
            .apply { range?.let { header("Range", it) } }
            .build()
        val response = Response.Builder()
            .request(request)
            .protocol(Protocol.HTTP_1_1)
            .code(200)
            .message("OK")
            .apply {
                if (cached) {
                    cacheResponse(
                        Response.Builder()
                            .request(request)
                            .protocol(Protocol.HTTP_1_1)
                            .code(200)
                            .message("OK")
                            .build(),
                    )
                }
            }
            .build()
        System.setErr(PrintStream(errors))
        try {
            NetworkRequestLoggingInterceptor().log(request, response)
        } finally {
            System.setErr(originalError)
        }
        return errors.toString()
    }
}
