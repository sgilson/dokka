pluginManagement {
    plugins {
        kotlin("jvm") version "1.5.30"
        id("org.jetbrains.dokka") version ("1.5.30")
    }
}

include(":parentProject")
include(":parentProject:childProjectA")
include(":parentProject:childProjectB")

rootProject.name = "dokka-multimodule-example"
