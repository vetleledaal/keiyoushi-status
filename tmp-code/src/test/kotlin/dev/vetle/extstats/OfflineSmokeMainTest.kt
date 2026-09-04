package dev.vetle.extstats

import dev.vetle.extstats.runtime.ExtensionSmokeResult
import dev.vetle.extstats.runtime.ExtensionSmokeSource
import org.junit.jupiter.api.io.TempDir
import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.readText
import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertFailsWith

class OfflineSmokeMainTest {
    @Test
    fun writesAReportForEveryJarBeforeSignalingFailure(
        @TempDir tempDir: Path,
    ) {
        val jars = Files.createDirectory(tempDir.resolve("jars"))
        Files.createFile(jars.resolve("first.jar"))
        Files.createFile(jars.resolve("second.jar"))
        val reports = tempDir.resolve("reports")

        assertFailsWith<IllegalStateException> {
            offlineSmokeExtensions(jars, reports) { jar ->
                if (jar.fileName.toString() == "first.jar") error("cannot load")
                ExtensionSmokeResult(
                    packageName = "example.second",
                    versionName = "1.0",
                    extensionLibraryVersion = "1.6",
                    entryPointClass = "example.Second",
                    sources = listOf(ExtensionSmokeSource(2L, "Second", "en", "example.Second")),
                )
            }
        }

        assertContains(reports.resolve("first.md").readText(), "- Result: FAIL")
        assertContains(reports.resolve("second.md").readText(), "- Result: PASS")
    }
}
