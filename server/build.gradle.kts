plugins {
    kotlin("jvm")
    application
}

application {
    mainClass.set("ServerKt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    val ktorVersion = "1.6.5"
    implementation("io.ktor:ktor-server-core:$ktorVersion")
    implementation("io.ktor:ktor-server-netty:$ktorVersion")
    implementation("org.slf4j:slf4j-simple:1.7.32")
}
