package dev.vetle.extstats.runtime

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.DataInputStream
import java.io.DataOutputStream
import java.io.PrintStream
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.time.Duration
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ExtensionApiOnlineTest {
    @Test
    fun `probes selected extension with minimal network requests`() {
        val input = """{"jarPath":"${System.getProperty("testExtensionJar")}","sourceId":null,"operations":["popular","popular_next","latest","latest_next","search","details","pages"],"limits":{"operationTimeoutMillis":30000,"responseSizeBytes":1048576}}"""
        val output = ByteArrayOutputStream()
        val originalInput = System.`in`
        val originalOutput = System.out
        val framedInput = ByteArrayOutputStream().also { bytes ->
            DataOutputStream(bytes).use { stream ->
                val request = input.toByteArray()
                stream.writeInt(request.size)
                stream.write(request)
            }
        }

        System.setIn(ByteArrayInputStream(framedInput.toByteArray()))
        System.setOut(PrintStream(output))
        try {
            ExtensionProbeRunner.main(emptyArray())
        } finally {
            System.setIn(originalInput)
            System.setOut(originalOutput)
        }

        val responseText = DataInputStream(ByteArrayInputStream(output.toByteArray())).use { stream ->
            String(stream.readNBytes(stream.readInt()))
        }
        val response = Json.parseToJsonElement(responseText).jsonObject
        val results = response.getValue("results").jsonArray
        val popular = results[0].jsonObject
        val search = results[4].jsonObject
        val detailsResult = results[5].jsonObject
        val details = detailsResult.getValue("mangas").jsonArray.single().jsonObject
        val pages = results[6].jsonObject.getValue("pages").jsonArray
        val selectedManga = popular.getValue("mangas").jsonArray.first { manga ->
            val fields = manga.jsonObject
            fields.getValue("title").jsonPrimitive.content.isNotBlank() &&
                fields.getValue("url").jsonPrimitive.content.isNotBlank()
        }.jsonObject

        assertEquals(
            listOf("popular", "popular_next", "latest", "latest_next", "search", "details", "pages"),
            results.map {
                it.jsonObject.getValue("operation").jsonPrimitive.content
            },
        )
        assertTrue(
            results.all {
                it.jsonObject.getValue("status").jsonPrimitive.content in setOf("success", "skipped")
            },
            "Unexpected operation statuses: " + results.joinToString { result ->
                val fields = result.jsonObject
                "${fields.getValue("operation").jsonPrimitive.content}=${fields.getValue("status").jsonPrimitive.content}"
            },
        )
        assertTrue(listOf(0, 2, 4).all { results[it].jsonObject.getValue("mangas").jsonArray.isNotEmpty() })
        assertEquals(
            selectedManga.getValue("title").jsonPrimitive.content,
            search.getValue("searchQuery").jsonPrimitive.content,
        )
        assertTrue(detailsResult.getValue("chapters").jsonArray.isNotEmpty())
        assertTrue(pages.isNotEmpty())
        val firstPage = pages.first().jsonObject
        val pageUrl = firstPage["imageUrl"]?.jsonPrimitive?.content?.takeUnless(String::isBlank)
            ?: firstPage.getValue("url").jsonPrimitive.content
        val pageResponse = HttpClient.newBuilder()
            .followRedirects(HttpClient.Redirect.NORMAL)
            .build()
            .send(
                HttpRequest.newBuilder(URI.create(pageUrl))
                    .timeout(Duration.ofSeconds(30))
                    .GET()
                    .build(),
                HttpResponse.BodyHandlers.discarding(),
            )

        assertTrue(pageResponse.statusCode() in 200..299)
        assertTrue(pageResponse.headers().firstValue("Content-Type").orElse("").startsWith("image/"))
        assertTrue(details.getValue("author").jsonPrimitive.content.isNotBlank())
        assertTrue(details.getValue("artist").jsonPrimitive.content.isNotBlank())
        assertTrue(details.getValue("genre").jsonPrimitive.content.isNotBlank())
        assertTrue(details.getValue("status").jsonPrimitive.content.toInt() != 0)
        assertTrue(details.getValue("description").jsonPrimitive.content.isNotBlank())
    }
}
