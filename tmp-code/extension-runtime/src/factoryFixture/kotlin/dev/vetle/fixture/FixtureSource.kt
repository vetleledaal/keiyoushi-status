package dev.vetle.fixture

import eu.kanade.tachiyomi.source.model.FilterList
import eu.kanade.tachiyomi.source.model.MangasPage
import eu.kanade.tachiyomi.source.model.Page
import eu.kanade.tachiyomi.source.model.SChapter
import eu.kanade.tachiyomi.source.model.SManga
import eu.kanade.tachiyomi.source.model.SMangaUpdate
import eu.kanade.tachiyomi.source.online.HttpSource

class FixtureSource(
    override val id: Long,
    override val name: String,
    override val lang: String,
    override val baseUrl: String,
) : HttpSource() {
    override val supportsLatest = false

    override suspend fun getPopularManga(page: Int) = MangasPage(emptyList(), false)

    override suspend fun getLatestUpdates(page: Int) = MangasPage(emptyList(), false)

    override suspend fun getSearchManga(page: Int, query: String, filters: FilterList) = MangasPage(emptyList(), false)

    override suspend fun getMangaUpdate(
        manga: SManga,
        chapters: List<SChapter>,
        fetchDetails: Boolean,
        fetchChapters: Boolean,
    ) = SMangaUpdate(manga, chapters)

    override suspend fun getPageList(chapter: SChapter): List<Page> = emptyList()
}
