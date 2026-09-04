package dev.vetle.extstats

import dev.vetle.extstats.core.CheckResult
import dev.vetle.extstats.core.CheckStatus
import dev.vetle.extstats.core.ExtensionValidator
import dev.vetle.extstats.core.MarkdownReportWriter
import dev.vetle.extstats.core.RedactionMode
import dev.vetle.extstats.core.ReportRetryDisposition
import dev.vetle.extstats.core.RetryCondition
import dev.vetle.extstats.core.RetryConditionType
import dev.vetle.extstats.core.TimingLog
import dev.vetle.extstats.core.ValidationConfig
import dev.vetle.extstats.core.ValidationResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.sync.Semaphore
import kotlinx.coroutines.sync.withPermit
import java.nio.channels.FileChannel
import java.nio.channels.OverlappingFileLockException
import java.nio.file.AtomicMoveNotSupportedException
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption
import java.nio.file.StandardOpenOption
import java.time.Instant
import kotlin.io.path.isRegularFile
import kotlin.io.path.name
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() = runBlocking {
    withValidationLock(Path.of("build", "reports", "extension-validation", ".run.lock")) {
        TimingLog.measure("full report generation") {
            ExtensionValidator().use { validator ->
                validateExtensions(
                    validationConfigs(
                        selection = System.getProperty("validationSelection", "missing"),
                        requestedNames =
                        System
                            .getProperty("validationExtensions", "")
                            .split(',')
                            .map(String::trim)
                            .filter(String::isNotEmpty)
                            .toSet(),
                        requestedIssues =
                        System
                            .getProperty("validationIssues", "")
                            .split(',')
                            .map(String::trim)
                            .filter(String::isNotEmpty)
                            .toSet(),
                        artifactType = System.getProperty("validationArtifactType", "all"),
                        timeoutMillis = System.getProperty("validationTimeoutSeconds", "130").toLong() * 1_000,
                        redactionMode =
                        RedactionMode.parse(
                            System.getProperty("validationRedactionMode", "urls-and-sensitive"),
                        ),
                    ),
                    summaryPath = Path.of("build", "reports", "extension-validation", "summary.md"),
                    validate = validator::validate,
                )
            }
        }
    }
}

internal suspend fun withValidationLock(
    lockPath: Path,
    block: suspend () -> Unit,
) {
    Files.createDirectories(lockPath.parent)
    FileChannel.open(lockPath, StandardOpenOption.CREATE, StandardOpenOption.WRITE).use { channel ->
        val lock =
            try {
                channel.tryLock()
            } catch (_: OverlappingFileLockException) {
                null
            }
        check(lock != null) { "Another extension validation run is already active ($lockPath)" }
        lock.use { block() }
    }
}

