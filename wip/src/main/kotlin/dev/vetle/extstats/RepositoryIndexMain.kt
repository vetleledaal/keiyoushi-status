package dev.vetle.extstats

import dev.vetle.extstats.core.ExtensionRepository
import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.isRegularFile
import kotlin.io.path.name

fun main(args: Array<String>) {
    require(args.size <= 1) {
        "Usage: readExtensionIndex [-PdownloadDirectory=<path>]"
    }

    val downloadDirectory = args.firstOrNull()?.let(Path::of)
    val repository = ExtensionRepository()
    val index =
        try {
            repository.fetchIndex()
        } catch (exception: Exception) {
            val existingJars = downloadDirectory?.let(::countJars) ?: 0L
            if (existingJars == 0L) throw exception
            System.err.println(
                "Extension index refresh failed; continuing with $existingJars existing JARs: " +
                    "${exception::class.qualifiedName}: ${exception.message}",
            )
            return
        }
    check(index.hasExtensionList()) { "Extension index does not contain an embedded extension list" }
    val extensions = index.extensionList.extensionsList
    val jars = extensions.count { it.resources.jarUrl.isNotBlank() }
    println("${index.name}: ${extensions.size} extensions, $jars JARs")

    downloadDirectory?.let { directory ->
        val downloaded =
            repository.downloadAllJars(
                index,
                directory,
                reportDirectory = Path.of("build", "reports", "extension-validation"),
            )
        println("Available ${downloaded.size} indexed JARs in ${directory.toAbsolutePath()}")
    }
}

private fun countJars(directory: Path): Long {
    if (!Files.isDirectory(directory)) return 0
    return Files.list(directory).use { paths ->
        paths.filter { it.isRegularFile() && it.name.endsWith(".jar") }.count()
    }
}
