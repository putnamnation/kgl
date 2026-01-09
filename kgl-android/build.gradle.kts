plugins {
    id("com.android.library")
    id("kotlin-android")
    id("maven-publish")
}

android {
    namespace = "com.danielgergely.kgl"

    compileSdk = 33

    defaultConfig {
        minSdk = 21
        targetSdk = 33
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlin {
        compilerOptions {
            jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_1_8)
        }
    }

    sourceSets {
        getByName("main") {
            java.srcDir("src/main/kotlin")
        }
    }
}

dependencies {
    implementation(libs.kotlin.stdlib)

//    implementation(project(":kgl"))
    implementation(projects.kgl.kgl)
}

afterEvaluate {
    publishing {
//        addRepositoryIfPresent(project)
//
//        publications {
//            create<MavenPublication>("maven") {
//                from(project.components["release"])
//
//                groupId = "com.danielgergely.kgl"
//                artifactId = "kgl-android"
//                version = currentVersion
//            }
//        }
    }
}
