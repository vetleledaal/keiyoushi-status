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
    implementation(libs.dex.translator)
    implementation(libs.apk.parser)
    extensionLibAar(libs.keiyoushi.extensions.lib) {
        isTransitive = false
        artifact { type = "aar" }
    }
    compileOnly(files(extensionLibHostApi))
    runtimeOnly(files(extensionLibHostApi))
    implementation(libs.injekt.core)
    implementation(libs.bcprov.jdk18on)
    implementation(libs.kodein.di.conf.jvm)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.kotlinx.serialization.json.okio)
    implementation(libs.kotlinx.serialization.protobuf)
    implementation(libs.kotlinx.coroutines.core)
    runtimeOnly(libs.kotlinx.coroutines.swing)
    implementation(libs.jcef)
    implementation(libs.okhttp)
    implementation(libs.okhttp.brotli)
    implementation(libs.okhttp.zstd)
    implementation(libs.zstd.kmp.okio)
    implementation(libs.jsoup)
    implementation(libs.quickjs.jvm)
    implementation(libs.rxjava)

    testCompileOnly(files(extensionLibHostApi))
    testImplementation(kotlin("test"))
    testImplementation(libs.mockwebserver3)
    // android-compat compiles against xmlpull but does not ship it; the tests exercise the
    // vendored XML code, so the pinned artifact has to be on the test classpath too.
    testImplementation(libs.xmlpull)
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
    from({ zipTree(configurations.runtimeClasspath.get().files.single { it.name.startsWith("rxjava-") }) }) {
        include("rx/Observable.class")
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
    providers.provider {
        rootProject.layout.buildDirectory.dir("extensions/all").get().asFile
            .listFiles { file -> file.isFile && file.extension.equals("jar", ignoreCase = true) }
            .orEmpty()
            .minByOrNull { it.name }
            ?.absolutePath
            .orEmpty()
    },
)

tasks.test {
    useJUnitPlatform()
    dependsOn(directFixtureJar, legacyDirectFixtureJar, factoryFixtureJar, classLoaderFixtureJar)
    dependsOn(rootProject.tasks.named("verifyNativeCef"))
    systemProperty("directFixtureJar", directFixtureJar.flatMap { it.archiveFile }.get().asFile.absolutePath)
    systemProperty("legacyDirectFixtureJar", legacyDirectFixtureJar.flatMap { it.archiveFile }.get().asFile.absolutePath)
    systemProperty("factoryFixtureJar", factoryFixtureJar.flatMap { it.archiveFile }.get().asFile.absolutePath)
    systemProperty("classLoaderFixtureJar", classLoaderFixtureJar.flatMap { it.archiveFile }.get().asFile.absolutePath)
    systemProperty("extensionLibHostApiJar", extensionLibHostApi.flatMap { it.archiveFile }.get().asFile.absolutePath)
    systemProperty(
        "nativeCefDir",
        providers.gradleProperty("nativeCefDir")
            .map { rootProject.file(it).absolutePath }
            .getOrElse(rootProject.layout.projectDirectory.dir("tachiserver-data/bin/kcef").asFile.absolutePath),
    )
    systemProperty("nativeCefLibcefSha256", rootProject.extra["nativeCefLibcefSha256"] as String)
    systemProperty("nativeCefLibjcefSha256", rootProject.extra["nativeCefLibjcefSha256"] as String)
    testExtensionJar.get().takeIf(String::isNotBlank)?.let { systemProperty("testExtensionJar", it) }
}

tasks.register<Test>("onlineTest") {
    description = "Runs extension-runtime tests that make live network requests."
    group = LifecycleBasePlugin.VERIFICATION_GROUP
    testClassesDirs = onlineTestSourceSet.output.classesDirs
    classpath = onlineTestSourceSet.runtimeClasspath
    useJUnitPlatform()
    testExtensionJar.get().takeIf(String::isNotBlank)?.let { systemProperty("testExtensionJar", it) }
}
