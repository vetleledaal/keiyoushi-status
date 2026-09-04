package dev.vetle.extstats.runtime

import com.jetbrains.cef.JCefAppConfig
import com.sun.net.httpserver.HttpServer
import org.cef.CefApp
import org.cef.CefClient
import org.cef.SystemBootstrap
import org.cef.browser.CefBrowser
import org.cef.browser.CefFrame
import org.cef.browser.CefMessageRouter
import org.cef.browser.CefRendering
import org.cef.callback.CefCallback
import org.cef.callback.CefQueryCallback
import org.cef.handler.CefDisplayHandlerAdapter
import org.cef.handler.CefMessageRouterHandlerAdapter
import org.cef.handler.CefRenderHandlerAdapter
import org.cef.handler.CefRequestHandlerAdapter
import org.cef.handler.CefResourceHandler
import org.cef.handler.CefResourceHandlerAdapter
import org.cef.handler.CefResourceRequestHandler
import org.cef.handler.CefResourceRequestHandlerAdapter
import org.cef.misc.IntRef
import org.cef.misc.StringRef
import org.cef.network.CefRequest
import org.cef.network.CefResponse
import java.net.InetSocketAddress
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Path
import java.security.MessageDigest
import java.util.Collections
import java.util.HexFormat
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit

object JcefBrowserFixtureMain {
    private const val CUSTOM_HEADER = "X-Fixture-Header"
    private const val CUSTOM_HEADER_VALUE = "fixture-value"
    private const val USER_AGENT = "ExtStats-JCEF-Fixture"
    private const val REPLACEMENT_MANIFEST = "intercepted-manifest"

    @JvmStatic
    fun main(args: Array<String>) {
        check(Runtime.version().feature() == 21) { "JCEF fixture requires JDK 21" }
        val nativeCefDir = Path.of(checkNotNull(System.getProperty("nativeCefDir")))
        verifyNativeCef(nativeCefDir)
        val receivedHeaders = Collections.synchronizedMap(mutableMapOf<String, String?>())
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0).apply {
            createContext("/") { exchange ->
                if (exchange.requestURI.path == "/") {
                    receivedHeaders[CUSTOM_HEADER] = exchange.requestHeaders.getFirst(CUSTOM_HEADER)
                    receivedHeaders["User-Agent"] = exchange.requestHeaders.getFirst("User-Agent")
                }
                val body = """
                    <!doctype html><html><body><script>
                    localStorage.setItem('fixture-key', 'stored-value');
                    fetch('/manifest').then(response => response.text()).then(manifest => {
                        window.fixtureQuery({request: [localStorage.getItem('fixture-key'), manifest].join('|')});
                    });
                    </script></body></html>
                """.trimIndent().toByteArray(StandardCharsets.UTF_8)
                exchange.responseHeaders.add("Content-Type", "text/html; charset=utf-8")
                exchange.sendResponseHeaders(200, body.size.toLong())
                exchange.responseBody.use { it.write(body) }
            }
            createContext("/manifest") { exchange ->
                error("Manifest request unexpectedly reached the HTTP server: ${exchange.requestURI}")
            }
            start()
        }
        System.loadLibrary("jawt")
        val config = JCefAppConfig.getInstance(nativeCefDir.toString(), false).apply {
            appArgsAsList.addAll(
                listOf(
                    "--disable-gpu",
                    "--off-screen-rendering-enabled",
                    "--disable-dev-shm-usage",
                    "--change-stack-guard-on-fork=disable",
                ),
            )
            cefSettings.windowless_rendering_enabled = true
        }

        config.loader.loadLibrary("cef")
        config.loader.loadLibrary("jcef")
        CefApp.setIsRemoteEnabled(config.isRemoteEnabled)
        SystemBootstrap.setLoader(config.loader)
        check(CefApp.startup(config.appArgs)) { "CEF startup failed" }

