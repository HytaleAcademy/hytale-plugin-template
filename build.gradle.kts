plugins {
    id("java")
    id("com.gradleup.shadow") version "9.3.1"
}

group = "hytale.plugin.template"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly(files("libs/HytaleServer.jar"))
}

tasks.shadowJar {
    minimize()
}

tasks.build {
    dependsOn("shadowJar")
}