package dev.vetle.extstats.runtime

import android.app.Application
import eu.kanade.tachiyomi.source.online.HttpSource
import okhttp3.OkHttpClient
import java.lang.reflect.Modifier
import java.nio.file.Path
import kotlin.coroutines.Continuation
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertIs
import kotlin.test.assertNotSame
import kotlin.test.assertSame

class ExtensionClassResolverTest {
    @Test
    fun `host HttpSource preserves concrete search API default`() {
        val method = HttpSource::class.java.getDeclaredMethod(
            "getSearchManga",
            Int::class.javaPrimitiveType,
            String::class.java,
            eu.kanade.tachiyomi.source.model.FilterList::class.java,
            Continuation::class.java,
        )

        assertEquals(false, Modifier.isAbstract(method.modifiers))
    }

    @Test
    fun `loads selected extension source class with child first classloader`() {
        val application = Application()
        val initializer = RuntimeInitializer()
        initializer.registerConfigurationServices()
        initializer.initializeAndroidCompat()
        initializer.startApplication(application)
        initializer.initializeInjekt()
        initializer.registerApplicationContext(application)
        initializer.registerNetworkHelper(application)

        val jar = Path.of(System.getProperty("testExtensionJar"))
        val manifest = AndroidManifestParser.parse(jar)

        ChildFirstUrlClassLoader(arrayOf(jar.toUri().toURL())).use { classLoader ->
            val sourceClass = Class.forName(manifest.resolveSourceClassName(), false, classLoader)
            val hostApiClass = Class.forName("eu.kanade.tachiyomi.source.ConfigurableSource", false, classLoader)
            val hostSourceClass = Class.forName("eu.kanade.tachiyomi.source.Source", false, classLoader)
            val hostDependencyClass = Class.forName("okhttp3.OkHttpClient", false, classLoader)
            val source = assertIs<HttpSource>(sourceClass.getDeclaredConstructor().newInstance())

            assertEquals(manifest.resolveSourceClassName(), sourceClass.name)
            assertSame(classLoader, sourceClass.classLoader)
            assertNotSame(classLoader, hostApiClass.classLoader)
            assertNotSame(classLoader, hostDependencyClass.classLoader)
            assertSame(classLoader, sourceClass.superclass.classLoader)
            assertSame(source, hostSourceClass.cast(source))
            assertIs<OkHttpClient>(sourceClass.getMethod("getClient").invoke(source))
        }
    }

    @Test
    fun `isolates serialization while preserving shared host packages`() {
        val jar = Path.of(System.getProperty("classLoaderFixtureJar"))

        ChildFirstUrlClassLoader(arrayOf(jar.toUri().toURL())).use { classLoader ->
            val serializationClass = classLoader.loadClass("kotlinx.serialization.FixtureSerializationRuntime")

            assertSame(classLoader, serializationClass.classLoader)
            listOf(
                "kotlinx.coroutines.CoroutineScope",
                "eu.kanade.tachiyomi.source.Source",
                "okhttp3.OkHttpClient",
                "android.content.Context",
            ).forEach { className ->
                assertNotSame(classLoader, classLoader.loadClass(className).classLoader, className)
            }
            assertNotSame(classLoader, classLoader.loadClass("kotlin.Unit").classLoader)
        }
    }

    @Test
    fun `expands relative source class names`() {
        assertEquals(
            "example.extension.Generated",
            manifestWithClass(".Generated").resolveSourceClassName(),
        )
        assertEquals(
            "example.extension.Generated",
            manifestWithClass("Generated").resolveSourceClassName(),
        )
    }

    @Test
    fun `rejects a missing source class`() {
        val exception = assertFailsWith<IllegalArgumentException> {
            manifestWithClass(null).resolveSourceClassName()
        }

        assertEquals("Missing tachiyomi.extension.class metadata", exception.message)
    }

    private fun manifestWithClass(className: String?) = ExtensionManifest(
        packageName = "example.extension",
        versionName = null,
        versionCode = null,
        extensionClass = className,
        extensionLibraryVersion = null,
        usesFeatures = emptyList(),
        metadata = className?.let { mapOf("tachiyomi.extension.class" to it) }.orEmpty(),
    )
}
