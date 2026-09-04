package dev.vetle.extstats.runtime

import org.w3c.dom.Element
import java.io.InputStream
import java.nio.file.Path
import java.util.zip.ZipFile
import javax.xml.XMLConstants
import javax.xml.parsers.DocumentBuilderFactory

data class ExtensionManifest(
    val packageName: String,
    val versionName: String?,
    val versionCode: Int?,
    val extensionClass: String?,
    val extensionLibraryVersion: String?,
    val usesFeatures: List<String>,
    val metadata: Map<String, String>,
)

object AndroidManifestParser {
    private const val ANDROID_NAMESPACE = "http://schemas.android.com/apk/res/android"
    private const val MANIFEST_PATH = "AndroidManifest.xml"

    fun parse(jar: Path): ExtensionManifest = ZipFile(jar.toFile()).use { zip ->
        val entry = requireNotNull(zip.getEntry(MANIFEST_PATH)) {
            "$jar does not contain $MANIFEST_PATH"
        }
        zip.getInputStream(entry).use(::parse)
    }

    private fun parse(input: InputStream): ExtensionManifest {
        val factory =
            DocumentBuilderFactory.newInstance().apply {
                isNamespaceAware = true
                setFeature("http://apache.org/xml/features/disallow-doctype-decl", true)
                setFeature("http://xml.org/sax/features/external-general-entities", false)
                setFeature("http://xml.org/sax/features/external-parameter-entities", false)
                setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "")
                setAttribute(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "")
            }
        val manifest = factory.newDocumentBuilder().parse(input).documentElement
        val metadata = mutableMapOf<String, String>()
        manifest.elements("meta-data").forEach {
            val name = requiredValue("meta-data name", it.androidAttribute("name"))
            val value = requireNotNull(it.androidAttribute("value"))
            require(metadata.put(name, value) == null) { "Duplicate manifest meta-data: $name" }
        }

        return ExtensionManifest(
            packageName = requiredValue("package", manifest.getAttribute("package")),
            versionName = requiredValue("versionName", manifest.androidAttribute("versionName")),
            versionCode = requiredValue("versionCode", manifest.androidAttribute("versionCode")).toIntOrNull(),
            extensionClass = requiredValue("tachiyomi.extension.class", metadata["tachiyomi.extension.class"]),
            extensionLibraryVersion = requiredValue("tachiyomix.extensionLib", metadata["tachiyomix.extensionLib"]),
            usesFeatures = manifest.elements("uses-feature").mapNotNull { it.androidAttribute("name") },
            metadata = metadata,
        )
    }

    private fun requiredValue(name: String, value: String?): String {
        require(!value.isNullOrBlank()) { "Manifest $name must not be blank" }
        return value
    }

    private fun Element.androidAttribute(name: String): String? = getAttributeNS(ANDROID_NAMESPACE, name).ifEmpty { null }

    private fun Element.elements(tagName: String): List<Element> {
        val nodes = getElementsByTagName(tagName)
        return (0 until nodes.length).map { nodes.item(it) as Element }
    }
}
