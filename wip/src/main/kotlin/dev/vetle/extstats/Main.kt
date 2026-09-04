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
            val summaryPath = Path.of("build", "reports", "extension-validation", "summary.md")
            val configs =
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
                    responseSizeBytes = System.getProperty("validationResponseSizeBytes", "4194304").toLong(),
                    redactionMode =
                    RedactionMode.parse(
                        System.getProperty("validationRedactionMode", "urls-and-sensitive"),
                    ),
                )
            ExtensionValidator().use { validator ->
                validateExtensions(configs, summaryPath = summaryPath, validate = validator::validate)
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
    extensionRepository: Path = Path.of(System.getProperty("extensionRepository", "/home/vetle/dev/keiyoushi-extensions")),
    selection: String = "all",
    requestedNames: Set<String> = emptySet(),
    requestedIssues: Set<String> = emptySet(),
    artifactType: String = "all",
    timeoutMillis: Long = 130_000L,
    responseSizeBytes: Long = 4_194_304L,
    redactionMode: RedactionMode = RedactionMode.URLS_AND_SENSITIVE,
): List<ValidationConfig> {
    require(timeoutMillis > 0) { "Validation timeout must be positive" }
    require(responseSizeBytes > 0) { "Probe response size limit must be positive" }
    require(selection in setOf("all", "missing", "failed", "retryable")) {
        "Unsupported validation selection '$selection'; expected all, missing, failed, or retryable"
    }
    require(artifactType in setOf("all", "jar", "apk")) {
        "Unsupported validation artifact type '$artifactType'; expected all, jar, or apk"
    }
    val artifacts =
        extensionArtifacts(allDirectory)
            .filter { artifactType == "all" || it.name.endsWith(".$artifactType", ignoreCase = true) }
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
                        theme = readExtensionTheme(extensionRepository, artifactName),
                        timeoutMillis = timeoutMillis,
                        responseSizeBytes = responseSizeBytes,
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

private fun readExtensionTheme(
    repository: Path,
    artifactName: String,
): String? {
    val match = Regex("^tachiyomi-([^.]+)\\.(.+)-v[0-9].*$").matchEntire(artifactName) ?: return null
    val buildFile = repository.resolve("src").resolve(match.groupValues[1]).resolve(match.groupValues[2]).resolve("build.gradle.kts")
    if (!Files.isRegularFile(buildFile)) return null
    return Regex("(?m)^\\s*theme\\s*=\\s*\"([^\"]+)\"")
        .find(buildFile.readText())
        ?.groupValues
        ?.get(1)
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
                                                exceptionDetails(exception),
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
    val failures = configs.zip(results).filter { (_, result) -> result.infrastructureFailures > 0 }
    check(failures.isEmpty()) {
        infrastructureFailureMessage(results.size, failures, summaryPath)
    }
}

private const val MAX_REPORTED_INFRASTRUCTURE_FAILURES = 10

private fun infrastructureFailureMessage(
    validatedCount: Int,
    failures: List<Pair<ValidationConfig, ValidationResult>>,
    summaryPath: Path?,
): String = buildString {
    append("${failures.size} of $validatedCount extension validations had infrastructure failures")
    failures.take(MAX_REPORTED_INFRASTRUCTURE_FAILURES).forEach { (config, result) ->
        appendLine()
        append("- ${config.extensionName}: ")
        append(
            result.checks
                .filter(CheckResult::blocksBuild)
                .joinToString("; ") { check -> "${check.name} [${check.status}]: ${check.details}" },
        )
        append(" (${config.reportPath})")
    }
    if (failures.size > MAX_REPORTED_INFRASTRUCTURE_FAILURES) {
        appendLine()
        append("- ...and ${failures.size - MAX_REPORTED_INFRASTRUCTURE_FAILURES} more")
    }
    summaryPath?.let {
        appendLine()
        append("Full run: $it")
    }
}

private fun exceptionDetails(exception: Exception): String = buildList {
    var cause: Throwable? = exception
    while (cause != null) {
        add(listOfNotNull(cause::class.qualifiedName, cause.message).joinToString(": "))
        cause = cause.cause?.takeUnless { it === cause }
    }
    exception.stackTrace.firstOrNull { it.className.startsWith("dev.vetle.extstats") }?.let { frame ->
        add("at $frame")
    }
}.joinToString("; caused by ")

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
    val stubbedApis: Set<String> = emptySet(),
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
    val stubbedApis =
        lines
            .flatMap { line -> STUBBED_API.findAll(line).map { it.groupValues[1] }.toList() }
            .toSet()
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
        stubbedApis = stubbedApis,
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
    val reportDirectory = path.parent ?: Path.of(".")
    Files.createDirectories(reportDirectory)
    val reports =
        Files
            .list(reportDirectory)
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
    val stubbedApis =
        reports
            .flatMap { report -> report.stubbedApis.map { it to report } }
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
            appendLine("## Stubbed APIs")
            appendLine()
            if (stubbedApis.isEmpty()) {
                appendLine("No stubbed Android APIs were hit.")
                appendLine()
            } else {
                stubbedApis.forEach { (api, apiReports) ->
                    appendLine("### `$api`")
                    appendLine()
                    appendLine("- Extensions: ${apiReports.size}")
                    appendLine(stubbedApiAdvice(api))
                    appendLine()
                    appendLine("#### Extension Reports")
                    appendLine()
                    apiReports.forEach { apiReport ->
                        appendLine("- [${apiReport.extensionName}](${apiReport.reportFileName})")
                    }
                    appendLine()
                }
            }
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
        check(result.failed == 0) {
            "Extension validation failed ${result.failed} check(s) for ${config.extensionName}; see ${config.reportPath}"
        }
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

private fun extensionArtifacts(directory: Path): List<Path> {
    Files.createDirectories(directory)
    return Files.list(directory).use { paths ->
        paths
            .filter { it.isExtensionArtifact() }
            .toList()
            .sortedBy(Path::name)
    }
}

private val FAILED_STATUSES = setOf("FAIL", "ERROR", "TIMEOUT")
private val CHECK_ROW = Regex("""\| ([^|]+) \| (PASS|LINT|UNUSUAL|FAIL|SKIP|ERROR|TIMEOUT) \|.*""")
private val STUBBED_API = Regex("""stubbed API `([^`]+)`""")

private fun stubbedApiAdvice(api: String): String {
    val member = api.substringAfterLast('.', "")
    val className = api.substringBeforeLast('.', api)
    val packagePath = className.substringBeforeLast('.', "").replace('.', '/')
    val simpleName = className.substringAfterLast('.', className)
    val location = if (packagePath.isEmpty()) "$className.java" else "$packagePath/$simpleName.java"
    val missing = member.takeIf { it.isNotEmpty() }?.let { " (missing `$it`)" }.orEmpty()
    return "- Implement: `$className` in `android-compat/src/main/java/$location`$missing; " +
        "then record it in `docs/android-compatibility-inventory.md` and drop the class from " +
        "`android-compat/lib/android.jar`"
}
private const val MAX_CONCURRENT_VALIDATIONS = 20
