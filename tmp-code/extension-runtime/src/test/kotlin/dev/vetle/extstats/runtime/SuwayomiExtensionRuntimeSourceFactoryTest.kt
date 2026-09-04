package dev.vetle.extstats.runtime

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Typeface
import android.icu.text.BreakIterator
import android.icu.text.Collator
import android.icu.text.Normalizer2
import android.icu.text.RuleBasedCollator
import android.icu.text.StringSearch
import android.text.Html
import android.util.JsonReader
import android.view.View
import android.view.ViewGroup
import android.webkit.ValueCallback
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebResourceResponse
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.AbsoluteLayout
import eu.kanade.tachiyomi.source.CatalogueSource
import eu.kanade.tachiyomi.source.Source
import eu.kanade.tachiyomi.source.model.MangasPage
import eu.kanade.tachiyomi.source.online.HttpSource
import kotlinx.coroutines.runBlocking
import java.nio.charset.StandardCharsets
import java.nio.file.Path
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

class SuwayomiExtensionRuntimeDirectFixtureTest {
    @Test
    fun `loads separately compiled direct source`() {
        SuwayomiExtensionRuntime().load(Path.of(System.getProperty("directFixtureJar"))).use { extension ->
            assertEquals(listOf("Direct Fixture"), extension.sources.map { it.name })
        }
    }

    @Test
    fun `reads asset from loaded extension classloader`() {
        SuwayomiExtensionRuntime().load(Path.of(System.getProperty("directFixtureJar"))).use { extension ->
            val source = extension.sources.single()

            val script = requireNotNull(source.javaClass.getResource("/assets/webview-script.js")).readText()

            assertTrue(script.contains("window.extensionAssetBridge.post(\"extension-asset-executed\")"))
        }
    }

    @Test
    fun `runtime owns defaults used by extension lib 1_6 source`() = runBlocking {
        SuwayomiExtensionRuntime().load(Path.of(System.getProperty("directFixtureJar"))).use { extension ->
            val source = extension.sources.single()
            val manga = source.getPopularManga(1).mangas.single()
            val update = source.getMangaUpdate(manga, emptyList(), fetchDetails = true, fetchChapters = true)

            assertTrue(source.getFilterList().isEmpty())
            assertEquals("Latest Fixture", source.getLatestUpdates(1).mangas.single().title)
            assertEquals("Search for query", source.getSearchManga(1, "query", source.getFilterList()).mangas.single().title)
            assertEquals("Detailed Popular Fixture", update.manga.title)
            assertEquals("Fixture Chapter", update.chapters.single().name)
            assertEquals("https://direct.invalid/page.jpg", source.getPageList(update.chapters.single()).single().imageUrl)
        }
    }

    @Suppress("DEPRECATION")
    @Test
    fun `reached host API classes do not resolve to untracked stubs`() {
        val reachedHostTypes = listOf(
            Source::class.java,
            CatalogueSource::class.java,
            HttpSource::class.java,
            MangasPage::class.java,
            Canvas::class.java,
            BitmapFactory.Options::class.java,
            Typeface::class.java,
            Html::class.java,
            Class.forName("android.text.StaticLayout"),
            JsonReader::class.java,
            Normalizer2::class.java,
            BreakIterator::class.java,
            Collator::class.java,
            RuleBasedCollator::class.java,
            StringSearch::class.java,
            View::class.java,
            ViewGroup::class.java,
            AbsoluteLayout::class.java,
            WebView::class.java,
            WebSettings::class.java,
            WebChromeClient::class.java,
            WebViewClient::class.java,
            WebResourceRequest::class.java,
            WebResourceResponse::class.java,
            ValueCallback::class.java,
        )
        val typesWithFailingCompatibilityTests = mapOf(
            Html::class.java to "android.text.Html.fromHtml(String, ImageGetter, TagHandler)",
        )

        reachedHostTypes.forEach { type ->
            val bytecode = requireNotNull(type.getResourceAsStream("/${type.name.replace('.', '/')}.class")).readAllBytes()
            val trackingTest = typesWithFailingCompatibilityTests[type]

            assertTrue(!type.protectionDomain.codeSource.location.path.endsWith("extension-lib-host-api.jar"), type.name)
            assertTrue(
                "Stub!" !in String(bytecode, StandardCharsets.ISO_8859_1) || trackingTest != null,
                "${type.name} resolves to Stub! without a failing compatibility test",
            )
        }
    }

