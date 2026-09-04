package eu.kanade.tachiyomi.source.online

import eu.kanade.tachiyomi.network.NetworkHelper
import eu.kanade.tachiyomi.network.asObservableSuccess
import eu.kanade.tachiyomi.network.awaitSuccess
import eu.kanade.tachiyomi.network.newCachelessCallWithProgress
import eu.kanade.tachiyomi.source.CatalogueSource
import eu.kanade.tachiyomi.source.model.FilterList
import eu.kanade.tachiyomi.source.model.MangasPage
import eu.kanade.tachiyomi.source.model.Page
import eu.kanade.tachiyomi.source.model.SChapter
import eu.kanade.tachiyomi.source.model.SManga
import okhttp3.Headers
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import rx.Observable
import uy.kohesive.injekt.injectLazy
import java.net.URI
import java.net.URISyntaxException
import java.security.MessageDigest

abstract class HttpSource : CatalogueSource {
    protected val network: NetworkHelper by injectLazy()

    abstract val baseUrl: String

    open fun getHomeUrl(): String = baseUrl

    open val versionId: Int = 1

    override val id: Long by lazy {
        val key = "${name.lowercase()}/$lang/$versionId"
        val bytes = MessageDigest.getInstance("MD5").digest(key.toByteArray())
        (0..7).map { bytes[it].toLong() and 0xff shl 8 * (7 - it) }.reduce(Long::or) and Long.MAX_VALUE
    }

    val headers: Headers by lazy { headersBuilder().build() }

    open val client: OkHttpClient get() = network.client

    protected open fun headersBuilder(): Headers.Builder = Headers.Builder().add("User-Agent", network.defaultUserAgentProvider())

    override fun toString(): String = "$name (${lang.uppercase()})"

    @Deprecated("Use the suspend API instead", ReplaceWith("getPopularManga"))
    override fun fetchPopularManga(page: Int): Observable<MangasPage> = execute(popularMangaRequest(page), ::popularMangaParse)

    protected open fun popularMangaRequest(page: Int): Request = unsupported()

    protected open fun popularMangaParse(response: Response): MangasPage = unsupported()

    @Deprecated("Use the suspend API instead", ReplaceWith("getSearchManga"))
    override fun fetchSearchManga(page: Int, query: String, filters: FilterList): Observable<MangasPage> =
        execute(searchMangaRequest(page, query, filters), ::searchMangaParse)

    override suspend fun getSearchManga(page: Int, query: String, filters: FilterList): MangasPage =
        super.getSearchManga(page, query, filters)

    protected open fun searchMangaRequest(page: Int, query: String, filters: FilterList): Request = unsupported()

    protected open fun searchMangaParse(response: Response): MangasPage = unsupported()

    @Deprecated("Use the suspend API instead", ReplaceWith("getLatestUpdates"))
    override fun fetchLatestUpdates(page: Int): Observable<MangasPage> = execute(latestUpdatesRequest(page), ::latestUpdatesParse)

    protected open fun latestUpdatesRequest(page: Int): Request = unsupported()

    protected open fun latestUpdatesParse(response: Response): MangasPage = unsupported()

    @Deprecated("Use the combined suspend API instead", ReplaceWith("getMangaUpdate"))
    override fun fetchMangaDetails(manga: SManga): Observable<SManga> = execute(mangaDetailsRequest(manga)) { response ->
        mangaDetailsParse(response).apply { initialized = true }
    }

    open fun mangaDetailsRequest(manga: SManga): Request = request(baseUrl + manga.url)

    protected open fun mangaDetailsParse(response: Response): SManga = unsupported()

    override val supportsRelatedMangas: Boolean get() = false

    override suspend fun fetchRelatedMangaList(manga: SManga): List<SManga> =
        client.newCall(relatedMangaListRequest(manga)).execute().use(::relatedMangaListParse)

    protected open fun relatedMangaListRequest(manga: SManga): Request = unsupported()

    protected open fun relatedMangaListParse(response: Response): List<SManga> = unsupported()

    @Deprecated("Use the combined suspend API instead", ReplaceWith("getMangaUpdate"))
    override fun fetchChapterList(manga: SManga): Observable<List<SChapter>> = execute(chapterListRequest(manga), ::chapterListParse)

    protected open fun chapterListRequest(manga: SManga): Request = request(baseUrl + manga.url)

    protected open fun chapterListParse(response: Response): List<SChapter> = unsupported()

    @Deprecated("Use the suspend API instead", ReplaceWith("getPageList"))
    override fun fetchPageList(chapter: SChapter): Observable<List<Page>> = execute(pageListRequest(chapter), ::pageListParse)

    protected open fun pageListRequest(chapter: SChapter): Request = request(baseUrl + chapter.url)

    protected open fun pageListParse(response: Response): List<Page> = unsupported()

    @Deprecated("Use the suspend API instead", ReplaceWith("getImageUrl"))
    open fun fetchImageUrl(page: Page): Observable<String> = execute(imageUrlRequest(page), ::imageUrlParse)

    open suspend fun getImageUrl(page: Page): String = client.newCall(imageUrlRequest(page)).execute().use(::imageUrlParse)

    protected open fun imageUrlRequest(page: Page): Request = request(page.url)

    protected open fun imageUrlParse(response: Response): String = unsupported()

    open fun fetchImage(page: Page): Observable<Response> =
        Observable.defer { client.newCachelessCallWithProgress(imageRequest(page), page).asObservableSuccess() }

    protected open fun imageRequest(page: Page): Request = request(requireNotNull(page.imageUrl))

    suspend fun getImage(page: Page, existingSize: Long = 0L): Response =
        client.newCachelessCallWithProgress(imageRequest(page), page, existingSize).awaitSuccess()

    fun SChapter.setUrlWithoutDomain(url: String) {
        this.url = getUrlWithoutDomain(url)
    }

    fun SManga.setUrlWithoutDomain(url: String) {
        this.url = getUrlWithoutDomain(url)
    }

    private fun getUrlWithoutDomain(original: String): String = try {
        val uri = URI(original.replace(" ", "%20"))
        buildString {
            append(uri.path)
            uri.query?.let { append('?').append(it) }
            uri.fragment?.let { append('#').append(it) }
        }
    } catch (_: URISyntaxException) {
        original
    }

    open fun getMangaUrl(manga: SManga): String = mangaDetailsRequest(manga).url.toString()

    open fun getChapterUrl(chapter: SChapter): String = pageListRequest(chapter).url.toString()

    @Deprecated("All modifications should be done when constructing the chapter")
    open fun prepareNewChapter(chapter: SChapter, manga: SManga) = Unit

    private fun request(url: String): Request = Request.Builder().url(url).headers(headers).build()

    private fun <T : Any> execute(request: Request, parser: (Response) -> T): Observable<T> =
        Observable.defer { client.newCall(request).asObservableSuccess() }
            .map { response -> response.use(parser) }

    private fun unsupported(): Nothing = throw UnsupportedOperationException()
}
