plugins {
    id("java")
}

repositories {
    maven {
        setUrl("https://repo.maven.apache.org/maven2")

    }
}
        dependencies {
            testImplementation("com.intuit.karate:karate-junit5:1.2.0.RC4")
        }


