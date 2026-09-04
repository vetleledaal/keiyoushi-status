package dev.vetle.extstats.runtime

import android.app.Application
import android.view.View
import android.view.ViewGroup
import android.webkit.CookieManager
import android.webkit.WebResourceResponse
import android.webkit.WebView
import android.webkit.WebViewClient
import com.sun.net.httpserver.HttpServer
import eu.kanade.tachiyomi.network.NetworkHelper
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import okhttp3.HttpUrl.Companion.toHttpUrl
import uy.kohesive.injekt.Injekt
import uy.kohesive.injekt.api.get
import java.io.ByteArrayInputStream
import java.io.FilterInputStream
import java.net.InetSocketAddress
import java.nio.charset.StandardCharsets
import java.nio.file.Path
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicInteger
import javax.swing.SwingUtilities

object JcefWebViewFixtureMain {
    @JvmStatic
    fun main(args: Array<String>) {
        val requestReceived = CountDownLatch(1)
        val pageFinished = CountDownLatch(1)
        val intercepted = CountDownLatch(1)
        val redirectObserved = CountDownLatch(1)
        val loadError = CountDownLatch(1)
        val dataPageReady = CountDownLatch(1)
        val javascriptMessage = CountDownLatch(1)
        val interceptedReady = CountDownLatch(1)
        val extensionAssetMessage = CountDownLatch(1)
        val stopPendingRequest = CountDownLatch(1)
        val destroyPendingRequest = CountDownLatch(1)
        val releaseStopPendingRequest = CountDownLatch(1)
        val releaseDestroyPendingRequest = CountDownLatch(1)
        val loadCancelled = CountDownLatch(1)
        lateinit var interceptedStream: TrackingInputStream
        var postedMessage: String? = null
        var postedExtensionAssetMessage: String? = null
        var requestedWithHeader: String? = null
        var userAgent: String? = null
        var requestCookies: String? = null
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0).apply {
            createContext("/redirect") { exchange ->
                exchange.responseHeaders.add("Location", "/final")
                exchange.sendResponseHeaders(302, -1)
                exchange.close()
            }
            createContext("/final") { exchange ->
                requestedWithHeader = exchange.requestHeaders.getFirst("X-Requested-With")
                userAgent = exchange.requestHeaders.getFirst("User-Agent")
                requestCookies = exchange.requestHeaders.getFirst("Cookie")
                exchange.responseHeaders.add("Set-Cookie", "browser-session=browser-value; Path=/; HttpOnly")
                val body = "<html><body>loaded</body></html>".toByteArray(StandardCharsets.UTF_8)
                exchange.sendResponseHeaders(200, body.size.toLong())
                exchange.responseBody.use { it.write(body) }
                requestReceived.countDown()
            }
            createContext("/ready") { exchange ->
                exchange.sendResponseHeaders(204, -1)
                exchange.close()
                dataPageReady.countDown()
            }
            createContext("/intercepted") { exchange ->
                val body = "server-response".toByteArray(StandardCharsets.UTF_8)
                exchange.sendResponseHeaders(200, body.size.toLong())
                exchange.responseBody.use { it.write(body) }
            }
            createContext("/pending-stop") { exchange ->
                stopPendingRequest.countDown()
                releaseStopPendingRequest.await(20, TimeUnit.SECONDS)
                exchange.sendResponseHeaders(204, -1)
                exchange.close()
            }
            createContext("/pending-destroy") { exchange ->
                destroyPendingRequest.countDown()
                releaseDestroyPendingRequest.await(20, TimeUnit.SECONDS)
                exchange.sendResponseHeaders(204, -1)
                exchange.close()
            }
            start()
        }
        val origin = "http://127.0.0.1:${server.address.port}"
        val sensitiveFailedUrl = "http://127.0.0.1:1/private/path?token=browser-query-secret"
        val initializer = RuntimeInitializer()
        val application = Application()
        initializer.initializeInjekt()
        initializer.registerApplicationContext(application)
        initializer.registerNetworkHelper(application)
        initializer.initializeAndroidCompat()
        val loadedExtension = args.singleOrNull()?.let { SuwayomiExtensionRuntime().load(Path.of(it)) }
        val extensionScript = loadedExtension?.sources?.single()?.javaClass
            ?.getResource("/assets/webview-script.js")
            ?.readText()
        val networkHelper = Injekt.get<NetworkHelper>()
        CookieManager.getInstance().setCookie(origin, "android-session=android-value; Path=/")
        networkHelper.cookieManager.saveFromResponse(
            origin.toHttpUrl(),
            listOf(okhttp3.Cookie.Builder().name("okhttp-session").value("okhttp-value").hostOnlyDomain("127.0.0.1").build()),
        )
        val webView = WebView(application)
        var destroyed = false
        try {
            webView.layoutParams = ViewGroup.LayoutParams(1280, 720)
            webView.measure(
                View.MeasureSpec.makeMeasureSpec(1280, View.MeasureSpec.EXACTLY),
                View.MeasureSpec.makeMeasureSpec(720, View.MeasureSpec.EXACTLY),
            )
            webView.layout(0, 0, 1280, 720)
            check(webView.layoutParams.width == 1280 && webView.layoutParams.height == 720)
            check(webView.measuredWidth == 1280 && webView.measuredHeight == 720)
            check(webView.left == 0 && webView.top == 0 && webView.right == 1280 && webView.bottom == 720)
            check(webView.width == 1280 && webView.height == 720)

            val lifecycle = mutableListOf<String>()
            webView.setWebViewClient(
                object : WebViewClient() {
                    override fun onPageStarted(view: WebView, url: String, favicon: android.graphics.Bitmap?) {
                        check(SwingUtilities.isEventDispatchThread()) { "Page-start callback did not run on Main" }
                        lifecycle += "started"
                        if (extensionScript != null) view.evaluateJavascript(extensionScript, null)
                    }

                    override fun onPageFinished(view: WebView, url: String) {
                        check(SwingUtilities.isEventDispatchThread()) { "Page-finish callback did not run on Main" }
                        lifecycle += "finished"
                        pageFinished.countDown()
                    }

                    @Deprecated("Testing the reached WebView callback")
                    override fun onReceivedError(
                        view: WebView,
                        errorCode: Int,
                        description: String,
                        failingUrl: String,
                    ) {
                        check(SwingUtilities.isEventDispatchThread()) { "Page-error callback did not run on Main" }
                        when (failingUrl) {
                            sensitiveFailedUrl -> loadError.countDown()
                            "$origin/pending-stop" -> {
                                check(errorCode == WebViewClient.ERROR_UNKNOWN) {
                                    "Pending load failed with unexpected error code: $errorCode"
                                }
                                loadCancelled.countDown()
                            }
                            "$origin/pending-destroy" -> Unit
                            else -> error("Unexpected page error for $failingUrl: $errorCode $description")
                        }
                    }

                    override fun shouldInterceptRequest(
                        view: WebView,
                        request: android.webkit.WebResourceRequest,
                    ): WebResourceResponse? {
                        check(!SwingUtilities.isEventDispatchThread()) { "Request interception ran on Main" }
                        when (request.url.path) {
                            "/redirect" -> {
                                check(request.url.toString() == "$origin/redirect")
                                check(request.method == "GET")
                                check(request.isForMainFrame)
                                check(!request.isRedirect)
                                check(!request.hasGesture())
                                check(request.requestHeaders["X-Requested-With"] == "generated-request-id")
                                return null
                            }
                            "/final" -> {
                                check(request.url.toString() == "$origin/final")
                                check(request.method == "GET")
                                check(request.isForMainFrame)
                                check(request.isRedirect)
                                check(!request.hasGesture())
                                check(request.requestHeaders["X-Requested-With"] == "generated-request-id")
                                redirectObserved.countDown()
                                return null
                            }
                            "/intercepted" -> {
                                check(request.url.toString() == "$origin/intercepted")
                                check(request.method == "GET")
                                check(!request.isForMainFrame)
                                check(!request.isRedirect)
                                check(!request.hasGesture())
                                check(request.requestHeaders["X-Resource-Header"] == "resource-value")
                            }
                            else -> return null
                        }
                        intercepted.countDown()
                        interceptedStream = TrackingInputStream(
                            ByteArrayInputStream("intercepted-response".toByteArray(StandardCharsets.UTF_8)),
                        )
                        check(interceptedStream.readCount.get() == 0) { "Response stream was read during interception" }
                        check(!interceptedStream.closed.get()) { "Response stream was closed during interception" }
                        return WebResourceResponse(
                            "text/plain",
                            "iso-8859-1",
                            202,
                            "Fixture Accepted",
                            mapOf("X-Intercepted" to "true"),
                            interceptedStream,
                        )
                    }
                },
            )
            webView.settings.userAgentString = "ExtStats-WebView-Fixture"
            webView.addJavascriptInterface(
                object {
                    fun post(message: String) {
                        if (message == "intercepted-ready") {
                            interceptedReady.countDown()
                        } else {
                            postedMessage = message
                            javascriptMessage.countDown()
                        }
                    }
                },
                "fixtureBridge",
            )
            webView.addJavascriptInterface(
                object {
                    fun post(message: String) {
                        postedExtensionAssetMessage = message
                        extensionAssetMessage.countDown()
                    }
                },
                "extensionAssetBridge",
            )
            SwingUtilities.invokeAndWait {
                webView.loadUrl(
                    "$origin/redirect",
                    mapOf("X-Requested-With" to "generated-request-id"),
                )
            }
            check(requestReceived.await(20, TimeUnit.SECONDS)) { "Timed out waiting for initial WebView request" }
            check(requestedWithHeader == "generated-request-id") { "X-Requested-With header was not preserved" }
            check(userAgent == "ExtStats-WebView-Fixture") { "Configured user agent was not received" }
            check(requestCookies?.contains("android-session=android-value") == true) {
                "Android cookie was not imported into WebView: $requestCookies"
            }
            check(requestCookies?.contains("okhttp-session=okhttp-value") == true) {
                "OkHttp cookie was not imported into WebView: $requestCookies"
            }
            check(redirectObserved.await(20, TimeUnit.SECONDS)) { "Timed out waiting for redirected request" }
            check(pageFinished.await(20, TimeUnit.SECONDS)) { "Timed out waiting for page-finished callback" }
            check(lifecycle == listOf("started", "finished")) { "Unexpected lifecycle callbacks: $lifecycle" }
            if (extensionScript != null) {
                check(extensionAssetMessage.await(20, TimeUnit.SECONDS)) {
                    "Timed out waiting for extension asset bridge message"
                }
                check(postedExtensionAssetMessage == "extension-asset-executed") {
                    "Unexpected extension asset bridge message: $postedExtensionAssetMessage"
                }
                println("JCEF_EXTENSION_ASSET_OK")
            }

            val baseUrl = "$origin/data"
            webView.loadDataWithBaseURL(
                baseUrl,
                "<html><body><div id='content'>data-page</div><script>" +
                    "fetch('/ready'); " +
                    "fetch('/intercepted', {headers: {'X-Resource-Header': 'resource-value'}})" +
                    ".then(async r => { const value = await r.clone().text(); " +
                    "document.body.dataset.intercepted = JSON.stringify({" +
                    "status: r.status, statusText: r.statusText, header: r.headers.get('X-Intercepted'), " +
                    "type: (await r.blob()).type, value: value}); })" +
                    ".then(() => window.fixtureBridge.post('intercepted-ready'))" +
                    "</script></body></html>",
                "text/html",
                "utf-8",
                null,
            )
            check(dataPageReady.await(20, TimeUnit.SECONDS)) { "Timed out waiting for base-URL data page" }
            webView.evaluateJavascript("window.fixtureBridge.post('bridge-message')", null)
            check(javascriptMessage.await(20, TimeUnit.SECONDS)) { "Timed out waiting for JavaScript interface" }
            check(postedMessage == "bridge-message") { "Unexpected JavaScript interface message: $postedMessage" }
            check(intercepted.await(20, TimeUnit.SECONDS)) { "Timed out waiting for request interception" }
            check(interceptedReady.await(20, TimeUnit.SECONDS)) { "Timed out waiting for intercepted response data" }
            val result = CountDownLatch(1)
            var value: String? = null
            webView.evaluateJavascript("document.getElementById('content').textContent") {
                check(SwingUtilities.isEventDispatchThread()) { "JavaScript result callback did not run on Main" }
                value = it
                result.countDown()
            }
            check(result.await(20, TimeUnit.SECONDS)) { "Timed out waiting for JavaScript result" }
            check(value == "\"data-page\"") { "Unexpected JavaScript result: $value" }
            val interceptedResult = CountDownLatch(1)
            webView.evaluateJavascript("document.body.dataset.intercepted") {
                val response = Json.parseToJsonElement(Json.parseToJsonElement(it).jsonPrimitive.content).jsonObject
                check(response["status"]?.jsonPrimitive?.content == "202") { "Unexpected status: $response" }
                check(response["statusText"]?.jsonPrimitive?.content == "Fixture Accepted") {
                    "Unexpected reason: $response"
                }
                check(response["header"]?.jsonPrimitive?.content == "true") { "Unexpected headers: $response" }
                check(response["type"]?.jsonPrimitive?.content == "text/plain; charset=iso-8859-1") {
                    "Unexpected MIME type or encoding: $response"
                }
                check(response["value"]?.jsonPrimitive?.content == "intercepted-response") {
                    "Unexpected body: $response"
                }
                interceptedResult.countDown()
            }
            check(interceptedResult.await(20, TimeUnit.SECONDS)) { "Timed out waiting for intercepted response" }
            check(interceptedStream.readCount.get() > 0) { "Intercepted response stream was not consumed" }
            check(interceptedStream.closed.get()) { "Intercepted response stream was not closed after consumption" }
            webView.removeJavascriptInterface("fixtureBridge")
            val bridgeRemoved = CountDownLatch(1)
            webView.evaluateJavascript("typeof window.fixtureBridge") {
                check(it == "\"undefined\"") { "JavaScript interface remained after removal: $it" }
                bridgeRemoved.countDown()
            }
            check(bridgeRemoved.await(20, TimeUnit.SECONDS)) { "Timed out waiting for JavaScript interface removal" }
            webView.loadUrl(
                sensitiveFailedUrl,
                mapOf("Authorization" to "Bearer browser-header-secret"),
            )
            check(loadError.await(20, TimeUnit.SECONDS)) { "Timed out waiting for page-error callback" }
            webView.evaluateJavascript("window.fixtureComplete = true", null)

            webView.loadUrl("$origin/pending-stop")
            check(stopPendingRequest.await(20, TimeUnit.SECONDS)) { "Timed out waiting for pending WebView request" }
            webView.stopLoading()
            check(loadCancelled.await(20, TimeUnit.SECONDS)) { "stopLoading did not cancel pending navigation" }
            releaseStopPendingRequest.countDown()

            webView.loadUrl("$origin/pending-destroy")
            check(destroyPendingRequest.await(20, TimeUnit.SECONDS)) {
                "Timed out waiting for second pending WebView request"
            }
            val destroyStarted = System.nanoTime()
            webView.destroy()
            check(System.nanoTime() - destroyStarted < TimeUnit.SECONDS.toNanos(5)) {
                "destroy blocked while navigation was pending"
            }
            destroyed = true
            check(CookieManager.getInstance().getCookie(origin).contains("browser-session=browser-value")) {
                "Browser cookie was not exported to Android CookieManager"
            }
            check(
                networkHelper.cookieManager.loadForRequest(origin.toHttpUrl()).any {
                    it.name == "browser-session" && it.value == "browser-value"
                },
            ) { "Browser cookie was not exported to OkHttp" }
            println("JCEF_WEBVIEW_FIXTURE_OK")
        } finally {
            releaseStopPendingRequest.countDown()
            releaseDestroyPendingRequest.countDown()
            if (!destroyed) webView.destroy()
            RuntimeInitializer.shutdown()
            server.stop(0)
        }
    }

    private class TrackingInputStream(input: ByteArrayInputStream) : FilterInputStream(input) {
        val readCount = AtomicInteger()
        val closed = AtomicBoolean()

        override fun read(): Int {
            readCount.incrementAndGet()
            return super.read()
        }

        override fun read(buffer: ByteArray, offset: Int, length: Int): Int {
            readCount.incrementAndGet()
            return super.read(buffer, offset, length)
        }

        override fun close() {
            check(closed.compareAndSet(false, true)) { "Intercepted response stream was closed more than once" }
            super.close()
        }
    }
}
