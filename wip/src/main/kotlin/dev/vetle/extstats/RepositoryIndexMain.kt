package dev.vetle.extstats

import dev.vetle.extstats.core.ExtensionRepository
import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.isRegularFile
import kotlin.io.path.name

fun main(args: Array<String>) {
    require(args.size <= 2) {
        "Usage: readExtensionIndex [-PdownloadDirectory=<path>] [-PdownloadArtifactType=jar|apk]"
    }

    val downloadDirectory = args.firstOrNull()?.let(Path::of)
    val artifactType = args.getOrNull(1) ?: "jar"
    require(artifactType in setOf("jar", "apk")) {
        "Unsupported download artifact type '$artifactType'; expected jar or apk"
    }
    val repository = ExtensionRepository()
    val index =
        try {
            repository.fetchIndex()
        } catch (exception: Exception) {
            val existingArtifacts = downloadDirectory?.let { countArtifacts(it, artifactType) } ?: 0L
            if (existingArtifacts == 0L) throw exception
            System.err.println(
                "Extension index refresh failed; continuing with $existingArtifacts existing " +
                    "${artifactType.uppercase()}s: " +
                    "${exception::class.qualifiedName}: ${exception.message}",
            )
            return
        }
    check(index.hasExtensionList()) { "Extension index does not contain an embedded extension list" }
    val extensions = index.extensionList.extensionsList
    val artifacts =
        extensions.count {
            when (artifactType) {
                "jar" -> it.resources.jarUrl.isNotBlank()
                else -> it.resources.apkUrl.isNotBlank()
            }
        }
    println("${index.name}: ${extensions.size} extensions, $artifacts ${artifactType.uppercase()}s")

    downloadDirectory?.let { directory ->
        val downloaded =
            when (artifactType) {
                "jar" ->
                    repository.downloadAllJars(
                        index,
                        directory,
                        reportDirectory = Path.of("build", "reports", "extension-validation"),
                    )
                else ->
                    repository.downloadAllApks(
                        index,
                        directory,
                        reportDirectory = Path.of("build", "reports", "extension-validation"),
                    )
            }
        println("Available ${downloaded.size} indexed ${artifactType.uppercase()}s in ${directory.toAbsolutePath()}")
    }
}

private fun countArtifacts(
    directory: Path,
    artifactType: String,
): Long {
    if (!Files.isDirectory(directory)) return 0
    return Files.list(directory).use { paths ->
        paths.filter { it.isRegularFile() && it.name.endsWith(".$artifactType") }.count()
    }
}
