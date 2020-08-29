import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

buildscript {
    val kotlinVersion by extra("1.4.0")
    repositories {
        jcenter()
        google()
        mavenCentral()
        maven(url = "https://plugins.gradle.org/m2/")
    }

    dependencies {
        classpath(Libs.Kotlin.GRADLE.full)
        classpath(Libs.AndroidGradle.GRADLE.full)
        classpath(Libs.Detekt.GRADLE.full)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    }
}

allprojects {
    repositories {
        jcenter()
        google()
        maven("https://jitpack.io")
    }
}
