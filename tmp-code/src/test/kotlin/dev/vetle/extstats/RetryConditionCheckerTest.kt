package dev.vetle.extstats

import dev.vetle.extstats.core.RetryCondition
import dev.vetle.extstats.core.RetryConditionChecker
import dev.vetle.extstats.core.RetryConditionRequest
import dev.vetle.extstats.core.RetryConditionType
import java.time.Clock
import java.time.Instant
import java.time.ZoneOffset
import kotlin.test.Test
import kotlin.test.assertEquals

class RetryConditionCheckerTest {
    @Test
    fun `checks local retry time and harness revision conditions`() {
        val checker =
            RetryConditionChecker(
                clock = Clock.fixed(Instant.parse("2026-09-01T12:02:00Z"), ZoneOffset.UTC),
                currentRevision = { "new-revision" },
                hostResolves = { error("DNS probe must not run") },
                tlsHandshakeSucceeds = { error("TLS probe must not run") },
            )
        val requests =
            listOf(
                request(RetryConditionType.RETRY_TIME_REACHED, "120", "2026-09-01T12:00:00Z"),
                request(RetryConditionType.RETRY_TIME_REACHED, "121", "2026-09-01T12:00:00Z"),
                request(RetryConditionType.RETRY_TIME_REACHED, "Tue, 1 Sep 2026 12:01:00 GMT"),
                request(RetryConditionType.HARNESS_REVISION_CHANGES, "java.lang.NoSuchMethodError", "old-revision"),
                request(RetryConditionType.HARNESS_REVISION_CHANGES, "java.lang.NoSuchMethodError", "new-revision"),
            )

        assertEquals(listOf(true, false, true, true, false), requests.map { checker.check(listOf(it)).single().met })
    }

    @Test
    fun `runs each distinct network condition once`() {
        val dnsHosts = mutableListOf<String>()
        val tlsHosts = mutableListOf<String>()
        val checker =
            RetryConditionChecker(
                currentRevision = { "revision" },
                hostResolves = { host ->
                    dnsHosts += host
                    host == "resolved.test"
                },
                tlsHandshakeSucceeds = { host ->
                    tlsHosts += host
                    host == "secure.test"
                },
            )
        val dns = request(RetryConditionType.HOST_RESOLVES, "resolved.test")
        val tls = request(RetryConditionType.TLS_HANDSHAKE_SUCCEEDS, "secure.test")

        val checks = checker.check(listOf(dns, dns, tls, tls))

        assertEquals(listOf("resolved.test"), dnsHosts)
        assertEquals(listOf("secure.test"), tlsHosts)
        assertEquals(2, checks.size)
        assertEquals(true, checks.all { it.met })
    }

    private fun request(
        type: RetryConditionType,
        value: String,
        baseline: String? = null,
    ) = RetryConditionRequest(RetryCondition(type, value), baseline)
}
