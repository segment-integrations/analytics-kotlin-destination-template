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
    google()
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

// Test Dependencies
dependencies {
    testImplementation ("junit:junit:4.13.2")
    testImplementation ("androidx.test.ext:junit:1.1.3")
    testImplementation ("androidx.test.espresso:espresso-core:3.4.0")
    testImplementation ("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.6.0")

    testImplementation ("io.mockk:mockk:1.10.6")
    testImplementation(platform("org.junit:junit-bom:5.7.2"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    // Add Roboelectric dependencies.
    testImplementation ("org.robolectric:robolectric:4.7.3")
    testImplementation ("androidx.test:core:1.4.0")

    // Add JUnit4 legacy dependencies.
    testImplementation ("junit:junit:4.13.2")
    testRuntimeOnly ("org.junit.vintage:junit-vintage-engine:5.7.2")

    // For JSON Object testing
    testImplementation ("org.json:json:20200518")
    testImplementation ("org.skyscreamer:jsonassert:1.5.0")
}

