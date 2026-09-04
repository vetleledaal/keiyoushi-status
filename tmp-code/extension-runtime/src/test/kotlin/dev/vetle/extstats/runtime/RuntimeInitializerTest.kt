package dev.vetle.extstats.runtime

import android.app.Application
import android.content.Context
import android.webkit.CookieManager
import android.webkit.WebView
import eu.kanade.tachiyomi.network.JavaScriptEngine
import eu.kanade.tachiyomi.network.NetworkHelper
import eu.kanade.tachiyomi.source.online.HttpSource
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlinx.serialization.protobuf.ProtoBuf
import okhttp3.CompressionInterceptor
import okhttp3.Gzip
import okhttp3.brotli.Brotli
import okhttp3.zstd.Zstd
import org.kodein.di.DI
import org.kodein.di.conf.global
import org.kodein.di.instance
import uy.kohesive.injekt.Injekt
import uy.kohesive.injekt.api.get
import xyz.nulldev.ts.config.ConfigManager
import xyz.nulldev.ts.config.GlobalConfigManager
import javax.crypto.Cipher
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertNotNull
import kotlin.test.assertNotSame
import kotlin.test.assertSame
import kotlin.test.assertTrue

class RuntimeInitializerTest {
    @Test
    fun `installs Android-compatible zero byte padding cipher`() {
        RuntimeInitializer().initializeAndroidCompat()
        val key = SecretKeySpec(ByteArray(16) { it.toByte() }, "AES")
        val iv = IvParameterSpec(ByteArray(16))
        val plaintext = "mangago".toByteArray()

        val encryptor = Cipher.getInstance("AES/CBC/ZeroBytePadding")
        encryptor.init(Cipher.ENCRYPT_MODE, key, iv)
        val ciphertext = encryptor.doFinal(plaintext)
        val decryptor = Cipher.getInstance("AES/CBC/ZeroBytePadding")
        decryptor.init(Cipher.DECRYPT_MODE, key, iv)

        assertEquals(16, ciphertext.size)
        assertContentEquals(plaintext, decryptor.doFinal(ciphertext))
    }

    @Test
    fun `installs WebView provider factory`() {
        val initializer = RuntimeInitializer()
        initializer.initializeAndroidCompat()
        val application = TestApplication()

        val webView = WebView(application)

        assertSame(application, webView.context)
        assertTrue(webView.provider is RuntimeWebViewProvider)
        assertSame(webView, (webView.provider as RuntimeWebViewProvider).webView)

        val settings = webView.settings
        assertSame(settings, webView.settings)
        assertTrue(settings.javaScriptEnabled)
        assertTrue(settings.domStorageEnabled)
        assertFalse(settings.blockNetworkImage)
        assertFalse(settings.loadWithOverviewMode)
        assertTrue(settings.useWideViewPort)

        settings.javaScriptEnabled = false
        settings.domStorageEnabled = false
        settings.blockNetworkImage = true
        settings.loadWithOverviewMode = true
        settings.useWideViewPort = false
        settings.userAgentString = "test-agent"

        assertFalse(settings.javaScriptEnabled)
        assertFalse(settings.domStorageEnabled)
        assertTrue(settings.blockNetworkImage)
        assertTrue(settings.loadWithOverviewMode)
        assertFalse(settings.useWideViewPort)
        assertEquals("test-agent", settings.userAgentString)

        settings.userAgentString = null
        assertEquals(System.getProperty("http.agent"), settings.userAgentString)
    }

    @Test
    fun `accepts highest validator network cache shard`() {
        val previous = System.getProperty("extstats.networkCacheShard")
        try {
            System.setProperty("extstats.networkCacheShard", "19")
            val client = NetworkHelper(TestApplication()).client
            try {
                assertEquals("network-responses-19", client.cache?.directory?.name)
            } finally {
                client.cache?.close()
                client.dispatcher.executorService.shutdown()
                client.connectionPool.evictAll()
            }
        } finally {
            if (previous == null) {
                System.clearProperty("extstats.networkCacheShard")
            } else {
                System.setProperty("extstats.networkCacheShard", previous)
            }
        }
    }

    @Test
    fun `permanent cache mode is the default`() {
        withNetworkCacheMode(null) {
            val client = NetworkHelper(TestApplication()).client
            try {
                assertTrue(client.interceptors.any { it.javaClass.simpleName == "ResponseCacheInterceptor" })
                assertTrue(client.networkInterceptors.any { it.javaClass.simpleName == "ResponseCachePolicyInterceptor" })
                assertEquals("network-responses", client.cache?.directory?.name)
            } finally {
                client.cache?.close()
                client.dispatcher.executorService.shutdown()
                client.connectionPool.evictAll()
            }
        }
    }

    @Test
    fun `mihon cache mode omits permanent cache interceptors`() {
        withNetworkCacheMode("mihon") {
            val client = NetworkHelper(TestApplication()).client
            try {
                assertTrue(client.interceptors.none { it.javaClass.simpleName == "ResponseCacheInterceptor" })
                assertTrue(client.networkInterceptors.none { it.javaClass.simpleName == "ResponseCachePolicyInterceptor" })
                assertEquals("network-responses-mihon", client.cache?.directory?.name)
            } finally {
                client.cache?.close()
                client.dispatcher.executorService.shutdown()
                client.connectionPool.evictAll()
            }
        }
    }

