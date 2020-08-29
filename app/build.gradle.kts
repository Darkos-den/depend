import config.depends.applyDependencies
import config.depends.implementation

plugins {
    id("com.android.application")
    kotlin("android")
    id("app-config-android")
}

val deps = listOf(
    implementation(Libs.Kotlin.STDLIB),
    implementation(Libs.AndroidX.Activity.KTX),
    implementation(Libs.AndroidX.AppCompat.CORE),
    *Libs.AndroidX.Compose.all,
    implementation(Libs.Coroutines.ANDROID)
)

androidApplicationConfig()

dependencies {
    applyDependencies(deps)
}
