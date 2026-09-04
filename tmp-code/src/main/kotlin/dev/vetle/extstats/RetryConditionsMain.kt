package dev.vetle.extstats

import dev.vetle.extstats.core.ReportRetryDisposition
import dev.vetle.extstats.core.RetryConditionCheck
import dev.vetle.extstats.core.RetryConditionRequest
import dev.vetle.extstats.core.RetryConditionType
import dev.vetle.extstats.core.boundedRetryConditionChecker
import java.io.File
import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.isRegularFile
import kotlin.io.path.name

fun main(args: Array<String>) {
    val reportDirectory = Path.of(args.getOrElse(0) { "build/reports/extension-validation" })
    val timeoutMillis = args.getOrElse(1) { "5" }.toLong() * 1_000
    require(Files.isDirectory(reportDirectory)) { "Validation report directory does not exist: $reportDirectory" }
    val reports =
        Files
            .list(reportDirectory)
            .use { paths ->
                paths.filter { it.isRegularFile() && it.name.endsWith(".md") }.toList()
            }.mapNotNull(::parseValidationReport)
            .filter { it.retryDisposition == ReportRetryDisposition.RETRY_WHEN }
    val checks = boundedRetryConditionChecker(timeoutMillis, ::gitRevision).check(retryConditionRequests(reports))

    if (checks.isEmpty()) {
        println("No conditional retry conditions found")
        return
    }
    checks.forEach { check -> println(formatConditionCheck(check)) }
    check(checks.all(RetryConditionCheck::met)) {
        "${checks.count { !it.met }} of ${checks.size} retry conditions are not met"
    }
}

internal fun retryConditionRequests(reports: Collection<ValidationReportSummary>): List<RetryConditionRequest> = reports
    .flatMap { report ->
        report.retryConditions.map { condition ->
            val baseline =
                when (condition.type) {
                    RetryConditionType.RETRY_TIME_REACHED -> report.generatedAt?.toString()
                    RetryConditionType.HARNESS_REVISION_CHANGES -> report.commit
                    RetryConditionType.HOST_RESOLVES, RetryConditionType.TLS_HANDSHAKE_SUCCEEDS -> null
                }
            RetryConditionRequest(condition, baseline)
        }
    }

private fun formatConditionCheck(check: RetryConditionCheck): String = buildString {
    append(if (check.met) "MET" else "NOT_MET")
    append(" ${check.request.condition.type}: ${check.request.condition.value}")
    check.request.baseline?.let { append(" (baseline: $it)") }
}

private fun gitRevision(): String {
    val commit = git("rev-parse", "HEAD").takeIf(String::isNotEmpty) ?: return "unknown"
    val dirty = git("status", "--porcelain", "--untracked-files=no").isNotEmpty()
    return commit + if (dirty) "+dirty" else ""
}

private fun git(vararg arguments: String): String {
    val process =
        ProcessBuilder(listOf("git", *arguments))
            .directory(File("."))
            .redirectErrorStream(true)
            .start()
    val output =
        process.inputStream
            .bufferedReader()
            .use { it.readText() }
            .trim()
    return output.takeIf { process.waitFor() == 0 }.orEmpty()
}
