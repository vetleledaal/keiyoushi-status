package dev.vetle.extstats.runtime

import java.net.ServerSocket
import java.nio.file.Path
import java.util.concurrent.TimeUnit
import java.util.concurrent.TimeoutException
import kotlin.io.path.absolutePathString
import kotlin.io.path.createTempDirectory
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class JcefBrowserFixtureTest {
    @Test
    fun `runs Android WebView loading and lifecycle fixture`() {
        val nativeCefDir = Path.of(checkNotNull(System.getProperty("nativeCefDir")))
        val process = startFixture(
            nativeCefDir,
            JcefWebViewFixtureMain::class.java.name,
            extensionJar = Path.of(checkNotNull(System.getProperty("directFixtureJar"))),
        )

        val result = awaitFixture(process, 30, "WebView fixture did not shut down")
        val output = result.output
        assertEquals(0, result.exitCode, output)
        assertTrue(output.contains("JCEF_WEBVIEW_FIXTURE_OK"), output)
        assertTrue(output.contains("JCEF_EXTENSION_ASSET_OK"), output)
        assertFalse(output.contains("browser-query-secret"), output)
        assertFalse(output.contains("browser-header-secret"), output)
    }

    @Test
    fun `persists IndexedDB across browser processes`() {
        val nativeCefDir = Path.of(checkNotNull(System.getProperty("nativeCefDir")))
        val profileDirectory = createTempDirectory("jcef-profile-")
        val port = ServerSocket(0).use { it.localPort }.toString()
        try {
            val writer = startFixture(
                nativeCefDir,
                JcefIndexedDbFixtureMain::class.java.name,
                profileDirectory,
                "write",
                port,
            )
            val writerResult = awaitFixture(writer, 30, "IndexedDB writer did not shut down")
            assertEquals(0, writerResult.exitCode, writerResult.output)
            assertTrue(writerResult.output.contains("JCEF_INDEXED_DB_WRITE_OK"), writerResult.output)

            val reader = startFixture(
                nativeCefDir,
                JcefIndexedDbFixtureMain::class.java.name,
                profileDirectory,
                "read",
                port,
            )
            val readerResult = awaitFixture(reader, 30, "IndexedDB reader did not shut down")
            assertEquals(0, readerResult.exitCode, readerResult.output)
            assertTrue(readerResult.output.contains("JCEF_INDEXED_DB_READ_OK"), readerResult.output)
        } finally {
            profileDirectory.toFile().deleteRecursively()
        }
    }

    @Test
    fun `runs local browser fixture and shuts down`() {
        val nativeCefDir = Path.of(checkNotNull(System.getProperty("nativeCefDir")))
        val process = startFixture(nativeCefDir, JcefBrowserFixtureMain::class.java.name)

        val result = awaitFixture(process, 30, "JCEF child JVM did not shut down")
        val output = result.output
        assertEquals(0, result.exitCode, output)
        assertTrue(output.contains("JCEF_HTTP_FIXTURE_OK"), output)
        assertTrue(result.observedDescendants, "JCEF fixture did not spawn a browser process")
    }

    @Test
    fun `fails immediately when native CEF is missing`() {
        val missing = Path.of(System.getProperty("java.io.tmpdir"), "missing-native-cef-${System.nanoTime()}")
        val process = startFixture(missing, JcefBrowserFixtureMain::class.java.name)

        val result = awaitFixture(process, 5, "Missing native CEF validation did not exit immediately")
        val output = result.output
        assertNotEquals(0, result.exitCode, output)
        assertTrue(output.contains("Native CEF directory is missing: $missing"), output)
    }

    @Test
    fun `fails immediately when native CEF checksum is invalid`() {
        val installed = Path.of(checkNotNull(System.getProperty("nativeCefDir")))
        val invalid = createTempDirectory("invalid-native-cef-")
        try {
            installed.resolve("libjcef.so").toFile().copyTo(invalid.resolve("libjcef.so").toFile())
            invalid.resolve("libjcef.so").toFile().appendBytes(byteArrayOf(0))
            val process = startFixture(invalid, JcefBrowserFixtureMain::class.java.name)

            val result = awaitFixture(process, 5, "Invalid native CEF validation did not exit immediately")
            val output = result.output
            assertNotEquals(0, result.exitCode, output)
            assertTrue(output.contains("Native CEF checksum mismatch for ${invalid.resolve("libjcef.so")}"), output)
        } finally {
            invalid.toFile().deleteRecursively()
        }
    }

    private fun startFixture(
        nativeCefDir: Path,
        mainClass: String,
        profileDirectory: Path? = null,
        vararg args: String,
        extensionJar: Path? = null,
    ): Process = ProcessBuilder(
        buildList {
            add(Path.of(System.getProperty("java.home"), "bin", "java").absolutePathString())
            add("-DnativeCefDir=${nativeCefDir.absolutePathString()}")
            add("-DnativeCefLibcefSha256=${checkNotNull(System.getProperty("nativeCefLibcefSha256"))}")
            add("-DnativeCefLibjcefSha256=${checkNotNull(System.getProperty("nativeCefLibjcefSha256"))}")
            if (profileDirectory != null) add("-Dextstats.webViewProfileDir=${profileDirectory.absolutePathString()}")
            add("-cp")
            add(System.getProperty("java.class.path"))
            add(mainClass)
            if (extensionJar != null) add(extensionJar.absolutePathString())
            addAll(args)
        },
    )
        .redirectErrorStream(true)
        .start()

    private fun awaitFixture(process: Process, timeoutSeconds: Long, timeoutMessage: String): FixtureResult {
        val root = process.toHandle()
        val descendants = mutableSetOf<ProcessHandle>()
        try {
            val deadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(timeoutSeconds)
            while (process.isAlive && System.nanoTime() < deadline) {
                root.descendants().forEach(descendants::add)
                process.waitFor(100, TimeUnit.MILLISECONDS)
            }
            assertFalse(process.isAlive, timeoutMessage)
            val output = process.inputStream.bufferedReader().readText()
            val shutdownDeadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(5)
            descendants.filter(ProcessHandle::isAlive).forEach { descendant ->
                val remaining = shutdownDeadline - System.nanoTime()
                if (remaining > 0) {
                    try {
                        descendant.onExit().get(remaining, TimeUnit.NANOSECONDS)
                    } catch (_: TimeoutException) {}
                }
            }
            assertTrue(descendants.none(ProcessHandle::isAlive), "CEF child process survived fixture shutdown")
            return FixtureResult(process.exitValue(), output, descendants.isNotEmpty())
        } finally {
            terminateProcessTree(root, descendants)
        }
    }

    private fun terminateProcessTree(root: ProcessHandle, observedDescendants: Set<ProcessHandle>) {
        val descendants = (root.descendants().toList() + observedDescendants).distinctBy(ProcessHandle::pid)
        descendants.asReversed().filter(ProcessHandle::isAlive).forEach(ProcessHandle::destroy)
        if (root.isAlive) root.destroy()
        descendants.asReversed().filter(ProcessHandle::isAlive).forEach(ProcessHandle::destroyForcibly)
        if (root.isAlive) root.destroyForcibly()
    }

    private data class FixtureResult(
        val exitCode: Int,
        val output: String,
        val observedDescendants: Boolean,
    )
}
