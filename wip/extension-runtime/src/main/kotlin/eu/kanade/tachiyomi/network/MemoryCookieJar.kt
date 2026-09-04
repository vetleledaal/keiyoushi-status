package eu.kanade.tachiyomi.network

import okhttp3.Cookie
import okhttp3.CookieJar
import okhttp3.HttpUrl

class MemoryCookieJar : CookieJar {
    private val cookies = mutableSetOf<Cookie>()

    @Synchronized
    override fun loadForRequest(url: HttpUrl): List<Cookie> {
        cookies.removeAll { it.expiresAt < System.currentTimeMillis() }
        return cookies.filter { it.matches(url) }
    }

    @Synchronized
    override fun saveFromResponse(url: HttpUrl, cookies: List<Cookie>) {
        cookies.forEach { cookie ->
            this.cookies.removeAll {
                it.name == cookie.name &&
                    it.domain == cookie.domain &&
                    it.path == cookie.path &&
                    it.secure == cookie.secure &&
                    it.hostOnly == cookie.hostOnly
            }
            this.cookies.add(cookie)
        }
    }

    @Synchronized
    fun getStoredCookies(): List<Cookie> = cookies.toList()

    @Synchronized
    fun clear() {
        cookies.clear()
    }
}
