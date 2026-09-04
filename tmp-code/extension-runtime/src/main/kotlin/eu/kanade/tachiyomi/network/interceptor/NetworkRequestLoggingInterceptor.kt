package eu.kanade.tachiyomi.network.interceptor

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class NetworkRequestLoggingInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        return try {
            chain.proceed(request).also { response ->
                log(request, response)
            }
        } catch (exception: Exception) {
            System.err.println("${request.logPrefix()} cache=false failed=${exception.javaClass.simpleName}")
            throw exception
        }
    }

    internal fun log(request: Request, response: Response) {
        System.err.println("${request.logPrefix()} cache=${response.cacheResponse != null}")
    }
}

private fun Request.logPrefix(): String = "[network] $method $url" + (header("Range")?.let { " range=$it" } ?: "")
