package eu.kanade.tachiyomi.source

import eu.kanade.tachiyomi.source.model.FilterList
import eu.kanade.tachiyomi.source.model.MangasPage
import eu.kanade.tachiyomi.source.model.Page
import eu.kanade.tachiyomi.source.model.SChapter
import eu.kanade.tachiyomi.source.model.SManga
import eu.kanade.tachiyomi.source.model.SMangaUpdate
import kotlinx.coroutines.async
import kotlinx.coroutines.supervisorScope
import kotlinx.coroutines.suspendCancellableCoroutine
import rx.Observable
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException

interface CatalogueSource : Source {
    val lang: String

    @Suppress("DEPRECATION")
    override suspend fun getPopularManga(page: Int): MangasPage = fetchPopularManga(page).awaitSingle()

    @Suppress("DEPRECATION")
    override suspend fun getLatestUpdates(page: Int): MangasPage = fetchLatestUpdates(page).awaitSingle()

    @Suppress("DEPRECATION")
    override suspend fun getSearchManga(page: Int, query: String, filters: FilterList): MangasPage = fetchSearchManga(page, query,
        filters).awaitSingle()

    @Suppress("DEPRECATION")
    override suspend fun getMangaUpdate(
        manga: SManga,
        chapters: List<SChapter>,
        fetchDetails: Boolean,
        fetchChapters: Boolean,
    ): SMangaUpdate = supervisorScope {
        val updatedManga = if (fetchDetails) async { fetchMangaDetails(manga).awaitSingle() } else null
        val updatedChapters = if (fetchChapters) async { fetchChapterList(manga).awaitSingle() } else null
        SMangaUpdate(updatedManga?.await() ?: manga, updatedChapters?.await() ?: chapters)
    }

    @Suppress("DEPRECATION")
    override suspend fun getPageList(chapter: SChapter): List<Page> = fetchPageList(chapter).awaitSingle()

    @Deprecated("Use the suspend API instead", ReplaceWith("getPopularManga"))
    fun fetchPopularManga(page: Int): Observable<MangasPage> = throw UnsupportedOperationException()

    @Deprecated("Use the suspend API instead", ReplaceWith("getSearchManga"))
    fun fetchSearchManga(page: Int, query: String, filters: FilterList): Observable<MangasPage> = throw UnsupportedOperationException()

    @Deprecated("Use the suspend API instead", ReplaceWith("getLatestUpdates"))
    fun fetchLatestUpdates(page: Int): Observable<MangasPage> = throw UnsupportedOperationException()

    val supportsRelatedMangas: Boolean get() = false

    val disableRelatedMangasBySearch: Boolean get() = false

    val disableRelatedMangas: Boolean get() = false

    suspend fun fetchRelatedMangaList(manga: SManga): List<SManga> = throw UnsupportedOperationException("Unsupported!")
}

private suspend fun <T> Observable<T>.awaitSingle(): T = suspendCancellableCoroutine { continuation ->
    val subscription = toSingle().subscribe(
        { value -> continuation.resume(value) },
        { error -> continuation.resumeWithException(error) },
    )
    continuation.invokeOnCancellation { subscription.unsubscribe() }
}
