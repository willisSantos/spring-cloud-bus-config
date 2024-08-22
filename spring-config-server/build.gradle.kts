plugins {
    id("java-conventions")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

dependencies {
    implementation("org.springframework.cloud:spring-cloud-config-server")
}
