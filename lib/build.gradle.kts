plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm")

    // Apply the java-library plugin for API and implementation separation.
    `java-library`
    `kotlin-dsl`
    id("mvn-publish")
}

repositories {
    // Use JCenter for resolving dependencies.
    mavenCentral()
}


java {
    withSourcesJar()
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {

    implementation("com.segment.analytics.kotlin:core:1.4.3")

}

