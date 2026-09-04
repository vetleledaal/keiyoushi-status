import java.net.URI
import java.security.MessageDigest
import java.util.Base64
import java.util.HexFormat

plugins {
    kotlin("jvm") version "2.4.20-RC3"
    id("com.google.protobuf") version "0.10.0"
    id("com.diffplug.spotless") version "8.10.1"
    application
}

group = "dev.vetle.extstats"
version = "0.1.0"

allprojects {
    repositories {
        mavenCentral()
        google()
        maven("https://jitpack.io")
        maven("https://packages.jetbrains.team/maven/p/ij/intellij-dependencies")
    }
}

// android-compat is vendored/generated code, skip lint there.
listOf(rootProject, project(":extension-runtime")).forEach { proj ->
    proj.apply(plugin = "com.diffplug.spotless")
    proj.configure<com.diffplug.gradle.spotless.SpotlessExtension> {
        kotlin {
            target("src/**/*.kt", "*.kts")
            ktlint().editorConfigOverride(
                mapOf(
                    "ktlint_standard_max-line-length" to "disabled",
                ),
            )
            trimTrailingWhitespace()
            endWithNewline()
        }
    }
}

dependencies {
    implementation(project(":extension-runtime"))
    implementation("com.google.protobuf:protobuf-java:4.36.0")
    implementation("io.github.nemanjastokuca:avif-imageio-native-reader:0.1.0")
    implementation("com.twelvemonkeys.imageio:imageio-jpeg:3.14.0")
    implementation("com.twelvemonkeys.imageio:imageio-webp:3.14.0")
    implementation("com.squareup.okhttp3:okhttp:5.5.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.11.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.11.0")

    testImplementation(kotlin("test"))
}

protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:4.36.0"
    }
}

kotlin {
    jvmToolchain(21)
}

application {
    mainClass.set("dev.vetle.extstats.MainKt")
}

// Pinned by package-name prefix, not exact version: upstream release assets for a
// specific extension version get removed once the extension is updated, so the
// actual jar file name is resolved dynamically from what readExtensionIndex downloaded.
data class ExtensionTarget(
    val displayName: String,
    val packagePrefix: String,
)

val extensionTargets =
    mapOf(
        "tooncubus" to ExtensionTarget(displayName = "Tooncubus", packagePrefix = "tachiyomi-id.tooncubus"),
        "hentainexus" to ExtensionTarget(displayName = "HentaiNexus", packagePrefix = "tachiyomi-en.hentainexus"),
        "mangafire" to ExtensionTarget(displayName = "MangaFire", packagePrefix = "tachiyomi-all.mangafire"),
    )
val requestedExtensionName = providers.gradleProperty("extension").orElse("all").get()
val selectedExtensionName = requestedExtensionName.takeUnless { it == "all" } ?: "tooncubus"
val selectedExtension =
    requireNotNull(extensionTargets[selectedExtensionName]) {
        "Unsupported extension '$requestedExtensionName'; expected all or ${extensionTargets.keys.joinToString(" or ")}"
    }

fun resolveDownloadedJarName(
    directory: File,
    packagePrefix: String,
): String {
    val jarPattern = Regex("^${Regex.escape(packagePrefix)}-v[0-9.]+\\.jar$")
    val matches = directory.listFiles { file -> jarPattern.matches(file.name) }.orEmpty()
    return requireNotNull(matches.singleOrNull()) {
        "Expected exactly one downloaded jar matching '$packagePrefix-v*.jar' in $directory " +
            "(found ${matches.size}); run ./gradlew readExtensionIndex first"
    }.name
}

rootProject.extra["selectedExtensionJarName"] =
    resolveDownloadedJarName(
        rootProject.layout.buildDirectory
            .dir("extensions/all")
            .get()
            .asFile,
        selectedExtension.packagePrefix,
    )

val readExtensionIndex =
    tasks.register<JavaExec>("readExtensionIndex") {
        description = "Reads the Keiyoushi extension index and optionally downloads its JARs."
        group = "application"
        classpath = sourceSets.main.get().runtimeClasspath
        mainClass.set("dev.vetle.extstats.RepositoryIndexMainKt")
        val downloadDirectory = providers.gradleProperty("downloadDirectory").orElse("build/extensions/all").get()
        downloadDirectory.let {
            args(it)
        }
    }

