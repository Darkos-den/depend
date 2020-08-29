import config.depends.applyDependencies
import config.depends.implementation
import config.depends.stringDepend

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
    implementation(Libs.Coroutines.ANDROID),
    implementation(Libs.material)
)

androidApplicationConfig()

dependencies {
    applyDependencies(deps)
}
