package dev.vetle.extstats.core

import java.io.ByteArrayOutputStream
import java.io.DataInputStream
import java.io.DataOutputStream
import java.io.EOFException
import java.nio.file.Path
import java.util.concurrent.TimeUnit
import java.util.concurrent.TimeoutException
import java.util.concurrent.atomic.AtomicReference
import kotlin.concurrent.thread

internal class ExtensionProbeProcess(
    private val command: List<String> = defaultCommand(),
    private val persistent: Boolean = command == defaultCommand(),
    private val maxPersistentRequests: Int = DEFAULT_MAX_PERSISTENT_REQUESTS,
) : AutoCloseable {
    private var persistentProcess: Process? = null
    private var persistentErrorCapture: ProcessErrorCapture? = null
    private var persistentRequestCount = 0

    init {
        require(maxPersistentRequests > 0) { "Persistent request limit must be positive" }
    }

    @Synchronized
    fun run(
        request: String,
        deadlineMillis: Long,
        responseSizeBytes: Long = 1_048_576,
    ): ProbeProcessResult {
        require(deadlineMillis > 0) { "Process deadline must be positive" }
        require(responseSizeBytes > 0) { "Response size limit must be positive" }

        return if (persistent) {
            runPersistent(request, deadlineMillis, responseSizeBytes)
        } else {
            runSingleRequest(request, deadlineMillis, responseSizeBytes)
        }
    }

    private fun runPersistent(
        request: String,
        deadlineMillis: Long,
        responseSizeBytes: Long,
    ): ProbeProcessResult {
        val startedAt = System.nanoTime()
        if (persistentRequestCount >= maxPersistentRequests) close()
        val process =
            persistentProcess?.takeIf(Process::isAlive) ?: ProcessBuilder(command)
                .start()
                .also {
                    persistentProcess = it
                    persistentErrorCapture = ProcessErrorCapture(it)
                }
        persistentRequestCount++
        persistentErrorCapture?.clear()
        val requestBytes = request.toByteArray(Charsets.UTF_8)
        DataOutputStream(process.outputStream).apply {
            writeInt(requestBytes.size)
            write(requestBytes)
            flush()
        }
        val response = AtomicReference<ResponseReadResult>()
        val failure = AtomicReference<Exception>()
        val responseReader =
            thread(name = "extension-probe-response", isDaemon = true) {
                try {
                    val input = DataInputStream(process.inputStream)
                    val size = input.readInt()
                    response.set(
                        if (size < 0 || size.toLong() > responseSizeBytes) {
                            ResponseReadResult.TooLarge
                        } else {
                            ResponseReadResult.Complete(String(input.readNBytes(size), Charsets.UTF_8))
                        },
                    )
                } catch (exception: Exception) {
                    failure.set(exception)
                }
            }
        responseReader.join(deadlineMillis)
        if (responseReader.isAlive) {
            close()
            responseReader.join()
            return ProbeProcessResult.TimedOut(elapsedMillis(startedAt))
        }
        if (response.get() is ResponseReadResult.TooLarge) {
            close()
            return ProbeProcessResult.ResponseTooLarge(responseSizeBytes, elapsedMillis(startedAt))
        }
        failure.get()?.let { exception ->
            val exitCode = if (exception is EOFException) process.waitFor() else process.exitValue()
            val stderr = persistentErrorCapture?.content().orEmpty()
            close()
            return ProbeProcessResult.Error("", stderr, exitCode, elapsedMillis(startedAt))
        }
        return ProbeProcessResult.Completed(
            (response.get() as ResponseReadResult.Complete).content,
            elapsedMillis(startedAt),
        )
    }

    private fun runSingleRequest(
        request: String,
        deadlineMillis: Long,
        responseSizeBytes: Long,
    ): ProbeProcessResult {
        val startedAt = System.nanoTime()
        val process =
            ProcessBuilder(command)
                .start()
        val errorCapture = ProcessErrorCapture(process)
        val response = AtomicReference<ResponseReadResult>()
        val responseReader =
            thread(name = "extension-probe-response", isDaemon = true) {
                response.set(readResponse(process, responseSizeBytes))
            }
        process.outputWriter().use { it.write(request) }

        val descendants = mutableSetOf<ProcessHandle>()
        val deadline = System.nanoTime() + TimeUnit.MILLISECONDS.toNanos(deadlineMillis)
        while (process.isAlive && System.nanoTime() < deadline) {
            process.toHandle().descendants().forEach(descendants::add)
            process.waitFor(100, TimeUnit.MILLISECONDS)
        }
        if (process.isAlive) {
            terminateProcessTree(process, descendants)
            responseReader.join()
            errorCapture.close()
            return ProbeProcessResult.TimedOut(elapsedMillis(startedAt))
        }
        terminateProcessTree(process, descendants)
        responseReader.join()
        errorCapture.close()

        val readResult = response.get()
        if (readResult is ResponseReadResult.TooLarge) {
            return ProbeProcessResult.ResponseTooLarge(responseSizeBytes, elapsedMillis(startedAt))
        }

        val content = (readResult as ResponseReadResult.Complete).content
        val exitCode = process.exitValue()
        return if (exitCode == 0) {
            ProbeProcessResult.Completed(content, elapsedMillis(startedAt))
        } else {
            ProbeProcessResult.Error(content, errorCapture.content(), exitCode, elapsedMillis(startedAt))
        }
    }

    @Synchronized
    override fun close() {
        persistentProcess?.let { process ->
            val descendants = process.toHandle().descendants().toList()
            process.outputStream.close()
            process.waitFor(5, TimeUnit.SECONDS)
            terminateProcessTree(process, descendants)
        }
        persistentErrorCapture?.close()
        persistentProcess = null
        persistentErrorCapture = null
        persistentRequestCount = 0
    }

    private fun readResponse(
        process: Process,
        responseSizeBytes: Long,
    ): ResponseReadResult {
        val output = ByteArrayOutputStream()
        process.inputStream.use { input ->
            val buffer = ByteArray(DEFAULT_BUFFER_SIZE)
            while (true) {
                val count = input.read(buffer)
                if (count < 0) break
                if (output.size().toLong() + count > responseSizeBytes) {
                    terminateProcessTree(process)
                    return ResponseReadResult.TooLarge
                }
                output.write(buffer, 0, count)
            }
        }
        return ResponseReadResult.Complete(output.toString(Charsets.UTF_8))
    }

    private fun elapsedMillis(startedAt: Long): Long = (System.nanoTime() - startedAt) / 1_000_000

    private fun terminateProcessTree(
        process: Process,
        observedDescendants: Collection<ProcessHandle> = emptyList(),
    ) {
        val root = process.toHandle()
        val descendants = (root.descendants().toList() + observedDescendants).distinctBy(ProcessHandle::pid)
        descendants.asReversed().filter(ProcessHandle::isAlive).forEach(ProcessHandle::destroy)
        if (root.isAlive) root.destroy()

        val deadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(1)
        (descendants + root).forEach { handle ->
            if (!handle.isAlive) return@forEach
            val remaining = deadline - System.nanoTime()
            if (remaining > 0) {
                try {
                    handle.onExit().get(remaining, TimeUnit.NANOSECONDS)
                } catch (_: TimeoutException) {
                }
            }
        }

        val remainingDescendants =
            (root.descendants().toList() + descendants)
                .distinctBy(ProcessHandle::pid)
                .asReversed()
                .filter(ProcessHandle::isAlive)
        remainingDescendants.forEach(ProcessHandle::destroyForcibly)
        if (root.isAlive) root.destroyForcibly()
        val forceDeadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(1)
        remainingDescendants.forEach { handle ->
            if (!handle.isAlive) return@forEach
            val remaining = forceDeadline - System.nanoTime()
            if (remaining > 0) {
                try {
                    handle.onExit().get(remaining, TimeUnit.NANOSECONDS)
                } catch (_: TimeoutException) {
                }
            }
        }
        process.waitFor()
    }

    companion object {
        internal fun defaultCommand(
            cacheShard: Int? = null,
            cacheMode: String? = System.getProperty("extstats.networkCacheMode"),
            webViewProfileDir: String? = System.getProperty("extstats.webViewProfileDir"),
            nativeCefDir: String? = System.getProperty("nativeCefDir"),
        ): List<String> {
            val isolatedWebViewProfileDir =
                cacheShard?.let { shard ->
                    Path.of(webViewProfileDir ?: "tachiserver-data/appdata/kcef", "shard-$shard").toString()
                } ?: webViewProfileDir
            return buildList {
                add(Path.of(System.getProperty("java.home"), "bin", "java").toString())
                add("-Xmx256m")
                cacheShard?.let { add("-Dextstats.networkCacheShard=$it") }
                cacheMode?.let { add("-Dextstats.networkCacheMode=$it") }
                isolatedWebViewProfileDir?.let { add("-Dextstats.webViewProfileDir=$it") }
                nativeCefDir?.let { add("-DnativeCefDir=$it") }
                add("-cp")
                add(System.getProperty("java.class.path"))
                add("dev.vetle.extstats.runtime.ExtensionProbeRunner")
            }
        }
    }
}

