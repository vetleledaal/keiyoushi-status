package dev.vetle.extstats.runtime

import android.webkit.ValueCallback
import android.webkit.WebResourceRequest
import android.webkit.WebResourceResponse
import android.webkit.WebView
import android.webkit.WebViewClient
import com.jetbrains.cef.JCefAppConfig
import eu.kanade.tachiyomi.network.MemoryCookieJar
import eu.kanade.tachiyomi.network.NetworkHelper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import okhttp3.Cookie
import okhttp3.HttpUrl
import org.cef.CefApp
import org.cef.CefClient
import org.cef.CefSettings
import org.cef.SystemBootstrap
import org.cef.browser.CefBrowser
import org.cef.browser.CefDevToolsClient
import org.cef.browser.CefFrame
import org.cef.browser.CefMessageRouter
import org.cef.browser.CefRendering
import org.cef.callback.CefCallback
import org.cef.callback.CefCompletionCallback
import org.cef.callback.CefQueryCallback
import org.cef.handler.CefLifeSpanHandlerAdapter
import org.cef.handler.CefLoadHandler
import org.cef.handler.CefLoadHandlerAdapter
import org.cef.handler.CefMessageRouterHandlerAdapter
import org.cef.handler.CefRenderHandlerAdapter
import org.cef.handler.CefRequestHandlerAdapter
import org.cef.handler.CefResourceHandler
import org.cef.handler.CefResourceHandlerAdapter
import org.cef.handler.CefResourceRequestHandler
import org.cef.handler.CefResourceRequestHandlerAdapter
import org.cef.misc.BoolRef
import org.cef.misc.IntRef
import org.cef.misc.StringRef
import org.cef.network.CefCookie
import org.cef.network.CefCookieManager
import org.cef.network.CefRequest
import org.cef.network.CefResponse
import uy.kohesive.injekt.Injekt
import uy.kohesive.injekt.api.get
import java.awt.EventQueue
import java.awt.Rectangle
import java.awt.Toolkit
import java.lang.reflect.Method
import java.net.CookieHandler
import java.net.HttpCookie
import java.net.URI
import java.nio.charset.Charset
import java.nio.file.Path
import java.util.Date
import java.util.UUID
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicBoolean
import javax.swing.Timer

internal object JcefRuntime {
    private var app: CefApp? = null
    private var initialized = CountDownLatch(1)

    @Synchronized
    fun createClient(): CefClient {
        val app = getOrCreateApp()
        check(awaitInitialization()) { "Timed out waiting for JCEF initialization" }
        return app.createClient()
    }

    private fun awaitInitialization(): Boolean {
        if (!EventQueue.isDispatchThread()) return initialized.await(20, TimeUnit.SECONDS)

        val eventLoop = Toolkit.getDefaultToolkit().systemEventQueue.createSecondaryLoop()
        val deadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(20)
        val timer = Timer(10) {
            if (initialized.count == 0L || System.nanoTime() >= deadline) eventLoop.exit()
        }
        timer.start()
        try {
            if (initialized.count > 0L) check(eventLoop.enter()) { "Could not enter JCEF initialization event loop" }
        } finally {
            timer.stop()
        }
        return initialized.count == 0L
    }

    @Synchronized
    fun shutdown() {
        app?.dispose()
        app = null
        initialized = CountDownLatch(1)
    }

    private fun getOrCreateApp(): CefApp = app ?: initialize().also { app = it }

    private fun initialize(): CefApp {
        check(Runtime.version().feature() == 21) { "JCEF requires JDK 21" }
        val nativeDirectory = Path.of(
            System.getProperty("nativeCefDir", "tachiserver-data/bin/kcef"),
        ).toAbsolutePath()
        val profileDirectory = Path.of(
            System.getProperty("extstats.webViewProfileDir", "tachiserver-data/appdata/kcef"),
        ).toAbsolutePath()
        val config = JCefAppConfig.getInstance(nativeDirectory.toString(), false).apply {
            appArgsAsList.addAll(
                listOf(
                    "--disable-gpu",
                    "--off-screen-rendering-enabled",
                    "--disable-dev-shm-usage",
                    "--change-stack-guard-on-fork=disable",
                    "--no-first-run",
                    "--no-default-browser-check",
                ),
            )
            cefSettings.windowless_rendering_enabled = true
            cefSettings.cache_path = profileDirectory.toString()
            cefSettings.log_severity = CefSettings.LogSeverity.LOGSEVERITY_DISABLE
        }
        System.loadLibrary("jawt")
        config.loader.loadLibrary("cef")
        config.loader.loadLibrary("jcef")
        CefApp.setIsRemoteEnabled(config.isRemoteEnabled)
        SystemBootstrap.setLoader(config.loader)
        check(CefApp.startup(config.appArgs)) { "CEF startup failed" }
        return CefApp.getInstance(config.appArgs, config.cefSettings, config.serverExe).also { app ->
            app.onInitialization({ state ->
                if (state == CefApp.CefAppState.INITIALIZED) initialized.countDown()
            }, true)
        }
    }
}

