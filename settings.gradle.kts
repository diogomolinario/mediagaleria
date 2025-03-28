pluginManagement {
    repositories {
        google()
        mavenCentral()
        maven("https://plugins.gradle.org/m2/")
        maven( url = "https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

rootProject.name = "GaleriaDeMidias"
include(":app")