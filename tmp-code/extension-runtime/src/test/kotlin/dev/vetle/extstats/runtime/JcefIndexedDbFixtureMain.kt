package dev.vetle.extstats.runtime

import android.app.Application
import android.webkit.WebView
import android.webkit.WebViewClient
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import java.nio.charset.StandardCharsets
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import javax.swing.SwingUtilities

object JcefIndexedDbFixtureMain {
    @JvmStatic
    fun main(args: Array<String>) {
        val mode = args[0]
        val port = args[1].toInt()
        val pageFinished = CountDownLatch(1)
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", port), 0).apply {
            createContext("/") { exchange ->
                val body = "<html><body>indexed-db-fixture</body></html>".toByteArray(StandardCharsets.UTF_8)
                exchange.sendResponseHeaders(200, body.size.toLong())
                exchange.responseBody.use { it.write(body) }
            }
            start()
        }
        val initializer = RuntimeInitializer()
        val application = Application()
        initializer.initializeInjekt()
        initializer.registerApplicationContext(application)
        initializer.registerNetworkHelper(application)
        initializer.initializeAndroidCompat()
        val webView = WebView(application)
        try {
            val result = CountDownLatch(1)
            var indexedDbValue: String? = null
            webView.addJavascriptInterface(
                object {
                    fun post(value: String) {
                        indexedDbValue = value
                        result.countDown()
                    }
                },
                "fixtureBridge",
            )
            webView.setWebViewClient(
                object : WebViewClient() {
                    override fun onPageStarted(view: WebView, url: String, favicon: android.graphics.Bitmap?) {
                        view.evaluateJavascript(script(mode), null)
                    }

                    override fun onPageFinished(view: WebView, url: String) {
                        pageFinished.countDown()
                    }
                },
            )
            webView.loadUrl("http://127.0.0.1:${server.address.port}/")
            check(pageFinished.await(20, TimeUnit.SECONDS)) { "Timed out loading IndexedDB fixture" }
            check(result.await(20, TimeUnit.SECONDS)) { "Timed out evaluating IndexedDB fixture" }
            check(indexedDbValue == "fixture-value") { "Unexpected IndexedDB value in $mode mode: $indexedDbValue" }
            SwingUtilities.invokeAndWait {}
            println("JCEF_INDEXED_DB_${mode.uppercase()}_OK")
        } finally {
            webView.destroy()
            RuntimeInitializer.shutdown()
            server.stop(0)
        }
    }

    private fun script(mode: String): String =
        """
        (async () => {
            const db = await new Promise((resolve, reject) => {
                const request = indexedDB.open('fixture-database', 1);
                request.onupgradeneeded = () => request.result.createObjectStore('fixture-store');
                request.onsuccess = () => resolve(request.result);
                request.onerror = () => reject(request.error);
            });
            const transaction = db.transaction('fixture-store', '${if (mode == "write") "readwrite" else "readonly"}');
            const store = transaction.objectStore('fixture-store');
            const request = ${if (mode == "write") "store.put('fixture-value', 'fixture-key')" else "store.get('fixture-key')"};
            const value = await new Promise((resolve, reject) => {
                request.onsuccess = () => resolve(${if (mode == "write") "'fixture-value'" else "request.result"});
                request.onerror = () => reject(request.error);
            });
            await new Promise((resolve, reject) => {
                transaction.oncomplete = resolve;
                transaction.onerror = () => reject(transaction.error);
            });
            db.close();
            window.fixtureBridge.post(String(value));
        })()
        """.trimIndent()
}