val offlineSmokeTest =
    tasks.register<JavaExec>("offlineSmokeTest") {
        description = "Loads every downloaded extension JAR without making source network requests."
        group = LifecycleBasePlugin.VERIFICATION_GROUP
        classpath = sourceSets.main.get().runtimeClasspath
        mainClass.set("dev.vetle.extstats.OfflineSmokeMainKt")
        args(
            providers.gradleProperty("smokeDirectory").getOrElse("build/extensions/all"),
            providers.gradleProperty("smokeReportDirectory").getOrElse("build/reports/offline-smoke"),
        )
    }
offlineSmokeTest.configure { mustRunAfter(readExtensionIndex) }

tasks.register<JavaExec>("checkRetryConditions") {
    description = "Checks explicit retry conditions without running extension validation."
    group = LifecycleBasePlugin.VERIFICATION_GROUP
    classpath = sourceSets.main.get().runtimeClasspath
    mainClass.set("dev.vetle.extstats.RetryConditionsMainKt")
    args(
        providers.gradleProperty("validationReportDirectory").getOrElse("build/reports/extension-validation"),
        providers.gradleProperty("retryConditionTimeoutSeconds").getOrElse("5"),
    )
}

val clearNetworkCache =
    tasks.register<JavaExec>("clearNetworkCache") {
        description = "Clears network cache entries by domain, or clears all entries."
        group = "maintenance"
        classpath = sourceSets.main.get().runtimeClasspath
        mainClass.set("dev.vetle.extstats.runtime.NetworkCacheMainKt")
        doFirst {
            val extension = providers.gradleProperty("cacheExtension").orNull
            val domain = providers.gradleProperty("cacheDomain").orNull
            val all = providers.gradleProperty("cacheAll").orNull
            require(listOf(extension, domain, all).count { it != null } == 1) {
                "Specify exactly one of -PcacheDomain=<domain>, -PcacheAll, or -PcacheExtension=<artifact-name>"
            }
            args(
                layout.projectDirectory
                    .dir("tachiserver-data/android-compat/appdata/cache")
                    .asFile.absolutePath,
                if (domain != null) "domain" else "all",
                domain ?: extension ?: "all",
            )
        }
    }

val localExtensionRepository =
    providers.gradleProperty("localExtensionRepository").orElse("/home/vetle/dev/keiyoushi-extensions")
val localExtensionSource = providers.gradleProperty("source")
val rebuildLocalExtension = providers.gradleProperty("rebuildLocalExtension").map(String::toBoolean).orElse(false)
val localExtensionSlug = localExtensionSource.map { it.substringAfterLast(':') }
val localExtensionApk = layout.buildDirectory.file("local-extension/${localExtensionSlug.getOrElse("extension")}.apk")

val buildLocalExtension =
    tasks.register<Exec>("buildLocalExtension") {
        description = "Builds one extension APK from the local Keiyoushi repository."
        group = LifecycleBasePlugin.VERIFICATION_GROUP
        doFirst {
            val source = localExtensionSource.orNull
            require(!source.isNullOrBlank()) {
                "Specify -Psource=<extension module>, for example -Psource=src:all:manhwa18net"
            }
            workingDir(localExtensionRepository.get())
            commandLine("./gradlew", "$source:assembleDebug")
        }
    }

val stageLocalExtension =
    tasks.register("stageLocalExtension") {
        description = "Stages a locally built Keiyoushi extension APK for validation."
        group = LifecycleBasePlugin.VERIFICATION_GROUP
        if (rebuildLocalExtension.get()) {
            dependsOn(buildLocalExtension)
        }
        outputs.file(localExtensionApk)
        doLast {
            val source = localExtensionSource.get()
            val slug = localExtensionSlug.get()
            val outputDirectory =
                file(localExtensionRepository.get())
                    .resolve(source.replace(':', '/'))
                    .resolve("build/outputs/apk/debug")
            val apks = outputDirectory.listFiles { file -> file.extension.equals("apk", ignoreCase = true) }.orEmpty()
            require(apks.size == 1) {
                "Expected exactly one APK in $outputDirectory after building $source (found ${apks.size})"
            }
            val destination = layout.buildDirectory.dir("extensions/all").get().asFile
            destination.mkdirs()
            destination.listFiles { file ->
                file.name.startsWith("tachiyomi-") &&
                    file.name.substringBeforeLast('-').substringAfterLast('.') == slug &&
                    file.extension.equals("apk", ignoreCase = true)
            }.orEmpty().forEach(File::delete)
            apks.single().copyTo(localExtensionApk.get().asFile, overwrite = true)
            localExtensionApk.get().asFile.copyTo(destination.resolve(apks.single().name), overwrite = true)
        }
    }

