package org.chromium.support_lib_glue;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public final class SupportLibReflectionUtil {
    private static final String[] SUPPORTED_FEATURES = {
        "USER_AGENT_METADATA",
        "WEB_MESSAGE_LISTENER",
        "WEB_MESSAGE_ARRAY_BUFFER",
        "JS_INJECTION_IN_FRAME_AND_WORLD",
    };

    private SupportLibReflectionUtil() {
    }

    public static InvocationHandler createWebViewProviderFactory() {
        return handler(
            (proxy, method, args) -> switch (method.getName()) {
                case "getSupportedFeatures" -> SUPPORTED_FEATURES.clone();
                case "createWebView" -> createProvider((android.webkit.WebView) args[0]);
                case "getWebkitToCompatConverter" -> handler((ignored, converterMethod, converterArgs) ->
                        converterMethod.getName().equals("convertSettings")
                            ? createSettings((android.webkit.WebSettings) converterArgs[0])
                            : converterArgs == null ? null : converterArgs[0]);
                case "toString" -> "SupportLibWebViewChromiumFactory";
                case "hashCode" -> System.identityHashCode(proxy);
                case "equals" -> proxy == args[0];
                default -> throw unsupported(method);
            }
        );
    }

    private static InvocationHandler createProvider(android.webkit.WebView webView) {
        return handler(
            (proxy, method, args) -> switch (method.getName()) {
                case "getJavaScriptWorld" -> args[0].hashCode();
                case "addWebMessageListener" -> {
                    invokeProvider(
                        webView,
                        "addWebMessageListener",
                        new Class<?>[] { String.class, String[].class, InvocationHandler.class, String.class },
                        args[0],
                        args[1],
                        args[2],
                        args.length > 3 ? args[3] : ""
                    );
                    yield null;
                }
                case "removeWebMessageListener" -> {
                    invokeProvider(
                        webView,
                        "removeWebMessageListener",
                        new Class<?>[] { String.class, String.class },
                        args[0],
                        args.length > 1 ? args[1] : ""
                    );
                    yield null;
                }
                case "addJavaScriptOnEvent" -> invokeScriptHandle(
                    webView,
                    (String) args[0],
                    (String[]) args[1],
                    args.length > 3 ? (String) args[3] : ""
                );
                case "toString" -> "WebViewProvider(" + webView + ")";
                case "hashCode" -> System.identityHashCode(proxy);
                case "equals" -> proxy == args[0];
                default -> throw unsupported(method);
            }
        );
    }

    private static InvocationHandler invokeScriptHandle(
        android.webkit.WebView webView,
        String script,
        String[] origins,
        String world
    ) {
        invokeProvider(
            webView,
            "addJavaScriptOnEvent",
            new Class<?>[] { String.class, String[].class, String.class },
            script,
            origins,
            world
        );
        return handler((proxy, method, args) -> switch (method.getName()) {
            case "remove" -> null;
            case "toString" -> "ScriptHandle";
            case "hashCode" -> System.identityHashCode(proxy);
            case "equals" -> proxy == args[0];
            default -> throw unsupported(method);
        });
    }

    private static InvocationHandler createSettings(android.webkit.WebSettings settings) {
        return handler((proxy, method, args) -> switch (method.getName()) {
            case "setUserAgentMetadataFromMap" -> null;
            case "getUserAgentMetadataMap" -> java.util.Collections.emptyMap();
            case "toString" -> "WebSettingsBoundary(" + settings + ")";
            case "hashCode" -> System.identityHashCode(proxy);
            case "equals" -> proxy == args[0];
            default -> defaultValue(method.getReturnType());
        });
    }

    private static Object defaultValue(Class<?> type) {
        if (type == boolean.class) return false;
        if (type == byte.class) return (byte) 0;
        if (type == short.class) return (short) 0;
        if (type == int.class) return 0;
        if (type == long.class) return 0L;
        if (type == float.class) return 0f;
        if (type == double.class) return 0d;
        if (type == char.class) return '\0';
        return null;
    }

    private static void invokeProvider(
        android.webkit.WebView webView,
        String name,
        Class<?>[] parameterTypes,
        Object... args
    ) {
        try {
            webView.getProvider().getClass().getMethod(name, parameterTypes).invoke(
                webView.getProvider(),
                args
            );
        } catch (ReflectiveOperationException exception) {
            throw new IllegalStateException("Could not invoke WebView provider method " + name, exception);
        }
    }

    private static InvocationHandler handler(InvocationHandler delegate) {
        return delegate;
    }

    private static UnsupportedOperationException unsupported(Method method) {
        return new UnsupportedOperationException("Unsupported WebView boundary method: " + method);
    }
}
