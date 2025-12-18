import java.net.URI

plugins {
    id("java")
    id("java-library")
    id("maven-publish")
    id("signing")
}

val artefactVersion: String by project

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
    withSourcesJar()
    withJavadocJar()
}

repositories {
    mavenLocal()
    mavenCentral()
}

group = "com.onixbyte"
version = artefactVersion

publishing {
    publications.create<MavenPublication>("maven") {
        groupId = group.toString()
        artifactId = "region"
        version = artefactVersion

        pom {
            name = "Onixbyte Regions"
            description = "Regions data according to ISO-3166-1"
            url = "https://github.com/onixbyte/region"

            licenses {
                license {
                    name = "MIT"
                    url = "https://github.com/onixbyte/region/blob/main/LICENSE"
                }
            }

            scm {
                connection = "scm:git:git://github.com:onixbyte/region.git"
                developerConnection = "scm:git:git://github.com:onixbyte/region.git"
                url = "https://github.com/onixbyte/region"
            }

            developers {
                developer {
                    id = "zihluwang"
                    name = "zihluwang"
                    timezone = "Asia/Hong_Kong"
                    url = "https://github.com/zihluwang"
                }

                developer {
                    id = "siujamo"
                    name = "siujamo"
                    timezone = "Asia/Shanghai"
                    url = "https://github.com/siujamo"
                }
            }
        }

        from(components["java"])

        signing {
            sign(publishing.publications["maven"])
        }
    }

    repositories {
        maven {
            name = "sonatypeNexus"
            url = URI(providers.gradleProperty("repo.maven-central.host").get())
            credentials {
                username = providers.gradleProperty("repo.maven-central.username").get()
                password = providers.gradleProperty("repo.maven-central.password").get()
            }
        }
    }
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}

tasks.withType<Javadoc>() {
    options.encoding = "UTF-8"
}
