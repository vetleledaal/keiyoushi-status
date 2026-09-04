package android.webkit;

import android.annotation.Nullable;
import android.annotation.SystemApi;
import android.net.WebAddress;
import xyz.nulldev.androidcompat.webkit.CookieManagerImpl;

public abstract class CookieManager {

    @Deprecated
    public CookieManager() {}
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("doesn't implement Cloneable");
    }

    private static CookieManager INSTANCE = null;
    private static final Object lock = new Object();

    public static CookieManager getInstance() {
        if (INSTANCE != null) {
            return INSTANCE;
        }
        synchronized (lock) {
            if (INSTANCE == null) {
                INSTANCE = new CookieManagerImpl();
            }
            return INSTANCE;
        }
    }

    public abstract void setAcceptCookie(boolean accept);

    public abstract boolean acceptCookie();

    public abstract void setAcceptThirdPartyCookies(WebView webview, boolean accept);

    public abstract boolean acceptThirdPartyCookies(WebView webview);

    public abstract void setCookie(String url, String value);

    public abstract void setCookie(String url, String value, @Nullable ValueCallback<Boolean>
            callback);

    public abstract String getCookie(String url);

    @SystemApi
    public abstract String getCookie(String url, boolean privateBrowsing);

    @SystemApi
    public synchronized String getCookie(WebAddress uri) {
        return getCookie(uri.toString());
    }

    @Deprecated
    public abstract void removeSessionCookie();

    public abstract void removeSessionCookies(@Nullable ValueCallback<Boolean> callback);

    @Deprecated
    public abstract void removeAllCookie();

    public abstract void removeAllCookies(@Nullable ValueCallback<Boolean> callback);

    public abstract boolean hasCookies();

    @SystemApi
    public abstract boolean hasCookies(boolean privateBrowsing);

    @Deprecated
    public abstract void removeExpiredCookie();

    public abstract void flush();

    public static boolean allowFileSchemeCookies() {
        return getInstance().allowFileSchemeCookiesImpl();
    }

    @SystemApi
    protected abstract boolean allowFileSchemeCookiesImpl();

    @Deprecated
    public static void setAcceptFileSchemeCookies(boolean accept) {
        getInstance().setAcceptFileSchemeCookiesImpl(accept);
    }

    @SystemApi
    protected abstract void setAcceptFileSchemeCookiesImpl(boolean accept);
}
