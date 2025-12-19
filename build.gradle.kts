/*
 * Copyright (c) 2024-2025 OnixByte
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

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

dependencies {
    implementation(libs.jspecify.core)
    testImplementation(platform(libs.junit.bom))
    testImplementation(libs.junit.jupiter)
    testRuntimeOnly(libs.junit.platformLauncher)
}

publishing {
    publications.create<MavenPublication>("maven") {
        groupId = group.toString()
        artifactId = "regions4j"
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

tasks.test {
    useJUnitPlatform()
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}

tasks.withType<Javadoc>() {
    options.encoding = "UTF-8"
}
