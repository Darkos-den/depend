# depend
Tools for manage project dependencies. Designed for use with kotlin dsl.

[![](https://jitpack.io/v/Darkos-den/depend.svg)](https://jitpack.io/#Darkos-den/depend)

## Usage
Add imports:
```kotlin
import com.darkos.depend.Depend
import com.darkos.depend.applyDependencies
import com.darkos.depend.implementation
import com.darkos.depend.stringDepend
import com.darkos.depend.depend
```

Declare dependencies list(default dependencies declared in Libs class):
```kotlin
val dependencyList: List<Depend> = listOf(
    implementation(Libs.Kotlin.STDLIB), //for single dependency
    *Libs.AndroidX.Compose.all, //for dependency group
    depend { 
        "kapt" to Libs.AndroidX.AppCompat.CORE //kapt can only be used this way at the moment
    },
    stringDepend { 
        "implementation" to "androidx.compose:compose-runtime:1.0.0" //for custom dependency string
    }
)
```

Apply dependency list:
```kotlin
dependencies {
    applyDependencies(dependencyList)
}
```

## Customization

### Change version
Declare function in buildSrc for change versions:
```kotlin
fun applyVersions(){
}
```

Change versions:
```kotlin
fun applyVersions(){
    Versions.kotlin = "1.3.72"
}
```

Call this function from build.gradle.kts project level:
```kotlin
buildscript {
    applyVersions()
    
    ...
}
```

### Create new dependency

Implement IDepend:
```kotlin
val material = object : IDepend {
    override val depend = "com.google.android.material:material"
    override val version = "1.1.1"
}
```

Use created dependency:
```kotlin
val dependencyList: List<Depend> = listOf(
    implementation(material),
    ...
)
```
