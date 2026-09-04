package dev.vetle.extstats

import dev.vetle.extstats.core.ExtensionDiscovery
import dev.vetle.extstats.core.ValidationConfig
import org.junit.jupiter.api.io.TempDir
import java.nio.file.Files
import java.nio.file.Path
import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class ExtensionDiscoveryTest {
    @Test
    fun usesLocalJarInputWithoutCopyingIt(
        @TempDir tempDir: Path,
    ) {
        val jar = Files.createFile(tempDir.resolve("fixture.jar"))
        val config =
            ValidationConfig(
                "fixture",
                jar.toUri().toString(),
                tempDir.resolve("reports/fixture.md"),
            )

        val prepared = ExtensionDiscovery().prepareJar(config)

        assertEquals(jar, prepared)
    }

    @Test
    fun convertsLocalApkInputToJar(
        @TempDir tempDir: Path,
    ) {
        val apk = Files.createFile(tempDir.resolve("fixture.apk"))
        val expectedJar = tempDir.resolve("reports/fixture.jar")
        val config =
            ValidationConfig(
                "fixture",
                apk.toUri().toString(),
                tempDir.resolve("reports/fixture.md"),
            )
        var convertedInput: Path? = null

        val prepared =
            ExtensionDiscovery(apkToJar = { input, target ->
                convertedInput = input
                assertEquals(expectedJar, target)
                target
            }).prepareJar(config)

        assertEquals(apk, convertedInput)
        assertEquals(expectedJar, prepared)
    }

    @Test
    fun rejectsRemoteArtifactInput(
        @TempDir tempDir: Path,
    ) {
        val config =
            ValidationConfig(
                "fixture",
                "https://example.test/fixture.jar",
                tempDir.resolve("reports/fixture.md"),
            )

        val failure =
            assertFailsWith<IllegalArgumentException> {
                ExtensionDiscovery().prepareJar(config)
            }

        assertContains(failure.message.orEmpty(), "must be a local file")
    }
}
