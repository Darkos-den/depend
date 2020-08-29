val kotlinVersion = "1.4.0"
val gradleVersion = "4.2.0-alpha08"

plugins {
    `kotlin-dsl`
}

dependencies {
    implementation("com.android.tools.build:gradle:${gradleVersion}")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${kotlinVersion}")
}