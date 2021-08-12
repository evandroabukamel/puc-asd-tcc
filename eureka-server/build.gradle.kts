import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	java
	id("org.springframework.boot") version "2.5.3"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	kotlin("jvm") version "1.5.21"
	kotlin("plugin.spring") version "1.5.21"
}

group = "br.elakc"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_15

repositories {
	mavenCentral()
	maven {
		url = uri("https://repo.spring.io/milestone")
	}
}

extra["springBootDocsVersion"] = "2.5.3"
extra["springCloudVersion"] = "2020.0.3"
extra["springBootGradlePluginVersion"] = "2.5.0-M1"

buildscript {
	repositories {
		mavenCentral()
	}

	dependencies {
		classpath("org.springframework.boot:spring-boot-gradle-plugin:2.5.3")
	}
}

apply(plugin = "java")
apply(plugin = "org.springframework.boot")
apply(plugin = "io.spring.dependency-management")

dependencies {
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation("org.springframework.boot:spring-boot-gradle-plugin:2.5.3")
	implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-server:3.0.3")
	testImplementation("org.springframework.boot:spring-boot-starter-test:2.5.3")
}

dependencyManagement {
	imports {
		mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
	}
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "15"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
