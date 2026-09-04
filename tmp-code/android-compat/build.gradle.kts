plugins {
    kotlin("jvm")
}

dependencies {
    implementation(project(":android-compat:Config"))
    implementation("org.kodein.di:kodein-di-conf-jvm:7.33.0")
    implementation("ch.qos.logback:logback-classic:1.6.3")
    implementation("io.github.microutils:kotlin-logging:3.0.5")
    implementation("io.reactivex:rxjava:1.3.8")
    implementation("org.jsoup:jsoup:1.23.2")
    implementation("com.google.code.gson:gson:2.14.0")
    implementation("com.typesafe:config:1.4.3")
    implementation("net.dongliu:apk-parser:2.6.10")
    implementation("de.femtopedia.dex2jar:dex-translator:2.4.38")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.11.0")
    implementation("com.russhwolf:multiplatform-settings-jvm:1.3.0")
    implementation("com.russhwolf:multiplatform-settings-serialization-jvm:1.3.0")
    implementation("com.ibm.icu:icu4j:78.3")
    implementation("com.github.usefulness:webp-imageio:0.11.0")
    implementation(files("lib/android.jar"))

    compileOnly("xmlpull:xmlpull:1.1.3.4a")
    compileOnly("com.android.tools.build:apksig:9.3.2")
    compileOnly("androidx.annotation:annotation:1.10.0")
}

kotlin {
    jvmToolchain(21)
}
