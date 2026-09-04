package dev.vetle.extstats

import dev.vetle.extstats.core.CheckResult
import dev.vetle.extstats.core.CheckStatus
import dev.vetle.extstats.core.ReportRetryDisposition
import dev.vetle.extstats.core.RetryAdvice
import dev.vetle.extstats.core.RetryCondition
import dev.vetle.extstats.core.RetryConditionType
import dev.vetle.extstats.core.RetryDisposition
import dev.vetle.extstats.core.RetryReason
import dev.vetle.extstats.core.ValidationResult
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNull
import kotlin.test.assertTrue

class RetryAdviceModelTest {
    @Test
    fun `defaults retry advice to conservative review`() {
        val result = CheckResult("fixture", CheckStatus.ERROR, "unknown failure")

        assertEquals(RetryDisposition.REVIEW, result.retryAdvice.disposition)
        assertEquals(RetryReason.INSUFFICIENT_EVIDENCE, result.retryAdvice.reason)
        assertNull(result.retryAdvice.condition)
        assertFalse(result.blocksBuild)
    }

    @Test
    fun `keeps retry advice independent from status and build impact`() {
        val advice =
            RetryAdvice(
                disposition = RetryDisposition.RETRY_WHEN,
                reason = RetryReason.HARNESS_COMPATIBILITY_FAILURE,
                condition = RetryCondition(RetryConditionType.HARNESS_REVISION_CHANGES, "fixture-revision"),
            )
        val result =
            CheckResult(
                name = "fixture",
                status = CheckStatus.ERROR,
                details = "compatibility failure",
                blocksBuild = true,
                retryAdvice = advice,
            )

        assertEquals(CheckStatus.ERROR, result.status)
        assertTrue(result.blocksBuild)
        assertEquals(advice, result.retryAdvice)
    }

    @Test
    fun `aggregates retry disposition from failed checks`() {
        data class Case(
            val name: String,
            val checks: List<CheckResult>,
            val expected: ReportRetryDisposition,
        )

        val cases =
            listOf(
                Case("healthy", listOf(check(CheckStatus.PASS, RetryDisposition.RETRY_NOW)), ReportRetryDisposition.NOT_APPLICABLE),
                Case("immediate", listOf(check(CheckStatus.ERROR, RetryDisposition.RETRY_NOW)), ReportRetryDisposition.RETRY_NOW),
                Case("conditional", listOf(check(CheckStatus.ERROR, RetryDisposition.RETRY_WHEN)), ReportRetryDisposition.RETRY_WHEN),
                Case("deterministic", listOf(check(CheckStatus.FAIL, RetryDisposition.DO_NOT_RETRY)), ReportRetryDisposition.DO_NOT_RETRY),
                Case("ambiguous", listOf(check(CheckStatus.ERROR, RetryDisposition.REVIEW)), ReportRetryDisposition.REVIEW),
                Case(
                    "mixed",
                    listOf(
                        check(CheckStatus.FAIL, RetryDisposition.DO_NOT_RETRY),
                        check(CheckStatus.ERROR, RetryDisposition.REVIEW),
                        check(CheckStatus.TIMEOUT, RetryDisposition.RETRY_WHEN),
                        check(CheckStatus.ERROR, RetryDisposition.RETRY_NOW),
                    ),
                    ReportRetryDisposition.RETRY_NOW,
                ),
            )

        cases.forEach { case ->
            assertEquals(case.expected, ValidationResult(case.name, case.checks).retrySummary.disposition, case.name)
        }
    }

    @Test
    fun `retains distinct conditions in stable order only for conditional retry`() {
        val host = RetryCondition(RetryConditionType.HOST_RESOLVES, "z.example")
        val retryTime = RetryCondition(RetryConditionType.RETRY_TIME_REACHED, "120")
        val conditional =
            ValidationResult(
                "conditional",
                listOf(
                    check(CheckStatus.ERROR, RetryDisposition.RETRY_WHEN, retryTime),
                    check(CheckStatus.ERROR, RetryDisposition.RETRY_WHEN, host),
                    check(CheckStatus.ERROR, RetryDisposition.RETRY_WHEN, host),
                    check(
                        CheckStatus.PASS,
                        RetryDisposition.RETRY_WHEN,
                        RetryCondition(RetryConditionType.HOST_RESOLVES, "ignored.example"),
                    ),
                ),
            ).retrySummary

        assertEquals(listOf(host, retryTime), conditional.conditions)

        val immediate =
            ValidationResult(
                "immediate",
                listOf(
                    check(CheckStatus.ERROR, RetryDisposition.RETRY_WHEN, host),
                    check(CheckStatus.TIMEOUT, RetryDisposition.RETRY_NOW),
                ),
            ).retrySummary

        assertEquals(ReportRetryDisposition.RETRY_NOW, immediate.disposition)
        assertEquals(emptyList(), immediate.conditions)
    }

    private fun check(
        status: CheckStatus,
        disposition: RetryDisposition,
        condition: RetryCondition? = null,
    ) = CheckResult(
        name = disposition.name,
        status = status,
        details = disposition.name,
        retryAdvice = RetryAdvice(disposition, RetryReason.INSUFFICIENT_EVIDENCE, condition),
    )
}
