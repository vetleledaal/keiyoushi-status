plugins {
    kotlin("jvm")
}

dependencies {
    implementation("org.kodein.di:kodein-di-conf-jvm:7.33.0")
    implementation("ch.qos.logback:logback-classic:1.6.3")
    implementation("io.github.microutils:kotlin-logging:3.0.5")
    implementation("com.typesafe:config:1.4.3")
}

kotlin {
    jvmToolchain(21)
}
