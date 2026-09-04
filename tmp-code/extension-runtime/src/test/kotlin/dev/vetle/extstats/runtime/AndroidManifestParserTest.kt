package dev.vetle.extstats.runtime

import java.nio.file.Files
import java.nio.file.Path
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream
import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class AndroidManifestParserTest {
    @Test
    fun `parses selected extension jar manifest`() {
        val manifest = AndroidManifestParser.parse(Path.of(System.getProperty("testExtensionJar")))

        assertTrue(manifest.packageName.startsWith("eu.kanade.tachiyomi.extension."))
        assertNotNull(manifest.versionName)
        assertTrue(assertNotNull(manifest.versionCode) > 0)
        assertEquals(manifest.metadata["tachiyomi.extension.class"], manifest.extensionClass)
        assertTrue(manifest.extensionLibraryVersion in setOf("1.4", "1.6"))
        assertTrue("tachiyomi.extension" in manifest.usesFeatures)
    }

    @Test
    fun `rejects blank required values`() {
        val error =
            assertFailsWith<IllegalArgumentException> {
                AndroidManifestParser.parse(manifestJar(extensionClass = " "))
            }

        assertContains(error.message.orEmpty(), "tachiyomi.extension.class must not be blank")
    }

    @Test
    fun `rejects duplicate metadata`() {
        val error =
            assertFailsWith<IllegalArgumentException> {
                AndroidManifestParser.parse(manifestJar(duplicateExtensionClass = true))
            }

        assertContains(error.message.orEmpty(), "Duplicate manifest meta-data: tachiyomi.extension.class")
    }

    private fun manifestJar(
        extensionClass: String = "example.Extension",
        duplicateExtensionClass: Boolean = false,
    ): Path {
        val duplicate =
            if (duplicateExtensionClass) {
                "<meta-data android:name=\"tachiyomi.extension.class\" android:value=\"example.OtherExtension\" />"
            } else {
                ""
            }
        val manifest =
            """<manifest xmlns:android="http://schemas.android.com/apk/res/android"
                |    package="example.extension"
                |    android:versionName="1.0"
                |    android:versionCode="1">
                |    <application>
                |        <meta-data android:name="tachiyomi.extension.class" android:value="$extensionClass" />
                |        $duplicate
                |        <meta-data android:name="tachiyomix.extensionLib" android:value="1.6" />
                |    </application>
                |</manifest>
            """.trimMargin()
        val jar = Files.createTempFile("extension-manifest", ".jar")
        jar.toFile().deleteOnExit()
        ZipOutputStream(Files.newOutputStream(jar)).use {
            it.putNextEntry(ZipEntry("AndroidManifest.xml"))
            it.write(manifest.toByteArray())
            it.closeEntry()
        }
        return jar
    }
}