internal class JcefWebViewSession : RuntimeWebViewSession {
    private companion object {
        const val VIEWPORT_WIDTH = 1280
        const val VIEWPORT_HEIGHT = 720
    }

    private val callbackScope = CoroutineScope(SupervisorJob() + Dispatchers.Main)
    private val callbacks = ConcurrentHashMap<String, ValueCallback<String>?>()
    private val cookieSynchronizer = JcefCookieSynchronizer()
    private val devToolsClients = ConcurrentHashMap<CefBrowser, CefDevToolsClient>()
    private val evaluateQueryFunction = "_${UUID.randomUUID().toString().replace("-", "")}"
    private val evaluateCancelFunction = "_${UUID.randomUUID().toString().replace("-", "")}"
    private val interfaceQueryFunction = "_${UUID.randomUUID().toString().replace("-", "")}"
    private val interfaceCancelFunction = "_${UUID.randomUUID().toString().replace("-", "")}"
    private val javascriptInterfaces = ConcurrentHashMap<String, JavascriptInterface>()
    private val loadStartInterfaceInjection = ConcurrentHashMap.newKeySet<Int>()
    private val pendingUrls = ConcurrentHashMap<CefBrowser, String>()
    private val syntheticPageStarts = ConcurrentHashMap.newKeySet<Int>()

    @Volatile
    private var pageStartScripts: MutableList<String>? = null
    private var client: CefClient? = null
    private var browser: CefBrowser? = null
    private var initialHeaders = emptyMap<String, String>()
    private var userAgent = System.getProperty("http.agent")
    private var dataPage: DataPage? = null
    private var webView: WebView? = null
    private var webViewClient = WebViewClient()

    override fun loadUrl(url: String, additionalHttpHeaders: Map<String, String>, userAgent: String) {
        initialHeaders = additionalHttpHeaders.toMap()
        this.userAgent = userAgent
        dataPage = null
        createBrowser(url)
    }

    override fun loadDataWithBaseURL(
        baseUrl: String?,
        data: String,
        mimeType: String?,
        encoding: String?,
        historyUrl: String?,
        userAgent: String,
    ) {
        val url = baseUrl ?: "http://localhost/"
        this.userAgent = userAgent
        initialHeaders = emptyMap()
        dataPage = DataPage(url.trimEnd('/'), data, mimeType ?: "text/html", encoding ?: "utf-8")
        createBrowser(url)
    }

    override fun evaluateJavascript(script: String, resultCallback: ValueCallback<String>?) {
        pageStartScripts?.let {
            it += script
            return
        }
        val id = UUID.randomUUID().toString()
        if (resultCallback != null) callbacks[id] = resultCallback
        val functionBody = when {
            script.contains('\n') || script.contains('\r') -> script
            script.trimStart().startsWith("return") -> script
            else -> "return $script"
        }
        requireNotNull(browser) { "WebView has not loaded content" }.executeJavaScript(
            """
            try {
                const result = (function() { $functionBody })();
                window[${JsonPrimitive(evaluateQueryFunction)}]({request: JSON.stringify({id: "$id", result: JSON.stringify(result)})});
            } catch (error) {
                window[${JsonPrimitive(evaluateQueryFunction)}]({request: JSON.stringify({id: "$id", result: "null"})});
            }
            """.trimIndent(),
            "about:blank",
            0,
        )
    }

    override fun addJavascriptInterface(object_: Any, name: String) {
        val postMethod = (object_.javaClass.declaredMethods.asSequence() + object_.javaClass.methods.asSequence())
            .firstOrNull {
                it.name == "post" && it.parameterTypes.contentEquals(arrayOf(String::class.java))
            }
            ?: throw IllegalArgumentException("JavaScript interface must define post(String)")
        postMethod.trySetAccessible()
        javascriptInterfaces[name] = JavascriptInterface(object_, postMethod)
    }

