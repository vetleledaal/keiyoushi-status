package android.webkit;

import java.util.Map;

public interface WebViewProvider {
    interface Factory {
        WebViewProvider create(WebView webView);
    }

    WebSettings getSettings();

    void loadUrl(String url, Map<String, String> additionalHttpHeaders);

    void loadDataWithBaseURL(String baseUrl, String data, String mimeType, String encoding, String historyUrl);

    void evaluateJavaScript(String script, ValueCallback<String> resultCallback);

    void addJavascriptInterface(Object object, String name);

    void removeJavascriptInterface(String name);

    void setWebViewClient(WebViewClient client);

    void stopLoading();

    void destroy();
}
