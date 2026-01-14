plugins {
    alias(libs.plugins.kotlin)
    alias(libs.plugins.shadow)
}

group = "org.hytaleacademy"

repositories {
    mavenCentral()
}

dependencies {
    val hytaleServerFile = "${System.getProperty("user.home")}/Appdata/Roaming/Hytale/install/release/package/game/latest/Server/HytaleServer.jar"
    compileOnly(files(hytaleServerFile))
}

tasks.shadowJar {
    minimize()
}

tasks.build {
    dependsOn("shadowJar")
}