    override fun removeJavascriptInterface(name: String) {
        javascriptInterfaces.remove(name)
        browser?.executeJavaScript("delete window[${JsonPrimitive(name)}];", "about:blank", 0)
    }

    override fun setWebViewClient(webView: WebView, client: WebViewClient) {
        this.webView = webView
        webViewClient = client
    }

    override fun stopLoading() {
        browser?.stopLoad()
    }

    override fun destroy() {
        callbackScope.cancel()
        if (browser != null) cookieSynchronizer.exportCookies()
        devToolsClients.values.forEach(CefDevToolsClient::close)
        devToolsClients.clear()
        disposeClient()
        callbacks.clear()
        javascriptInterfaces.clear()
    }

    private fun createBrowser(url: String) {
        disposeClient()
        val client = createClient().also { client = it }
        cookieSynchronizer.importCookies()
        val browser = client.createBrowser(
            "about:blank",
            CefRendering.CefRenderingWithHandler(
                object : CefRenderHandlerAdapter() {
                    override fun getViewRect(browser: CefBrowser) = Rectangle(0, 0, VIEWPORT_WIDTH, VIEWPORT_HEIGHT)
                },
                null,
            ),
            false,
        )
        this.browser = browser
        pendingUrls[browser] = url
        browser.createImmediately()
        browser.wasResized(VIEWPORT_WIDTH, VIEWPORT_HEIGHT)
    }

    private fun disposeClient() {
        val client = client ?: return
        val disposed = CountDownLatch(1)
        client.setOnDisposeCallback(disposed::countDown)
        browser?.stopLoad()
        browser?.setCloseAllowed()
        client.dispose()
        check(disposed.await(5, TimeUnit.SECONDS)) { "Timed out waiting for JCEF client shutdown" }
        browser = null
        this.client = null
    }