internal fun validationConfigs(
    allDirectory: Path = Path.of("build", "extensions", "all"),
    reportDirectory: Path = Path.of("build", "reports", "extension-validation"),
    selection: String = "all",
    requestedNames: Set<String> = emptySet(),
    requestedIssues: Set<String> = emptySet(),
    artifactType: String = "all",
    timeoutMillis: Long = 130_000L,
    redactionMode: RedactionMode = RedactionMode.URLS_AND_SENSITIVE,
): List<ValidationConfig> {
    require(timeoutMillis > 0) { "Validation timeout must be positive" }
    require(selection in setOf("all", "missing", "failed", "retryable")) {
        "Unsupported validation selection '$selection'; expected all, missing, failed, or retryable"
    }
    require(artifactType in setOf("all", "jar", "apk")) {
        "Unsupported validation artifact type '$artifactType'; expected all, jar, or apk"
    }
    require(Files.isDirectory(allDirectory)) {
        "Extension directory does not exist: $allDirectory; run ./gradlew readExtensionIndex -PdownloadDirectory=$allDirectory"
    }
    val artifacts =
        extensionArtifacts(allDirectory)
            .filter { artifactType == "all" || it.name.endsWith(".$artifactType", ignoreCase = true) }
            .also { require(it.isNotEmpty()) { "No extension artifacts found in $allDirectory" } }
    val knownNames = artifacts.map { it.name }.toSet()
    require(requestedNames.all(knownNames::contains)) {
        "Unknown validation extension artifact(s): ${(requestedNames - knownNames).sorted().joinToString()}"
    }
    val configs =
        artifacts.map { artifact ->
            artifact to
                run {
                    val artifactName = artifact.name.substringBeforeLast('.')
                    ValidationConfig(
                        extensionName = artifactName,
                        jarUrl = artifact.toAbsolutePath().toUri().toString(),
                        reportPath = reportDirectory.resolve("$artifactName.md"),
                        timeoutMillis = timeoutMillis,
                        redactionMode = redactionMode,
                    )
                }
        }
    val reports = configs.mapNotNull { (_, config) -> parseValidationReport(config.reportPath) }
    val knownIssues = reports.flatMap(ValidationReportSummary::issueGroups).toSet()
    val unknownIssues =
        requestedIssues.filter { requestedIssue ->
            knownIssues.none { knownIssue -> validationIssueMatches(requestedIssue, knownIssue) }
        }
    require(unknownIssues.isEmpty()) {
        "Unknown validation issue group(s): ${unknownIssues.sorted().joinToString()}"
    }
    return configs
        .filter { (artifact, config) ->
            val explicitSelection = requestedNames.isNotEmpty() || requestedIssues.isNotEmpty()
            val nameMatches = requestedNames.isEmpty() || artifact.name in requestedNames
            val issueMatches =
                requestedIssues.isEmpty() ||
                    parseValidationReport(config.reportPath)?.issueGroups?.any { knownIssue ->
                        requestedIssues.any { requestedIssue -> validationIssueMatches(requestedIssue, knownIssue) }
                    } == true
            val modeMatches =
                if (explicitSelection) {
                    true
                } else {
                    when (selection) {
                        "all" -> {
                            true
                        }
                        "missing" -> {
                            reportFailureCount(config.reportPath) == null
                        }
                        "failed" -> {
                            (reportFailureCount(config.reportPath) ?: 0) > 0
                        }
                        "retryable" -> {
                            parseValidationReport(config.reportPath)?.let { report ->
                                report.failed > 0 && report.retryDisposition == ReportRetryDisposition.RETRY_NOW
                            } == true
                        }
                        else -> {
                            error("unreachable")
                        }
                    }
                }
            nameMatches && issueMatches && modeMatches
        }.also { selected ->
            selected.groupBy { (_, config) -> config.extensionName }.forEach { (name, matches) ->
                require(matches.size == 1) {
                    "Both JAR and APK inputs selected for '$name'; specify the extension filename including .jar or .apk"
                }
            }
            println("Selected ${selected.size} extension(s) for validation")
        }.map { (_, config) -> config }
}

private fun reportFailureCount(path: Path): Int? = path
    .takeIf { it.isRegularFile() }
    ?.readText()
    ?.takeIf { it.startsWith("# Extension Validation Report\n") }
    ?.lineSequence()
    ?.firstNotNullOfOrNull { line -> line.removePrefix("- Failed: ").takeIf { it != line }?.toIntOrNull() }

private fun validationIssueMatches(
    requestedIssue: String,
    knownIssue: String,
): Boolean = if (':' in requestedIssue) requestedIssue == knownIssue else knownIssue.startsWith("$requestedIssue:")

internal suspend fun validateExtensions(
    configs: List<ValidationConfig>,
    summaryPath: Path? = null,
    validate: suspend (ValidationConfig) -> ValidationResult,
) {
    val semaphore = Semaphore(MAX_CONCURRENT_VALIDATIONS)
    val results =
        coroutineScope {
            configs
                .map { config ->
                    async(Dispatchers.IO) {
                        semaphore.withPermit {
                            val result =
                                try {
                                    validate(config)
                                } catch (exception: Exception) {
                                    ValidationResult(
                                        extensionName = config.extensionName,
                                        artifactType = config.artifactType,
                                        checks =
                                        listOf(
                                            CheckResult(
                                                "extension validation",
                                                CheckStatus.ERROR,
                                                listOfNotNull(exception::class.qualifiedName, exception.message).joinToString(": "),
                                                blocksBuild = true,
                                            ),
                                        ),
                                    )
                                }
                            writeReport(config, result, failOnFailedChecks = false)
                            result
                        }
                    }
                }.awaitAll()
        }
    summaryPath?.let { writeValidationSummary(it, configs.map(ValidationConfig::extensionName).toSet()) }
    val infrastructureFailures = results.count { it.infrastructureFailures > 0 }
    check(infrastructureFailures == 0) {
        "$infrastructureFailures of ${results.size} extension validations had infrastructure failures"
    }
}

