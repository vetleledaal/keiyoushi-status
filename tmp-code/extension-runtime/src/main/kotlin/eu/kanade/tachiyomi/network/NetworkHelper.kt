package eu.kanade.tachiyomi.network

import android.content.Context
import eu.kanade.tachiyomi.network.interceptor.CloudflareInterceptor
import eu.kanade.tachiyomi.network.interceptor.NetworkRequestLoggingInterceptor
import eu.kanade.tachiyomi.network.interceptor.ResponseCacheInterceptor
import eu.kanade.tachiyomi.network.interceptor.ResponseCachePolicyInterceptor
import eu.kanade.tachiyomi.network.interceptor.UncaughtExceptionInterceptor
import eu.kanade.tachiyomi.network.interceptor.UserAgentInterceptor
import okhttp3.Cache
import okhttp3.OkHttpClient
import xyz.nulldev.androidcompat.io.AndroidFiles
import java.util.concurrent.TimeUnit

class NetworkHelper(
    @Suppress("UNUSED_PARAMETER") context: Context,
) {
    val cookieManager = MemoryCookieJar()

    fun defaultUserAgentProvider(): String = DEFAULT_USER_AGENT

    val client by lazy {
        val cacheMode = networkCacheMode()
        OkHttpClient.Builder()
            .cache(networkCache(cacheMode))
            .cookieJar(cookieManager)
            .addInterceptor(NetworkRequestLoggingInterceptor())
            .addInterceptor(UncaughtExceptionInterceptor())
            .addInterceptor(UserAgentInterceptor(::defaultUserAgentProvider))
            .addInterceptor(CloudflareInterceptor())
            .apply {
                if (cacheMode == NetworkCacheMode.PERMANENT) {
                    addInterceptor(ResponseCacheInterceptor())
                    addNetworkInterceptor(ResponseCachePolicyInterceptor())
                }
            }
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .callTimeout(2, TimeUnit.MINUTES)
            .build()
    }

    val cloudflareClient by lazy {
        client
    }
}

private fun networkCacheMode(): NetworkCacheMode = when (val value = System.getProperty(NETWORK_CACHE_MODE_PROPERTY)) {
    null, "permanent" -> NetworkCacheMode.PERMANENT
    "mihon" -> NetworkCacheMode.MIHON
    else -> error("Invalid $NETWORK_CACHE_MODE_PROPERTY '$value'; expected 'permanent' or 'mihon'")
}

private fun networkCache(cacheMode: NetworkCacheMode): Cache {
    val shardProperty = System.getProperty("extstats.networkCacheShard")
    val shard = shardProperty?.toIntOrNull()
    require(shardProperty == null || shard in 0 until NETWORK_CACHE_SHARDS) {
        "Invalid network cache shard '$shardProperty'"
    }
    val modeSuffix = if (cacheMode == NetworkCacheMode.MIHON) "-mihon" else ""
    val directoryName = "network-responses$modeSuffix" + (shard?.let { "-$it" } ?: "")
    val maximumSize = if (shard == null) NETWORK_CACHE_SIZE_BYTES else NETWORK_CACHE_SIZE_BYTES / NETWORK_CACHE_SHARDS
    return Cache(AndroidFiles().cacheDir.resolve(directoryName), maximumSize)
}

private enum class NetworkCacheMode { PERMANENT, MIHON }

private const val NETWORK_CACHE_MODE_PROPERTY = "extstats.networkCacheMode"
private const val NETWORK_CACHE_SHARDS = 20
private const val NETWORK_CACHE_SIZE_BYTES = 5L * 1024L * 1024L * 1024L
private const val DEFAULT_USER_AGENT =
    "Mozilla/5.0 (Windows NT 10.0; Win64; x64) " +
        "AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36"
