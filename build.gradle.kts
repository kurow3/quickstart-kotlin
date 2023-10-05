/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin application project to get you started.
 * For more details on building Java & JVM projects, please refer to https://docs.gradle.org/8.2.1/userguide/building_java_projects.html in the Gradle documentation.
 */

plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.8.20"

    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Use the Kotlin JUnit 5 integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")

    // Use the JUnit 5 integration.
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testImplementation("org.junit.jupiter:junit-jupiter-params")

    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // This dependency is used by the application.
    implementation("com.google.guava:guava:31.1-jre")
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

sourceSets {
    main {
        kotlin {
            srcDir("${project.rootDir}/src/${sourceSets.main.name}")
            destinationDirectory.set(file("${project.buildDir}/classes/${sourceSets.main.name}"))
        }
        java {
            srcDir("${project.rootDir}/src/${sourceSets.main.name}")
            destinationDirectory.set(file("${project.buildDir}/classes/${sourceSets.main.name}"))
        }
        resources {
            srcDir("${project.rootDir}/resources/${sourceSets.main.name}")
            destinationDirectory.set(file("${project.buildDir}/resources/${sourceSets.main.name}"))
        }
}

    test {
        kotlin {
            srcDir("${project.rootDir}/src/${sourceSets.test.name}")
            destinationDirectory.set(file("${project.buildDir}/classes/${sourceSets.test.name}"))
        }
        java {
            srcDir("${project.rootDir}/src/${sourceSets.test.name}")
            destinationDirectory.set(file("${project.buildDir}/classes/${sourceSets.test.name}"))
        }
        resources {
            srcDir("${project.rootDir}/resources/${sourceSets.test.name}")
            destinationDirectory.set(file("${project.buildDir}/resources/${sourceSets.test.name}"))
        }
    }
}

application {
    // Define the main class for the application.
    mainClass.set("com.example.kotlin_package.Main")
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}
