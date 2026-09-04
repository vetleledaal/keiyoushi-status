package dev.vetle.fixture

import eu.kanade.tachiyomi.source.Source
import eu.kanade.tachiyomi.source.SourceFactory

class Generated : SourceFactory {
    override fun createSources(): List<Source> = listOf(
        FixtureSource(1L, "Factory One", "en", "https://one.invalid"),
        FixtureSource(2L, "Factory Two", "ja", "https://two.invalid"),
        FixtureSource(2L, "Factory Two Duplicate", "fr", "https://two-duplicate.invalid"),
    )
}
