plugins {
    kotlin("jvm")
}

val extensionLibAar = configurations.create("extensionLibAar")
val extensionLibClasses = layout.buildDirectory.file("extension-lib/classes.jar")
val extractExtensionLibClasses = tasks.register<Copy>("extractExtensionLibClasses") {
    from({ zipTree(extensionLibAar.singleFile) }) {
        include("classes.jar")
    }
    into(extensionLibClasses.map { it.asFile.parentFile })
    outputs.file(extensionLibClasses)
}
val extensionLibHostApi = tasks.register<Jar>("extensionLibHostApi") {
    from(extensionLibClasses.map { zipTree(it) }) {
        exclude("android/**")
        exclude("eu/kanade/tachiyomi/AppInfo*")
        exclude("eu/kanade/tachiyomi/network/OkHttpExtensionsKt*")
        exclude("eu/kanade/tachiyomi/network/RequestsKt*")
        exclude("eu/kanade/tachiyomi/source/model/MangasPage*")
        exclude("eu/kanade/tachiyomi/source/model/Page*")
        exclude("eu/kanade/tachiyomi/source/model/SChapter*")
        exclude("eu/kanade/tachiyomi/source/model/SManga*")
        exclude("eu/kanade/tachiyomi/util/JsoupExtensionsKt*")
    }
    archiveFileName = "extension-lib-host-api.jar"
    destinationDirectory = layout.buildDirectory.dir("extension-lib")
    dependsOn(extractExtensionLibClasses)
}

dependencies {
    implementation(project(":android-compat"))
    implementation(project(":android-compat:Config"))
    implementation("de.femtopedia.dex2jar:dex-translator:2.4.38")
    implementation("net.dongliu:apk-parser:2.6.10")
    extensionLibAar("com.github.keiyoushi:extensions-lib:6e0c96cea8@aar")
    compileOnly(files(extensionLibHostApi))
    runtimeOnly(files(extensionLibHostApi))
    implementation("com.github.null2264.injekt:injekt-core:4135455a2a")
    implementation("org.bouncycastle:bcprov-jdk18on:1.85.2")
    implementation("org.kodein.di:kodein-di-conf-jvm:7.33.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.11.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json-okio:1.11.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf:1.11.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.11.0")
    runtimeOnly("org.jetbrains.kotlinx:kotlinx-coroutines-swing:1.11.0")
    implementation("org.jetbrains.intellij.deps.jcef:jcef:${rootProject.extra["jcefJavaVersion"]}")
    implementation("com.squareup.okhttp3:okhttp:5.5.0")
    implementation("com.squareup.okhttp3:okhttp-brotli:5.5.0")
    implementation("com.squareup.okhttp3:okhttp-zstd:5.5.0")
    implementation("com.squareup.zstd:zstd-kmp-okio:0.4.0")
    implementation("org.jsoup:jsoup:1.23.2")
    implementation("app.cash.quickjs:quickjs-jvm:0.9.2")
    implementation("io.reactivex:rxjava:1.3.8")

    testCompileOnly(files(extensionLibHostApi))
    testImplementation(kotlin("test"))
    testImplementation("com.squareup.okhttp3:mockwebserver3:5.5.0")
}

val directFixtureSourceSet = sourceSets.create("directFixture")
val factoryFixtureSourceSet = sourceSets.create("factoryFixture")
val classLoaderFixtureSourceSet = sourceSets.create("classLoaderFixture")
listOf(directFixtureSourceSet, factoryFixtureSourceSet, classLoaderFixtureSourceSet).forEach { fixture ->
    fixture.compileClasspath = sourceSets.main.get().output + configurations.testCompileClasspath.get()
    configurations[fixture.compileOnlyConfigurationName]
        .extendsFrom(configurations.testCompileOnly.get())
}

fun registerFixtureJar(
    name: String,
    sourceSet: SourceSet,
    entryPoint: String,
    extensionLibVersion: String = "1.6",
) = tasks.register<Jar>(name) {
    from(sourceSet.output)
    archiveFileName = "$name.jar"
    destinationDirectory = layout.buildDirectory.dir("fixtures")
    into("") {
        from(
            resources.text.fromString(
                """
                <manifest package="dev.vetle.fixture" android:versionName="1.0" android:versionCode="1"
                    xmlns:android="http://schemas.android.com/apk/res/android">
                    <application>
                        <meta-data android:name="tachiyomi.extension.class" android:value="$entryPoint"/>
                        <meta-data android:name="tachiyomix.extensionLib" android:value="$extensionLibVersion"/>
                    </application>
                </manifest>
                """.trimIndent(),
            ),
        )
        rename { "AndroidManifest.xml" }
    }
}

