plugins {
    kotlin("jvm") version "1.5.31"
    application
}

application {
    mainClass.set("MainKt")
    applicationDefaultJvmArgs += "-Xmx32m"
    applicationDefaultJvmArgs += "-javaagent:./opentelemetry-javaagent-all.jar"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    val ktorVersion = "1.6.5"
    implementation("io.ktor:ktor-client-core:$ktorVersion")
    implementation("io.ktor:ktor-client-apache:$ktorVersion")
    implementation("io.ktor:ktor-client-java:$ktorVersion")
    implementation("io.ktor:ktor-client-cio:$ktorVersion")
}