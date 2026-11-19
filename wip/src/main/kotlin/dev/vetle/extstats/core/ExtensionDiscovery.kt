package dev.vetle.extstats.core

import dev.vetle.extstats.runtime.ApkToJarConverter
import java.net.URI
import java.nio.file.Files
import java.nio.file.Path
import java.util.jar.JarEntry
import java.util.jar.JarFile
import java.util.jar.JarOutputStream
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes

class ExtensionDiscovery(
    private val apkToJar: (Path, Path) -> Path = ApkToJarConverter::convert,
) {
    fun prepareJar(config: ValidationConfig): Path {
        val uri = URI(config.jarUrl)
        require(uri.scheme == "file") { "Extension artifact must be a local file: $uri" }
        val isApk = uri.path.endsWith(".apk", ignoreCase = true)
        // TEMPORARY HACK: rewrite one known Koi/MeDamTruyen bytecode regex constant.
        // This is not a general regex or JAR compatibility mechanism.
        if (!isApk) return patchKoiMedamTruyenEncryptedContentRegex(Path.of(uri), config)

        val target = config.reportPath.parent.resolve("${config.extensionName}.jar")
        if (target.toFile().isFile) return target
        return synchronized(conversionLock) {
            if (target.toFile().isFile) return@synchronized target
            apkToJar(Path.of(uri), target)
        }
    }

    private companion object {
        val conversionLock = Any()
    }
}

private fun patchKoiMedamTruyenEncryptedContentRegex(source: Path, config: ValidationConfig): Path {
    val target = config.reportPath.parent.resolve("${config.extensionName}.compatibility.jar")
    if (target.toFile().isFile && !containsJarSignature(target)) return target
    Files.deleteIfExists(target)

    var changed = false
    Files.createDirectories(target.parent)
    try {
        JarFile(source.toFile()).use { sourceJar ->
            JarOutputStream(Files.newOutputStream(target)).use { output ->
                sourceJar.entries().asSequence().forEach { entry ->
                    if (
                        entry.name.equals("META-INF/MANIFEST.MF", ignoreCase = true) ||
                        entry.name.matches(Regex("META-INF/[^/]+\\.(SF|RSA|DSA)", RegexOption.IGNORE_CASE))
                    ) {
                        return@forEach
                    }
                    val bytes = sourceJar.getInputStream(entry).use { it.readBytes() }
                    val outputBytes =
                        if (!entry.isDirectory && entry.name.endsWith(".class")) {
                            patchRegexConstant(bytes).also { changed = changed || it.contentEquals(bytes).not() }
                        } else {
                            bytes
                        }
                    output.putNextEntry(JarEntry(entry.name))
                    output.write(outputBytes)
                    output.closeEntry()
                }
            }
        }
    } catch (_: java.util.zip.ZipException) {
        Files.deleteIfExists(target)
        return source
    }
    if (!changed) {
        Files.deleteIfExists(target)
        return source
    }
    return target
}

private fun patchRegexConstant(original: ByteArray): ByteArray {
    val reader = ClassReader(original)
    val writer = ClassWriter(reader, 0)
    reader.accept(
        object : ClassVisitor(Opcodes.ASM9, writer) {
            override fun visitMethod(
                access: Int,
                name: String?,
                descriptor: String?,
                signature: String?,
                exceptions: Array<out String>?,
            ): MethodVisitor {
                val method = super.visitMethod(access, name, descriptor, signature, exceptions)
                return object : MethodVisitor(Opcodes.ASM9, method) {
                    override fun visitLdcInsn(value: Any?) {
                        super.visitLdcInsn(
                            if (value is String && value == UNSAFE_KOI_REGEX) SAFE_KOI_REGEX else value,
                        )
                    }
                }
            }
        },
        0,
    )
    return writer.toByteArray()
}

private fun containsJarSignature(jar: Path): Boolean =
    JarFile(jar.toFile()).use { archive ->
        archive.entries().asSequence().any { entry ->
            entry.name.equals("META-INF/MANIFEST.MF", ignoreCase = true) ||
                entry.name.matches(Regex("META-INF/[^/]+\\.(SF|RSA|DSA)", RegexOption.IGNORE_CASE))
        }
    }

private const val UNSAFE_KOI_REGEX = """var\s+htmlContent\s*=\s*("(?:[^"\\]|\\.)*")\s*;"""
private const val SAFE_KOI_REGEX = """var\s+htmlContent\s*=\s*("[^"\\]*(?:\\.[^"\\]*)*")\s*;"""
