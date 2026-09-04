package dev.vetle.extstats.core

import dev.vetle.extstats.proto.ExtensionIndexProto.Index
import java.io.InputStream
import java.io.PushbackInputStream
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption
import java.time.Duration
import java.util.zip.GZIPInputStream
import kotlin.io.path.createDirectories
import kotlin.io.path.exists

class ExtensionRepository(
    private val indexUri: URI = DEFAULT_INDEX_URI,
    private val httpClient: HttpClient =
        HttpClient
            .newBuilder()
            .connectTimeout(Duration.ofSeconds(30))
            .followRedirects(HttpClient.Redirect.NORMAL)
            .build(),
    private val output: (String) -> Unit = ::println,
) {
    fun fetchIndex(): Index {
        val request =
            HttpRequest
                .newBuilder(indexUri)
                .timeout(REQUEST_TIMEOUT)
                .GET()
                .build()
        val response = httpClient.send(request, HttpResponse.BodyHandlers.ofByteArray())
        check(response.statusCode() in 200..299) {
            "Failed to download extension index: HTTP ${response.statusCode()} from $indexUri"
        }
        return readIndex(response.body().inputStream())
    }

    fun readIndex(input: InputStream): Index {
        val buffered = PushbackInputStream(input, 2)
        val signature = buffered.readNBytes(2)
        buffered.unread(signature)
        val decoded = if (signature.contentEquals(GZIP_SIGNATURE)) GZIPInputStream(buffered) else buffered
        return decoded.use(Index::parseFrom)
    }

    fun downloadAllJars(
        index: Index,
        directory: Path,
        reportDirectory: Path? = null,
    ): List<Path> {
        check(index.hasExtensionList()) { "Extension index does not contain an embedded extension list" }
        directory.createDirectories()
        val targets =
            index.extensionList.extensionsList
                .filter { it.resources.jarUrl.isNotBlank() }
                .mapNotNull { extension ->
                    try {
                        val jarUri = URI.create(extension.resources.jarUrl)
                        val fileName = Path.of(jarUri.path).fileName?.toString()
                        require(!fileName.isNullOrBlank()) {
                            "Extension ${extension.packageName} has an invalid JAR URL: $jarUri"
                        }
                        Triple(extension.packageName, jarUri, directory.resolve(fileName))
                    } catch (exception: Exception) {
                        System.err.println(
                            "Failed to prepare ${extension.packageName}: ${exception::class.qualifiedName}: ${exception.message}",
                        )
                        null
                    }
                }
        val expectedJarNames = targets.map { (_, _, destination) -> destination.fileName.toString() }.toSet()
        removeUnknownJars(directory, expectedJarNames)
        reportDirectory?.let { removeUnknownReports(it, expectedJarNames) }
        val expectedDownloads = targets.count { (_, _, destination) -> !destination.exists() }
        output(
            "Extension JARs: $expectedDownloads to download, " +
                "${targets.size - expectedDownloads} already present (${targets.size} indexed).",
        )
        val progressInterval = maxOf(1, (expectedDownloads + 9) / 10)
        var attemptedDownloads = 0
        val downloadedFileNames = mutableListOf<String>()

        val availableJars =
            targets.mapNotNull { (packageName, jarUri, destination) ->
                try {
                    val alreadyPresent = destination.exists()
                    download(jarUri, destination).also { downloaded ->
                        if (!alreadyPresent) {
                            downloadedFileNames += downloaded.fileName.toString()
                            attemptedDownloads++
                            if (attemptedDownloads % progressInterval == 0 || attemptedDownloads == expectedDownloads) {
                                output("Download progress: $attemptedDownloads/$expectedDownloads")
                            }
                        }
                    }
                } catch (exception: InterruptedException) {
                    Thread.currentThread().interrupt()
                    throw exception
                } catch (exception: Exception) {
                    System.err.println(
                        "Failed to download $packageName: ${exception::class.qualifiedName}: ${exception.message}",
                    )
                    attemptedDownloads++
                    if (attemptedDownloads % progressInterval == 0 || attemptedDownloads == expectedDownloads) {
                        output("Download progress: $attemptedDownloads/$expectedDownloads")
                    }
                    null
                }
            }
        if (downloadedFileNames.isNotEmpty()) {
            output(
                "Regenerate reports: ./gradlew run -PvalidationExtensions=" +
                    downloadedFileNames.joinToString(","),
            )
        }
        return availableJars
    }

    private fun removeUnknownJars(
        directory: Path,
        expectedJarNames: Set<String>,
    ) {
        Files.list(directory).use { paths ->
            paths
                .filter(Files::isRegularFile)
                .filter { path -> path.fileName.toString().endsWith(".jar", ignoreCase = true) }
                .filter { path -> path.fileName.toString() !in expectedJarNames }
                .forEach(::deleteUnknownFile)
        }
    }

    private fun removeUnknownReports(
        directory: Path,
        expectedJarNames: Set<String>,
    ) {
        if (!Files.isDirectory(directory)) return
        val expectedReportNames = expectedJarNames.map { it.removeSuffix(".jar") + ".md" }.toSet()
        Files.list(directory).use { paths ->
            paths
                .filter(Files::isRegularFile)
                .filter { path -> path.fileName.toString().endsWith(".md", ignoreCase = true) }
                .filter { path -> path.fileName.toString() != "summary.md" }
                .filter { path -> path.fileName.toString() !in expectedReportNames }
                .forEach(::deleteUnknownFile)
        }
    }

    private fun deleteUnknownFile(path: Path) {
        Files.delete(path)
        output("Deleted unknown file: ${path.toAbsolutePath()}")
    }

    private fun download(
        uri: URI,
        destination: Path,
    ): Path {
        if (destination.exists()) return destination

        val temporary = Files.createTempFile(destination.parent, ".${destination.fileName}.", ".part")
        val request =
            HttpRequest
                .newBuilder(uri)
                .timeout(REQUEST_TIMEOUT)
                .GET()
                .build()
        val response = httpClient.send(request, HttpResponse.BodyHandlers.ofByteArray())
        check(response.statusCode() in 200..299) {
            "Failed to download extension JAR: HTTP ${response.statusCode()} from $uri"
        }
        try {
            Files.write(temporary, response.body())
            Files.move(temporary, destination, StandardCopyOption.REPLACE_EXISTING)
        } finally {
            Files.deleteIfExists(temporary)
        }
        return destination
    }

    companion object {
        private val REQUEST_TIMEOUT: Duration = Duration.ofMinutes(2)
        private val GZIP_SIGNATURE = byteArrayOf(0x1f, 0x8b.toByte())
        val DEFAULT_INDEX_URI: URI =
            URI("https://raw.githubusercontent.com/keiyoushi/extensions/repo/index.pb")
    }
}