val printLocalExtensionReport =
    tasks.register("printLocalExtensionReport") {
        description = "Prints the report path for a locally built extension."
        group = LifecycleBasePlugin.VERIFICATION_GROUP
        doLast {
            val source = localExtensionSource.get()
            val outputDirectory =
                file(localExtensionRepository.get())
                    .resolve(source.replace(':', '/'))
                    .resolve("build/outputs/apk/debug")
            val apk = outputDirectory.listFiles { file -> file.extension.equals("apk", ignoreCase = true) }.orEmpty().single()
            println("Report: ${layout.buildDirectory.file("reports/extension-validation/${apk.nameWithoutExtension}.md").get().asFile.absolutePath}")
        }
    }

tasks.register("validateLocalExtension") {
    description = "Builds and validates one extension from the local Keiyoushi repository."
    group = LifecycleBasePlugin.VERIFICATION_GROUP
    dependsOn(stageLocalExtension)
    finalizedBy(tasks.named("run"))
}

tasks.named<JavaExec>("run") {
    mustRunAfter(clearNetworkCache)
    mustRunAfter(stageLocalExtension)
    systemProperty(
        "extstats.networkCacheMode",
        providers.systemProperty("extstats.networkCacheMode").getOrElse("permanent"),
    )
    providers.systemProperty("extstats.validationOperations").orNull?.let {
        systemProperty("extstats.validationOperations", it)
    }
    providers.systemProperty("extstats.validationChapterOffsetFromOldest").orNull?.let {
        systemProperty("extstats.validationChapterOffsetFromOldest", it)
    }
    systemProperty("nativeCefDir", nativeCefDirectory.get().absolutePath)
    systemProperty("validationSelection", providers.gradleProperty("validationSelection").getOrElse("missing"))
    systemProperty("validationExtensions", providers.gradleProperty("validationExtensions").getOrElse(""))
    systemProperty("validationIssues", providers.gradleProperty("validationIssues").getOrElse(""))
    systemProperty("validationArtifactType", providers.gradleProperty("validationArtifactType").getOrElse("all"))
    systemProperty("validationTimeoutSeconds", providers.gradleProperty("validationTimeoutSeconds").getOrElse("130"))
    systemProperty("validationRedactionMode", providers.gradleProperty("redact").getOrElse("urls-and-sensitive"))
    if (gradle.startParameter.taskNames.any { it.substringAfterLast(':') == "validateLocalExtension" }) {
        finalizedBy(printLocalExtensionReport)
        doFirst {
            val source = localExtensionSource.get()
            val outputDirectory =
                file(localExtensionRepository.get())
                    .resolve(source.replace(':', '/'))
                    .resolve("build/outputs/apk/debug")
            val apk = outputDirectory.listFiles { file -> file.extension.equals("apk", ignoreCase = true) }.orEmpty().single()
            systemProperty("validationSelection", "all")
            systemProperty("validationExtensions", apk.name)
            systemProperty("validationArtifactType", "apk")
        }
    }
}

val nativeCefVersion = "150.0.14-g7c1aa68-chromium-150.0.7871.129-api-1.21-263-b10"
val nativeCefArchiveName = "jbr_jcef-25.0.4.1-linux-x64-b583.48.tar.gz"
val nativeCefArchiveUrl = "https://cache-redirector.jetbrains.com/intellij-jbr/$nativeCefArchiveName"
val nativeCefArchiveSha512 =
    "d56810129fee7b33e3bc34191823f2506f4908f6bbaf877fa7b3d8a7e0d0fd2fc275a9d1cdc1727575d0a2c821b522601355fe5bac9a967abfab794fa07e9033"
val nativeCefLibrarySha256 =
    mapOf(
        "libcef.so" to "751e1d26464fc82e30b01ec76170fe9816e5c31826070ba8b492f08d6241c813",
        "libjcef.so" to "7112962bf57b2635018b93691110004f0c4a9c6a9e983b424bdfcde81a6425c3",
    )
