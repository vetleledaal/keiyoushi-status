package dev.vetle.extstats.core

import okhttp3.HttpUrl
import okhttp3.HttpUrl.Companion.toHttpUrl
import okhttp3.HttpUrl.Companion.toHttpUrlOrNull

internal class ReportSanitizer(
    private val mode: RedactionMode,
) {
    private val urlIdentities = linkedMapOf<String, Int>()

    fun text(value: String): String {
        if (mode == RedactionMode.NONE) return value
        return URL
            .replace(value) { match -> url(match.value, "resource") }
            .replace(STRUCTURED_WORKSTATION_FIELD) { match ->
                "<redacted structured workstation field: ${workstationFieldLabel(match.groupValues[1])}>"
            }.replace(AWS_AUTHORIZATION, "<redacted AWS authorization header: credential, signed headers, and signature>")
            .replace(AWS_HEADER) { match ->
                "<redacted AWS header: ${awsHeaderLabel(match.groupValues[1])}>"
            }.replace(SENSITIVE_HEADER) { match ->
                "<redacted credential header: ${sensitiveHeaderLabel(match.groupValues[1])}>"
            }.replace(AUTHORIZATION, "<redacted credential>")
            .replace(EMAIL, "<redacted email address>")
            .replace(HOME_PATH, "<redacted home path>")
    }

    fun url(
        value: String,
        resource: String,
    ): String {
        if (mode == RedactionMode.NONE) return value
        val parsed = parseUrl(value)
        val hasAuthorityCredentials = parsed.httpUrl?.let { it.username.isNotEmpty() || it.password.isNotEmpty() } == true
        val queryNames =
            parsed.httpUrl
                ?.queryParameterNames
                .orEmpty()
                .toList()
        val queryRedaction =
            queryNames
                .takeIf { it.isNotEmpty() }
                ?.let { "<redacted query values: ${labelSummary(it)}>" }
        if (mode == RedactionMode.URLS_AND_SENSITIVE) {
            if (!parsed.absolute && parsed.httpUrl != null) {
                val finalPathSegment = parsed.httpUrl.encodedPathSegments.lastOrNull { it.isNotEmpty() }
                if (finalPathSegment != null) {
                    return listOfNotNull(".../$finalPathSegment", queryRedaction).joinToString(" ")
                }
            }
            if (parsed.absolute && parsed.validWebScheme && parsed.httpUrl != null && !isLocalHost(parsed.httpUrl.host)) {
                val finalPathSegment = parsed.httpUrl.encodedPathSegments.lastOrNull { it.isNotEmpty() }
                val path = finalPathSegment?.let { "/.../$it" }.orEmpty()
                return listOfNotNull("${parsed.httpUrl.scheme}://${parsed.httpUrl.host}$path", queryRedaction).joinToString(" ")
            }
            val identity = urlIdentities.getOrPut(value) { urlIdentities.size + 1 }
            val authoritySuffix = "; authority credentials".takeIf { hasAuthorityCredentials }.orEmpty()
            val localSuffix = "; workstation or local network".takeIf { isLocalHost(parsed.httpUrl?.host) }.orEmpty()
            val querySuffix =
                queryNames
                    .takeIf { it.isNotEmpty() }
                    ?.let { "; query parameters: ${labelSummary(it)}" }
                    .orEmpty()
            return "<redacted URL #$identity: $resource; ${urlClassification(
                parsed,
            )}${urlLocation(parsed)}$authoritySuffix$localSuffix$querySuffix>"
        }
        if (isLocalHost(parsed.httpUrl?.host)) return "<redacted local URL: workstation or local network>"
        if (queryNames.isEmpty() && !hasAuthorityCredentials) return value
        val httpUrl = parsed.httpUrl ?: return "<redacted malformed URL: sensitive content>"
        if (!parsed.validWebScheme) return "<redacted URL: invalid web scheme; sensitive content>"
        val base =
            httpUrl
                .newBuilder()
                .username("")
                .password("")
                .query(null)
                .build()
                .toString()
        val redactions =
            buildList {
                if (hasAuthorityCredentials) add("<redacted URL authority credentials>")
                queryRedaction?.let(::add)
            }
        return "$base ${redactions.joinToString("; ")}"
    }

    private fun isLocalHost(host: String?): Boolean {
        val normalized = host?.lowercase()?.removeSurrounding("[", "]") ?: return false
        if (normalized == "localhost" || normalized.endsWith(".localhost") || normalized.endsWith(".local")) return true
        if (normalized == "::1" || normalized.startsWith("fc") || normalized.startsWith("fd")) return true
        if (normalized.take(3) in setOf("fe8", "fe9", "fea", "feb")) return true
        val octets = normalized.split('.').mapNotNull(String::toIntOrNull)
        if (octets.size == 4 && octets.all { it in 0..255 }) {
            return octets[0] == 10 || octets[0] == 127 ||
                (octets[0] == 169 && octets[1] == 254) ||
                (octets[0] == 172 && octets[1] in 16..31) ||
                (octets[0] == 192 && octets[1] == 168)
        }
        return '.' !in normalized && ':' !in normalized
    }

    private fun parseUrl(value: String): ParsedUrl {
        val scheme =
            SCHEME
                .find(value)
                ?.groupValues
                ?.get(1)
                ?.lowercase()
        val validWebScheme = scheme == "http" || scheme == "https"
        val candidate =
            when {
                validWebScheme -> value
                scheme != null -> value.replaceRange(0, scheme.length, "https")
                else -> value
            }
        val httpUrl = if (scheme == null) RELATIVE_BASE.resolve(candidate) else candidate.toHttpUrlOrNull()
        return ParsedUrl(httpUrl, scheme != null, validWebScheme)
    }

    private fun urlClassification(parsed: ParsedUrl): String = when {
        parsed.absolute && parsed.validWebScheme && parsed.httpUrl != null -> "absolute; valid web scheme"
        parsed.absolute && parsed.validWebScheme -> "malformed; absolute; valid web scheme"
        parsed.absolute -> "absolute; invalid web scheme"
        parsed.httpUrl != null -> "relative; no scheme"
        else -> "malformed; relative; no scheme"
    }

    private fun urlLocation(parsed: ParsedUrl): String {
        val httpUrl = parsed.httpUrl ?: return ""
        if (isLocalHost(httpUrl.host)) return ""
        val host =
            httpUrl.host
                .takeIf { parsed.absolute }
                ?.let { "; host $it" }
                .orEmpty()
        val finalPathSegment =
            httpUrl.encodedPathSegments
                .lastOrNull { it.isNotEmpty() }
                ?.let { "; final path segment $it" }
                .orEmpty()
        return host + finalPathSegment
    }

    private fun labelSummary(labels: List<String>): String = when (labels.size) {
        0 -> ""
        1 -> labels.single()
        2 -> labels.joinToString(" and ")
        else -> labels.dropLast(1).joinToString(", ") + ", and " + labels.last()
    }

    private fun awsHeaderLabel(name: String): String = AWS_HEADER_LABELS[name.lowercase()] ?: "signing metadata"

    private fun sensitiveHeaderLabel(name: String): String = SENSITIVE_HEADER_LABELS.getValue(name.lowercase())

    private fun workstationFieldLabel(name: String): String = when {
        name.contains("home", ignoreCase = true) -> "user home"
        name.startsWith("user", ignoreCase = true) -> "user name"
        name.startsWith("machine", ignoreCase = true) -> "machine name"
        else -> "host name"
    }

    companion object {
        private data class ParsedUrl(
            val httpUrl: HttpUrl?,
            val absolute: Boolean,
            val validWebScheme: Boolean,
        )

        private val RELATIVE_BASE = "https://relative.invalid/".toHttpUrl()
        private val SCHEME = Regex("^([A-Za-z][A-Za-z0-9+.-]*):")
        private val URL =
            Regex(
                "https?://(?:[^\\s()`|]+|\\([^\\s()`|]*\\))+|" +
                    "(?<![A-Za-z0-9:/])/(?!home/|Users/)(?:[^\\s()`|]+|\\([^\\s()`|]*\\))+",
            )
        private val STRUCTURED_WORKSTATION_FIELD =
            Regex(
                "(?im)\\b(user[._ -]name|user[._ -]home|home[._ -]directory|" +
                    "machine[._ -]name|host(?:[._ -]name|name))\\s*[:=]\\s*[^\\r\\n|]*",
            )
        private val AWS_AUTHORIZATION = Regex("(?i)\\bauthorization\\s*:\\s*AWS4-[^\\r\\n|]*")
        private val AWS_HEADER = Regex("(?i)\\b(x-amz-[a-z0-9-]+)\\s*:\\s*[^\\r\\n|]*")
        private val SENSITIVE_HEADER_LABELS =
            mapOf(
                "authorization" to "authorization",
                "proxy-authorization" to "authorization",
                "cookie" to "cookie",
                "set-cookie" to "cookie",
                "x-api-key" to "API key",
                "api-key" to "API key",
                "password" to "password",
                "x-password" to "password",
                "secret" to "secret",
                "client-secret" to "secret",
                "x-client-secret" to "secret",
                "session" to "session",
                "session-id" to "session",
                "x-session-id" to "session",
                "signature" to "signature",
                "x-signature" to "signature",
                "x-auth-token" to "token",
                "x-access-token" to "token",
                "x-session-token" to "session token",
                "token" to "token",
                "x-token" to "token",
            )
        private val SENSITIVE_HEADER =
            Regex(
                "(?i)\\b(${SENSITIVE_HEADER_LABELS.keys.joinToString("|") { Regex.escape(it) }})\\s*:\\s*[^\\r\\n|]*",
            )
        private val AUTHORIZATION = Regex("(?i)(?:authorization\\s*:\\s*(?:bearer\\s+)?|bearer\\s+)[^\\s|]+")
        private val EMAIL = Regex("(?i)\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,}\\b")
        private val HOME_PATH = Regex("(?i)(?<![A-Za-z0-9_])(?:[A-Z]:\\\\Users\\\\[^\\s|)]+|/(?:home|Users)/[^\\s|)]+)")
        private val AWS_HEADER_LABELS =
            mapOf(
                "x-amz-credential" to "temporary credential",
                "x-amz-security-token" to "session token",
                "x-amz-signature" to "signature",
                "x-amz-date" to "signing timestamp",
                "x-amz-expires" to "expiry",
            )
    }
}
