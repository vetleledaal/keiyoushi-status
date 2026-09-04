package dev.vetle.extstats.runtime

import eu.kanade.tachiyomi.source.online.HttpSource
import java.nio.file.Path
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertIs

class SuwayomiExtensionRuntimeLoadTest {
    @Test
    fun `loads selected extension behind runtime interface`() {
        val runtime: ExtensionRuntime = SuwayomiExtensionRuntime()
        val jar = Path.of(System.getProperty("testExtensionJar"))
        val manifest = AndroidManifestParser.parse(jar)

        runtime.load(jar).use { extension ->
            val source = extension.sources.single()

            assertIs<HttpSource>(source)
            assertEquals(manifest.extensionLibraryVersion, extension.metadata.extensionLibraryVersion)
            assertEquals(manifest.resolveSourceClassName(), extension.metadata.entryPointClass)
            assertEquals(source::class.java.name, extension.metadata.sourceImplementationClass)
        }
    }
}
