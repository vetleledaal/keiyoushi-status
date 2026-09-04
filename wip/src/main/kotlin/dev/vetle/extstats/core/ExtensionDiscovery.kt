package dev.vetle.extstats.core

import dev.vetle.extstats.runtime.ApkToJarConverter
import java.net.URI
import java.nio.file.Path

class ExtensionDiscovery(
    private val apkToJar: (Path, Path) -> Path = ApkToJarConverter::convert,
) {
    fun prepareJar(config: ValidationConfig): Path {
        val uri = URI(config.jarUrl)
        require(uri.scheme == "file") { "Extension artifact must be a local file: $uri" }
        val isApk = uri.path.endsWith(".apk", ignoreCase = true)
        if (!isApk) return Path.of(uri)

        val target = config.reportPath.parent.resolve("${config.extensionName}.jar")
        return apkToJar(Path.of(uri), target)
    }
}
