package eu.kanade.tachiyomi.network

import okhttp3.MediaType
import okhttp3.ResponseBody
import okio.Buffer
import okio.BufferedSource
import okio.ForwardingSource
import okio.Source
import okio.buffer
import java.io.IOException

fun interface ProgressListener {
    fun update(bytesRead: Long, contentLength: Long, done: Boolean)
}

class ProgressResponseBody(
    private val responseBody: ResponseBody,
    private val progressListener: ProgressListener,
    private val existingSize: Long,
) : ResponseBody() {
    private val bufferedSource: BufferedSource by lazy { progressSource(responseBody.source()).buffer() }

    override fun contentType(): MediaType? = responseBody.contentType()

    override fun contentLength(): Long = responseBody.contentLength()

    override fun source(): BufferedSource = bufferedSource

    private fun progressSource(source: Source): Source = object : ForwardingSource(source) {
        private var totalBytesRead = existingSize

        @Throws(IOException::class)
        override fun read(sink: Buffer, byteCount: Long): Long {
            val bytesRead = super.read(sink, byteCount)
            if (bytesRead != -1L) totalBytesRead += bytesRead
            progressListener.update(totalBytesRead, existingSize + responseBody.contentLength(), bytesRead == -1L)
            return bytesRead
        }
    }
}