val directFixtureJar = registerFixtureJar("direct-source-fixture", directFixtureSourceSet, "dev.vetle.fixture.DirectSource")
val legacyDirectFixtureJar = registerFixtureJar(
    "legacy-direct-source-fixture",
    directFixtureSourceSet,
    "dev.vetle.fixture.DirectSource",
    extensionLibVersion = "1.4",
)
val factoryFixtureJar = registerFixtureJar("generated-factory-fixture", factoryFixtureSourceSet, "dev.vetle.fixture.Generated")
val classLoaderFixtureJar = tasks.register<Jar>("class-loader-fixture") {
    from(classLoaderFixtureSourceSet.output)
    from(sourceSets.main.get().output) {
        include("eu/kanade/tachiyomi/source/Source.class")
    }
    from({ zipTree(configurations.runtimeClasspath.get().files.single { it.name.startsWith("kotlinx-coroutines-core-jvm-") }) }) {
        include("kotlinx/coroutines/CoroutineScope.class")
    }
    from({ zipTree(configurations.runtimeClasspath.get().files.single { it.name.startsWith("okhttp-jvm-") }) }) {
        include("okhttp3/OkHttpClient.class")
    }
    from({ zipTree(project(":android-compat").tasks.named<Jar>("jar").flatMap { it.archiveFile }) }) {
        include("android/content/Context.class")
    }
    archiveFileName = "class-loader-fixture.jar"
    destinationDirectory = layout.buildDirectory.dir("fixtures")
}

val onlineTestSourceSet = sourceSets.create("onlineTest")
onlineTestSourceSet.compileClasspath = sourceSets.main.get().output + onlineTestSourceSet.compileClasspath
onlineTestSourceSet.runtimeClasspath =
    onlineTestSourceSet.output + sourceSets.main.get().output + onlineTestSourceSet.runtimeClasspath
configurations[onlineTestSourceSet.implementationConfigurationName]
    .extendsFrom(configurations.testImplementation.get())
configurations[onlineTestSourceSet.compileOnlyConfigurationName]
    .extendsFrom(configurations.testCompileOnly.get())
configurations[onlineTestSourceSet.runtimeOnlyConfigurationName]
    .extendsFrom(configurations.testRuntimeOnly.get())

kotlin {
    jvmToolchain(21)
}

val testExtensionJar = providers.systemProperty("testExtensionJar").orElse(
    rootProject.layout.buildDirectory
        .file("extensions/all/${rootProject.extra["selectedExtensionJarName"]}")
        .map { it.asFile.absolutePath },
)

tasks.test {
    useJUnitPlatform()
    dependsOn(directFixtureJar, legacyDirectFixtureJar, factoryFixtureJar, classLoaderFixtureJar)
    dependsOn(rootProject.tasks.named("verifyNativeCef"))
    systemProperty("directFixtureJar", directFixtureJar.flatMap { it.archiveFile }.get().asFile.absolutePath)
    systemProperty("legacyDirectFixtureJar", legacyDirectFixtureJar.flatMap { it.archiveFile }.get().asFile.absolutePath)
    systemProperty("factoryFixtureJar", factoryFixtureJar.flatMap { it.archiveFile }.get().asFile.absolutePath)
    systemProperty("classLoaderFixtureJar", classLoaderFixtureJar.flatMap { it.archiveFile }.get().asFile.absolutePath)
    systemProperty(
        "nativeCefDir",
        providers.gradleProperty("nativeCefDir")
            .map { rootProject.file(it).absolutePath }
            .getOrElse(rootProject.layout.projectDirectory.dir("tachiserver-data/bin/kcef").asFile.absolutePath),
    )
    systemProperty("nativeCefLibcefSha256", rootProject.extra["nativeCefLibcefSha256"] as String)
    systemProperty("nativeCefLibjcefSha256", rootProject.extra["nativeCefLibjcefSha256"] as String)
    systemProperty(
        "testExtensionJar",
        testExtensionJar.get(),
    )
}

tasks.register<Test>("onlineTest") {
    description = "Runs extension-runtime tests that make live network requests."
    group = LifecycleBasePlugin.VERIFICATION_GROUP
    testClassesDirs = onlineTestSourceSet.output.classesDirs
    classpath = onlineTestSourceSet.runtimeClasspath
    useJUnitPlatform()
    systemProperty(
        "testExtensionJar",
        testExtensionJar.get(),
    )
}
