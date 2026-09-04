package dev.vetle.extstats.runtime

import android.webkit.ValueCallback
import android.webkit.WebView
import android.webkit.WebViewClient

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

    fun removeJavascriptInterface(name: String)

    fun setWebViewClient(webView: WebView, client: WebViewClient)

    fun stopLoading()

    fun destroy()
}
