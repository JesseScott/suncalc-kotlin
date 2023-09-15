plugins {
    kotlin("jvm") version "1.8.0"
    `java-library`
    `maven-publish`
}

group = "tt.co.jesses"
version = "0.1-SNAPSHOT"

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "tt.co.jesses"
            artifactId = "suncalc-kotlin"
            version = "0.1-SNAPSHOT"
            from(components["java"])
        }
    }
}

repositories {
    mavenCentral()
}

dependencies {
    // SunCalc
    implementation("org.shredzone.commons:commons-suncalc:3.7")

    // Test
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}