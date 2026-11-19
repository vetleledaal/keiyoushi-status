package dev.vetle.extstats.runtime

import android.webkit.ValueCallback
import android.webkit.WebView
import android.webkit.WebViewClient
import android.webkit.WebViewProvider
import xyz.nulldev.androidcompat.webkit.KcefWebSettings
import java.lang.reflect.InvocationHandler

internal class RuntimeWebViewProvider(
    val webView: WebView,
    private val session: RuntimeWebViewSession = JcefWebViewSession(),
) : WebViewProvider {
    private val settings = KcefWebSettings()

    override fun getSettings() = settings

    override fun loadUrl(url: String, additionalHttpHeaders: Map<String, String>) {
        session.loadUrl(url, additionalHttpHeaders, settings.userAgentString)
    }

    override fun loadDataWithBaseURL(
        baseUrl: String?,
        data: String,
        mimeType: String?,
        encoding: String?,
        historyUrl: String?,
    ) {
        session.loadDataWithBaseURL(baseUrl, data, mimeType, encoding, historyUrl, settings.userAgentString)
    }

    override fun evaluateJavaScript(script: String, resultCallback: ValueCallback<String>?) {
        session.evaluateJavascript(script.removePrefix("javascript:"), resultCallback)
    }

    override fun addJavascriptInterface(object_: Any, name: String) = session.addJavascriptInterface(object_, name)

    override fun removeJavascriptInterface(name: String) = session.removeJavascriptInterface(name)

    override fun setWebViewClient(client: WebViewClient) = session.setWebViewClient(webView, client)

    override fun stopLoading() = session.stopLoading()

    override fun destroy() = session.destroy()

    fun addWebMessageListener(
        name: String,
        allowedOriginRules: Array<String>,
        listener: InvocationHandler,
        worldName: String,
    ) = session.addWebMessageListener(name, allowedOriginRules, listener, worldName)

    fun removeWebMessageListener(name: String, worldName: String) = session.removeWebMessageListener(name, worldName)

    fun addJavaScriptOnEvent(script: String, allowedOriginRules: Array<String>, worldName: String) =
        session.addJavaScriptOnEvent(script, allowedOriginRules, worldName)
}
