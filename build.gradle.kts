/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn more about Gradle by exploring our samples at https://docs.gradle.org/7.5.1/samples
 * This project uses @Incubating APIs which are subject to change.
 */


plugins {
    @Suppress("DSL_SCOPE_VIOLATION")
    libs.plugins.kotlin
    @Suppress("DSL_SCOPE_VIOLATION")
    libs.plugins.spotless
    application
}
repositories {
    mavenCentral()
    maven("https://jitpack.io")
    maven("https://maven.pkg.github.com/gtcno/gradle-catalog")
    maven {
        name = "gpr.local"
        url = uri("https://maven.pkg.github.com/gtcno/gradle-catalog")
        credentials {
            username = System.getenv("GPR_USER")
            password = System.getenv("GPR_TOKEN")
        }
    }
}

dependencies {
    implementation(libs.konfig)
    testImplementation("no.gtc.gradle:gradle-catalog:2022.11.05-21.11.2cd46231dea0")
}

