package dev.vetle.extstats

import dev.vetle.extstats.core.CheckResult
import dev.vetle.extstats.core.CheckStatus
import dev.vetle.extstats.core.ExtensionArtifactType
import dev.vetle.extstats.core.MarkdownReportWriter
import dev.vetle.extstats.core.OperationEvidence
import dev.vetle.extstats.core.RedactionMode
import dev.vetle.extstats.core.ReportEvidence
import dev.vetle.extstats.core.RetryAdvice
import dev.vetle.extstats.core.RetryCondition
import dev.vetle.extstats.core.RetryConditionType
import dev.vetle.extstats.core.RetryDisposition
import dev.vetle.extstats.core.RetryReason
import dev.vetle.extstats.core.SelectedMangaEvidence
import dev.vetle.extstats.core.ValidationResult
import java.io.File
import java.time.Clock
import java.time.Instant
import java.time.ZoneOffset
import kotlin.io.path.createTempDirectory
import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ReportWriterTest {
    @Test
    fun writesMarkdownReport() {
        val report = MarkdownReportWriter(
            clock = Clock.fixed(Instant.parse("2026-08-31T12:34:56Z"), ZoneOffset.UTC),
            workingDirectory = File("."),
        ).write(
            ValidationResult(
                extensionName = "tooncubus",
                artifactType = ExtensionArtifactType.APK,
                checks = CheckStatus.entries.map { status ->
                    val retryAdvice = when (status) {
                        CheckStatus.TIMEOUT -> RetryAdvice(RetryDisposition.RETRY_NOW, RetryReason.TIMEOUT)
                        CheckStatus.ERROR -> RetryAdvice(
                            RetryDisposition.RETRY_WHEN,
                            RetryReason.DNS_LOOKUP_FAILURE,
                            RetryCondition(RetryConditionType.HOST_RESOLVES, "example.test"),
                        )
                        CheckStatus.FAIL -> RetryAdvice(RetryDisposition.DO_NOT_RETRY, RetryReason.DETERMINISTIC_FAILURE)
                        else -> RetryAdvice.review()
                    }
                    CheckResult(status.name.lowercase(), status, "${status.name.lowercase()} | [English]", retryAdvice = retryAdvice)
                },
                evidence = ReportEvidence(
                    extensionLibraryVersion = "1.6",
                    entryPointClass = "keiyoushi.source.Generated",
                    sourceImplementationClass = "example.FixtureSource",
                    sourceId = 123,
                    sourceName = "Fixture",
                    sourceLanguage = "en",
                    selectedManga = SelectedMangaEvidence("popular", 4, "Fixture", "/fixture"),
                    operations = listOf(
                        OperationEvidence(
                            operation = "popular",
                            method = "getPopularManga(1)",
                            status = "success",
                            entryCount = 30,
                            selectedTitle = "Fixture",
                            selectedUrl = "/fixture",
                            exceptionClass = "okhttp3.CacheControl\$Builder",
                            exceptionMessage =
                            "Unable to resolve host \"www.tooncubus-read.my.id\": No address associated with hostname",
                            elapsedTimeMillis = 42,
                        ),
                        OperationEvidence(
                            operation = "chapters",
                            method =
                            "reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)",
                            status = "success",
                            entryCount = 12,
                            selectedTitle = "Chapter 12",
                            selectedUrl = "/chapter/12",
                            exceptionClass = null,
                            exceptionMessage = null,
                            elapsedTimeMillis = 0,
                        ),
                    ),
                ),
            ),
        )

        assertContains(report, "# Extension Validation Report")
        assertContains(report, "tooncubus")
        assertContains(report, "- Input artifact: APK")
        assertContains(report, "- Generated at: 2026-08-31T12:00:00Z")
        assertContains(report, "- Commit: ")
        assertContains(report, "- Passed: 1")
        assertContains(report, "- Lint: 1")
        assertContains(report, "- Warnings: 1")
        assertContains(report, "- Skipped: 1")
        assertContains(report, "- Failed: 3")
        assertContains(report, "- Retry disposition: RETRY_NOW")
        assertContains(report, "- Extension library: 1.6")
        assertContains(report, "- Entry point: keiyoushi.source.Generated")
        assertContains(report, "- Source implementation: example.FixtureSource")
        assertContains(report, "- Source ID: 123")
        assertContains(report, "- Source name: Fixture")
        assertContains(report, "- Source language: en")
        assertContains(report, "- Selected manga input: popular offset 4: Fixture (`.../fixture`)")
        assertContains(
            report,
            "| popular | `getPopularManga(1)` | success | 30 | Fixture (`.../fixture`) | okhttp3.CacheControl\\\$Builder: Unable to resolve host \"www.tooncubus-read.my.id\": No address associated with hostname | <1s |",
        )
        assertContains(
            report,
            "| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 12 | Chapter 12 (`.../12`) |  | <1s |",
        )
        CheckStatus.entries.forEach { status ->
            assertContains(report, "| ${status.name.lowercase()} | $status |")
            assertContains(report, "${status.name.lowercase()} \\| \\[English\\]")
        }
        assertContains(report, "| timeout | TIMEOUT | timeout \\| \\[English\\] | RETRY_NOW | TIMEOUT |  |")
        assertContains(
            report,
            "| error | ERROR | error \\| \\[English\\] | RETRY_WHEN | DNS_LOOKUP_FAILURE | HOST_RESOLVES: example.test |",
        )
        assertContains(report, "| fail | FAIL | fail \\| \\[English\\] | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |")
    }

    @Test
    fun `writes full evidence URLs when redaction is disabled`() {
        val evidence = ReportEvidence(
            extensionLibraryVersion = "1.4",
            entryPointClass = "example.Generated",
            sourceImplementationClass = "example.Source",
            sourceId = 123,
            sourceName = "Fixture",
            sourceLanguage = "en",
            selectedManga = SelectedMangaEvidence("latest", 0, "Fixture", "/with space"),
            operations = listOf(
                OperationEvidence("latest", "fetchLatestUpdates(1)", "success", 1, "Fixture", "/with space", null, null, 42),
            ),
        )
        val result = ValidationResult("fixture", emptyList(), evidence)

        val report = MarkdownReportWriter().write(result, RedactionMode.NONE)

        assertContains(report, "- Selected manga input: latest offset 0: Fixture (`/with space`)")
        assertContains(report, "| latest | `fetchLatestUpdates(1)` | success | 1 | Fixture (`/with space`) |")
    }

    @Test
    fun `applies the selected report redaction mode`() {
        val ordinaryUrl = "https://example.com/manga/fixture"
        val publicIpUrl = "https://203.0.113.10/manga/fixture"
        val authorityCredentialUrl = "https://AUTHORITY-USER-CANARY:AUTHORITY-PASSWORD-CANARY@example.com/private"
        val localhostUrl = "http://localhost:8080/LOCALHOST-PATH-CANARY"
        val privateNetworkUrl = "http://192.168.1.25/PRIVATE-NETWORK-PATH-CANARY"
        val linkLocalUrl = "http://169.254.10.20/LINK-LOCAL-PATH-CANARY"
        val signedUrl = "https://images.example.com/page.jpg?X-Amz-Credential=AWS-CANARY&X-Amz-Security-Token=SESSION-CANARY&X-Amz-Signature=SIGNATURE-CANARY&X-Amz-Date=DATE-CANARY&X-Amz-Expires=EXPIRY-CANARY&X-Amz-Algorithm=ALGORITHM-CANARY"
        val credentialUrl = "https://api.example.com/page.jpg?api_key=API-KEY-CANARY&password=PASSWORD-CANARY&client_secret=SECRET-CANARY&session_id=SESSION-ID-CANARY&sig=SIG-CANARY&access_token=ACCESS-TOKEN-CANARY&cookie=COOKIE-QUERY-CANARY&authorization=AUTH-QUERY-CANARY"
        val result = ValidationResult(
            extensionName = "fixture",
            checks = listOf(
                CheckResult(
                    "request",
                    CheckStatus.ERROR,
                    "Bearer TOKEN-CANARY at $signedUrl from test@example.com /home/alice/report C:\\Users\\alice\\report; public example.com $publicIpUrl Norway Europe/Oslo 59.91,10.75\nuser.name: USER-NAME-CANARY\nuser.home=USER-HOME-CANARY\nhostname: HOST-NAME-CANARY\nmachine name=MACHINE-NAME-CANARY\nOrdinary person name Alice Example remains useful",
                    retryAdvice = RetryAdvice(
                        RetryDisposition.RETRY_WHEN,
                        RetryReason.DNS_LOOKUP_FAILURE,
                        RetryCondition(RetryConditionType.HOST_RESOLVES, "retry@example.com"),
                    ),
                ),
            ),
            evidence = ReportEvidence(
                extensionLibraryVersion = "1.4",
                entryPointClass = "example.Generated",
                sourceImplementationClass = "example.Source",
                sourceId = 123,
                sourceName = "Fixture",
                sourceLanguage = "en",
                selectedManga = SelectedMangaEvidence("selected@example.com", 0, "Fixture", ordinaryUrl),
                operations = listOf(
                    OperationEvidence("fast", "fast()", "success", 1, "Fixture", signedUrl, null, null, 999),
                    OperationEvidence(
                        "medium",
                        "medium()",
                        "success",
                        1,
                        null,
                        null,
                        "example.Failure",
                        "X-Amz-Date: HEADER-DATE-CANARY\nAuthorization: AWS4-HMAC-SHA256 Credential=HEADER-CREDENTIAL-CANARY, SignedHeaders=host;x-amz-date, Signature=HEADER-SIGNATURE-CANARY\nCookie: COOKIE-HEADER-CANARY\nX-Api-Key: API-HEADER-CANARY\nPassword: PASSWORD-HEADER-CANARY\nX-Client-Secret: SECRET-HEADER-CANARY\nX-Session-Id: SESSION-HEADER-CANARY\nX-Signature: SIGNATURE-HEADER-CANARY\nX-Auth-Token: TOKEN-HEADER-CANARY\nProxy-Authorization: Basic AUTH-HEADER-CANARY",
                        1_000,
                    ),
                    OperationEvidence("slow", "slow()", "timeout", 0, null, null, null, null, 10_000),
                    OperationEvidence("credentials", "credentials()", "success", 1, "Fixture", credentialUrl, null, null, 1),
                    OperationEvidence("authority", "authority()", "success", 1, "Fixture", authorityCredentialUrl, null, null, 1),
                    OperationEvidence("localhost", "localhost()", "success", 1, "Fixture", localhostUrl, null, null, 1),
                    OperationEvidence("private-network", "privateNetwork()", "success", 1, "Fixture", privateNetworkUrl, null, null, 1),
                    OperationEvidence("link-local", "linkLocal()", "success", 1, "Fixture", linkLocalUrl, null, null, 1),
                    OperationEvidence(
                        "invalid-scheme", "invalidScheme()", "error", 0, "Fixture", "ftp://private.example/secret-path", null,
                        null, 1,
                    ),
                ),
            ),
        )
        val writer = MarkdownReportWriter(clock = Clock.fixed(Instant.parse("2026-08-31T12:34:56Z"), ZoneOffset.UTC))

        val none = writer.write(result, RedactionMode.NONE)
        assertContains(none, "- Redaction: NONE (unsafe for publication)")
        listOf(
            ordinaryUrl, publicIpUrl, authorityCredentialUrl, localhostUrl, privateNetworkUrl, linkLocalUrl, credentialUrl, "AWS-CANARY",
            "SESSION-CANARY", "SIGNATURE-CANARY", "DATE-CANARY", "EXPIRY-CANARY", "ALGORITHM-CANARY", "TOKEN-CANARY", "HEADER-DATE-CANARY",
            "HEADER-CREDENTIAL-CANARY", "HEADER-SIGNATURE-CANARY", "COOKIE-HEADER-CANARY", "API-HEADER-CANARY", "PASSWORD-HEADER-CANARY",
            "SECRET-HEADER-CANARY", "SESSION-HEADER-CANARY", "SIGNATURE-HEADER-CANARY", "TOKEN-HEADER-CANARY", "AUTH-HEADER-CANARY",
            "test@example.com", "/home/alice/report", "C:\\Users\\alice\\report", "selected@example.com", "retry@example.com", "999 ms",
            "1000 ms", "10000 ms",
        ).forEach {
            assertContains(none, it)
        }
        assertContains(none, "- Generated at: 2026-08-31T12:34:56Z")

        val urlsAndSensitive = writer.write(result, RedactionMode.URLS_AND_SENSITIVE)
        assertContains(urlsAndSensitive, "- Generated at: 2026-08-31T12:00:00Z")
        assertContains(urlsAndSensitive, "https://example.com/.../fixture")
        assertContains(
            urlsAndSensitive,
            "https://images.example.com/.../page.jpg <redacted query values: X-Amz-Credential, X-Amz-Security-Token, X-Amz-Signature, X-Amz-Date, X-Amz-Expires, and X-Amz-Algorithm>",
        )
        assertContains(
            urlsAndSensitive,
            "https://api.example.com/.../page.jpg <redacted query values: api_key, password, client_secret, session_id, sig, access_token, cookie, and authorization>",
        )
        assertContains(
            urlsAndSensitive,
            "<redacted URL #4: selected resource; absolute; invalid web scheme; host private.example; final path segment secret-path>",
        )
        assertContains(urlsAndSensitive, "<redacted AWS header: signing timestamp>")
        assertContains(urlsAndSensitive, "<redacted AWS authorization header: credential, signed headers, and signature>")
        assertContains(urlsAndSensitive, "<redacted credential header: cookie>")
        assertContains(urlsAndSensitive, "<redacted credential header: API key>")
        assertContains(urlsAndSensitive, "<redacted credential header: password>")
        assertContains(urlsAndSensitive, "<redacted credential header: secret>")
        assertContains(urlsAndSensitive, "<redacted credential header: session>")
        assertContains(urlsAndSensitive, "<redacted credential header: signature>")
        assertContains(urlsAndSensitive, "<redacted credential header: token>")
        assertContains(urlsAndSensitive, "<redacted credential header: authorization>")
        assertContains(urlsAndSensitive, "<redacted credential>")
        assertContains(urlsAndSensitive, "<redacted email address>")
        assertContains(urlsAndSensitive, "<redacted home path>")
        assertContains(urlsAndSensitive, "<redacted structured workstation field: user name>")
        assertContains(urlsAndSensitive, "<redacted structured workstation field: user home>")
        assertContains(urlsAndSensitive, "<redacted structured workstation field: host name>")
        assertContains(urlsAndSensitive, "<redacted structured workstation field: machine name>")
        assertContains(urlsAndSensitive, "Ordinary person name Alice Example remains useful")
        assertContains(urlsAndSensitive, "| <1s |")
        assertContains(urlsAndSensitive, "| 1-10s |")
        assertContains(urlsAndSensitive, "| 10s+ |")
        assertFalse(urlsAndSensitive.contains("/manga/fixture"))

        val sensitive = writer.write(result, RedactionMode.SENSITIVE)
        assertContains(sensitive, ordinaryUrl)
        assertContains(sensitive, publicIpUrl)
        assertContains(sensitive, "https://example.com/private <redacted URL authority credentials>")
        assertContains(sensitive, "<redacted local URL: workstation or local network>")
        assertContains(
            sensitive,
            "https://images.example.com/page.jpg <redacted query values: X-Amz-Credential, X-Amz-Security-Token, X-Amz-Signature, X-Amz-Date, X-Amz-Expires, and X-Amz-Algorithm>",
        )
        assertContains(
            sensitive,
            "https://api.example.com/page.jpg <redacted query values: api_key, password, client_secret, session_id, sig, access_token, cookie, and authorization>",
        )
        assertContains(sensitive, "- Generated at: 2026-08-31T12:00:00Z")
        listOf("example.com", publicIpUrl, "Norway", "Europe/Oslo", "59.91,10.75", "Source language: en").forEach {
            assertContains(sensitive, it)
        }

        val canaries = listOf(
            "AWS-CANARY", "SESSION-CANARY", "SIGNATURE-CANARY", "DATE-CANARY", "EXPIRY-CANARY", "ALGORITHM-CANARY",
            "TOKEN-CANARY", "HEADER-DATE-CANARY", "HEADER-CREDENTIAL-CANARY", "HEADER-SIGNATURE-CANARY", "API-KEY-CANARY",
            "PASSWORD-CANARY", "SECRET-CANARY", "SESSION-ID-CANARY", "SIG-CANARY", "ACCESS-TOKEN-CANARY", "COOKIE-QUERY-CANARY",
            "AUTH-QUERY-CANARY", "COOKIE-HEADER-CANARY", "API-HEADER-CANARY", "PASSWORD-HEADER-CANARY", "SECRET-HEADER-CANARY",
            "SESSION-HEADER-CANARY", "SIGNATURE-HEADER-CANARY", "TOKEN-HEADER-CANARY", "AUTH-HEADER-CANARY", "AUTHORITY-USER-CANARY",
            "AUTHORITY-PASSWORD-CANARY", "LOCALHOST-PATH-CANARY", "PRIVATE-NETWORK-PATH-CANARY", "LINK-LOCAL-PATH-CANARY",
            "USER-NAME-CANARY", "USER-HOME-CANARY", "HOST-NAME-CANARY", "MACHINE-NAME-CANARY", "test@example.com", "/home/alice/report",
            "C:\\Users\\alice\\report", "selected@example.com", "retry@example.com",
        )
        assertTrue(canaries.none(urlsAndSensitive::contains), canaries.filter(urlsAndSensitive::contains).toString())
        assertTrue(canaries.none(sensitive::contains), canaries.filter(sensitive::contains).toString())
    }

    @Test
    fun `sanitizes every free text publication path`() {
        val canaries = listOf(
            "extension@example.test",
            "retry@example.test",
            "library@example.test",
            "entry@example.test",
            "implementation@example.test",
            "source@example.test",
            "language@example.test",
            "selection-operation@example.test",
            "selection-title@example.test",
            "operation@example.test",
            "method@example.test",
            "status@example.test",
            "operation-title@example.test",
            "exception-class@example.test",
            "exception-message@example.test",
            "check-name@example.test",
            "check-details@example.test",
        )
        val result = ValidationResult(
            extensionName = canaries[0],
            checks = listOf(
                CheckResult(
                    canaries[15],
                    CheckStatus.ERROR,
                    canaries[16],
                    retryAdvice = RetryAdvice(
                        RetryDisposition.RETRY_WHEN,
                        RetryReason.DNS_LOOKUP_FAILURE,
                        RetryCondition(RetryConditionType.HOST_RESOLVES, canaries[1]),
                    ),
                ),
            ),
            evidence = ReportEvidence(
                extensionLibraryVersion = canaries[2],
                entryPointClass = canaries[3],
                sourceImplementationClass = canaries[4],
                sourceId = 123,
                sourceName = canaries[5],
                sourceLanguage = canaries[6],
                selectedManga = SelectedMangaEvidence(canaries[7], 0, canaries[8], "/manga"),
                operations = listOf(
                    OperationEvidence(
                        operation = canaries[9],
                        method = canaries[10],
                        status = canaries[11],
                        entryCount = 1,
                        selectedTitle = canaries[12],
                        selectedUrl = "/chapter",
                        exceptionClass = canaries[13],
                        exceptionMessage = canaries[14],
                        elapsedTimeMillis = 1,
                    ),
                ),
            ),
        )
        val writer = MarkdownReportWriter()

        val none = writer.write(result, RedactionMode.NONE)
        val urlsAndSensitive = writer.write(result, RedactionMode.URLS_AND_SENSITIVE)
        val sensitive = writer.write(result, RedactionMode.SENSITIVE)

        assertTrue(canaries.all(none::contains), canaries.filterNot(none::contains).toString())
        listOf(urlsAndSensitive, sensitive).forEach { report ->
            assertTrue(canaries.none(report::contains), canaries.filter(report::contains).toString())
            assertContains(report, "<redacted email address>")
        }
    }

    @Test
    fun `publishes duration buckets at exact boundaries in sensitive modes`() {
        val durations = listOf(999L, 1_000L, 1_001L, 9_999L, 10_000L, 10_001L)
        val result = ValidationResult(
            extensionName = "fixture",
            checks = emptyList(),
            evidence = ReportEvidence(
                extensionLibraryVersion = "1.0",
                entryPointClass = "example.Generated",
                sourceImplementationClass = "example.Source",
                sourceId = 123,
                sourceName = "Fixture",
                sourceLanguage = "en",
                operations = durations.map { duration ->
                    OperationEvidence(
                        operation = "duration-$duration",
                        method = "duration($duration)",
                        status = "success",
                        entryCount = 0,
                        selectedTitle = null,
                        selectedUrl = null,
                        exceptionClass = null,
                        exceptionMessage = null,
                        elapsedTimeMillis = duration,
                    )
                },
            ),
        )
        val writer = MarkdownReportWriter()

        val none = writer.write(result, RedactionMode.NONE)
        durations.forEach { duration ->
            assertContains(none, "| duration-$duration | `duration($duration)` | success | 0 |  |  | $duration ms |")
        }

        listOf(RedactionMode.URLS_AND_SENSITIVE, RedactionMode.SENSITIVE).forEach { mode ->
            val report = writer.write(result, mode)
            mapOf(
                999L to "<1s",
                1_000L to "1-10s",
                1_001L to "1-10s",
                9_999L to "1-10s",
                10_000L to "10s+",
                10_001L to "10s+",
            ).forEach { (duration, bucket) ->
                assertContains(report, "| duration-$duration | `duration($duration)` | success | 0 |  |  | $bucket |")
            }
        }
    }

    @Test
    fun `marks commit dirty only for modified tracked files`() {
        val repository = createTempDirectory("report-writer-git").toFile()
        git(repository, "init", "--quiet")
        git(repository, "config", "user.email", "test@example.com")
        git(repository, "config", "user.name", "Test")
        repository.resolve("tracked.txt").writeText("clean")
        git(repository, "add", "tracked.txt")
        git(repository, "commit", "--quiet", "-m", "initial")
        val commit = git(repository, "rev-parse", "HEAD")
        val writer = MarkdownReportWriter(workingDirectory = repository)
        val result = ValidationResult("fixture", emptyList())

        val cleanReport = writer.write(result)
        assertContains(cleanReport, "- Commit: $commit\n")

        repository.resolve("untracked.txt").writeText("ignored")
        val untrackedReport = writer.write(result)
        assertFalse(untrackedReport.contains("- Commit: $commit+dirty"))

        repository.resolve("tracked.txt").writeText("modified")
        val dirtyReport = writer.write(result)
        assertContains(dirtyReport, "- Commit: $commit+dirty")
    }

    private fun git(directory: File, vararg arguments: String): String {
        val process = ProcessBuilder(listOf("git", *arguments))
            .directory(directory)
            .redirectErrorStream(true)
            .start()
        val output = process.inputStream.bufferedReader().use { it.readText() }.trim()
        check(process.waitFor() == 0) { output }
        return output
    }
}
