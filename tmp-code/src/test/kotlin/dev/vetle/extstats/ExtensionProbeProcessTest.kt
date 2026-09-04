package dev.vetle.extstats

import dev.vetle.extstats.core.ExtensionProbeProcess
import dev.vetle.extstats.core.ProbeProcessResult
import java.nio.file.Files
import java.nio.file.Path
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertIs
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class ExtensionProbeProcessTest {
    @Test
    fun `bounds child JVM heap`() {
        assertTrue("-Xmx256m" in ExtensionProbeProcess.defaultCommand())
    }

    @Test
    fun `enables bytecode verification in child JVM`() {
        assertTrue("-Xverify:none" !in ExtensionProbeProcess.defaultCommand())
    }

    @Test
    fun `configures an isolated network cache shard`() {
        assertTrue("-Dextstats.networkCacheShard=4" in ExtensionProbeProcess.defaultCommand(cacheShard = 4))
    }

    @Test
    fun `forwards network cache mode to child JVM`() {
        assertTrue(
            "-Dextstats.networkCacheMode=mihon" in ExtensionProbeProcess.defaultCommand(cacheMode = "mihon"),
        )
    }

    @Test
    fun `forwards WebView profile directory to child JVM`() {
        assertTrue(
            "-Dextstats.webViewProfileDir=/tmp/webview-profile" in
                ExtensionProbeProcess.defaultCommand(
                    webViewProfileDir = "/tmp/webview-profile",
                ),
        )
    }

    @Test
    fun `isolates WebView profile by process shard`() {
        assertTrue(
            "-Dextstats.webViewProfileDir=/tmp/webview-profile/shard-4" in
                ExtensionProbeProcess.defaultCommand(
                    cacheShard = 4,
                    webViewProfileDir = "/tmp/webview-profile",
                ),
        )
    }

    @Test
    fun `forwards native CEF directory to child JVM`() {
        assertTrue(
            "-DnativeCefDir=/tmp/jcef" in ExtensionProbeProcess.defaultCommand(nativeCefDir = "/tmp/jcef"),
        )
    }

    @Test
    fun `kills child JVM when whole-process deadline expires`() {
        val java = Path.of(System.getProperty("java.home"), "bin", "java").toString()
        val process =
            ExtensionProbeProcess(
                listOf(java, "-cp", System.getProperty("java.class.path"), BlockingProbeProcess::class.java.name),
            )

        val result = assertIs<ProbeProcessResult.TimedOut>(process.run("", deadlineMillis = 100))

        assertTrue(result.elapsedTimeMillis >= 100)
        assertTrue(result.elapsedTimeMillis < 5_000)
    }

    @Test
    fun `kills descendant process when whole-process deadline expires`() {
        val java = Path.of(System.getProperty("java.home"), "bin", "java").toString()
        val descendantPidFile = Files.createTempFile("probe-descendant-", ".pid")
        try {
            val process =
                ExtensionProbeProcess(
                    listOf(
                        java,
                        "-cp",
                        System.getProperty("java.class.path"),
                        DescendantProbeProcess::class.java.name,
                        descendantPidFile.toString(),
                    ),
                )

            assertIs<ProbeProcessResult.TimedOut>(process.run("", deadlineMillis = 1_000))

            val descendantPid = Files.readString(descendantPidFile).trim().toLong()
            assertTrue(
                ProcessHandle.of(descendantPid).map { !it.isAlive }.orElse(true),
                "Descendant process $descendantPid survived probe timeout",
            )
        } finally {
            Files.deleteIfExists(descendantPidFile)
        }
    }

    @Test
    fun `kills descendant process when persistent probe closes`() {
        val java = Path.of(System.getProperty("java.home"), "bin", "java").toString()
        val descendantPidFile = Files.createTempFile("persistent-probe-descendant-", ".pid")
        try {
            val process =
                ExtensionProbeProcess(
                    listOf(
                        java,
                        "-cp",
                        System.getProperty("java.class.path"),
                        PersistentDescendantProbeProcess::class.java.name,
                        descendantPidFile.toString(),
                    ),
                    persistent = true,
                )

            process.use {
                assertIs<ProbeProcessResult.Completed>(it.run("{}", deadlineMillis = 5_000))
            }

            val descendantPid = Files.readString(descendantPidFile).trim().toLong()
            assertTrue(
                ProcessHandle.of(descendantPid).map { !it.isAlive }.orElse(true),
                "Descendant process $descendantPid survived persistent probe close",
            )
        } finally {
            Files.deleteIfExists(descendantPidFile)
        }
    }

    @Test
    fun `kills child when structured response exceeds its size limit`() {
        val java = Path.of(System.getProperty("java.home"), "bin", "java").toString()
        val process =
            ExtensionProbeProcess(
                listOf(java, "-cp", System.getProperty("java.class.path"), OversizedProbeProcess::class.java.name),
            )

        val result =
            assertIs<ProbeProcessResult.ResponseTooLarge>(
                process.run("", deadlineMillis = 5_000, responseSizeBytes = 1_024),
            )

        assertEquals(1_024, result.limitBytes)
        assertTrue(result.elapsedTimeMillis < 5_000)
    }

    @Test
    fun `classifies child loader failures as errors`() {
        val java = Path.of(System.getProperty("java.home"), "bin", "java").toString()
        val process =
            ExtensionProbeProcess(
                listOf(java, "-cp", System.getProperty("java.class.path"), FailingProbeProcess::class.java.name),
            )

        val result = assertIs<ProbeProcessResult.Error>(process.run("", deadlineMillis = 5_000))

        assertEquals(1, result.exitCode)
        assertTrue("java.lang.IllegalStateException: Unknown source ID 42" in result.stderr)
    }

    @Test
    fun `captures out of memory error from persistent child JVM`() {
        val java = Path.of(System.getProperty("java.home"), "bin", "java").toString()
        val process =
            ExtensionProbeProcess(
                listOf(java, "-cp", System.getProperty("java.class.path"), OutOfMemoryProbeProcess::class.java.name),
                persistent = true,
            )

        val result = assertIs<ProbeProcessResult.Error>(process.run("{}", deadlineMillis = 5_000))

        assertEquals(1, result.exitCode)
        assertTrue("java.lang.OutOfMemoryError: Java heap space" in result.stderr)
    }

    @Test
    fun `recycles persistent child after request limit`() {
        val java = Path.of(System.getProperty("java.home"), "bin", "java").toString()
        val process =
            ExtensionProbeProcess(
                listOf(java, "-cp", System.getProperty("java.class.path"), ProcessIdProbeProcess::class.java.name),
                persistent = true,
                maxPersistentRequests = 2,
            )

        process.use {
            val firstPid = assertIs<ProbeProcessResult.Completed>(it.run("{}", deadlineMillis = 5_000)).response
            val secondPid = assertIs<ProbeProcessResult.Completed>(it.run("{}", deadlineMillis = 5_000)).response
            val thirdPid = assertIs<ProbeProcessResult.Completed>(it.run("{}", deadlineMillis = 5_000)).response

            assertEquals(firstPid, secondPid)
            assertNotEquals(secondPid, thirdPid)
        }
    }
}

