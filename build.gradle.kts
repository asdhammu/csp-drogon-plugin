import org.jetbrains.intellij.platform.gradle.TestFrameworkType

plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "2.3.0"
    id("org.jetbrains.intellij.platform") version "2.10.5"
}

group = "com.asdhammu"
version = "1.1.1"

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    intellijPlatform {
        create("CL", "2024.2.3")
        testFramework(TestFrameworkType.Platform)
        zipSigner()
    }
    testImplementation("junit:junit:4.13.2")
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

sourceSets["main"].java.srcDirs("src/main/gen")

intellijPlatform {
    publishing {
        token.set(System.getenv("PUBLISH_TOKEN"))
    }

    signing {
        certificateChain.set(System.getenv("CERTIFICATE_CHAIN"))
        privateKey.set(System.getenv("PRIVATE_KEY"))
        password.set(System.getenv("PRIVATE_KEY_PASSWORD"))
    }
    pluginConfiguration {
        id.set("csp-drogon-plugin")
        name.set("CSP Drogon")
        version.set("1.1.1")
        description.set("CSP drogon plugin. Plugin provides html and CPP parsing for drogon directives")
        ideaVersion {
            sinceBuild.set("242")
            untilBuild.set(provider{null})
        }
    }
}

tasks {
    test{
        useJUnit()
    }

    withType<JavaCompile> {
        sourceCompatibility = "21"
        targetCompatibility = "21"
        options.encoding = "UTF-8"
    }
}