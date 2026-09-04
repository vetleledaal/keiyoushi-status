package dev.vetle.extstats

import dev.vetle.extstats.core.CheckResult
import dev.vetle.extstats.core.ExtensionArtifactType
import dev.vetle.extstats.core.ExtensionProbe
import dev.vetle.extstats.core.ExtensionValidator
import dev.vetle.extstats.core.ProbeValidationResult
import dev.vetle.extstats.core.ValidationConfig
import kotlinx.coroutines.runBlocking
import java.nio.file.Path
import kotlin.test.Test
import kotlin.test.assertEquals

class ExtensionValidatorTest {
    @Test
    fun `selects probe from runtime metadata`() = runBlocking {
        var selectedName = ""
        val validator =
            ExtensionValidator { name ->
                selectedName = name
                object : ExtensionProbe {
                    override val name = name

                    override suspend fun validate(config: ValidationConfig) = ProbeValidationResult(
                        listOf(
                            CheckResult(
                                "fixture",
                                true,
                                "validated",
                            ),
                        ),
                    )
                }
            }
        val config = ValidationConfig("fixture", "https://example.test/fixture.jar", Path.of("report.md"))

        val result = validator.validate(config)

        assertEquals("fixture", selectedName)
        assertEquals("fixture", result.extensionName)
        assertEquals(ExtensionArtifactType.JAR, result.artifactType)
        assertEquals(1, result.passed)
    }
}
