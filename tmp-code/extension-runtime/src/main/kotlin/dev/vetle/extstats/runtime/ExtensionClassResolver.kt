package dev.vetle.extstats.runtime

private const val EXTENSION_CLASS_METADATA = "tachiyomi.extension.class"

fun ExtensionManifest.resolveSourceClassName(): String {
    val declaredName = requireNotNull(metadata[EXTENSION_CLASS_METADATA]) {
        "Missing $EXTENSION_CLASS_METADATA metadata"
    }
    return when {
        declaredName.startsWith(".") -> packageName + declaredName
        '.' !in declaredName -> "$packageName.$declaredName"
        else -> declaredName
    }
}
