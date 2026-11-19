package dev.vetle.extstats

import dev.vetle.extstats.runtime.ExtensionSmokeResult
import dev.vetle.extstats.runtime.SuwayomiExtensionRuntime
import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.isRegularFile
import kotlin.io.path.name
import kotlin.io.path.writeText

fun main(args: Array<String>) {
    require(args.size == 2) { "Usage: offlineSmokeTest <jar-directory> <report-directory>" }
    offlineSmokeExtensions(Path.of(args[0]), Path.of(args[1]), SuwayomiExtensionRuntime()::smokeTest)
}

internal fun offlineSmokeExtensions(
    jarDirectory: Path,
    reportDirectory: Path,
    smokeTest: (Path) -> ExtensionSmokeResult,
) {
    require(Files.isDirectory(jarDirectory)) { "Extension directory does not exist: $jarDirectory" }
    val jars =
        Files.list(jarDirectory).use { paths ->
            paths.filter { it.isRegularFile() && it.name.endsWith(".jar") }.sorted().toList()
        }
    require(jars.isNotEmpty()) { "No JAR files found in $jarDirectory" }
    Files.createDirectories(reportDirectory)

    var failures = 0
    jars.forEach { jar ->
        val reportPath = reportDirectory.resolve("${jar.name.removeSuffix(".jar")}.md")
        val startedAt = System.nanoTime()
        try {
            val result = smokeTest(jar)
            val elapsedMillis = (System.nanoTime() - startedAt) / 1_000_000
            reportPath.writeText(smokeReport(jar, result, elapsedMillis))
            println("PASS ${jar.name} ($elapsedMillis ms)")
        } catch (failure: Throwable) {
            if (failure !is Exception && failure !is LinkageError) throw failure
            val cause = rootCause(failure)
            val elapsedMillis = (System.nanoTime() - startedAt) / 1_000_000
            failures++
            reportPath.writeText(smokeFailureReport(jar, cause, elapsedMillis))
            println("FAIL ${jar.name} ($elapsedMillis ms): ${cause::class.qualifiedName}: ${cause.message}")
        }
    }
    check(failures == 0) { "$failures of ${jars.size} offline extension smoke tests failed" }
}

private fun smokeReport(
    jar: Path,
    result: ExtensionSmokeResult,
    elapsedMillis: Long,
) = buildString {
    appendLine("# Offline Extension Smoke Test")
    appendLine()
    appendLine("- Result: PASS")
    appendLine("- Duration: $elapsedMillis ms")
    appendLine("- Jar: $jar")
    appendLine("- Package: ${result.packageName}")
    appendLine("- Version: ${result.versionName.orEmpty()}")
    appendLine("- Extension library: ${result.extensionLibraryVersion}")
    appendLine("- Entry point: ${result.entryPointClass}")
    appendLine("- Sources: ${result.sources.size}")
    appendLine()
    appendLine("| ID | Language | Name | Implementation |")
    appendLine("| ---: | --- | --- | --- |")
    result.sources.forEach { source ->
        appendLine("| ${source.id} | ${source.language} | ${source.name} | ${source.implementationClass} |")
    }
}

private fun smokeFailureReport(
    jar: Path,
    failure: Throwable,
    elapsedMillis: Long,
) = buildString {
    appendLine("# Offline Extension Smoke Test")
    appendLine()
    appendLine("- Result: FAIL")
    appendLine("- Duration: $elapsedMillis ms")
    appendLine("- Jar: $jar")
    appendLine("- Error: ${failure::class.qualifiedName}: ${failure.message}")
    appendLine()
    appendLine("```text")
    appendLine(failure.stackTraceToString().trimEnd())
    appendLine("```")
}

private fun rootCause(failure: Throwable): Throwable {
    var cause = failure
    while (cause.cause != null && cause.cause !== cause) cause = cause.cause!!
    return cause
}
