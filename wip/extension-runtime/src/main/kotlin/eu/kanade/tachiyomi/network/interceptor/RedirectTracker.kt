package eu.kanade.tachiyomi.network.interceptor

import kotlinx.coroutines.asContextElement
import okhttp3.Response
import java.util.concurrent.ConcurrentLinkedQueue

data class RedirectHop(
    val fromUrl: String,
    val toUrl: String,
    val statusCode: Int,
)

data class RedirectChain(
    val hops: List<RedirectHop>,
)

class RedirectCollector internal constructor() {
    private val chains = ConcurrentLinkedQueue<RedirectChain>()

    fun record(hops: List<RedirectHop>) {
        if (hops.isNotEmpty()) chains.add(RedirectChain(hops))
    }

    fun drain(): List<RedirectChain> = buildList {
        while (true) add(chains.poll() ?: break)
    }
}

object RedirectTracker {
    private val collector = ThreadLocal<RedirectCollector?>()

    fun newCollector() = RedirectCollector()

    fun currentCollector(): RedirectCollector? = collector.get()

    fun context(redirectCollector: RedirectCollector) = collector.asContextElement(redirectCollector)
}

class RedirectTrackingInterceptor(
    private val collector: RedirectCollector,
) : okhttp3.Interceptor {
    override fun intercept(chain: okhttp3.Interceptor.Chain): Response = chain.proceed(chain.request()).also { response -> collector.record(response.redirectHops()) }
}

internal fun Response.redirectHops(): List<RedirectHop> {
    val priors = generateSequence(priorResponse) { it.priorResponse }.toList().reversed()
    if (priors.isEmpty()) return emptyList()
    val requests = priors.map { it.request } + request
    return priors.mapIndexed { index, prior ->
        RedirectHop(
            fromUrl = requests[index].url.toString(),
            toUrl = requests[index + 1].url.toString(),
            statusCode = prior.code,
        )
    }
}
