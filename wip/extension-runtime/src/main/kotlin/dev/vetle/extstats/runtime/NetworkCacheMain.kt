package dev.vetle.extstats.runtime

import okhttp3.Cache
import okhttp3.HttpUrl.Companion.toHttpUrlOrNull
import java.nio.file.Files
import java.nio.file.Path

fun main(args: Array<String>) {
    require(args.size == 3) { "Usage: clearNetworkCache <cache-root> <all|domain> <value>" }
    val cacheRoot = Path.of(args[0])
    val selector = args[1]
    val value = args[2]
    val result = when (selector) {
        "all" -> NetworkCacheCleaner.clearAll(cacheRoot)
        "domain" -> NetworkCacheCleaner.clearDomain(cacheRoot, value)
        else -> error("Unknown cache selector '$selector'")
    }
    println("Cleared ${result.entries} cached response(s) from ${result.shards} shard(s) for $selector '$value'")
}

internal object NetworkCacheCleaner {
    fun clearAll(cacheRoot: Path): CacheClearResult {
        val shards = cacheShards(cacheRoot)
        val entries = shards.sumOf { directory ->
            Files.list(directory).use { paths -> paths.filter { it.fileName.toString().endsWith(".0") }.count().toInt() }
        }
        shards.forEach { it.toFile().deleteRecursively() }
        return CacheClearResult(entries, shards.size)
    }

    fun clearDomain(cacheRoot: Path, value: String): CacheClearResult {
        val domain = parseDomain(value)
        var entries = 0
        val shards = cacheShards(cacheRoot)
        shards.forEach { directory ->
            Cache(directory.toFile(), CACHE_SIZE_BYTES).use { cache ->
                val urls = cache.urls()
                while (urls.hasNext()) {
                    val host = urls.next().toHttpUrlOrNull()?.host ?: continue
                    if (host == domain || host.endsWith(".$domain")) {
                        urls.remove()
                        entries++
                    }
                }
            }
        }
        return CacheClearResult(entries, shards.size)
    }

    internal fun parseDomain(value: String): String {
        val url = value.trim().let { if ("://" in it) it else "https://$it" }.toHttpUrlOrNull()
        return requireNotNull(url?.host?.takeIf(String::isNotBlank)) { "Invalid cache domain '$value'" }
    }

    private fun cacheShards(cacheRoot: Path): List<Path> {
        if (!Files.isDirectory(cacheRoot)) return emptyList()
        return Files.list(cacheRoot).use { paths ->
            paths.filter { path ->
                Files.isDirectory(path) && CACHE_DIRECTORY_REGEX.matches(path.fileName.toString())
            }.sorted().toList()
        }
    }
}

internal data class CacheClearResult(val entries: Int, val shards: Int)

private val CACHE_DIRECTORY_REGEX = Regex("network-responses(?:-mihon)?(?:-\\d+)?")
private const val CACHE_SIZE_BYTES = 5L * 1024L * 1024L * 1024L
