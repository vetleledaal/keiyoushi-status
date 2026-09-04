package dev.vetle.extstats

import com.sun.net.httpserver.HttpServer
import dev.vetle.extstats.core.ExtensionRepository
import dev.vetle.extstats.proto.ExtensionIndexProto.Extension
import dev.vetle.extstats.proto.ExtensionIndexProto.ExtensionList
import dev.vetle.extstats.proto.ExtensionIndexProto.Index
import dev.vetle.extstats.proto.ExtensionIndexProto.Resources
import org.junit.jupiter.api.io.TempDir
import java.io.ByteArrayOutputStream
import java.net.InetSocketAddress
import java.nio.file.Files
import java.nio.file.Path
import java.util.zip.GZIPOutputStream
import kotlin.io.path.createFile
import kotlin.io.path.exists
import kotlin.io.path.readText
import kotlin.io.path.writeText
import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals

class ExtensionRepositoryTest {
    @Test
    fun readsExtensionJarUrlFromProtobufIndex() {
        val expected =
            Index
                .newBuilder()
                .setName("Keiyoushi")
                .setExtensionList(
                    ExtensionList.newBuilder().addExtensions(
                        Extension
                            .newBuilder()
                            .setPackageName("eu.kanade.tachiyomi.extension.en.example")
                            .setResources(
                                Resources.newBuilder().setJarUrl(
                                    "https://github.com/keiyoushi/extensions/releases/download/example/example.jar",
                                ),
                            ),
                    ),
                ).build()

        val compressed =
            ByteArrayOutputStream()
                .also { output ->
                    GZIPOutputStream(output).use { it.write(expected.toByteArray()) }
                }.toByteArray()

        val actual = ExtensionRepository().readIndex(compressed.inputStream())

        assertEquals("Keiyoushi", actual.name)
        assertEquals(
            "https://github.com/keiyoushi/extensions/releases/download/example/example.jar",
            actual.extensionList.extensionsList
                .single()
                .resources.jarUrl,
        )
    }

    @Test
    fun removesJarsAndReportsMissingFromIndex(
        @TempDir tempDir: Path,
    ) {
        val jars = tempDir.resolve("jars")
        val reports = tempDir.resolve("reports")
        Files.createDirectories(jars)
        Files.createDirectories(reports)
        val current = jars.resolve("tachiyomi-en.example-v1.6.2.jar").createFile()
        val superseded = jars.resolve("tachiyomi-en.example-v1.6.1.jar").createFile()
        val orphan = jars.resolve("tachiyomi-en.orphan-v1.4.0.jar").createFile()
        val unrelated = jars.resolve("notes.txt").createFile()
        val currentReport = reports.resolve("tachiyomi-en.example-v1.6.2.md").createFile()
        val supersededReport = reports.resolve("tachiyomi-en.example-v1.6.1.md").createFile()
        val orphanReport = reports.resolve("tachiyomi-en.orphan-v1.4.0.md").createFile()
        val summary = reports.resolve("summary.md").createFile()
        val output = mutableListOf<String>()
        val index =
            Index
                .newBuilder()
                .setExtensionList(
                    ExtensionList.newBuilder().addExtensions(
                        Extension
                            .newBuilder()
                            .setPackageName("eu.kanade.tachiyomi.extension.en.example")
                            .setResources(
                                Resources.newBuilder().setJarUrl(
                                    "https://example.invalid/tachiyomi-en.example-v1.6.2.jar",
                                ),
                            ),
                    ),
                ).build()

        assertEquals(
            listOf(current),
            ExtensionRepository(output = output::add).downloadAllJars(index, jars, reportDirectory = reports),
        )

        assertEquals(false, superseded.exists())
        assertEquals(false, orphan.exists())
        assertEquals(true, unrelated.exists())
        assertEquals(true, currentReport.exists())
        assertEquals(false, supersededReport.exists())
        assertEquals(false, orphanReport.exists())
        assertEquals(true, summary.exists())
        assertEquals(5, output.size)
        assertContains(output, "Deleted unknown file: ${orphan.toAbsolutePath()}")
        assertContains(output, "Deleted unknown file: ${superseded.toAbsolutePath()}")
        assertContains(output, "Deleted unknown file: ${orphanReport.toAbsolutePath()}")
        assertContains(output, "Deleted unknown file: ${supersededReport.toAbsolutePath()}")
        assertContains(output, "Extension JARs: 0 to download, 1 already present (1 indexed).")
    }

    @Test
    fun skipsExistingJar(
        @TempDir tempDir: Path,
    ) {
        val jar = tempDir.resolve("tachiyomi-en.example-v1.6.2.jar")
        jar.writeText("existing")
        val index = extensionIndex("https://example.invalid/${jar.fileName}")
        val output = mutableListOf<String>()

        ExtensionRepository(output = output::add).downloadAllJars(index, tempDir)

        assertEquals("existing", jar.readText())
        assertEquals("Extension JARs: 0 to download, 1 already present (1 indexed).", output.single())
    }

    @Test
    fun downloadsMissingJar(
        @TempDir tempDir: Path,
    ) {
        val server =
            HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0).apply {
                createContext("/tachiyomi-en.example-v1.6.2.jar") { exchange ->
                    val body = "fresh".toByteArray()
                    exchange.sendResponseHeaders(200, body.size.toLong())
                    exchange.responseBody.use { it.write(body) }
                }
                start()
            }
        try {
            val jar = tempDir.resolve("tachiyomi-en.example-v1.6.2.jar")
            val index = extensionIndex("http://127.0.0.1:${server.address.port}/${jar.fileName}")
            val output = mutableListOf<String>()

            ExtensionRepository(output = output::add).downloadAllJars(index, tempDir)

            assertEquals("fresh", jar.readText())
            assertEquals(
                listOf(
                    "Extension JARs: 1 to download, 0 already present (1 indexed).",
                    "Download progress: 1/1",
                    "Regenerate reports: ./gradlew run " +
                        "-PvalidationExtensions=tachiyomi-en.example-v1.6.2.jar",
                ),
                output,
            )
        } finally {
            server.stop(0)
        }
    }

    private fun extensionIndex(jarUrl: String): Index = Index
        .newBuilder()
        .setExtensionList(
            ExtensionList.newBuilder().addExtensions(
                Extension
                    .newBuilder()
                    .setPackageName("eu.kanade.tachiyomi.extension.en.example")
                    .setResources(Resources.newBuilder().setJarUrl(jarUrl)),
            ),
        ).build()
}
