pluginManagement {
    repositories {
        mavenLocal()
        maven { setUrl("https://maven.aliyun.com/repository/gradle-plugin") }
        maven { setUrl("https://maven.aliyun.com/repository/spring-plugin") }
        maven { setUrl("https://maven.aliyun.com/repository/central") }
        maven { setUrl("https://maven.aliyun.com/repository/public") }
    }

    plugins {
        id("org.springframework.boot") version "2.4.5"
        id("io.spring.dependency-management") version "1.0.11.RELEASE"
        kotlin("jvm") version "1.4.32"
        kotlin("plugin.spring") version "1.4.32"
    }
}

rootProject.name = "juejin0"

include(":demo0")
include(":demo1")

