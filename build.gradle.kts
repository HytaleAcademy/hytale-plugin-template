plugins {
    alias(libs.plugins.kotlin)
    alias(libs.plugins.shadow)
}

group = "org.hytaleacademy"

repositories {
    mavenCentral()
    maven("https://maven.hytale.com/release")
}

dependencies {
    compileOnly(libs.hytale)
}

tasks.shadowJar {
    minimize()
}

tasks.build {
    dependsOn("shadowJar")
}