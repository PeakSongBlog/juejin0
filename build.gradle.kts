
allprojects {
    repositories {
        mavenLocal()
        maven { setUrl("https://maven.aliyun.com/repository/public") }
        maven { setUrl("https://maven.aliyun.com/repository/central") }
        maven { setUrl("https://maven.aliyun.com/repository/spring") }
        maven { setUrl("https://maven.aliyun.com/repository/jcenter") }
        maven { setUrl("https://maven.aliyun.com/repository/apache-snapshots") }
        maven { setUrl("https://maven.aliyun.com/repository/google") }
        maven { setUrl("https://maven.aliyun.com/repository/releases") }
        maven { setUrl("https://maven.aliyun.com/repository/snapshots") }
        maven { setUrl("https://maven.aliyun.com/repository/grails-core") }
        maven { setUrl("https://maven.aliyun.com/repository/mapr-public") }
        maven { setUrl("https://maven.aliyun.com/repository/gradle-plugin") }
        maven { setUrl("https://maven.aliyun.com/repository/spring-plugin") }
    }
}

group = "blog.peaksong"
version = "0.0.1-SNAPSHOT"
