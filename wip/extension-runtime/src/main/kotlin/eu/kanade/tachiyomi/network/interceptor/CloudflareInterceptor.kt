package eu.kanade.tachiyomi.network.interceptor

import okhttp3.Interceptor
import okhttp3.Response

class CloudflareInterceptor : Interceptor {
    @Synchronized
    override fun intercept(chain: Interceptor.Chain): Response = chain.proceed(chain.request())
}
