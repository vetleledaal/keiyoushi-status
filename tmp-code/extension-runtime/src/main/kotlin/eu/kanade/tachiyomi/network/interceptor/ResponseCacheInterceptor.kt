package eu.kanade.tachiyomi.network.interceptor

import okhttp3.Interceptor
import okhttp3.Response
import java.util.concurrent.TimeUnit

class ResponseCacheInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()
        val request = originalRequest.withoutHitomiCacheBuster().withRangeCacheKey().newBuilder()
            .build()
        val response = chain.proceed(request)
        val originalStatus = response.header(ORIGINAL_STATUS_HEADER)?.toIntOrNull() ?: return response
        return response.newBuilder()
            .request(originalRequest)
            .code(originalStatus)
            .removeHeader(ORIGINAL_STATUS_HEADER)
            .build()
    }
}

// HACK: Hitomi appends a timestamp here, which defeats deterministic response caching.
private fun okhttp3.Request.withoutHitomiCacheBuster(): okhttp3.Request {
    if (url.host != HITOMI_CDN_HOST || url.encodedPath != HITOMI_VERSION_PATH || url.queryParameter("_") == null) {
        return this
    }
    return newBuilder()
        .url(url.newBuilder().removeAllQueryParameters("_").build())
        .build()
}

class ResponseCachePolicyInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val cacheRequest = chain.request()
        val response = chain.proceed(cacheRequest.withoutRangeCacheKey())
        val maxAgeSeconds = when {
            response.isSuccessful -> SUCCESS_MAX_AGE_SECONDS
            response.code >= 400 -> FAILURE_MAX_AGE_SECONDS
            else -> return response
        }
        return response.newBuilder()
            .request(cacheRequest)
            .code(if (response.isSuccessful) CACHEABLE_SUCCESS_STATUS else CACHEABLE_FAILURE_STATUS)
            .header(ORIGINAL_STATUS_HEADER, response.code.toString())
            .removeHeader("Cache-Control")
            .removeHeader("Pragma")
            .removeHeader("Expires")
            .header("Cache-Control", "public, max-age=$maxAgeSeconds")
            .addHeader("Vary", "Range")
            .build()
    }
}

private fun okhttp3.Request.withRangeCacheKey(): okhttp3.Request {
    val range = header("Range") ?: return this
    return newBuilder()
        .url(url.newBuilder().addQueryParameter(RANGE_CACHE_KEY_PARAMETER, range).build())
        .build()
}

private fun okhttp3.Request.withoutRangeCacheKey(): okhttp3.Request {
    if (url.queryParameter(RANGE_CACHE_KEY_PARAMETER) == null) return this
    return newBuilder()
        .url(url.newBuilder().removeAllQueryParameters(RANGE_CACHE_KEY_PARAMETER).build())
        .build()
}

private const val ORIGINAL_STATUS_HEADER = "X-Ext-Stats-Original-Status"
private const val RANGE_CACHE_KEY_PARAMETER = "__extstats_range_cache_key"
private const val HITOMI_CDN_HOST = "ltn.gold-usergeneratedcontent.net"
private const val HITOMI_VERSION_PATH = "/galleriesindex/version"
private const val CACHEABLE_SUCCESS_STATUS = 200
private const val CACHEABLE_FAILURE_STATUS = 501
private val SUCCESS_MAX_AGE_SECONDS = TimeUnit.DAYS.toSeconds(60)
private val FAILURE_MAX_AGE_SECONDS = TimeUnit.SECONDS.toSeconds(30)