    private fun createClient(): CefClient = JcefRuntime.createClient().apply {
        addLifeSpanHandler(
            object : CefLifeSpanHandlerAdapter() {
                override fun onBeforePopup(
                    browser: CefBrowser,
                    frame: CefFrame,
                    targetUrl: String,
                    targetFrameName: String,
                ) = true

                override fun onAfterCreated(browser: CefBrowser) {
                    val url = pendingUrls.remove(browser) ?: return
                    syntheticPageStarts += browser.identifier
                    dispatchPageStartAndNavigate(browser, url)
                }

                override fun onBeforeClose(browser: CefBrowser) {
                    loadStartInterfaceInjection.remove(browser.identifier)
                    devToolsClients.remove(browser)?.close()
                }
            },
        )
        addLoadHandler(
            object : CefLoadHandlerAdapter() {
                override fun onLoadStart(
                    browser: CefBrowser,
                    frame: CefFrame,
                    transitionType: CefRequest.TransitionType,
                ) {
                    if (frame.isMain) {
                        val url = frame.url
                        if (url == "about:blank") return
                        if (browser.identifier in loadStartInterfaceInjection) injectJavascriptInterfaces(browser)
                        if (syntheticPageStarts.remove(browser.identifier)) return
                        dispatchWebViewCallback { view, client ->
                            client.onPageStarted(view, url, null)
                        }
                    }
                }

                override fun onLoadEnd(browser: CefBrowser, frame: CefFrame, httpStatusCode: Int) {
                    if (frame.isMain) {
                        val url = frame.url
                        dispatchWebViewCallback { view, client -> client.onPageFinished(view, url) }
                    }
                }

                @Suppress("DEPRECATION")
                override fun onLoadError(
                    browser: CefBrowser,
                    frame: CefFrame,
                    errorCode: CefLoadHandler.ErrorCode,
                    errorText: String,
                    failedUrl: String,
                ) {
                    if (frame.isMain) {
                        dispatchWebViewCallback { view, client ->
                            client.onReceivedError(view, WebViewClient.ERROR_UNKNOWN, errorText, failedUrl)
                        }
                    }
                }
            },
        )
        addMessageRouter(
            CefMessageRouter.create(
                CefMessageRouter.CefMessageRouterConfig(evaluateQueryFunction, evaluateCancelFunction),
                object : CefMessageRouterHandlerAdapter() {
                    override fun onQuery(
                        browser: CefBrowser,
                        frame: CefFrame,
                        queryId: Long,
                        request: String,
                        persistent: Boolean,
                        callback: CefQueryCallback,
                    ): Boolean {
                        val payload = runCatching { Json.parseToJsonElement(request).jsonObject }.getOrNull()
                            ?: return false
                        val id = payload["id"]?.jsonPrimitive?.content ?: return false
                        callbacks.remove(id)?.let { resultCallback ->
                            val result = payload["result"]?.jsonPrimitive?.content ?: "null"
                            callbackScope.launch { resultCallback.onReceiveValue(result) }
                        }
                        callback.success("")
                        return true
                    }
                },
            ),
        )
        addMessageRouter(
            CefMessageRouter.create(
                CefMessageRouter.CefMessageRouterConfig(interfaceQueryFunction, interfaceCancelFunction),
                object : CefMessageRouterHandlerAdapter() {
                    override fun onQuery(
                        browser: CefBrowser,
                        frame: CefFrame,
                        queryId: Long,
                        request: String,
                        persistent: Boolean,
                        callback: CefQueryCallback,
                    ): Boolean {
                        val payload = runCatching { Json.parseToJsonElement(request).jsonObject }.getOrNull()
                            ?: return false
                        val name = payload["name"]?.jsonPrimitive?.content ?: return false
                        val message = payload["message"]?.jsonPrimitive?.content ?: return false
                        val javascriptInterface = javascriptInterfaces[name] ?: return false
                        return runCatching {
                            javascriptInterface.post.invoke(javascriptInterface.target, message)
                            callback.success("")
                            true
                        }.getOrElse {
                            callback.failure(0, it.message ?: "JavaScript interface invocation failed")
                            true
                        }
                    }
                },
            ),
        )
        addRequestHandler(
            object : CefRequestHandlerAdapter() {
                private val resourceHandler = object : CefResourceRequestHandlerAdapter() {
                    private val redirectedRequests = ConcurrentHashMap.newKeySet<Long>()

                    override fun onBeforeResourceLoad(
                        browser: CefBrowser,
                        frame: CefFrame,
                        request: CefRequest,
                    ): Boolean {
                        request.setHeaderByName("User-Agent", userAgent, true)
                        if (request.resourceType == CefRequest.ResourceType.RT_MAIN_FRAME) {
                            initialHeaders.forEach { (name, value) -> request.setHeaderByName(name, value, true) }
                        }
                        return false
                    }

                    override fun onResourceRedirect(
                        browser: CefBrowser,
                        frame: CefFrame,
                        request: CefRequest,
                        response: CefResponse,
                        newUrl: StringRef,
                    ) {
                        redirectedRequests += request.identifier
                    }

                    override fun getResourceHandler(
                        browser: CefBrowser,
                        frame: CefFrame,
                        request: CefRequest,
                    ): CefResourceHandler? {
                        val intercepted = webView?.let {
                            webViewClient.shouldInterceptRequest(
                                it,
                                CefWebResourceRequest(
                                    request,
                                    redirectedRequests.remove(request.identifier) || request.transitionType.isRedirect,
                                ),
                            )
                        }
                        return intercepted?.let(::WebResponseResourceHandler)
                            ?: dataPage?.takeIf { request.url.trimEnd('/') == it.url }?.let(::DataResourceHandler)
                    }
                }

                override fun getResourceRequestHandler(
                    browser: CefBrowser,
                    frame: CefFrame,
                    request: CefRequest,
                    isNavigation: Boolean,
                    isDownload: Boolean,
                    requestInitiator: String,
                    disableDefaultHandling: BoolRef,
                ): CefResourceRequestHandler = resourceHandler
            },
        )
    }

    private fun dispatchWebViewCallback(callback: (WebView, WebViewClient) -> Unit) {
        val view = webView ?: return
        val client = webViewClient
        callbackScope.launch {
            ensureMainLooperBoundToCurrentThread()
            callback(view, client)
        }
    }

    private fun dispatchPageStartAndNavigate(browser: CefBrowser, url: String) {
        val view = webView ?: return
        val client = webViewClient
        callbackScope.launch {
            ensureMainLooperBoundToCurrentThread()
            val scripts = mutableListOf<String>()
            pageStartScripts = scripts
            try {
                client.onPageStarted(view, url, null)
            } finally {
                pageStartScripts = null
            }
            if (scripts.isEmpty()) {
                loadStartInterfaceInjection += browser.identifier
                browser.loadURL(url)
            } else {
                browser.registerPageStartJavascript(url, scripts)
            }
        }
    }