        val app = CefApp.getInstance(config.appArgs, config.cefSettings, config.serverExe)
        var client: CefClient? = null
        var browser: CefBrowser? = null
        val clientDisposed = CountDownLatch(1)
        try {
            val result = CountDownLatch(1)
            var callbackPayload: String? = null
            client = app.createClient().apply {
                setOnDisposeCallback(clientDisposed::countDown)
                addDisplayHandler(
                    object : CefDisplayHandlerAdapter() {
                        override fun onTitleChange(browser: CefBrowser, title: String) {
                            check(title != "fixture-failed") { "Browser fixture JavaScript failed" }
                        }
                    },
                )
                addMessageRouter(
                    CefMessageRouter.create(
                        CefMessageRouter.CefMessageRouterConfig("fixtureQuery", "fixtureQueryCancel"),
                        object : CefMessageRouterHandlerAdapter() {
                            override fun onQuery(
                                browser: CefBrowser,
                                frame: CefFrame,
                                queryId: Long,
                                request: String,
                                persistent: Boolean,
                                callback: CefQueryCallback,
                            ): Boolean {
                                callbackPayload = request
                                callback.success("received")
                                result.countDown()
                                return true
                            }
                        },
                    ),
                )
                addRequestHandler(
                    object : CefRequestHandlerAdapter() {
                        private val resourceHandler = object : CefResourceRequestHandlerAdapter() {
                            override fun onBeforeResourceLoad(
                                browser: CefBrowser,
                                frame: CefFrame,
                                request: CefRequest,
                            ): Boolean {
                                if (request.resourceType == CefRequest.ResourceType.RT_MAIN_FRAME) {
                                    request.setHeaderByName(CUSTOM_HEADER, CUSTOM_HEADER_VALUE, true)
                                    request.setHeaderByName("User-Agent", USER_AGENT, true)
                                }
                                return false
                            }

                            override fun getResourceHandler(
                                browser: CefBrowser,
                                frame: CefFrame,
                                request: CefRequest,
                            ): CefResourceHandler? = if (request.url.endsWith("/manifest")) ByteArrayResourceHandler(REPLACEMENT_MANIFEST) else null
                        }

                        override fun getResourceRequestHandler(
                            browser: CefBrowser,
                            frame: CefFrame,
                            request: CefRequest,
                            isNavigation: Boolean,
                            isDownload: Boolean,
                            requestInitiator: String,
                            disableDefaultHandling: org.cef.misc.BoolRef,
                        ): CefResourceRequestHandler = resourceHandler
                    },
                )
            }
            val rendering = CefRendering.CefRenderingWithHandler(object : CefRenderHandlerAdapter() {}, null)
            browser = client.createBrowser(
                "http://127.0.0.1:${server.address.port}/",
                rendering,
                false,
            )
            browser.createImmediately()
            check(result.await(20, TimeUnit.SECONDS)) { "Timed out waiting for browser callback" }
            check(receivedHeaders[CUSTOM_HEADER] == CUSTOM_HEADER_VALUE) { "Custom request header was not received" }
            check(receivedHeaders["User-Agent"] == USER_AGENT) { "Configured user agent was not received" }
            check(callbackPayload == "stored-value|$REPLACEMENT_MANIFEST") { "Unexpected callback payload: $callbackPayload" }
            println("JCEF_HTTP_FIXTURE_OK")
        } finally {
            browser?.setCloseAllowed()
            client?.dispose()
            check(clientDisposed.await(5, TimeUnit.SECONDS)) { "Timed out waiting for JCEF client shutdown" }
            app.dispose()
            server.stop(0)
        }
    }

    private fun verifyNativeCef(directory: Path) {
        check(Files.isDirectory(directory)) { "Native CEF directory is missing: $directory" }
        mapOf(
            "libjcef.so" to checkNotNull(System.getProperty("nativeCefLibjcefSha256")),
            "libcef.so" to checkNotNull(System.getProperty("nativeCefLibcefSha256")),
        ).forEach { (name, expectedSha256) ->
            val library = directory.resolve(name)
            check(Files.isRegularFile(library)) { "Native CEF library is missing: $library" }
            val digest = MessageDigest.getInstance("SHA-256")
            Files.newInputStream(library).use { input ->
                val buffer = ByteArray(DEFAULT_BUFFER_SIZE)
                while (true) {
                    val count = input.read(buffer)
                    if (count < 0) break
                    digest.update(buffer, 0, count)
                }
            }
            val actualSha256 = HexFormat.of().formatHex(digest.digest())
            check(actualSha256 == expectedSha256) {
                "Native CEF checksum mismatch for $library: expected $expectedSha256, found $actualSha256"
            }
        }
    }

    private class ByteArrayResourceHandler(body: String) : CefResourceHandlerAdapter() {
        private val body = body.toByteArray(StandardCharsets.UTF_8)
        private var offset = 0

        override fun processRequest(request: CefRequest, callback: CefCallback): Boolean {
            callback.Continue()
            return true
        }

        override fun getResponseHeaders(response: CefResponse, responseLength: IntRef, redirectUrl: StringRef) {
            response.status = 200
            response.statusText = "OK"
            response.mimeType = "text/plain"
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
}