private sealed interface ResponseReadResult {
    data class Complete(
        val content: String,
    ) : ResponseReadResult

    data object TooLarge : ResponseReadResult
}

internal sealed interface ProbeProcessResult {
    val elapsedTimeMillis: Long

    data class Completed(
        val response: String,
        override val elapsedTimeMillis: Long,
    ) : ProbeProcessResult

    data class Error(
        val response: String,
        val stderr: String,
        val exitCode: Int,
        override val elapsedTimeMillis: Long,
    ) : ProbeProcessResult

    data class TimedOut(
        override val elapsedTimeMillis: Long,
    ) : ProbeProcessResult

    data class ResponseTooLarge(
        val limitBytes: Long,
        override val elapsedTimeMillis: Long,
    ) : ProbeProcessResult
}

private class ProcessErrorCapture(
    process: Process,
) : AutoCloseable {
    private val tail = ByteArray(STDERR_LIMIT_BYTES)
    private var size = 0
    private var next = 0
    private val reader =
        thread(name = "extension-probe-stderr", isDaemon = true) {
            process.errorStream.use { input ->
                val buffer = ByteArray(DEFAULT_BUFFER_SIZE)
                while (true) {
                    val count = input.read(buffer)
                    if (count < 0) break
                    System.err.write(buffer, 0, count)
                    append(buffer, count)
                }
            }
        }

    @Synchronized
    fun clear() {
        size = 0
        next = 0
    }

    @Synchronized
    fun content(): String {
        val bytes = ByteArray(size)
        val start = if (size == tail.size) next else 0
        val first = minOf(size, tail.size - start)
        tail.copyInto(bytes, endIndex = start + first, startIndex = start)
        if (first < size) tail.copyInto(bytes, destinationOffset = first, endIndex = size - first)
        return bytes.toString(Charsets.UTF_8)
    }

    @Synchronized
    private fun append(
        bytes: ByteArray,
        count: Int,
    ) {
        val sourceOffset = maxOf(0, count - tail.size)
        val retained = count - sourceOffset
        val first = minOf(retained, tail.size - next)
        bytes.copyInto(tail, destinationOffset = next, startIndex = sourceOffset, endIndex = sourceOffset + first)
        if (first < retained) bytes.copyInto(tail, startIndex = sourceOffset + first, endIndex = count)
        next = (next + retained) % tail.size
        size = minOf(tail.size, size + retained)
    }

    override fun close() {
        reader.join()
    }
}

private const val STDERR_LIMIT_BYTES = 64 * 1024
private const val DEFAULT_MAX_PERSISTENT_REQUESTS = 50
