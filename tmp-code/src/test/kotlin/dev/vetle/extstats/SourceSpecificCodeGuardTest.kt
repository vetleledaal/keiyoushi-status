package dev.vetle.extstats

import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.extension
import kotlin.io.path.readText
import kotlin.test.Test
import kotlin.test.assertTrue

class SourceSpecificCodeGuardTest {
    @Test
    fun validatorContainsNoHentaiNexusSpecificCode() {
        val productionSourceDirectories =
            listOf(
                Path.of("src/main"),
                Path.of("extension-runtime/src/main"),
                Path.of("android-compat/src/main"),
                Path.of("android-compat/Config/src/main"),
            )
        val forbiddenLiterals =
            listOf(
                "/manga/",
                "div.manga-list",
                "div.single-manga",
                "fixture author",
                "fixture artist",
                "popular fixture",
                "latest fixture",
                "detailed fixture",
            )
        val violations =
            productionSourceDirectories.flatMap { directory ->
                Files.walk(directory).use { paths ->
                    paths
                        .filter { it.extension in setOf("java", "kt") }
                        .flatMap { path ->
                            val source = path.readText().lowercase()
                            forbiddenLiterals
                                .stream()
                                .filter(source::contains)
                                .map { literal -> "$path contains '$literal'" }
                        }.toList()
                }
            }

        assertTrue(
            violations.isEmpty(),
            "Validator code must remain source-agnostic:\n${violations.joinToString("\n")}",
        )
    }
}
