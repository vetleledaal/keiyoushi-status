package dev.vetle.fixture

import eu.kanade.tachiyomi.source.model.FilterList
import eu.kanade.tachiyomi.source.model.MangasPage
import eu.kanade.tachiyomi.source.model.Page
import eu.kanade.tachiyomi.source.model.SChapter
import eu.kanade.tachiyomi.source.model.SManga
import eu.kanade.tachiyomi.source.online.HttpSource
import okhttp3.HttpUrl.Companion.toHttpUrl
import okhttp3.OkHttpClient
import okhttp3.Protocol
import okhttp3.Request
import okhttp3.Response
import okhttp3.ResponseBody.Companion.toResponseBody

@Suppress("DEPRECATION", "OVERRIDE_DEPRECATION")
open class FixtureSource(
    override val name: String,
    override val lang: String,
    override val baseUrl: String,
) : HttpSource() {
    override val supportsLatest = true
    override val client = OkHttpClient.Builder()
        .addInterceptor { chain ->
            Response.Builder()
                .request(chain.request())
                .protocol(Protocol.HTTP_1_1)
                .code(200)
                .message("OK")
                .body(ByteArray(0).toResponseBody())
                .build()
        }
        .build()

    override fun popularMangaRequest(page: Int) = request("popular")

    override fun popularMangaParse(response: Response) = MangasPage(
        listOf(manga("/popular", "Popular Fixture")),
        false,
    )

    override fun latestUpdatesRequest(page: Int) = request("latest")

    override fun latestUpdatesParse(response: Response) = MangasPage(
        listOf(manga("/latest", "Latest Fixture")),
        false,
    )

    override fun searchMangaRequest(page: Int, query: String, filters: FilterList) = Request.Builder()
        .url(baseUrl.toHttpUrl().newBuilder().addPathSegment("search").addQueryParameter("query", query).build())
        .build()

    override fun searchMangaParse(response: Response) = MangasPage(
        listOf(manga("/search", "Search for ${response.request.url.queryParameter("query")}")),
        false,
    )

    override fun mangaDetailsRequest(manga: SManga) = request("details")

    override fun mangaDetailsParse(response: Response) = manga("/popular", "Detailed Popular Fixture").apply {
        author = "Fixture Author"
    }

    override fun chapterListRequest(manga: SManga) = request("chapters")

    override fun chapterListParse(response: Response) = listOf(
        SChapter.create().apply {
            url = "/chapter/fixture"
            name = "Fixture Chapter"
        },
    )

    override fun pageListRequest(chapter: SChapter) = request("pages")

    override fun pageListParse(response: Response) = listOf(Page(0, imageUrl = "https://direct.invalid/page.jpg"))

    protected fun request(path: String): Request = Request.Builder()
        .url(baseUrl.toHttpUrl().newBuilder().addPathSegment(path).build())
        .build()

    private fun manga(url: String, title: String) = SManga.create().apply {
        this.url = url
        this.title = title
        thumbnail_url = "https://direct.invalid/cover.jpg"
    }
}
