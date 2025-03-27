plugins {
    kotlin("jvm")
    id("maven-publish")
}

repositories {
    mavenCentral()
}

//version = currentVersion

dependencies {
    implementation(libs.kotlin.stdlib)

    implementation(libs.org.lwjgl)
    implementation(libs.org.lwjgl.assimp)
    implementation(libs.org.lwjgl.glfw)
    implementation(libs.org.lwjgl.openal)
    implementation(libs.org.lwjgl.opengl)
    implementation(libs.org.lwjgl.stb)

    implementation(projects.kgl.kgl)
}

java {
    withSourcesJar()
}

publishing {
//    addRepositoryIfPresent(project)
//
//    publications {
//        create<MavenPublication>("maven") {
//            groupId = "com.danielgergely.kgl"
//            artifactId = "kgl-lwjgl"
//            version = currentVersion
//
//            from(components["java"])
//        }
//    }
}