rootProject.extra["jcefJavaVersion"] = "150.0.14-g7c1aa68-chromium-150.0.7871.129-api-1.21-263-b11"
rootProject.extra["nativeCefLibcefSha256"] = nativeCefLibrarySha256.getValue("libcef.so")
rootProject.extra["nativeCefLibjcefSha256"] = nativeCefLibrarySha256.getValue("libjcef.so")
val nativeCefDirectory =
    providers
        .gradleProperty("nativeCefDir")
        .map(::file)
        .orElse(layout.projectDirectory.dir("tachiserver-data/bin/kcef").asFile)

fun verifyNativeCefInstallation(directory: File) {
    check(
        System.getProperty("os.name").lowercase().contains("linux") &&
            System.getProperty("os.arch") in setOf("amd64", "x86_64"),
    ) {
        "Native CEF setup currently supports Linux x64 only"
    }
    val release = directory.resolve("release")
    check(release.isFile) {
        "Native CEF is missing $release; run ./gradlew setupNativeCef or set -PnativeCefDir=<path>"
    }
    val installedVersion =
        release.useLines { lines ->
            lines
                .firstOrNull { it.startsWith("JCEF_VERSION_DETAILED=") }
                ?.substringAfter('=')
                ?.trim('"')
        }
    check(installedVersion == nativeCefVersion) {
        "Native CEF version mismatch in $release: expected $nativeCefVersion, found ${installedVersion ?: "missing"}"
    }
    nativeCefLibrarySha256.forEach { (library, expectedSha256) ->
        val file = directory.resolve(library)
        check(file.isFile) { "Native CEF installation is missing $library in $directory" }
        val digest = MessageDigest.getInstance("SHA-256")
        file.inputStream().use { input ->
            val buffer = ByteArray(DEFAULT_BUFFER_SIZE)
            while (true) {
                val count = input.read(buffer)
                if (count < 0) break
                digest.update(buffer, 0, count)
            }
        }
        val actualSha256 = HexFormat.of().formatHex(digest.digest())
        check(actualSha256 == expectedSha256) {
            "Native CEF checksum mismatch for $file: expected $expectedSha256, found $actualSha256"
        }
    }
    listOf("jcef_helper", "chrome-sandbox", "cef_server").forEach { executable ->
        check(directory.resolve(executable).canExecute()) {
            "Native CEF installation is not executable: ${directory.resolve(executable)}"
        }
    }
}

tasks.register("verifyNativeCef") {
    description = "Verifies the pinned Linux x64 native CEF installation without downloading it."
    group = LifecycleBasePlugin.VERIFICATION_GROUP
    doLast { verifyNativeCefInstallation(nativeCefDirectory.get()) }
}

tasks.register("setupNativeCef") {
    description = "Downloads, verifies, and installs the pinned Linux x64 native CEF distribution."
    group = "setup"

    doLast {
        val archive =
            layout.buildDirectory
                .file("downloads/$nativeCefArchiveName")
                .get()
                .asFile
        val download = archive.resolveSibling("${archive.name}.part")

        fun sha512(file: File): String {
            val digest = MessageDigest.getInstance("SHA-512")
            file.inputStream().use { input ->
                val buffer = ByteArray(DEFAULT_BUFFER_SIZE)
                while (true) {
                    val count = input.read(buffer)
                    if (count < 0) break
                    digest.update(buffer, 0, count)
                }
            }
            return HexFormat.of().formatHex(digest.digest())
        }

        if (!archive.isFile) {
            archive.parentFile.mkdirs()
            download.delete()
            URI(nativeCefArchiveUrl).toURL().openStream().use { input ->
                download.outputStream().use(input::copyTo)
            }
            check(sha512(download) == nativeCefArchiveSha512) {
                download.delete()
                "Downloaded native CEF checksum does not match $nativeCefArchiveSha512"
            }
            check(download.renameTo(archive)) { "Could not move verified native CEF archive to $archive" }
        }
        check(sha512(archive) == nativeCefArchiveSha512) {
            "Native CEF archive checksum does not match $nativeCefArchiveSha512: $archive"
        }

        val directory = nativeCefDirectory.get()
        val staging = directory.resolveSibling("${directory.name}.part")
        staging.deleteRecursively()
        copy {
            from(tarTree(resources.gzip(archive)))
            into(staging)
        }
        val extractedHome =
            staging.walkTopDown().firstOrNull {
                it.isDirectory && it.resolve("release").isFile && it.resolve("lib").isDirectory
            }
        checkNotNull(extractedHome) { "Native CEF archive does not contain a JBR home" }
        val normalized = directory.resolveSibling("${directory.name}.new")
        normalized.deleteRecursively()
        normalized.mkdirs()
        extractedHome.resolve("lib").copyRecursively(normalized, overwrite = true)
        extractedHome.resolve("release").copyTo(normalized.resolve("release"), overwrite = true)
        listOf("jcef_helper", "chrome-sandbox", "cef_server").forEach { executable ->
            check(normalized.resolve(executable).setExecutable(true, false)) {
                "Could not make native CEF helper executable: ${normalized.resolve(executable)}"
            }
        }
        verifyNativeCefInstallation(normalized)
        directory.deleteRecursively()
        check(normalized.renameTo(directory)) { "Could not install native CEF at $directory" }
        staging.deleteRecursively()
    }
}

