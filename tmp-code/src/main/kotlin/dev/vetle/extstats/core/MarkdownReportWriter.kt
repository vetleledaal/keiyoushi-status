package dev.vetle.extstats.core

import java.io.File
import java.time.Clock
import java.time.Instant
import java.time.temporal.ChronoUnit

class MarkdownReportWriter(
    private val clock: Clock = Clock.systemUTC(),
    private val workingDirectory: File = File("."),
) {
    fun write(
        result: ValidationResult,
        redactionMode: RedactionMode = RedactionMode.URLS_AND_SENSITIVE,
    ): String = buildString {
        val sanitizer = ReportSanitizer(redactionMode)
        appendLine("# Extension Validation Report")
        appendLine()
        appendLine("- Extension: ${sanitizer.text(result.extensionName)}")
        result.artifactType?.let { appendLine("- Input artifact: $it") }
        if (redactionMode == RedactionMode.NONE) appendLine("- Redaction: NONE (unsafe for publication)")
        val generatedAt =
            Instant.now(clock).let {
                if (redactionMode == RedactionMode.NONE) it else it.truncatedTo(ChronoUnit.HOURS)
            }
        appendLine("- Generated at: $generatedAt")
        appendLine("- Commit: ${gitRevision()}")
        appendLine("- Passed: ${result.passed}")
        appendLine("- Lint: ${result.lint}")
        appendLine("- Warnings: ${result.warnings}")
        appendLine("- Skipped: ${result.skipped}")
        appendLine("- Failed: ${result.failed}")
        appendLine("- Retry disposition: ${result.retrySummary.disposition}")
        result.retrySummary.conditions.forEach { condition ->
            appendLine("- Retry condition: ${condition.type}: ${sanitizer.text(condition.value)}")
        }
        appendLine()
        result.evidence?.let { evidence ->
            appendLine("## Runtime Evidence")
            appendLine()
            appendLine("- Extension library: ${sanitizer.text(evidence.extensionLibraryVersion)}")
            appendLine("- Entry point: ${sanitizer.text(evidence.entryPointClass)}")
            appendLine("- Source implementation: ${sanitizer.text(evidence.sourceImplementationClass)}")
            appendLine("- Source ID: ${evidence.sourceId}")
            appendLine("- Source name: ${sanitizer.text(evidence.sourceName)}")
            appendLine("- Source language: ${sanitizer.text(evidence.sourceLanguage)}")
            evidence.selectedManga?.let { manga ->
                val identity =
                    when {
                        manga.title != null && manga.url != null -> "${sanitizer.text(
                            manga.title,
                        )} (`${sanitizer.url(manga.url, "manga resource")}`)"
                        manga.title != null -> sanitizer.text(manga.title)
                        else -> manga.url?.let { "`${sanitizer.url(it, "manga resource")}`" }.orEmpty()
                    }
                appendLine("- Selected manga input: ${sanitizer.text(manga.operation)} offset ${manga.offset}: $identity")
            }
            appendLine()
            appendLine("| Operation | Method | Result | Entries | Selected manga | Exception | Duration |")
            appendLine("| --- | --- | --- | ---: | --- | --- | ---: |")
            evidence.operations.forEach { operation ->
                val selectedManga =
                    when {
                        operation.selectedTitle != null && operation.selectedUrl != null -> {
                            "${sanitizer.text(operation.selectedTitle)} (`${sanitizer.url(operation.selectedUrl, "selected resource")}`)"
                        }
                        operation.selectedTitle != null -> {
                            sanitizer.text(operation.selectedTitle)
                        }
                        else -> {
                            operation.selectedUrl?.let { "`${sanitizer.url(it, "selected resource")}`" }.orEmpty()
                        }
                    }
                val exception =
                    operation.exceptionClass
                        ?.let { exceptionClass ->
                            listOfNotNull(exceptionClass, operation.exceptionMessage).joinToString(": ")
                        }.orEmpty()
                val duration =
                    when {
                        redactionMode == RedactionMode.NONE -> "${operation.elapsedTimeMillis} ms"
                        operation.elapsedTimeMillis < 1_000 -> "<1s"
                        operation.elapsedTimeMillis < 10_000 -> "1-10s"
                        else -> "10s+"
                    }
                appendLine(
                    "| ${sanitizer.text(
                        operation.operation,
                    )} | `${sanitizer.text(
                        operation.method,
                    )}` | ${sanitizer.text(
                        operation.status,
                    )} | ${operation.entryCount} | $selectedManga | ${markdownCell(sanitizer.text(exception))} | $duration |",
                )
            }
            appendLine()
        }
        appendLine("| Check | Result | Details | Retry disposition | Retry reason | Retry condition |")
        appendLine("| --- | --- | --- | --- | --- | --- |")
        result.checks.forEach { check ->
            val failed = check.status in setOf(CheckStatus.FAIL, CheckStatus.ERROR, CheckStatus.TIMEOUT)
            val condition =
                check.retryAdvice.condition
                    ?.let { "${it.type}: ${sanitizer.text(it.value)}" }
                    .orEmpty()
            appendLine(
                "| ${markdownCell(sanitizer.text(check.name))} | ${check.status} | ${markdownCell(sanitizer.text(check.details))} | " +
                    "${check.retryAdvice.disposition.takeIf { failed }?.name.orEmpty()} | " +
                    "${check.retryAdvice.reason.takeIf { failed }?.name.orEmpty()} | ${markdownCell(
                        condition.takeIf { failed }.orEmpty(),
                    )} |",
            )
        }
    }

    private fun gitRevision(): String {
        val commit = git("rev-parse", "HEAD").takeIf { it.isNotEmpty() } ?: return "unknown"
        val dirty = git("status", "--porcelain", "--untracked-files=no").isNotEmpty()
        return commit + if (dirty) "+dirty" else ""
    }

    private fun git(vararg arguments: String): String {
        val process =
            ProcessBuilder(listOf("git", *arguments))
                .directory(workingDirectory)
                .redirectErrorStream(true)
                .start()
        val output =
            process.inputStream
                .bufferedReader()
                .use { it.readText() }
                .trim()
        return output.takeIf { process.waitFor() == 0 }.orEmpty()
    }

    private fun markdownCell(value: String) = value
        .replace("$", "\\$")
        .replace("[", "\\[")
        .replace("]", "\\]")
        .replace("|", "\\|")
        .replace("\n", "<br>")
}