internal data class ValidationReportSummary(
    val extensionName: String,
    val reportFileName: String,
    val passed: Int,
    val lint: Int,
    val warnings: Int,
    val skipped: Int,
    val failed: Int,
    val retryDisposition: ReportRetryDisposition,
    val retryConditions: List<RetryCondition>,
    val issueGroups: Set<String>,
    val generatedAt: Instant?,
    val commit: String?,
)

internal fun parseValidationReport(path: Path): ValidationReportSummary? {
    if (!path.isRegularFile()) return null
    val lines = path.readText().lines()
    if (lines.firstOrNull() != "# Extension Validation Report") return null

    fun count(label: String) = lines
        .firstOrNull { it.startsWith("- $label: ") }
        ?.substringAfter(": ")
        ?.toIntOrNull()
    val extensionName = lines.firstOrNull { it.startsWith("- Extension: ") }?.substringAfter(": ") ?: return null
    val retryDisposition =
        lines
            .firstOrNull { it.startsWith("- Retry disposition: ") }
            ?.substringAfter(": ")
            ?.let { runCatching { ReportRetryDisposition.valueOf(it) }.getOrNull() }
            ?: ReportRetryDisposition.REVIEW
    val retryConditions =
        lines
            .mapNotNull { line ->
                line.removePrefix("- Retry condition: ").takeIf { it != line }?.let { condition ->
                    val type = runCatching { RetryConditionType.valueOf(condition.substringBefore(": ")) }.getOrNull()
                    val value = condition.substringAfter(": ", missingDelimiterValue = "")
                    if (type != null && value.isNotEmpty()) RetryCondition(type, value) else null
                }
            }.distinct()
            .sortedWith(compareBy<RetryCondition>({ it.type.name }, RetryCondition::value))
    val issueGroups =
        lines
            .mapNotNull { line ->
                CHECK_ROW.matchEntire(line)?.destructured?.let { (name, status) ->
                    status.takeIf { it in FAILED_STATUSES }?.let { "$it:${issueSlug(name)}" }
                }
            }.toSet()
    return ValidationReportSummary(
        extensionName = extensionName,
        reportFileName = path.fileName.toString(),
        passed = count("Passed") ?: return null,
        lint = count("Lint") ?: 0,
        warnings = count("Warnings") ?: return null,
        skipped = count("Skipped") ?: return null,
        failed = count("Failed") ?: return null,
        retryDisposition = retryDisposition,
        retryConditions = retryConditions,
        issueGroups = issueGroups,
        generatedAt =
        lines
            .firstOrNull { it.startsWith("- Generated at: ") }
            ?.substringAfter(": ")
            ?.let { runCatching { Instant.parse(it) }.getOrNull() },
        commit = lines.firstOrNull { it.startsWith("- Commit: ") }?.substringAfter(": "),
    )
}

