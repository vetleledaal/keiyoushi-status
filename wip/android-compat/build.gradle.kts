plugins {
    kotlin("jvm")
}

dependencies {
    implementation(project(":android-compat:Config"))
    implementation(libs.kodein.di.conf.jvm)
    implementation(libs.logback.classic)
    implementation(libs.kotlin.logging)
    implementation(libs.rxjava)
    implementation(libs.jsoup)
    implementation(libs.gson)
    implementation(libs.typesafe.config)
    implementation(libs.apk.parser)
    implementation(libs.dex.translator)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.multiplatform.settings.jvm)
    implementation(libs.multiplatform.settings.serialization.jvm)
    implementation(libs.icu4j)
    implementation(libs.webp.imageio)
    implementation(files("lib/android.jar"))

    compileOnly(libs.xmlpull)
    compileOnly(libs.apksig)
    compileOnly(libs.androidx.annotation)
}

kotlin {
    jvmToolchain(21)
}
