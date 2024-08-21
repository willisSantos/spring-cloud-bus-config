plugins {
    `kotlin-dsl`
}

dependencies {
    implementation("org.springframework.boot:spring-boot-gradle-plugin:3.3.2")
    implementation("org.graalvm.buildtools:native-gradle-plugin:0.10.2")
}

repositories {
    mavenCentral()
}