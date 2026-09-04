package dev.vetle.extstats.core

import java.net.InetAddress
import java.net.InetSocketAddress
import java.time.Clock
import java.time.Instant
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import javax.net.ssl.SSLSocket
import javax.net.ssl.SSLSocketFactory

data class RetryConditionRequest(
    val condition: RetryCondition,
    val baseline: String? = null,
)

data class RetryConditionCheck(
    val request: RetryConditionRequest,
    val met: Boolean,
)

class RetryConditionChecker(
    private val clock: Clock = Clock.systemUTC(),
    private val currentRevision: () -> String,
    private val hostResolves: (String) -> Boolean,
    private val tlsHandshakeSucceeds: (String) -> Boolean,
) {
    fun check(requests: Collection<RetryConditionRequest>): List<RetryConditionCheck> = requests
        .distinct()
        .sortedWith(compareBy({ it.condition.type.name }, { it.condition.value }, { it.baseline }))
        .map { request -> RetryConditionCheck(request, conditionMet(request)) }

    private fun conditionMet(request: RetryConditionRequest): Boolean = when (request.condition.type) {
        RetryConditionType.RETRY_TIME_REACHED -> {
            retryTimeReached(request.condition.value, request.baseline)
        }
        RetryConditionType.HOST_RESOLVES -> {
            hostResolves(request.condition.value)
        }
        RetryConditionType.TLS_HANDSHAKE_SUCCEEDS -> {
            tlsHandshakeSucceeds(request.condition.value)
        }
        RetryConditionType.HARNESS_REVISION_CHANGES -> {
            request.baseline
                ?.takeUnless { it == "unknown" }
                ?.let { currentRevision().takeUnless { revision -> revision == "unknown" } != it }
                ?: false
        }
    }

    private fun retryTimeReached(
        value: String,
        baseline: String?,
    ): Boolean {
        val deadline =
            value.toLongOrNull()?.takeIf { it >= 0 }?.let { seconds ->
                baseline?.let { runCatching { Instant.parse(it) }.getOrNull() }?.plusSeconds(seconds)
            } ?: runCatching { ZonedDateTime.parse(value, DateTimeFormatter.RFC_1123_DATE_TIME).toInstant() }.getOrNull()
        return deadline?.let { !clock.instant().isBefore(it) } ?: false
    }
}

fun boundedRetryConditionChecker(
    timeoutMillis: Long,
    currentRevision: () -> String,
): RetryConditionChecker {
    require(timeoutMillis > 0) { "Retry condition timeout must be positive" }
    return RetryConditionChecker(
        currentRevision = currentRevision,
        hostResolves = { host -> bounded(timeoutMillis) { InetAddress.getAllByName(host).isNotEmpty() } },
        tlsHandshakeSucceeds = { host ->
            bounded(timeoutMillis) {
                (SSLSocketFactory.getDefault().createSocket() as SSLSocket).use { socket ->
                    socket.connect(InetSocketAddress(host, 443), timeoutMillis.toInt())
                    socket.soTimeout = timeoutMillis.toInt()
                    socket.startHandshake()
                    true
                }
            }
        },
    )
}

private fun bounded(
    timeoutMillis: Long,
    probe: () -> Boolean,
): Boolean {
    val executor =
        Executors.newSingleThreadExecutor { runnable ->
            Thread(runnable, "retry-condition-probe").apply { isDaemon = true }
        }
    return try {
        runCatching { executor.submit(probe).get(timeoutMillis, TimeUnit.MILLISECONDS) }.getOrDefault(false)
    } finally {
        executor.shutdownNow()
    }
}
