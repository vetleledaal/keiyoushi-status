package dev.vetle.extstats.runtime

import android.app.Application
import eu.kanade.tachiyomi.source.SourceFactory
import eu.kanade.tachiyomi.source.online.HttpSource
import java.nio.file.Path

interface ExtensionRuntime {
    fun load(jar: Path, sourceId: Long? = null): LoadedExtension
}

interface LoadedExtension : AutoCloseable {
    val metadata: LoadedExtensionMetadata
    val sources: List<HttpSource>
}

data class LoadedExtensionMetadata(
    val extensionLibraryVersion: String,
    val entryPointClass: String,
    val sourceImplementationClass: String,
)

data class ExtensionSmokeResult(
    val packageName: String,
    val versionName: String?,
    val extensionLibraryVersion: String,
    val entryPointClass: String,
    val sources: List<ExtensionSmokeSource>,
)

data class ExtensionSmokeSource(
    val id: Long,
    val name: String,
    val language: String,
    val implementationClass: String,
)

class SuwayomiExtensionRuntime : ExtensionRuntime {
    override fun load(jar: Path, sourceId: Long?): LoadedExtension {
        val extension = loadAll(jar)
        return try {
            val selectedSources = sourceId?.let { id ->
                val matches = extension.sources.filter { it.id == id }
                require(matches.isNotEmpty()) { "Unknown source ID $id" }
                require(matches.size == 1) { "Duplicate source ID $id" }
                matches
            } ?: listOf(selectPreferredSource(extension.sources))
            ClassLoaderLoadedExtension(
                metadata = LoadedExtensionMetadata(
                    extensionLibraryVersion = extension.extensionLibraryVersion,
                    entryPointClass = extension.entryPointClass,
                    sourceImplementationClass = selectedSources.single()::class.java.name,
                ),
                sources = selectedSources,
                classLoader = extension.classLoader,
            )
        } catch (exception: Exception) {
            extension.close()
            throw exception
        }
    }

    fun smokeTest(jar: Path): ExtensionSmokeResult = RuntimeInitializer.runWithShutdown {
        loadAll(jar).use { extension ->
            ExtensionSmokeResult(
                packageName = extension.manifest.packageName,
                versionName = extension.manifest.versionName,
                extensionLibraryVersion = extension.extensionLibraryVersion,
                entryPointClass = extension.entryPointClass,
                sources = extension.sources.map { source ->
                    ExtensionSmokeSource(
                        id = source.id,
                        name = source.name,
                        language = source.lang,
                        implementationClass = source::class.java.name,
                    )
                },
            )
        }
    }

    private fun loadAll(jar: Path): UnselectedLoadedExtension {
        val manifest = AndroidManifestParser.parse(jar)
        val extensionLibraryVersion = requireNotNull(manifest.extensionLibraryVersion) {
            "Missing extension-lib version"
        }
        require(extensionLibraryVersion in setOf("1.4", "1.6")) {
            "Unsupported extension-lib version $extensionLibraryVersion; expected 1.4 or 1.6"
        }
        initializeRuntime()
        val classLoader = ChildFirstUrlClassLoader(arrayOf(jar.toUri().toURL()))

        return try {
            val sourceClass = Class.forName(manifest.resolveSourceClassName(), false, classLoader)
            val entryPoint = sourceClass.getDeclaredConstructor().newInstance()
            val sources =
                when (entryPoint) {
                    is HttpSource -> listOf(entryPoint)
                    is SourceFactory ->
                        entryPoint.createSources().map { source ->
                            require(source is HttpSource) {
                                "SourceFactory returned unsupported source type ${source::class.java.name}"
                            }
                            source
                        }
                    else -> error("Unsupported extension entry point type ${sourceClass.name}")
                }
            UnselectedLoadedExtension(
                manifest = manifest,
                extensionLibraryVersion = extensionLibraryVersion,
                entryPointClass = sourceClass.name,
                sources = sources,
                classLoader = classLoader,
            )
        } catch (exception: Exception) {
            classLoader.close()
            throw exception
        }
    }

    private fun initializeRuntime() {
        val application = Application()
        val initializer = RuntimeInitializer()
        initializer.registerConfigurationServices()
        initializer.initializeAndroidCompat()
        initializer.startApplication(application)
        initializer.initializeInjekt()
        initializer.registerApplicationContext(application)
        initializer.registerNetworkHelper(application)
        initializer.registerJson()
        initializer.registerProtoBuf()
        initializer.registerJavaScriptEngine(application)
    }
}

internal fun <T> selectPreferredSource(sources: List<T>, language: (T) -> String): T {
    require(sources.isNotEmpty()) { "Extension contains no sources" }
    return sources.minBy { source ->
        val normalizedLanguage = language(source).lowercase().replace('_', '-')
        SOURCE_LANGUAGE_PRIORITY.indexOfFirst { preferred ->
            normalizedLanguage == preferred || normalizedLanguage.startsWith("$preferred-")
        }.takeIf { it >= 0 } ?: SOURCE_LANGUAGE_PRIORITY.size
    }
}

private fun selectPreferredSource(sources: List<HttpSource>): HttpSource = selectPreferredSource(sources, HttpSource::lang)

private val SOURCE_LANGUAGE_PRIORITY = listOf(
    "en",
    "all",
    "multi",
    "ja",
    "ko",
    "zh",
    "es",
    "ar",
    "pt",
    "id",
    "fr",
    "ru",
    "vi",
    "it",
    "th",
    "uk",
)

private class UnselectedLoadedExtension(
    val manifest: ExtensionManifest,
    val extensionLibraryVersion: String,
    val entryPointClass: String,
    val sources: List<HttpSource>,
    val classLoader: ChildFirstUrlClassLoader,
) : AutoCloseable {
    override fun close() {
        classLoader.close()
    }
}

private class ClassLoaderLoadedExtension(
    override val metadata: LoadedExtensionMetadata,
    override val sources: List<HttpSource>,
    private val classLoader: ChildFirstUrlClassLoader,
) : LoadedExtension {
    override fun close() {
        classLoader.close()
    }
}
