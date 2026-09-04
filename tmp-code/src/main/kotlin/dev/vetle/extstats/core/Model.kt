package dev.vetle.extstats.core

import java.net.URI
import java.nio.file.Path

enum class RedactionMode {
    NONE,
    URLS_AND_SENSITIVE,
    SENSITIVE,
    ;

    companion object {
        fun parse(value: String): RedactionMode = when (value) {
            "none" -> NONE
            "urls-and-sensitive" -> URLS_AND_SENSITIVE
            "sensitive" -> SENSITIVE
            else -> error("Unknown redaction mode '$value'; expected none, urls-and-sensitive, or sensitive")
        }
    }
}

data class ValidationConfig(
    val extensionName: String,
    val jarUrl: String,
    val reportPath: Path,
    val sourceId: Long? = null,
    val timeoutMillis: Long = 130_000L,
    val redactionMode: RedactionMode = RedactionMode.URLS_AND_SENSITIVE,
) {
    val artifactType: ExtensionArtifactType
        get() = ExtensionArtifactType.fromUrl(jarUrl)
}

data class ValidationResult(
    val extensionName: String,
    val checks: List<CheckResult>,
    val evidence: ReportEvidence? = null,
    val artifactType: ExtensionArtifactType? = null,
) {
    val passed: Int get() = checks.count { it.status == CheckStatus.PASS }
    val lint: Int get() = checks.count { it.status == CheckStatus.LINT }
    val warnings: Int get() = checks.count { it.status == CheckStatus.UNUSUAL }
    val skipped: Int get() = checks.count { it.status == CheckStatus.SKIP }
    val failed: Int get() = checks.count { it.status in setOf(CheckStatus.FAIL, CheckStatus.ERROR, CheckStatus.TIMEOUT) }
    val infrastructureFailures: Int get() = checks.count(CheckResult::blocksBuild)
    val retrySummary: RetrySummary
        get() {
            val failedChecks = checks.filter { it.status in FAILED_CHECK_STATUSES }
            val disposition =
                when {
                    failedChecks.isEmpty() -> ReportRetryDisposition.NOT_APPLICABLE
                    failedChecks.any { it.retryAdvice.disposition == RetryDisposition.RETRY_NOW } -> ReportRetryDisposition.RETRY_NOW
                    failedChecks.any { it.retryAdvice.disposition == RetryDisposition.RETRY_WHEN } -> ReportRetryDisposition.RETRY_WHEN
                    failedChecks.any { it.retryAdvice.disposition == RetryDisposition.REVIEW } -> ReportRetryDisposition.REVIEW
                    else -> ReportRetryDisposition.DO_NOT_RETRY
                }
            val conditions =
                if (disposition == ReportRetryDisposition.RETRY_WHEN) {
                    failedChecks
                        .filter { it.retryAdvice.disposition == RetryDisposition.RETRY_WHEN }
                        .mapNotNull { it.retryAdvice.condition }
                        .distinct()
                        .sortedWith(
                            compareBy<RetryCondition>({ it.type.name }, RetryCondition::value),
                        )
                } else {
                    emptyList()
                }
            return RetrySummary(disposition, conditions)
        }
}

data class RetrySummary(
    val disposition: ReportRetryDisposition,
    val conditions: List<RetryCondition>,
)

data class ProbeValidationResult(
    val checks: List<CheckResult>,
    val evidence: ReportEvidence? = null,
)

data class ReportEvidence(
    val extensionLibraryVersion: String,
    val entryPointClass: String,
    val sourceImplementationClass: String,
    val sourceId: Long,
    val sourceName: String,
    val sourceLanguage: String,
    val operations: List<OperationEvidence>,
    val selectedManga: SelectedMangaEvidence? = null,
)

data class SelectedMangaEvidence(
    val operation: String,
    val offset: Int,
    val title: String?,
    val url: String?,
)

data class OperationEvidence(
    val operation: String,
    val method: String,
    val status: String,
    val entryCount: Int,
    val selectedTitle: String?,
    val selectedUrl: String?,
    val exceptionClass: String?,
    val exceptionMessage: String?,
    val elapsedTimeMillis: Long,
)

data class CheckResult(
    val name: String,
    val status: CheckStatus,
    val details: String,
    val blocksBuild: Boolean = false,
    val retryAdvice: RetryAdvice = RetryAdvice.review(),
) {
    constructor(name: String, passed: Boolean, details: String) : this(
        name,
        if (passed) CheckStatus.PASS else CheckStatus.FAIL,
        details,
    )

    val passed: Boolean get() = status == CheckStatus.PASS
}

data class RetryAdvice(
    val disposition: RetryDisposition,
    val reason: RetryReason,
    val condition: RetryCondition? = null,
) {
    companion object {
        fun review(): RetryAdvice = RetryAdvice(RetryDisposition.REVIEW, RetryReason.INSUFFICIENT_EVIDENCE)
    }
}

data class RetryCondition(
    val type: RetryConditionType,
    val value: String,
)

enum class RetryDisposition {
    RETRY_NOW,
    RETRY_WHEN,
    DO_NOT_RETRY,
    REVIEW,
}

enum class ReportRetryDisposition {
    NOT_APPLICABLE,
    RETRY_NOW,
    RETRY_WHEN,
    DO_NOT_RETRY,
    REVIEW,
}

enum class RetryReason {
    TIMEOUT,
    TEMPORARY_CONNECTION_FAILURE,
    RATE_LIMITED,
    DNS_LOOKUP_FAILURE,
    TLS_FAILURE,
    HTTP_SERVER_ERROR,
    HARNESS_COMPATIBILITY_FAILURE,
    MALFORMED_OUTPUT,
    DETERMINISTIC_FAILURE,
    PARKED_SOURCE,
    INSUFFICIENT_EVIDENCE,
}

enum class RetryConditionType {
    RETRY_TIME_REACHED,
    HOST_RESOLVES,
    TLS_HANDSHAKE_SUCCEEDS,
    HARNESS_REVISION_CHANGES,
}

enum class CheckStatus {
    PASS,
    LINT,
    UNUSUAL,
    FAIL,
    SKIP,
    ERROR,
    TIMEOUT,
}

private val FAILED_CHECK_STATUSES = setOf(CheckStatus.FAIL, CheckStatus.ERROR, CheckStatus.TIMEOUT)

enum class ExtensionArtifactType {
    JAR,
    APK,
    ;

    companion object {
        fun fromUrl(url: String): ExtensionArtifactType {
            val extension = URI(url).path.substringAfterLast('.').uppercase()
            return entries.firstOrNull { it.name == extension }
                ?: error("Unsupported extension artifact '$extension'; expected JAR or APK")
        }
    }
}