    @Test
    fun `rejects invalid network cache mode`() {
        withNetworkCacheMode("invalid") {
            val exception = assertFailsWith<IllegalStateException> { NetworkHelper(TestApplication()).client }
            assertTrue(exception.message.orEmpty().contains("expected 'permanent' or 'mihon'"))
        }
    }

    @Test
    fun `shutdown stops network dispatcher`() {
        val application = TestApplication()
        val initializer = RuntimeInitializer()
        initializer.registerConfigurationServices()
        initializer.initializeAndroidCompat()
        initializer.initializeInjekt()
        initializer.registerNetworkHelper(application)
        val client = Injekt.get<NetworkHelper>().client

        RuntimeInitializer.shutdown()

        assertTrue(client.dispatcher.executorService.isShutdown)
    }

    @Test
    @Suppress("DEPRECATION")
    @OptIn(ExperimentalSerializationApi::class)
    fun `initializes AndroidCompat and starts fake Android application`() {
        val initializer = RuntimeInitializer()
        initializer.registerConfigurationServices()
        initializer.registerConfigurationServices()
        initializer.initializeAndroidCompat()
        val cookieManager = CookieManager.getInstance()
        cookieManager.removeAllCookie()
        cookieManager.setCookie("https://example.com/path", "session=offline-test; Path=/")
        val application = TestApplication()

        initializer.startApplication(application)
        val previousInjekt = Injekt
        initializer.initializeInjekt()
        initializer.registerApplicationContext(application)
        initializer.registerNetworkHelper(application)
        initializer.registerJavaScriptEngine(application)
        initializer.registerJson()
        initializer.registerProtoBuf()

        val configManager by DI.global.instance<ConfigManager>()
        val javaScriptEngine = Injekt.get<JavaScriptEngine>()
        val networkHelper = Injekt.get<NetworkHelper>()
        val json = Injekt.get<Json>()
        val httpSource = object : HttpSource() {
            override val baseUrl = "https://example.com"
            override val lang = "en"
            override val name = "User agent fixture"
            override val supportsLatest = false
        }

        assertSame(GlobalConfigManager, configManager)
        assertEquals(
            "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/149.0.0.0 Mobile Safari/537.36",
            System.getProperty("http.agent"),
        )
        assertSame(cookieManager, CookieManager.getInstance())
        assertEquals("session=offline-test", cookieManager.getCookie("https://example.com/path"))
        assertEquals("session=offline-test", cookieManager.getCookie("https://example.com/path", false))
        assertTrue(cookieManager.hasCookies())
        assertNotNull(application.baseContext)
        assertTrue(application.started)
        assertNotSame(previousInjekt, Injekt)
        assertSame(application, Injekt.get<Application>())
        assertSame(application, Injekt.get<Context>())
        assertNotNull(application.getSharedPreferences("runtime-initializer-test", 0))
        assertEquals(4, runBlocking { javaScriptEngine.evaluate<Int>("2 + 2") })
        assertSame(javaScriptEngine, Injekt.get<JavaScriptEngine>())
        assertSame(networkHelper, Injekt.get<NetworkHelper>())
        assertEquals(
            "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) " +
                "Chrome/120.0.0.0 Safari/537.36",
            networkHelper.defaultUserAgentProvider(),
        )
        assertEquals(networkHelper.defaultUserAgentProvider(), httpSource.headers["User-Agent"])
        assertEquals(
            listOf(
                "NetworkRequestLoggingInterceptor",
                "UncaughtExceptionInterceptor",
                "UserAgentInterceptor",
                "CloudflareInterceptor",
                "ResponseCacheInterceptor",
            ),
            networkHelper.client.interceptors.map { it.javaClass.simpleName },
        )
        assertEquals(
            listOf("ResponseCachePolicyInterceptor"),
            networkHelper.client.networkInterceptors.map { it.javaClass.simpleName },
        )
        assertNotNull(networkHelper.client.cache)
        assertEquals(30_000, networkHelper.client.connectTimeoutMillis)
        assertEquals(30_000, networkHelper.client.readTimeoutMillis)
        assertEquals(10_000, networkHelper.client.writeTimeoutMillis)
        assertEquals(120_000, networkHelper.client.callTimeoutMillis)
        assertSame(networkHelper.client, networkHelper.cloudflareClient)
        assertNotNull(CompressionInterceptor(Brotli, Gzip, Zstd))
        assertTrue(json.configuration.ignoreUnknownKeys)
        assertFalse(json.configuration.explicitNulls)
        assertSame(json, Injekt.get<Json>())
        assertSame(ProtoBuf, Injekt.get<ProtoBuf>())
    }

    private class TestApplication : Application() {
        var started = false

        override fun onCreate() {
            super.onCreate()
            started = true
        }
    }

    private fun withNetworkCacheMode(value: String?, block: () -> Unit) {
        val previous = System.getProperty("extstats.networkCacheMode")
        try {
            if (value == null) {
                System.clearProperty("extstats.networkCacheMode")
            } else {
                System.setProperty("extstats.networkCacheMode", value)
            }
            block()
        } finally {
            if (previous == null) {
                System.clearProperty("extstats.networkCacheMode")
            } else {
                System.setProperty("extstats.networkCacheMode", previous)
            }
        }
    }
}
