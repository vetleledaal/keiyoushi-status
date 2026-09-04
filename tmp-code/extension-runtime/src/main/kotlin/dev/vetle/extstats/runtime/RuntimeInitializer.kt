package dev.vetle.extstats.runtime

import android.app.Application
import android.content.Context
import android.os.Looper
import android.webkit.WebView
import eu.kanade.tachiyomi.network.JavaScriptEngine
import eu.kanade.tachiyomi.network.NetworkHelper
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlinx.serialization.protobuf.ProtoBuf
import org.bouncycastle.jce.provider.BouncyCastleProvider
import org.kodein.di.DI
import org.kodein.di.conf.global
import uy.kohesive.injekt.Injekt
import uy.kohesive.injekt.api.InjektScope
import uy.kohesive.injekt.api.addSingletonFactory
import uy.kohesive.injekt.api.get
import uy.kohesive.injekt.registry.default.DefaultRegistrar
import xyz.nulldev.androidcompat.AndroidCompat
import xyz.nulldev.androidcompat.AndroidCompatInitializer
import xyz.nulldev.ts.config.ConfigKodeinModule
import java.net.CookieHandler
import java.net.CookieManager
import java.net.CookiePolicy
import java.security.Security

class RuntimeInitializer {
    companion object {
        @Volatile
        private var androidCompatInitialized = false

        @Volatile
        private var configurationServicesRegistered = false

        @Volatile
        private var mainLooperInitialized = false

        fun registerConfigurationServicesOnce() {
            if (configurationServicesRegistered) return

            synchronized(this) {
                if (!configurationServicesRegistered) {
                    DI.global.addImport(ConfigKodeinModule().create())
                    configurationServicesRegistered = true
                }
            }
        }

        fun initializeAndroidCompatOnce() {
            if (androidCompatInitialized) return

            synchronized(this) {
                if (!androidCompatInitialized) {
                    if (Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) == null) {
                        Security.addProvider(BouncyCastleProvider())
                    }
                    CookieHandler.setDefault(CookieManager(null, CookiePolicy.ACCEPT_ALL))
                    AndroidCompatInitializer().init()
                    WebView.setProviderFactory(::RuntimeWebViewProvider)
                    androidCompatInitialized = true
                }
            }
        }

        fun initializeMainLooperOnce() {
            if (mainLooperInitialized) return

            synchronized(this) {
                if (!mainLooperInitialized) {
                    Looper.prepareMainLooper()
                    mainLooperInitialized = true
                }
            }
        }

        fun shutdown() {
            JcefRuntime.shutdown()
            val client = runCatching { Injekt.get<NetworkHelper>().client }.getOrNull() ?: return
            client.dispatcher.executorService.shutdown()
            client.connectionPool.evictAll()
            client.cache?.close()
        }

        inline fun <T> runWithShutdown(block: () -> T): T = try {
            block()
        } finally {
            shutdown()
        }
    }

    fun registerConfigurationServices() {
        registerConfigurationServicesOnce()
    }

    fun initializeAndroidCompat() {
        initializeAndroidCompatOnce()
        initializeMainLooperOnce()
    }

    fun startApplication(application: Application) {
        AndroidCompat().startApp(application)
    }

    fun initializeInjekt() {
        Injekt = InjektScope(DefaultRegistrar())
    }

    fun registerApplicationContext(application: Application) {
        Injekt.addSingletonFactory<Application> { application }
        Injekt.addSingletonFactory<Context> { application }
    }

    fun registerNetworkHelper(application: Application) {
        Injekt.addSingletonFactory { NetworkHelper(application) }
    }

    fun registerJavaScriptEngine(application: Application) {
        Injekt.addSingletonFactory { JavaScriptEngine(application) }
    }

    fun registerJson() {
        Injekt.addSingletonFactory {
            Json {
                ignoreUnknownKeys = true
                explicitNulls = false
            }
        }
    }

    @OptIn(ExperimentalSerializationApi::class)
    fun registerProtoBuf() {
        Injekt.addSingletonFactory<ProtoBuf> { ProtoBuf }
    }
}
