package dev.vetle.extstats

import dev.vetle.extstats.core.CheckResult
import dev.vetle.extstats.core.CheckStatus
import dev.vetle.extstats.core.RedactionMode
import dev.vetle.extstats.core.ReportRetryDisposition
import dev.vetle.extstats.core.RetryCondition
import dev.vetle.extstats.core.RetryConditionType
import dev.vetle.extstats.core.ValidationConfig
import dev.vetle.extstats.core.ValidationResult
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout
import org.junit.jupiter.api.io.TempDir
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.nio.channels.FileChannel
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardOpenOption
import java.util.concurrent.atomic.AtomicInteger
import kotlin.io.path.readText
import kotlin.io.path.writeText
import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class MainTest {
    @Test
    fun parsesAndPropagatesReportRedactionMode(
        @TempDir tempDir: Path,
    ) {
        assertEquals(RedactionMode.NONE, RedactionMode.parse("none"))
        assertEquals(RedactionMode.URLS_AND_SENSITIVE, RedactionMode.parse("urls-and-sensitive"))
        assertEquals(RedactionMode.SENSITIVE, RedactionMode.parse("sensitive"))

        val artifacts = tempDir.resolve("artifacts")
        Files.createDirectories(artifacts)
        Files.createFile(artifacts.resolve("fixture.jar"))

        assertEquals(
            RedactionMode.URLS_AND_SENSITIVE,
            validationConfigs(artifacts, tempDir.resolve("default-reports")).single().redactionMode,
        )
        assertEquals(
            RedactionMode.SENSITIVE,
            validationConfigs(
                artifacts,
                tempDir.resolve("sensitive-reports"),
                redactionMode = RedactionMode.SENSITIVE,
            ).single().redactionMode,
        )

        val error = assertFailsWith<IllegalStateException> { RedactionMode.parse("unknown") }
        assertContains(error.message.orEmpty(), "expected none, urls-and-sensitive, or sensitive")
    }

    @Test
    fun createsOneReportConfigPerDownloadedJar(
        @TempDir tempDir: Path,
    ) {
        val jars = tempDir.resolve("jars")
        Files.createDirectories(jars)
        Files.createFile(jars.resolve("tachiyomi-en.second-v1.0.0.jar"))
        Files.createFile(jars.resolve("tachiyomi-en.first-v1.0.0.jar"))
        Files.createFile(jars.resolve("ignored.part"))
        val reports = tempDir.resolve("reports")

        val configs = validationConfigs(jars, reports)

        assertEquals(
            listOf("tachiyomi-en.first-v1.0.0", "tachiyomi-en.second-v1.0.0"),
            configs.map(ValidationConfig::extensionName),
        )
        assertEquals(
            listOf(
                reports.resolve("tachiyomi-en.first-v1.0.0.md"),
                reports.resolve("tachiyomi-en.second-v1.0.0.md"),
            ),
            configs.map(ValidationConfig::reportPath),
        )
    }

    @Test
    fun createsReportConfigForDownloadedApk(
        @TempDir tempDir: Path,
    ) {
        val artifacts = tempDir.resolve("artifacts")
        Files.createDirectories(artifacts)
        val apk = Files.createFile(artifacts.resolve("tachiyomi-all.ahottie-v1.6.4.apk"))
        Files.createFile(artifacts.resolve("tachiyomi-all.ahottie-v1.6.4.jar"))

        val configs =
            validationConfigs(
                artifacts,
                tempDir.resolve("reports"),
                requestedNames = setOf("tachiyomi-all.ahottie-v1.6.4.apk"),
            )

        assertEquals(listOf("tachiyomi-all.ahottie-v1.6.4"), configs.map(ValidationConfig::extensionName))
        assertEquals(apk.toAbsolutePath().toUri().toString(), configs.single().jarUrl)
    }

    @Test
    fun selectsOnlyJarsWhenRequested(
        @TempDir tempDir: Path,
    ) {
        val artifacts = tempDir.resolve("artifacts")
        Files.createDirectories(artifacts)
        Files.createFile(artifacts.resolve("fixture.apk"))
        val jar = Files.createFile(artifacts.resolve("fixture.jar"))

        val configs =
            validationConfigs(
                artifacts,
                tempDir.resolve("reports"),
                artifactType = "jar",
            )

        assertEquals(listOf("fixture"), configs.map(ValidationConfig::extensionName))
        assertEquals(jar.toAbsolutePath().toUri().toString(), configs.single().jarUrl)
    }

    @Test
    fun rejectsSelectingJarAndApkWithSameBaseName(
        @TempDir tempDir: Path,
    ) {
        val artifacts = tempDir.resolve("artifacts")
        Files.createDirectories(artifacts)
        Files.createFile(artifacts.resolve("fixture.apk"))
        Files.createFile(artifacts.resolve("fixture.jar"))

        val error =
            assertFailsWith<IllegalArgumentException> {
                validationConfigs(
                    artifacts,
                    tempDir.resolve("reports"),
                    requestedNames = setOf("fixture.apk", "fixture.jar"),
                )
            }

        assertContains(error.message.orEmpty(), "including .jar or .apk")
    }

    @Test
    fun resumesWithMissingReportsAndCanRetryFailures(
        @TempDir tempDir: Path,
    ) {
        val jars = tempDir.resolve("jars")
        val reports = tempDir.resolve("reports")
        Files.createDirectories(jars)
        Files.createDirectories(reports)
        listOf("failed", "interrupted", "missing", "passed").forEach { Files.createFile(jars.resolve("$it.jar")) }
        reports.resolve("failed.md").writeText("# Extension Validation Report\n- Failed: 1\n")
        reports.resolve("interrupted.md").writeText("# Extension Validation Report\n")
        reports.resolve("passed.md").writeText("# Extension Validation Report\n- Failed: 0\n")

        assertEquals(
            listOf("interrupted", "missing"),
            validationConfigs(jars, reports, selection = "missing").map(ValidationConfig::extensionName),
        )
        assertEquals(listOf("failed"), validationConfigs(jars, reports, selection = "failed").map(ValidationConfig::extensionName))
        assertEquals(
            listOf("passed"),
            validationConfigs(jars, reports, requestedNames = setOf("passed.jar")).map(ValidationConfig::extensionName),
        )
    }

    @Test
    fun selectsOnlyCompleteFailedReportsMarkedForImmediateRetry(
        @TempDir tempDir: Path,
    ) {
        val jars = tempDir.resolve("jars")
        val reports = tempDir.resolve("reports")
        Files.createDirectories(jars)
        Files.createDirectories(reports)
        val dispositions =
            mapOf(
                "healthy" to "- Failed: 0\n- Retry disposition: RETRY_NOW",
                "immediate" to "- Failed: 1\n- Retry disposition: RETRY_NOW",
                "conditional" to "- Failed: 1\n- Retry disposition: RETRY_WHEN",
                "deterministic" to "- Failed: 1\n- Retry disposition: DO_NOT_RETRY",
                "ambiguous" to "- Failed: 1\n- Retry disposition: REVIEW",
                "legacy" to "- Failed: 1",
            )
        dispositions.forEach { (name, retryMetadata) ->
            Files.createFile(jars.resolve("$name.jar"))
            reports.resolve("$name.md").writeText(
                """# Extension Validation Report
- Extension: $name
- Passed: 0
- Warnings: 0
- Skipped: 0
$retryMetadata
""",
            )
        }
        Files.createFile(jars.resolve("incomplete.jar"))
        reports.resolve("incomplete.md").writeText(
            "# Extension Validation Report\n- Failed: 1\n- Retry disposition: RETRY_NOW\n",
        )

        val selected = validationConfigs(jars, reports, selection = "retryable")

        assertEquals(listOf("immediate"), selected.map(ValidationConfig::extensionName))
    }

    @Test
    fun parsesRetryMetadataAndTreatsLegacyReportsAsReview(
        @TempDir tempDir: Path,
    ) {
        val current = tempDir.resolve("current.md")
        current.writeText(
            """# Extension Validation Report
- Extension: current
- Passed: 0
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: RETRY_WHEN
- Retry condition: HOST_RESOLVES: example.test
""",
        )
        val legacy = tempDir.resolve("legacy.md")
        legacy.writeText(
            """# Extension Validation Report
- Extension: legacy
- Passed: 0
- Warnings: 0
- Skipped: 0
- Failed: 1
""",
        )

        val currentSummary = requireNotNull(parseValidationReport(current))
        assertEquals(ReportRetryDisposition.RETRY_WHEN, currentSummary.retryDisposition)
        assertEquals(
            listOf(RetryCondition(RetryConditionType.HOST_RESOLVES, "example.test")),
            currentSummary.retryConditions,
        )
        assertEquals(
            ReportRetryDisposition.REVIEW,
            requireNotNull(parseValidationReport(legacy)).retryDisposition,
        )
    }

    @Test
    fun writesRetryCountsAndConditionsToSummary(
        @TempDir tempDir: Path,
    ) {
        val reports = tempDir.resolve("reports")
        Files.createDirectories(reports)
        val fixtures =
            mapOf(
                "healthy" to "- Failed: 0\n- Retry disposition: NOT_APPLICABLE",
                "immediate" to "- Failed: 1\n- Retry disposition: RETRY_NOW",
                "conditional-a" to "- Failed: 1\n- Retry disposition: RETRY_WHEN\n- Retry condition: HOST_RESOLVES: example.test",
                "conditional-b" to "- Failed: 1\n- Retry disposition: RETRY_WHEN\n- Retry condition: HOST_RESOLVES: example.test",
                "deterministic" to "- Failed: 1\n- Retry disposition: DO_NOT_RETRY",
                "legacy" to "- Failed: 1",
            )
        fixtures.forEach { (name, retryMetadata) ->
            reports.resolve("$name.md").writeText(
                """# Extension Validation Report
- Extension: $name
- Passed: 0
- Warnings: 0
- Skipped: 0
$retryMetadata
""",
            )
        }

        val summary = reports.resolve("summary.md")
        writeValidationSummary(summary, emptySet())

        val content = summary.readText()
        assertContains(content, "- Retry NOT_APPLICABLE: 1")
        assertContains(content, "- Retry RETRY_NOW: 1")
        assertContains(content, "- Retry RETRY_WHEN: 2")
        assertContains(content, "- Retry DO_NOT_RETRY: 1")
        assertContains(content, "- Retry REVIEW: 1")
        assertContains(content, "### HOST_RESOLVES: example.test")
        assertContains(content, "- Reports: 2")
        assertContains(content, "- [conditional-a](conditional-a.md)")
        assertContains(content, "- [conditional-b](conditional-b.md)")
    }

    @Test
    fun selectsNamedExtensionsByIssueGroup(
        @TempDir tempDir: Path,
    ) {
        val jars = tempDir.resolve("jars")
        val reports = tempDir.resolve("reports")
        Files.createDirectories(jars)
        Files.createDirectories(reports)
        listOf("first", "second").forEach { name ->
            Files.createFile(jars.resolve("$name.jar"))
            val config = ValidationConfig(name, "file:///tmp/$name.jar", reports.resolve("$name.md"))
            writeReport(
                config,
                ValidationResult(name, listOf(CheckResult("popular listing", false, "empty"))),
                failOnFailedChecks = false,
            )
        }

        val selected =
            validationConfigs(
                jars,
                reports,
                requestedNames = setOf("second.jar"),
                requestedIssues = setOf("FAIL:popular-listing"),
            )

        assertEquals(listOf("second"), selected.map(ValidationConfig::extensionName))
    }

    @Test
    fun selectsAllIssueGroupsWithRequestedStatus(
        @TempDir tempDir: Path,
    ) {
        val jars = tempDir.resolve("jars")
        val reports = tempDir.resolve("reports")
        Files.createDirectories(jars)
        Files.createDirectories(reports)
        val fixtures =
            listOf(
                Triple("chapters-timeout", CheckStatus.TIMEOUT, "chapters operation"),
                Triple("pages-timeout", CheckStatus.TIMEOUT, "pages operation"),
                Triple("popular-failure", CheckStatus.FAIL, "popular listing"),
            )
        fixtures.forEach { (name, status, checkName) ->
            Files.createFile(jars.resolve("$name.jar"))
            writeReport(
                ValidationConfig(name, "file:///tmp/$name.jar", reports.resolve("$name.md")),
                ValidationResult(name, listOf(CheckResult(checkName, status, "fixture"))),
                failOnFailedChecks = false,
            )
        }

        val selected = validationConfigs(jars, reports, requestedIssues = setOf("TIMEOUT"))

        assertEquals(
            listOf("chapters-timeout", "pages-timeout"),
            selected.map(ValidationConfig::extensionName),
        )
    }

    @Test
    fun writesFullSummaryWithoutFailingBuildForCheckFailure(
        @TempDir tempDir: Path,
    ) = runBlocking {
        val reports = tempDir.resolve("reports")
        val configs =
            listOf("failed", "healthy").map { name ->
                ValidationConfig(name, "file:///tmp/$name.jar", reports.resolve("$name.md"))
            }
        val summary = reports.resolve("summary.md")

        validateExtensions(configs, summaryPath = summary) { config ->
            ValidationResult(
                config.extensionName,
                listOf(CheckResult("popular listing", config.extensionName == "healthy", "fixture")),
            )
        }

        val content = summary.readText()
        assertContains(content, "- Reports: 2")
        assertContains(content, "- Healthy: 1")
        assertContains(content, "- Failed: 1")
        assertContains(content, "| [failed](failed.md) | yes |")
        assertContains(content, "### FAIL:popular-listing")
        assertContains(content, "`./gradlew run -PvalidationIssues=FAIL:popular-listing`")
        assertContains(content, "#### Extension Reports\n\n- [failed](failed.md)")
    }

    @Test
    fun rejectsConcurrentValidationWithoutWaiting(
        @TempDir tempDir: Path,
    ) = runBlocking {
        val lockPath = tempDir.resolve(".run.lock")
        FileChannel.open(lockPath, StandardOpenOption.CREATE, StandardOpenOption.WRITE).use { channel ->
            channel.lock().use {
                assertFailsWith<IllegalStateException> { withValidationLock(lockPath) {} }
            }
        }
    }

    @Test
    fun writesEveryReportBeforeSignalingBatchFailure(
        @TempDir tempDir: Path,
    ) = runBlocking {
        val configs =
            listOf("first", "second").map { extensionName ->
                ValidationConfig(
                    extensionName,
                    "file:///tmp/$extensionName.jar",
                    tempDir.resolve("$extensionName.md"),
                )
            }

        assertFailsWith<IllegalStateException> {
            validateExtensions(configs) { config ->
                if (config.extensionName == "first") error("broken fixture")
                ValidationResult(config.extensionName, listOf(CheckResult("popular", true, "1 entry")))
            }
        }

        assertContains(configs[0].reportPath.readText(), "| extension validation | ERROR |")
        assertContains(configs[1].reportPath.readText(), "| popular | PASS | 1 entry |")
    }

    @Test
    fun signalsExplicitInfrastructureFailureAfterWritingReport(
        @TempDir tempDir: Path,
    ) = runBlocking {
        val config = ValidationConfig("fixture", "file:///tmp/fixture.jar", tempDir.resolve("fixture.md"))

        assertFailsWith<IllegalStateException> {
            validateExtensions(listOf(config)) {
                ValidationResult(
                    it.extensionName,
                    listOf(CheckResult("popular operation", CheckStatus.ERROR, "java.lang.NoSuchMethodError", blocksBuild = true)),
                )
            }
        }

        assertContains(config.reportPath.readText(), "| popular operation | ERROR | java.lang.NoSuchMethodError |")
    }

    @Test
    fun runsAtMostTwentyExtensionValidationsConcurrently(
        @TempDir tempDir: Path,
    ) = runBlocking {
        val active = AtomicInteger()
        val maximumActive = AtomicInteger()
        val twentyStarted = CompletableDeferred<Unit>()
        val configs =
            List(21) { index ->
                ValidationConfig("fixture-$index", "file:///tmp/fixture-$index.jar", tempDir.resolve("fixture-$index.md"))
            }

        withTimeout(5_000) {
            validateExtensions(configs) { config ->
                val current = active.incrementAndGet()
                maximumActive.updateAndGet { maximum -> maxOf(maximum, current) }
                if (current == 20) twentyStarted.complete(Unit)
                try {
                    twentyStarted.await()
                    ValidationResult(config.extensionName, listOf(CheckResult("fixture", true, "validated")))
                } finally {
                    active.decrementAndGet()
                }
            }
        }

        assertEquals(20, maximumActive.get())
    }

    @Test
    fun completesSuccessfullyWhenAllRequiredChecksPass(
        @TempDir tempDir: Path,
    ) {
        val config = ValidationConfig("fixture", "https://example.invalid/fixture.jar", tempDir.resolve("report.md"))
        val result = ValidationResult(config.extensionName, listOf(CheckResult("popular", true, "1 entry")))

        writeReport(config, result)

        assertContains(config.reportPath.readText(), "| popular | PASS | 1 entry |")
    }

    @Test
    fun printsOnlyReportPath(
        @TempDir tempDir: Path,
    ) {
        val config = ValidationConfig("fixture", "https://example.invalid/fixture.jar", tempDir.resolve("report.md"))
        val result = ValidationResult(config.extensionName, listOf(CheckResult("popular", true, "1 entry")))
        val output = ByteArrayOutputStream()
        val originalOutput = System.out

        try {
            System.setOut(PrintStream(output))
            writeReport(config, result)
        } finally {
            System.setOut(originalOutput)
        }

        assertEquals("Report: ${config.reportPath.toAbsolutePath()}\n", output.toString())
    }

    @Test
    fun writesReportBeforeSignalingFailedValidation(
        @TempDir tempDir: Path,
    ) {
        val config = ValidationConfig("fixture", "https://example.invalid/fixture.jar", tempDir.resolve("report.md"))
        val result = ValidationResult(config.extensionName, listOf(CheckResult("popular", false, "empty")))

        assertFailsWith<IllegalStateException> { writeReport(config, result) }

        assertContains(config.reportPath.readText(), "| popular | FAIL | empty |")
    }
}
