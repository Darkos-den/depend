val kotlinVersion = "1.4.0"
val gradleVersion = "4.2.0-alpha15"

plugins {
    `kotlin-dsl`
    id("com.github.dcendents.android-maven")
}

group = "com.github.Darkos-den"

dependencies {
    implementation("com.android.tools.build:gradle:${gradleVersion}")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${kotlinVersion}")
}