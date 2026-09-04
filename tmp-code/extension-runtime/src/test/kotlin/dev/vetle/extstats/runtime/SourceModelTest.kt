package dev.vetle.extstats.runtime

import eu.kanade.tachiyomi.source.model.Page
import eu.kanade.tachiyomi.source.model.SChapter
import eu.kanade.tachiyomi.source.model.SManga
import eu.kanade.tachiyomi.source.model.UpdateStrategy
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import java.io.Serializable
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertIs
import kotlin.test.assertNotSame
import kotlin.test.assertNull
import kotlin.test.assertSame

class SourceModelTest {
    @Test
    fun `runtime-owned models use Mihon defaults`() {
        val chapter = SChapter.create()
        assertEquals(-1F, chapter.chapter_number)
        assertNull(chapter.scanlator)
        assertEquals(0L, chapter.date_upload)
        assertEquals(JsonObject(emptyMap()), chapter.memo)

        val manga = SManga.create()
        assertNull(manga.thumbnail_url)
        assertNull(manga.artist)
        assertNull(manga.author)
        assertEquals(SManga.UNKNOWN, manga.status)
        assertNull(manga.description)
        assertNull(manga.genre)
        assertEquals(UpdateStrategy.ALWAYS_UPDATE, manga.update_strategy)
        assertEquals(false, manga.initialized)
        assertEquals(JsonObject(emptyMap()), manga.memo)

        val page = Page(index = 2)
        assertEquals("", page.url)
        assertNull(page.imageUrl)
        assertNull(page.uri)
        assertEquals(3, page.number)
        assertEquals(Page.State.Queue, page.status)
        assertEquals(Page.State.Queue, page.statusFlow.value)
        assertEquals(0, page.progress)
        assertEquals(0, page.progressFlow.value)
    }

    @Test
    fun `page state and progress flows match Mihon behavior`() {
        val page = Page(index = 0)

        page.status = Page.State.DownloadImage
        page.update(bytesRead = 25, contentLength = 100, done = false)

        assertEquals(Page.State.DownloadImage, page.statusFlow.value)
        assertEquals(25, page.progressFlow.value)

        page.update(bytesRead = 0, contentLength = 0, done = true)

        assertEquals(-1, page.progressFlow.value)
    }

    @Test
    fun `chapter copyFrom preserves all extension-visible state`() {
        val memo = JsonObject(mapOf("source.key" to JsonPrimitive("value")))
        val original = SChapter.create().apply {
            url = "/chapter"
            name = "Chapter"
            chapter_number = 12.5F
            scanlator = "Scanlator"
            date_upload = 123456789L
            this.memo = memo
        }
        val copy = SChapter.create().apply {
            url = ""
            name = ""
        }

        copy.copyFrom(original)

        assertIs<Serializable>(copy)
        assertEquals(original.url, copy.url)
        assertEquals(original.name, copy.name)
        assertEquals(original.chapter_number, copy.chapter_number)
        assertEquals(original.scanlator, copy.scanlator)
        assertEquals(original.date_upload, copy.date_upload)
        assertSame(memo, copy.memo)
    }

    @Test
    fun `manga copy preserves all extension-visible state`() {
        val memo = JsonObject(mapOf("source.key" to JsonPrimitive("value")))
        val original = SManga.create().apply {
            url = "/manga"
            title = "Manga"
            thumbnail_url = "https://example.com/cover.jpg"
            artist = "Artist"
            author = "Author"
            status = SManga.COMPLETED
            description = "Description"
            genre = "Action, Comedy"
            update_strategy = UpdateStrategy.ONLY_FETCH_ONCE
            initialized = true
            this.memo = memo
        }

        val copy = original.copy()

        assertNotSame(original, copy)
        assertEquals(original.url, copy.url)
        assertEquals(original.title, copy.title)
        assertEquals(original.thumbnail_url, copy.thumbnail_url)
        assertEquals(original.artist, copy.artist)
        assertEquals(original.author, copy.author)
        assertEquals(original.status, copy.status)
        assertEquals(original.description, copy.description)
        assertEquals(original.genre, copy.genre)
        assertEquals(original.update_strategy, copy.update_strategy)
        assertEquals(original.initialized, copy.initialized)
        assertSame(memo, copy.memo)
    }
}
