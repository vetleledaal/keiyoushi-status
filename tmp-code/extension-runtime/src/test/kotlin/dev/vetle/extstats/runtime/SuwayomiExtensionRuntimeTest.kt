package dev.vetle.extstats.runtime

import java.nio.file.FileSystems
import java.nio.file.Files
import java.nio.file.Path
import java.util.Collections
import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertFailsWith

class SuwayomiExtensionRuntimeTest {
    @Test
    fun `rejects unsupported extension library version`() {
        val sourceJar = Path.of(System.getProperty("testExtensionJar"))
        val originalVersion = requireNotNull(AndroidManifestParser.parse(sourceJar).extensionLibraryVersion)
        val jar = Files.createTempFile("unsupported-extension", ".jar")
        Files.copy(sourceJar, jar, java.nio.file.StandardCopyOption.REPLACE_EXISTING)
        FileSystems.newFileSystem(jar, Collections.emptyMap<String, Any>()).use { fileSystem ->
            val manifest = fileSystem.getPath("AndroidManifest.xml")
            Files.writeString(
                manifest,
                Files.readString(manifest).replaceFirst(
                    "android:value=\"$originalVersion\"",
                    "android:value=\"1.5\"",
                ),
            )
        }

        val error =
            assertFailsWith<IllegalArgumentException> {
                SuwayomiExtensionRuntime().load(jar)
            }

        assertContains(error.message.orEmpty(), "Unsupported extension-lib version 1.5; expected 1.4 or 1.6")
    }

    @Test
    fun `rejects missing entry point class`() {
        val sourceJar = Path.of(System.getProperty("testExtensionJar"))
        val originalEntryPoint = requireNotNull(AndroidManifestParser.parse(sourceJar).extensionClass)
        val jar = Files.createTempFile("missing-entry-point", ".jar")
        Files.copy(sourceJar, jar, java.nio.file.StandardCopyOption.REPLACE_EXISTING)
        FileSystems.newFileSystem(jar, Collections.emptyMap<String, Any>()).use { fileSystem ->
            val manifest = fileSystem.getPath("AndroidManifest.xml")
            Files.writeString(manifest, Files.readString(manifest).replaceFirst(originalEntryPoint, "missing.EntryPoint"))
        }

        val error =
            assertFailsWith<ClassNotFoundException> {
                SuwayomiExtensionRuntime().load(jar)
            }

        assertContains(error.message.orEmpty(), "missing.EntryPoint")
    }
}
