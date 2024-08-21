plugins {
    id("java")
    id("org.springframework.boot")
    id("org.graalvm.buildtools.native")
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    implementation(platform("org.springframework.boot:spring-boot-dependencies:3.3.2"))
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("io.projectreactor:reactor-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}
//TODO search for clean ways to organize
val catalogs = extensions.getByType<VersionCatalogsExtension>()
val libs = catalogs.named("libs")
dependencies.addProvider("compileOnly", libs.findLibrary("lombok").get())
dependencies.addProvider("annotationProcessor", libs.findLibrary("lombok").get())

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

tasks.test {
    useJUnitPlatform()
}
