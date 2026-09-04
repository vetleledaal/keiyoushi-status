plugins {
    kotlin("jvm")
}

dependencies {
    implementation(libs.kodein.di.conf.jvm)
    implementation(libs.logback.classic)
    implementation(libs.kotlin.logging)
    implementation(libs.typesafe.config)
}

kotlin {
    jvmToolchain(21)
}
