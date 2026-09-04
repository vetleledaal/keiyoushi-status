package dev.vetle.extstats.core

import kotlin.test.Test
import kotlin.test.assertEquals

class ReportSanitizerTest {
    @Test
    fun `redacts relative URL query values in free text`() {
        val sanitizer = ReportSanitizer(RedactionMode.URLS_AND_SENSITIVE)

        assertEquals(
            "Matched by URL=.../18827 <redacted query values: 27 and hash>",
            sanitizer.text("Matched by URL=/g/18827?27&hash=sensitive"),
        )
    }

    @Test
    fun `lists ordinary query names in sensitive mode`() {
        val sanitizer = ReportSanitizer(RedactionMode.SENSITIVE)

        assertEquals(
            "https://example.com/search <redacted query values: page and sort>",
            sanitizer.url("https://example.com/search?page=2&sort=latest", "search resource"),
        )
    }

    @Test
    fun `uses lenient structured parsing for public URL summaries`() {
        val sanitizer = ReportSanitizer(RedactionMode.URLS_AND_SENSITIVE)

        assertEquals(
            "https://example.com/.../page%201.jpg <redacted query values: token>",
            sanitizer.url("https://EXAMPLE.com:8443/covers/page 1.jpg?token=SECRET#private", "image resource"),
        )
        assertEquals(
            "Image: https://example.com/.../page.jpg <redacted query values: token>",
            sanitizer.text("Image: https://EXAMPLE.com:8443/covers/page.jpg?token=SECRET#private"),
        )
    }

    @Test
    fun `redacts signed query after parenthesized URL path segment`() {
        val sanitizer = ReportSanitizer(RedactionMode.URLS_AND_SENSITIVE)

        assertEquals(
            "Image: https://cdn.example.com/.../page(1).jpg <redacted query values: Expires, Key-Pair-Id, and Signature>",
            sanitizer.text(
                "Image: https://cdn.example.com/private/page(1).jpg?Expires=DATE-CANARY&Key-Pair-Id=KEY-CANARY&Signature=SIGNATURE-CANARY",
            ),
        )
    }

    @Test
    fun `preserves useful diagnostic evidence in every mode`() {
        val evidence =
            listOf(
                "Ordinary diagnostic prose remains useful",
                "Source language: en",
                "Public class: example.FixtureSource",
                "Public host: cdn.example.com",
                "Public IP: 203.0.113.10",
                "Country: Norway",
                "Region: Innlandet",
                "City: Oslo",
                "Coordinates: 59.91,10.75",
                "Timezone: Europe/Oslo",
                "Entry count: 30",
                "Observed at: 2026-08-31T12:34:56Z",
            ).joinToString("\n")

        RedactionMode.entries.forEach { mode ->
            assertEquals(evidence, ReportSanitizer(mode).text(evidence))
        }
    }
}
