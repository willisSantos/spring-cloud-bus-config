import org.springframework.boot.gradle.tasks.run.BootRun

plugins {
    id("java-conventions")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-aop")
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("org.springframework.cloud:spring-cloud-starter-config")
}

tasks.named<JavaExec>("bootRun") {
    jvmArgs = listOf("-javaagent:" + rootDir + "\\lib\\aspectjweaver-1.9.22.1.jar",
        "-javaagent:" + rootDir + "\\lib\\spring-instrument-6.1.12.jar")
}
