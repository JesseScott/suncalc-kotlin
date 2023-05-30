plugins {
    kotlin("jvm") version "1.8.0"
}

group = "tt.co.jesses"
version = "1.0-SNAPSHOT"


repositories {
    mavenCentral()
}

dependencies {

    // Test
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}