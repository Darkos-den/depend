import com.darkos.depend.applyDependencies
import com.darkos.depend.implementation

plugins {
    id("com.android.application")
    kotlin("android")
    id("app-config-android")
}

val deps: List<com.darkos.depend.Depend> = listOf(
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