tasks.register("setupExtension") {
    description = "Downloads and verifies the extension selected by -Pextension."
    group = "setup"
    dependsOn(readExtensionIndex)
}

tasks.register("setupAndroidCompatStub") {
    description = "Downloads, patches, and verifies the pinned Android API 30 stub."
    group = "setup"

    doLast {
        val expectedSha256 = "543ad5622f7edf2a9a7d6273268fa954fff4469943ab4029b08375bafcdb0ee9"
        val androidJar = layout.projectDirectory.file("android-compat/lib/android.jar").asFile
        val download = androidJar.resolveSibling("${androidJar.name}.part")

        fun sha256(file: File): String {
            val digest = MessageDigest.getInstance("SHA-256")
            file.inputStream().use { input ->
                val buffer = ByteArray(DEFAULT_BUFFER_SIZE)
                while (true) {
                    val count = input.read(buffer)
                    if (count < 0) break
                    digest.update(buffer, 0, count)
                }
            }
            return HexFormat.of().formatHex(digest.digest())
        }

        fun deleteEntries(vararg entries: String) {
            val process =
                ProcessBuilder("zip", "--delete", download.absolutePath, *entries)
                    .inheritIO()
                    .start()
            val exitCode = process.waitFor()
            check(exitCode == 0 || exitCode == 12) {
                "zip failed with exit code $exitCode while patching $download"
            }
        }

        if (!androidJar.exists()) {
            androidJar.parentFile.mkdirs()
            download.delete()
            URI(
                "https://android.googlesource.com/platform/prebuilts/sdk/+/" +
                    "6cd31be5e4e25901aadf838120d71a79b46d9add/30/public/android.jar?format=TEXT",
            ).toURL().openStream().use { encoded ->
                Base64.getMimeDecoder().wrap(encoded).use { input ->
                    download.outputStream().use(input::copyTo)
                }
            }

            listOf("org/json/*", "org/apache/*", "org/w3c/*", "org/xml/*", "org/xmlpull/*", "junit/*", "javax/*", "java/*")
                .forEach { deleteEntries(it) }
            val sourceRoot = layout.projectDirectory.dir("android-compat/src/main/java").asFile
            sourceRoot
                .walkTopDown()
                .filter(File::isFile)
                .forEach { source ->
                    val className = source.relativeTo(sourceRoot).invariantSeparatorsPath.substringBeforeLast('.')
                    deleteEntries(
                        "$className.class",
                        "$className\$*.class",
                        "${className}Kt.class",
                        "${className}Kt\$*.class",
                    )
                }
            deleteEntries("android/preference/PreferenceManager.class", "android/preference/PreferenceManager\$*.class")

            check(sha256(download) == expectedSha256) {
                download.delete()
                "Generated Android stub checksum does not match $expectedSha256"
            }
            download.renameTo(androidJar).also { check(it) }
        }

        check(sha256(androidJar) == expectedSha256) {
            "Android stub checksum does not match $expectedSha256: $androidJar"
        }
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

tasks.test {
    useJUnitPlatform()
}