    @Suppress("DEPRECATION")
    @Test
    fun `runtime owns mangas page copy behavior for extension lib 1_4 and 1_6`() {
        listOf("legacyDirectFixtureJar", "directFixtureJar").forEach { fixtureProperty ->
            SuwayomiExtensionRuntime().load(Path.of(System.getProperty(fixtureProperty))).use { extension ->
                val original = extension.sources.single().fetchPopularManga(1).toBlocking().single()
                val copied = original.copy(hasNextPage = true)
                val (mangas, hasNextPage) = copied

                assertEquals(original.mangas, mangas)
                assertTrue(hasNextPage)
            }
        }
    }

    @Suppress("DEPRECATION")
    @Test
    fun `loads legacy-only extension lib 1_4 fixture`() {
        SuwayomiExtensionRuntime().load(Path.of(System.getProperty("legacyDirectFixtureJar"))).use { extension ->
            assertEquals("1.4", extension.metadata.extensionLibraryVersion)
            assertEquals("Popular Fixture", extension.sources.single().fetchPopularManga(1).toBlocking().single().mangas.single().title)
        }
    }
}

class SuwayomiExtensionRuntimeCloseTest {
    @Test
    fun `closes extension classloader immediately`() {
        val extension = SuwayomiExtensionRuntime().load(Path.of(System.getProperty("directFixtureJar")))
        val classLoader = extension.sources.single()::class.java.classLoader

        extension.close()

        assertFailsWith<ClassNotFoundException> {
            classLoader.loadClass("dev.vetle.fixture.ClosedLoaderProbe")
        }
    }
}

class SuwayomiExtensionRuntimeValidSourceIdTest {
    @Test
    fun `selects separately compiled generated source by ID`() {
        SuwayomiExtensionRuntime().load(Path.of(System.getProperty("factoryFixtureJar")), sourceId = 1L).use { extension ->
            assertEquals(listOf("Factory One"), extension.sources.map { it.name })
            assertEquals("dev.vetle.fixture.Generated",
                extension.sources.first()::class.java.classLoader.loadClass("dev.vetle.fixture.Generated").name)
        }
    }
}

class SuwayomiExtensionRuntimeSmokeTest {
    @Test
    fun `smoke tests every source in a factory without selecting an ID`() {
        val result = SuwayomiExtensionRuntime().smokeTest(Path.of(System.getProperty("factoryFixtureJar")))

        assertEquals("dev.vetle.fixture.Generated", result.entryPointClass)
        assertEquals(listOf("Factory One", "Factory Two", "Factory Two Duplicate"), result.sources.map { it.name })
    }
}

class SuwayomiExtensionRuntimePreferredSourceTest {
    @Test
    fun `selects preferred source when ID is missing`() {
        SuwayomiExtensionRuntime().load(Path.of(System.getProperty("factoryFixtureJar"))).use { extension ->
            assertEquals(listOf("Factory One"), extension.sources.map { it.name })
        }
    }

    @Test
    fun `prioritizes language aliases and preserves source order as fallback`() {
        assertEquals(
            "English",
            selectPreferredSource(listOf("Spanish", "English", "Japanese")) {
                mapOf("Spanish" to "es", "English" to "en", "Japanese" to "ja").getValue(it)
            },
        )
        assertEquals(
            "Chinese",
            selectPreferredSource(listOf("Portuguese", "Chinese")) {
                mapOf("Portuguese" to "pt_BR", "Chinese" to "zh-Hant").getValue(it)
            },
        )
        assertEquals("First", selectPreferredSource(listOf("First", "Second")) { "unknown" })
    }

    @Test
    fun `prioritizes multi-language source after English`() {
        assertEquals(
            "Multi",
            selectPreferredSource(listOf("Japanese", "Multi")) {
                mapOf("Japanese" to "ja", "Multi" to "all").getValue(it)
            },
        )
    }
}

class SuwayomiExtensionRuntimeDuplicateSourceIdTest {
    @Test
    fun `rejects duplicate source ID`() {
        val exception = assertFailsWith<IllegalArgumentException> {
            SuwayomiExtensionRuntime().load(Path.of(System.getProperty("factoryFixtureJar")), sourceId = 2L)
        }

        assertEquals("Duplicate source ID 2", exception.message)
    }
}

class SuwayomiExtensionRuntimeUnknownSourceIdTest {
    @Test
    fun `rejects unknown source ID`() {
        val exception = assertFailsWith<IllegalArgumentException> {
            SuwayomiExtensionRuntime().load(Path.of(System.getProperty("factoryFixtureJar")), sourceId = 3L)
        }

        assertEquals("Unknown source ID 3", exception.message)
    }
}
