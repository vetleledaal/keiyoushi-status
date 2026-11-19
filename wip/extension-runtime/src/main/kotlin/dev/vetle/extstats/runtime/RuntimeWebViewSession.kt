package dev.vetle.extstats.runtime

import android.webkit.ValueCallback
import android.webkit.WebView
import android.webkit.WebViewClient
import java.lang.reflect.InvocationHandler

internal interface RuntimeWebViewSession {
    fun loadUrl(url: String, additionalHttpHeaders: Map<String, String>, userAgent: String)

    fun loadDataWithBaseURL(
        baseUrl: String?,
        data: String,
        mimeType: String?,
        encoding: String?,
        historyUrl: String?,
        userAgent: String,
    )

    fun evaluateJavascript(script: String, resultCallback: ValueCallback<String>?)

    fun addJavascriptInterface(object_: Any, name: String)

    fun addWebMessageListener(
        name: String,
        allowedOriginRules: Array<String>,
        listener: InvocationHandler,
        worldName: String,
    )

    fun removeWebMessageListener(name: String, worldName: String)

    fun addJavaScriptOnEvent(script: String, allowedOriginRules: Array<String>, worldName: String)

    fun removeJavascriptInterface(name: String)

    fun setWebViewClient(webView: WebView, client: WebViewClient)

    fun stopLoading()

    fun destroy()
}
