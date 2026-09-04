package dev.vetle.extstats

import dev.vetle.extstats.core.RetryCondition
import dev.vetle.extstats.core.RetryConditionRequest
import dev.vetle.extstats.core.RetryConditionType
import java.time.Instant
import kotlin.test.Test
import kotlin.test.assertEquals

class RetryConditionsMainTest {
    @Test
    fun `uses report time and revision as local condition baselines`() {
        val generatedAt = Instant.parse("2026-09-01T12:00:00Z")
        val report =
            ValidationReportSummary(
                extensionName = "fixture",
                reportFileName = "fixture.md",
                passed = 0,
                lint = 0,
                warnings = 0,
                skipped = 0,
                failed = 2,
                retryDisposition = dev.vetle.extstats.core.ReportRetryDisposition.RETRY_WHEN,
                retryConditions =
                listOf(
                    RetryCondition(RetryConditionType.RETRY_TIME_REACHED, "120"),
                    RetryCondition(RetryConditionType.HARNESS_REVISION_CHANGES, "java.lang.NoSuchMethodError"),
                    RetryCondition(RetryConditionType.HOST_RESOLVES, "example.test"),
                ),
                issueGroups = emptySet(),
                generatedAt = generatedAt,
                commit = "old-revision",
            )

        assertEquals(
            listOf(
                RetryConditionRequest(report.retryConditions[0], generatedAt.toString()),
                RetryConditionRequest(report.retryConditions[1], "old-revision"),
                RetryConditionRequest(report.retryConditions[2]),
            ),
            retryConditionRequests(listOf(report)),
        )
    }
}
