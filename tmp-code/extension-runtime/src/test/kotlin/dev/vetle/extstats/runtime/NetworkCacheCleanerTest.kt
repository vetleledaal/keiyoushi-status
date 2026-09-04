package dev.vetle.extstats.runtime

import mockwebserver3.MockResponse
import mockwebserver3.MockWebServer
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.Request
import org.junit.jupiter.api.io.TempDir
import java.nio.file.Files
import java.nio.file.Path
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class NetworkCacheCleanerTest {
    @Test
    fun `clears a domain from every cache shard`(@TempDir tempDir: Path) {
        val server = MockWebServer()
        server.start()
        try {
            val shards = listOf(
                tempDir.resolve("network-responses-0"),
                tempDir.resolve("network-responses-mihon-1"),
            )
            shards.forEach { shard ->
                server.enqueue(MockResponse.Builder().body("cached").addHeader("Cache-Control", "max-age=3600").build())
                val cache = Cache(shard.toFile(), 1024 * 1024)
                OkHttpClient.Builder().cache(cache).build()
                    .newCall(Request.Builder().url(server.url("/image")).build())
                    .execute()
                    .close()
                cache.close()
            }

            val result = NetworkCacheCleaner.clearDomain(tempDir, server.hostName)

            assertEquals(CacheClearResult(entries = 2, shards = 2), result)
            shards.forEach { shard -> Cache(shard.toFile(), 1024 * 1024).use { assertFalse(it.urls().hasNext()) } }
        } finally {
            server.close()
        }
    }

    @Test
    fun `all cleanup removes all shards`(@TempDir tempDir: Path) {
        val shard = Files.createDirectory(tempDir.resolve("network-responses-4"))
        Files.writeString(shard.resolve("cached.0"), "metadata")
        val unrelated = Files.createDirectory(tempDir.resolve("other-cache"))

        val result = NetworkCacheCleaner.clearAll(tempDir)

        assertEquals(CacheClearResult(entries = 1, shards = 1), result)
        assertFalse(Files.exists(shard))
        assertTrue(Files.exists(unrelated))
    }

    @Test
    fun `accepts a URL as a domain selector`() {
        assertEquals("example.test", NetworkCacheCleaner.parseDomain("https://example.test/path"))
    }
}