    @Suppress("DEPRECATION")
    private fun CefBrowser.registerPageStartJavascript(url: String, scripts: List<String>) {
        val interfaceSource = javascriptInterfaces.keys.joinToString("\n") { name ->
            val encodedName = JsonPrimitive(name).toString()
            """
            window[$encodedName] = {
                post: function(message) {
                    window[${JsonPrimitive(interfaceQueryFunction)}]({
                        request: JSON.stringify({name: $encodedName, message: String(message)})
                    });
                }
            };
            """.trimIndent()
        }
        val source = (listOf(interfaceSource) + scripts).joinToString("\n")
        val devTools = requireNotNull(getDevToolsClient()) { "JCEF DevTools client is unavailable" }
        devToolsClients[this] = devTools
        devTools.executeDevToolsMethod("Page.enable")
            .thenCompose {
                devTools.executeDevToolsMethod(
                    "Page.addScriptToEvaluateOnNewDocument",
                    Json.encodeToString(mapOf("source" to source)),
                )
            }
            .whenComplete { _, error ->
                if (error == null) {
                    callbackScope.launch {
                        ensureMainLooperBoundToCurrentThread()
                        loadURL(url)
                    }
                } else {
                    dispatchWebViewCallback { view, client ->
                        client.onReceivedError(
                            view,
                            WebViewClient.ERROR_UNKNOWN,
                            "Could not register page-start JavaScript: ${error.message}",
                            url,
                        )
                    }
                }
            }
    }

    private fun ensureMainLooperBoundToCurrentThread() {
        if (android.os.Looper.myLooper() == null) android.os.Looper.prepare()
        if (android.os.Looper.myLooper() !== android.os.Looper.getMainLooper()) {
            android.os.Looper.setMainLooperForTest(android.os.Looper.myLooper()!!)
        }
    }

    private fun injectJavascriptInterfaces(browser: CefBrowser) {
        javascriptInterfaces.keys.forEach { name ->
            val encodedName = JsonPrimitive(name).toString()
            browser.executeJavaScript(
                """
                window[$encodedName] = {
                    post: function(message) {
                        window[${JsonPrimitive(interfaceQueryFunction)}]({
                            request: JSON.stringify({name: $encodedName, message: String(message)})
                        });
                    }
                };
                """.trimIndent(),
                "about:blank",
                0,
            )
        }
    }

    private data class JavascriptInterface(val target: Any, val post: Method)

    private data class DataPage(val url: String, val data: String, val mimeType: String, val encoding: String)

    private class CefWebResourceRequest(
        private val request: CefRequest,
        private val redirect: Boolean,
    ) : WebResourceRequest {
        override fun getUrl() = android.net.Uri.parse(request.url)

        override fun isForMainFrame() = request.resourceType == CefRequest.ResourceType.RT_MAIN_FRAME

        override fun isRedirect() = redirect

        override fun hasGesture() = false

        override fun getMethod(): String = request.method

        override fun getRequestHeaders(): Map<String, String> = buildMap { request.getHeaderMap(this) }
    }

    private class DataResourceHandler(page: DataPage) : CefResourceHandlerAdapter() {
        private val body = page.data.toByteArray(Charset.forName(page.encoding))
        private val mimeType = page.mimeType
        private var offset = 0

        override fun processRequest(request: CefRequest, callback: CefCallback): Boolean {
            callback.Continue()
            return true
        }

        override fun getResponseHeaders(response: CefResponse, responseLength: IntRef, redirectUrl: StringRef) {
            response.status = 200
            response.statusText = "OK"
            response.mimeType = mimeType
            responseLength.set(body.size)
        }

        override fun readResponse(dataOut: ByteArray, bytesToRead: Int, bytesRead: IntRef, callback: CefCallback): Boolean {
            val count = minOf(bytesToRead, body.size - offset)
            if (count == 0) return false
            body.copyInto(dataOut, startIndex = offset, endIndex = offset + count)
            offset += count
            bytesRead.set(count)
            return true
        }
    }

    private class WebResponseResourceHandler(private val webResponse: WebResourceResponse) : CefResourceHandlerAdapter() {
        private val data = webResponse.data
        private val closed = AtomicBoolean()

        override fun processRequest(request: CefRequest, callback: CefCallback): Boolean {
            callback.Continue()
            return true
        }

