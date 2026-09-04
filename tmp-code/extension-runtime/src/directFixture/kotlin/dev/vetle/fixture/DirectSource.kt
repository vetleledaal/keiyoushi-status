package dev.vetle.fixture

import okhttp3.Request

class DirectSource : FixtureSource("Direct Fixture", "en", "https://direct.invalid") {
    init {
        println("fixture stdout")
        System.err.println("fixture stderr")
    }

    override fun popularMangaRequest(page: Int): Request {
        if (System.getProperty("fixturePopularFailure") == "true") {
            error("fixture popular failure")
        }
        return super.popularMangaRequest(page)
    }
}

class ClosedLoaderProbe
