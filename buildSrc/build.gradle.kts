plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(libs.spring.boot.plugin)
    implementation(libs.graalvm.buildtools)
}

repositories {
    mavenCentral()
}