internal fun writeValidationSummary(
    path: Path,
    selectedNames: Set<String>,
) {
    val reports =
        Files
            .list(path.parent)
            .use { paths ->
                paths
                    .filter { it.isRegularFile() && it.name.endsWith(".md") && it.fileName != path.fileName }
                    .toList()
            }.mapNotNull(::parseValidationReport)
            .sortedBy(ValidationReportSummary::extensionName)
    val retryCounts =
        ReportRetryDisposition.entries.associateWith { disposition ->
            reports.count { it.retryDisposition == disposition }
        }
    val retryConditions =
        reports
            .filter { it.retryDisposition == ReportRetryDisposition.RETRY_WHEN }
            .flatMap { report -> report.retryConditions.map { condition -> condition to report } }
            .groupBy({ it.first }, { it.second })
            .toSortedMap(compareBy<RetryCondition>({ it.type.name }, RetryCondition::value))
    val issueGroups =
        reports
            .flatMap { report -> report.issueGroups.map { it to report.extensionName } }
            .groupBy({ it.first }, { it.second })
            .toSortedMap()
    val report =
        buildString {
            appendLine("# Extension Validation Summary")
            appendLine()
            appendLine("- Reports: ${reports.size}")
            appendLine("- Selected this run: ${selectedNames.size}")
            appendLine("- Healthy: ${reports.count { it.failed == 0 }}")
            appendLine("- Failed: ${reports.count { it.failed > 0 }}")
            retryCounts.forEach { (disposition, count) ->
                appendLine("- Retry $disposition: $count")
            }
            appendLine()
            appendLine("| Extension | Selected | Passed | Lint | Warnings | Skipped | Failed | Issue groups |")
            appendLine("| --- | --- | ---: | ---: | ---: | ---: | ---: | --- |")
            reports.forEach { result ->
                appendLine(
                    "| [${result.extensionName}](${result.reportFileName}) | " +
                        "${if (result.extensionName in selectedNames) "yes" else "no"} | " +
                        "${result.passed} | ${result.lint} | ${result.warnings} | ${result.skipped} | ${result.failed} | " +
                        "${result.issueGroups.sorted().joinToString("<br>")} |",
                )
            }
            appendLine()
            appendLine("## Retry Conditions")
            appendLine()
            if (retryConditions.isEmpty()) {
                appendLine("No conditional retry conditions.")
                appendLine()
            } else {
                retryConditions.forEach { (condition, conditionReports) ->
                    appendLine("### ${condition.type}: ${condition.value}")
                    appendLine()
                    appendLine("- Reports: ${conditionReports.size}")
                    conditionReports.forEach { conditionReport ->
                        appendLine("- [${conditionReport.extensionName}](${conditionReport.reportFileName})")
                    }
                    appendLine()
                }
            }
            appendLine("## Issue Groups")
            appendLine()
            if (issueGroups.isEmpty()) {
                appendLine("No failed issue groups.")
            } else {
                issueGroups.forEach { (issue, extensions) ->
                    appendLine("### $issue")
                    appendLine()
                    appendLine("- Extensions: ${extensions.size}")
                    appendLine("- Rerun: `./gradlew run -PvalidationIssues=$issue`")
                    appendLine()
                    appendLine("#### Extension Reports")
                    appendLine()
                    extensions.forEach { extension ->
                        val matchingReport = reports.single { it.extensionName == extension }
                        appendLine("- [$extension](${matchingReport.reportFileName})")
                    }
                    appendLine()
                }
            }
        }
    writeAtomically(path, report)
}

internal fun writeReport(
    config: ValidationConfig,
    result: ValidationResult,
    failOnFailedChecks: Boolean = true,
) {
    val report = TimingLog.measure("render report") { MarkdownReportWriter().write(result, config.redactionMode) }

    TimingLog.measure("write report file") {
        writeAtomically(config.reportPath, report)
    }
    TimingLog.measure("print report") {
        println("Report: ${config.reportPath.toAbsolutePath()}")
        System.out.flush()
    }
    if (failOnFailedChecks) {
        check(result.failed == 0) { "Extension validation failed ${result.failed} check(s); see ${config.reportPath}" }
    }
}

private fun writeAtomically(
    path: Path,
    content: String,
) {
    val directory = path.parent ?: Path.of(".")
    Files.createDirectories(directory)
    val temporary = Files.createTempFile(directory, ".${path.fileName}.", ".tmp")
    try {
        temporary.writeText(content)
        try {
            Files.move(temporary, path, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING)
        } catch (_: AtomicMoveNotSupportedException) {
            Files.move(temporary, path, StandardCopyOption.REPLACE_EXISTING)
        }
    } finally {
        Files.deleteIfExists(temporary)
    }
}

private fun issueSlug(name: String): String = name
    .lowercase()
    .replace(Regex("[^a-z0-9]+"), "-")
    .trim('-')

private fun Path.isExtensionArtifact(): Boolean = isRegularFile() && (
    name.endsWith(".jar", ignoreCase = true) || name.endsWith(
        ".apk",
        ignoreCase = true,
    )
    )

private fun extensionArtifacts(directory: Path): List<Path> = Files.list(directory).use { paths ->
    paths
        .filter { it.isExtensionArtifact() }
        .toList()
        .sortedBy(Path::name)
}

private val FAILED_STATUSES = setOf("FAIL", "ERROR", "TIMEOUT")
private val CHECK_ROW = Regex("""\| ([^|]+) \| (PASS|LINT|UNUSUAL|FAIL|SKIP|ERROR|TIMEOUT) \|.*""")
private const val MAX_CONCURRENT_VALIDATIONS = 20
