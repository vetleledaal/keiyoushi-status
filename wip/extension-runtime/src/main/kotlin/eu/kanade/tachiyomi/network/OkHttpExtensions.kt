package eu.kanade.tachiyomi.network

import kotlinx.coroutines.suspendCancellableCoroutine
import okhttp3.Call
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import rx.Observable
import rx.subscriptions.Subscriptions
import java.io.IOException
import java.util.concurrent.atomic.AtomicBoolean
import kotlin.coroutines.resumeWithException

private suspend fun Call.await(callStack: Array<StackTraceElement>): Response = suspendCancellableCoroutine { continuation ->
    continuation.invokeOnCancellation {
        try {
            cancel()
        } catch (_: Throwable) {
            // Ignore cancellation failures from third-party Call implementations.
        }
    }

    enqueue(
        object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                if (continuation.isCancelled) return
                val evidence = NetworkFailureEvidence(host = call.request().url.host)
                continuation.resumeWithException(
                    NetworkFailureIOException(e.message, e, evidence).apply {
                        stackTrace = callStack
                    },
                )
            }

            override fun onResponse(call: Call, response: Response) {
                continuation.resume(response) { _, value, _ -> value.close() }
            }
        },
    )
}

suspend fun Call.await(): Response {
    val callStack = Exception().stackTrace.run { copyOfRange(1, size) }
    return await(callStack)
}

suspend fun Call.awaitSuccess(): Response {
    val callStack = Exception().stackTrace.run { copyOfRange(1, size) }
    val response = await(callStack)
    if (!response.isSuccessful) {
        response.close()
        throw HttpException(response.code).apply {
            stackTrace = callStack
            addSuppressed(response.networkFailureEvidence())
        }
    }
    return response
}

fun OkHttpClient.newCachelessCall(request: Request): Call = newBuilder().cache(null).build().newCall(request)

fun OkHttpClient.newCachelessCallWithProgress(
    request: Request,
    listener: ProgressListener,
    existingSize: Long = 0L,
): Call {
    val progressClient = newBuilder()
        .cache(null)
        .addNetworkInterceptor { chain ->
            val rangedRequest = chain.request()
                .newBuilder()
                .apply {
                    if (existingSize > 0 && chain.request().header("Range") == null) {
                        header("Range", "bytes=$existingSize-")
                    }
                }
                .build()
            val response = chain.proceed(rangedRequest)
            val actualExistingSize = if (response.code == 206) existingSize else 0L
            response.newBuilder()
                .body(ProgressResponseBody(response.body, listener, actualExistingSize))
                .build()
        }
        .build()
    return progressClient.newCall(request)
}

fun Call.asObservable(): Observable<Response> = Observable.create { subscriber ->
    val responseDelivered = AtomicBoolean()
    subscriber.add(Subscriptions.create { if (!responseDelivered.get()) cancel() })
    enqueue(
        object : Callback {
            override fun onFailure(call: Call, exception: IOException) {
                if (!subscriber.isUnsubscribed) {
                    exception.addSuppressed(NetworkFailureEvidence(host = call.request().url.host))
                    subscriber.onError(exception)
                }
            }

            override fun onResponse(call: Call, response: Response) {
                if (subscriber.isUnsubscribed) {
                    response.close()
                    return
                }
                responseDelivered.set(true)
                subscriber.onNext(response)
                subscriber.onCompleted()
            }
        },
    )
}

fun Call.asObservableSuccess(): Observable<Response> = asObservable().doOnNext { response ->
    if (!response.isSuccessful) {
        response.close()
        throw HttpException(response.code).apply {
            addSuppressed(response.networkFailureEvidence())
        }
    }
}

internal class NetworkFailureEvidence(
    val statusCode: Int? = null,
    val host: String? = null,
    val retryAfter: String? = null,
) : Exception(null, null, false, false)

internal class NetworkFailureIOException(
    message: String?,
    cause: IOException,
    val evidence: NetworkFailureEvidence,
) : IOException(message, cause)

private fun Response.networkFailureEvidence() = NetworkFailureEvidence(
    statusCode = code,
    host = request.url.host,
    retryAfter = header("Retry-After"),
)
