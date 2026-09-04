/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.webkit;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AbsoluteLayout;

import java.util.Collections;
import java.util.Map;

public class WebView extends AbsoluteLayout {
    private static WebViewProvider.Factory providerFactory;

    private final WebViewProvider provider;

    public static void setProviderFactory(WebViewProvider.Factory factory) {
        providerFactory = factory;
    }

    public WebViewProvider getProvider() {
        return provider;
    }

    public WebSettings getSettings() {
        return provider.getSettings();
    }

    public void loadUrl(String url, Map<String, String> additionalHttpHeaders) {
        provider.loadUrl(url, additionalHttpHeaders);
    }

    public void loadUrl(String url) {
        loadUrl(url, Collections.emptyMap());
    }

    public void loadDataWithBaseURL(
            String baseUrl,
            String data,
            String mimeType,
            String encoding,
            String historyUrl
    ) {
        provider.loadDataWithBaseURL(baseUrl, data, mimeType, encoding, historyUrl);
    }

    public void evaluateJavascript(String script, ValueCallback<String> resultCallback) {
        provider.evaluateJavaScript(script, resultCallback);
    }

    public void addJavascriptInterface(Object object, String name) {
        provider.addJavascriptInterface(object, name);
    }

    public void removeJavascriptInterface(String name) {
        provider.removeJavascriptInterface(name);
    }

    public void setWebViewClient(WebViewClient client) {
        provider.setWebViewClient(client);
    }

    public void setWebChromeClient(WebChromeClient client) {
    }

    public void stopLoading() {
        provider.stopLoading();
    }

    public void destroy() {
        provider.destroy();
    }

    public WebView(Context context) {
        this(context, null);
    }

    public WebView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public WebView(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }

    public WebView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        if (providerFactory == null) {
            throw new IllegalStateException("WebView provider factory is not installed");
        }
        provider = providerFactory.create(this);
    }

    @Deprecated
    public WebView(Context context, AttributeSet attrs, int defStyleAttr, boolean privateBrowsing) {
        this(context, attrs, defStyleAttr, 0);
    }
}