object BlockingProbeProcess {
    @JvmStatic
    fun main(args: Array<String>) {
        Thread.sleep(Long.MAX_VALUE)
    }
}

object DescendantProbeProcess {
    @JvmStatic
    fun main(args: Array<String>) {
        val java = Path.of(System.getProperty("java.home"), "bin", "java").toString()
        val descendant =
            ProcessBuilder(
                java,
                "-cp",
                System.getProperty("java.class.path"),
                BlockingProbeProcess::class.java.name,
            ).start()
        Files.writeString(Path.of(args[0]), descendant.pid().toString())
        Thread.sleep(Long.MAX_VALUE)
    }
}

object PersistentDescendantProbeProcess {
    @JvmStatic
    fun main(args: Array<String>) {
        val java = Path.of(System.getProperty("java.home"), "bin", "java").toString()
        val descendant =
            ProcessBuilder(
                java,
                "-cp",
                System.getProperty("java.class.path"),
                BlockingProbeProcess::class.java.name,
            ).start()
        Files.writeString(Path.of(args[0]), descendant.pid().toString())
        ProcessIdProbeProcess.main(emptyArray())
    }
}

object OversizedProbeProcess {
    @JvmStatic
    fun main(args: Array<String>) {
        print("x".repeat(2_048))
        System.out.flush()
        Thread.sleep(Long.MAX_VALUE)
    }
}

object FailingProbeProcess {
    @JvmStatic
    fun main(args: Array<String>) {
        error("Unknown source ID 42")
    }
}

object OutOfMemoryProbeProcess {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = java.io.DataInputStream(System.`in`)
        input.readNBytes(input.readInt())
        throw OutOfMemoryError("Java heap space")
    }
}

object ProcessIdProbeProcess {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = java.io.DataInputStream(System.`in`)
        val output = java.io.DataOutputStream(System.out)
        while (true) {
            val requestSize = runCatching { input.readInt() }.getOrNull() ?: return
            input.readNBytes(requestSize)
            val response =
                ProcessHandle
                    .current()
                    .pid()
                    .toString()
                    .toByteArray()
            output.writeInt(response.size)
            output.write(response)
            output.flush()
        }
    }
}
