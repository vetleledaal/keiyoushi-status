package dev.vetle.extstats.runtime

import kotlin.test.Test
import kotlin.test.assertEquals

class ExtensionProbeRunnerFixtureExceptionTest {
    @Test
    fun `fixture exception becomes error with original message`() {
        val jar = System.getProperty("directFixtureJar")
        val input = """{"jarPath":"$jar","sourceId":null,"operations":["popular"],"limits":{"operationTimeoutMillis":1000,"responseSizeBytes":4096}}"""
        System.setProperty("fixturePopularFailure", "true")

        val response = try {
            ExtensionProbeRunner.runRequest(input, initializeAndroidCompat = {})
        } finally {
            System.clearProperty("fixturePopularFailure")
        }

        val result = response.results.single()
        assertEquals(ProbeStatus.ERROR, result.status)
        assertEquals("java.lang.IllegalStateException", result.exceptionClass)
        assertEquals("fixture popular failure", result.message)
    }
}
