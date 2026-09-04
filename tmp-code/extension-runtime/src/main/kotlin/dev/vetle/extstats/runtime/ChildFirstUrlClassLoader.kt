package dev.vetle.extstats.runtime

import java.net.URL
import java.net.URLClassLoader

class ChildFirstUrlClassLoader(
    urls: Array<URL>,
    parent: ClassLoader? = null,
) : URLClassLoader(urls, parent) {
    private val systemClassLoader = getSystemClassLoader()

    override fun loadClass(name: String, resolve: Boolean): Class<*> {
        var loadedClass = findLoadedClass(name)

        if (loadedClass == null && isParentFirst(name)) {
            loadedClass =
                try {
                    systemClassLoader.loadClass(name)
                } catch (_: ClassNotFoundException) {
                    null
                }
        }

        if (loadedClass == null) {
            loadedClass =
                try {
                    findClass(name)
                } catch (_: ClassNotFoundException) {
                    systemClassLoader.loadClass(name)
                }
        }

        if (resolve) {
            resolveClass(loadedClass)
        }

        return loadedClass
    }

    private fun isParentFirst(name: String): Boolean =
        PARENT_FIRST_PACKAGES.any { packageName ->
            name == packageName || name.startsWith("$packageName.")
        }

    private companion object {
        val PARENT_FIRST_PACKAGES =
            listOf(
                "android",
                "androidx",
                "eu.kanade.tachiyomi",
                "java",
                "javax",
                "kotlin",
                "kotlinx.coroutines",
                "okhttp3",
                "okio",
                "org.jsoup",
                "rx",
                "uy.kohesive.injekt",
            )
    }
}
