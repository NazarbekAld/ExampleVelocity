plugins {
    id("java")
    kotlin("jvm") version "1.9.21"
    kotlin("kapt") version "1.9.21"
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "org.xexe"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://s01.oss.sonatype.org/content/repositories/snapshots/")
    maven {
        name = "papermc"
        url = uri("https://repo.papermc.io/repository/maven-public/")
    }
}

dependencies {
    compileOnly("com.velocitypowered:velocity-api:3.3.0-SNAPSHOT")
    kapt("com.velocitypowered:velocity-api:3.3.0-SNAPSHOT")
}


tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}