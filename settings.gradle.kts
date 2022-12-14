/*
 * This file was generated by the Gradle 'init' task.
 *
 * The settings file is used to specify which projects to include in your build.
 *
 * Detailed information about configuring a multi-project build in Gradle can be found
 * in the user manual at https://docs.gradle.org/7.5.1/userguide/multi_project_builds.html
 * This project uses @Incubating APIs which are subject to change.
 */

rootProject.name = "gradle-catalog-client"

dependencyResolutionManagement {
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
    versionCatalogs {
        this.create("libs") {
            from("no.gtc.gradle:gradle-catalog:2022.11.05-21.11.2cd46231dea0")
        }
    }
}
