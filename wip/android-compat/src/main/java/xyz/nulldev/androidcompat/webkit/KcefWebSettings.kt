package xyz.nulldev.androidcompat.webkit

import android.webkit.WebSettings

class KcefWebSettings : WebSettings() {
    private var javaScriptEnabled = true
    private var domStorageEnabled = true
    private var blockNetworkImage = false
    private var loadWithOverviewMode = false
    private var useWideViewPort = true
    private var userAgentString: String? = null

    override fun setJavaScriptEnabled(flag: Boolean) {
        javaScriptEnabled = flag
    }

    override fun getJavaScriptEnabled() = javaScriptEnabled

    override fun setDomStorageEnabled(flag: Boolean) {
        domStorageEnabled = flag
    }

    override fun getDomStorageEnabled() = domStorageEnabled

    override fun setBlockNetworkImage(flag: Boolean) {
        blockNetworkImage = flag
    }

    override fun getBlockNetworkImage() = blockNetworkImage

    override fun setLoadWithOverviewMode(overview: Boolean) {
        loadWithOverviewMode = overview
    }

    override fun getLoadWithOverviewMode() = loadWithOverviewMode

    override fun setUseWideViewPort(use: Boolean) {
        useWideViewPort = use
    }

    override fun getUseWideViewPort() = useWideViewPort

    override fun setUserAgentString(ua: String?) {
        userAgentString = ua
    }

    override fun getUserAgentString() = userAgentString ?: System.getProperty("http.agent")
}