        override fun getResponseHeaders(response: CefResponse, responseLength: IntRef, redirectUrl: StringRef) {
            response.status = webResponse.statusCode
            response.statusText = webResponse.reasonPhrase
            response.mimeType = buildString {
                append(webResponse.mimeType)
                webResponse.encoding?.let { append("; charset=").append(it) }
            }
            webResponse.responseHeaders?.forEach { (name, value) -> response.setHeaderByName(name, value, true) }
            if (webResponse.responseHeaders?.keys?.none { it.equals("Content-Type", ignoreCase = true) } != false) {
                val contentType = buildString {
                    append(webResponse.mimeType)
                    webResponse.encoding?.let { append("; charset=").append(it) }
                }
                response.setHeaderByName("Content-Type", contentType, true)
            }
            responseLength.set(-1)
        }

        override fun readResponse(
            dataOut: ByteArray,
            bytesToRead: Int,
            bytesRead: IntRef,
            callback: CefCallback,
        ): Boolean {
            val count = data?.read(dataOut, 0, bytesToRead) ?: -1
            if (count <= 0) {
                closeData()
                return false
            }
            bytesRead.set(count)
            return true
        }

        override fun cancel() = closeData()

        private fun closeData() {
            if (closed.compareAndSet(false, true)) data?.close()
        }
    }
}

private class JcefCookieSynchronizer {
    private val javaCookieManager = CookieHandler.getDefault() as java.net.CookieManager
    private val okHttpCookieJar: MemoryCookieJar? = runCatching { Injekt.get<NetworkHelper>().cookieManager }.getOrNull()
    private var imported = false
    private var exported = false

    fun importCookies() {
        if (imported) return
        imported = true
        val manager = CefCookieManager.getGlobalManager()
        javaCookieManager.cookieStore.cookies.forEach { cookie ->
            cookie.origin()?.let { manager.setCookie(it, cookie.toCefCookie()) }
        }
        okHttpCookieJar?.getStoredCookies()?.forEach { cookie ->
            manager.setCookie(cookie.origin(), cookie.toCefCookie())
        }
    }

    fun exportCookies() {
        if (exported) return
        exported = true
        val manager = CefCookieManager.getGlobalManager()
        manager.visitAllCookies { cookie, _, _, _ ->
            cookie.saveTo(javaCookieManager, okHttpCookieJar)
            true
        }
        val completed = CountDownLatch(1)
        manager.flushStore(CefCompletionCallback { completed.countDown() })
        check(completed.await(5, TimeUnit.SECONDS)) { "Timed out synchronizing browser cookies" }
    }

    private fun HttpCookie.origin(): String? {
        val host = domain?.removePrefix(".")
            ?: javaCookieManager.cookieStore.urIs.firstOrNull { this in javaCookieManager.cookieStore.get(it) }?.host
            ?: return null
        return "${if (secure) "https" else "http"}://$host"
    }

    private fun HttpCookie.toCefCookie(): CefCookie {
        val now = Date()
        val hasExpires = maxAge >= 0
        val expires = if (hasExpires) Date(now.time + TimeUnit.SECONDS.toMillis(maxAge)) else Date(0)
        return CefCookie(name, value, domain ?: "", path ?: "/", secure, isHttpOnly, now, now, hasExpires, expires)
    }

    private fun Cookie.origin(): String = "${if (secure) "https" else "http"}://$domain"

    private fun Cookie.toCefCookie(): CefCookie {
        val now = Date()
        val hasExpires = persistent
        return CefCookie(name, value, domain, path, secure, httpOnly, now, now, hasExpires, Date(expiresAt))
    }

    private fun CefCookie.saveTo(javaCookieManager: java.net.CookieManager, okHttpCookieJar: MemoryCookieJar?) {
        val host = domain.removePrefix(".")
        val scheme = if (secure) "https" else "http"
        val uri = URI("$scheme://$host")
        val javaCookie = HttpCookie(name, value).apply {
            domain = this@saveTo.domain
            path = this@saveTo.path.ifEmpty { "/" }
            secure = this@saveTo.secure
            isHttpOnly = httponly
            if (hasExpires) maxAge = ((expires.time - System.currentTimeMillis()) / 1000).coerceAtLeast(0)
        }
        javaCookieManager.cookieStore.add(uri, javaCookie)

        val builder = Cookie.Builder()
            .name(name)
            .value(value)
            .path(path.ifEmpty { "/" })
            .apply {
                if (domain.startsWith('.')) domain(host) else hostOnlyDomain(host)
                if (hasExpires) expiresAt(expires.time)
                if (secure) secure()
                if (httponly) httpOnly()
            }
        okHttpCookieJar?.saveFromResponse(HttpUrl.Builder().scheme(scheme).host(host).build(), listOf(builder.build()))
    }
}
