plugins {
    id("java")
    id("com.gradleup.shadow") version "9.3.1"
}

group = "hytale.plugin.template"

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