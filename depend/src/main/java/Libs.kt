import com.darkos.depend.IDepend
import com.darkos.depend.implementation

object Libs {

    enum class Kotlin(
        override val depend: String
    ) : IDepend {
        /**
         * org.jetbrains.kotlin:kotlin-stdlib-jdk8
         */
        JDK("org.jetbrains.kotlin:kotlin-stdlib-jdk8"),

        /**
         * org.jetbrains.kotlin:kotlin-stdlib
         */
        STDLIB("org.jetbrains.kotlin:kotlin-stdlib"),

        /**
         * org.jetbrains.kotlin:kotlin-reflect
         */
        REFLECT("org.jetbrains.kotlin:kotlin-reflect"),

        /**
         * org.jetbrains.kotlin:kotlin-gradle-plugin
         */
        GRADLE("org.jetbrains.kotlin:kotlin-gradle-plugin"),

        /**
         * org.jetbrains.kotlin:kotlin-stdlib-common
         */
        COMMON("org.jetbrains.kotlin:kotlin-stdlib-common");

        override val version =
            Versions.kotlin
    }

    enum class Glide(
        override val depend: String
    ) : IDepend {
        /**
         * com.github.bumptech.glide:glide
         */
        CORE("com.github.bumptech.glide:glide"),

        /**
         * com.github.bumptech.glide:compiler
         */
        COMPILER("com.github.bumptech.glide:compiler");

        override val version =
            Versions.glide
    }

    enum class Ktor(
        override val depend: String
    ) : IDepend {
        /**
         * io.ktor:ktor-client-core
         */
        CORE("io.ktor:ktor-client-core"),

        /**
         * io.ktor:ktor-client-serialization
         */
        SERIALIZATION("io.ktor:ktor-client-serialization"),

        /**
         * io.ktor:ktor-client-serialization-jvm
         */
        SERIALIZATION_JVM("io.ktor:ktor-client-serialization-jvm"),

        /**
         * io.ktor:ktor-client-serialization-native
         */
        SERIALIZATION_NATIVE("io.ktor:ktor-client-serialization-native"),

        /**
         * io.ktor:ktor-client-logging
         */
        LOGGING("io.ktor:ktor-client-logging"),

        /**
         * io.ktor:ktor-client-logging-jvm
         */
        LOGGING_JVM("io.ktor:ktor-client-logging-jvm"),

        /**
         * io.ktor:ktor-client-logging-native
         */
        LOGGING_IOS("io.ktor:ktor-client-logging-native"),

        /**
         * io.ktor:ktor-client-okhttp
         */
        OK_HTTP("io.ktor:ktor-client-okhttp"),

        /**
         * io.ktor:ktor-client-ios
         */
        IOS("io.ktor:ktor-client-ios"),

        /**
         * io.ktor:ktor-client-android
         */
        ANDROID("io.ktor:ktor-client-android");

        override val version = Versions.ktor

        companion object {
            val defaultCommon = listOf(
                implementation(CORE),
                implementation(SERIALIZATION),
                implementation(LOGGING)
            ).toTypedArray()

            val defaultAndroid = listOf(
                implementation(OK_HTTP),
                implementation(SERIALIZATION_JVM),
                implementation(LOGGING_JVM)
            ).toTypedArray()

            val defaultIos = listOf(
                implementation(IOS),
                implementation(SERIALIZATION_NATIVE),
                implementation(LOGGING_IOS)
            ).toTypedArray()
        }
    }

    enum class Coroutines(
        override val depend: String
    ) : IDepend {
        /**
         * org.jetbrains.kotlinx:kotlinx-coroutines-core-common
         */
        COMMON("org.jetbrains.kotlinx:kotlinx-coroutines-core-common"),

        /**
         * org.jetbrains.kotlinx:kotlinx-coroutines-android
         */
        ANDROID("org.jetbrains.kotlinx:kotlinx-coroutines-android"),

        /**
         * org.jetbrains.kotlinx:kotlinx-coroutines-core-native
         */
        NATIVE("org.jetbrains.kotlinx:kotlinx-coroutines-core-native");

        override val version: String
            get() = Versions.coroutines

    }

    enum class Serialization(
        override val depend: String
    ) : IDepend {
        /**
         * org.jetbrains.kotlinx:kotlinx-serialization-runtime-common
         */
        COMMON("org.jetbrains.kotlinx:kotlinx-serialization-runtime-common"),

        /**
         * org.jetbrains.kotlinx:kotlinx-serialization-runtime
         */
        RUNTIME("org.jetbrains.kotlinx:kotlinx-serialization-runtime"),

        /**
         * org.jetbrains.kotlinx:kotlinx-serialization-core
         */
        CORE("org.jetbrains.kotlinx:kotlinx-serialization-core"),

        /**
         * org.jetbrains.kotlinx:kotlinx-serialization-protobuf
         */
        PROTOBUF("org.jetbrains.kotlinx:kotlinx-serialization-protobuf"),

        /**
         * org.jetbrains.kotlinx:kotlinx-serialization-runtime-native
         */
        NATIVE("org.jetbrains.kotlinx:kotlinx-serialization-runtime-native");

        override val version: String
            get() = Versions.serialization

    }

    enum class AndroidGradle(
        override val depend: String
    ) : IDepend {
        /**
         * com.android.tools.build:gradle
         */
        GRADLE("com.android.tools.build:gradle");

        override val version: String
            get() = Versions.gradle

    }

    enum class Detekt(
        override val depend: String
    ) : IDepend {
        /**
         * io.gitlab.arturbosch.detekt:detekt-gradle-plugin
         */
        GRADLE("io.gitlab.arturbosch.detekt:detekt-gradle-plugin");

        override val version: String
            get() = Versions.detekt

    }

    /**
     * com.google.android.material:material
     */
    val material = object : IDepend {
        override val depend = "com.google.android.material:material"
        override val version = Versions.material
    }

    object AndroidX {
        enum class Activity(
            override val depend: String
        ) : IDepend {
            /**
             * androidx.activity:activity-ktx
             */
            KTX("androidx.activity:activity-ktx");

            override val version: String
                get() = Versions.AndroidX.activity

        }

        enum class AppCompat(
            override val depend: String
        ) : IDepend {
            /**
             * androidx.appcompat:appcompat
             */
            CORE("androidx.appcompat:appcompat");

            override val version: String
                get() = Versions.AndroidX.appCompat

        }

        enum class Compose(
            override val depend: String
        ) : IDepend {
            /**
             * androidx.compose.ui:ui
             */
            UI("androidx.compose.ui:ui"),

            /**
             * androidx.compose.animation:animation
             */
            ANIMATION("androidx.compose.animation:animation"),

            /**
             * androidx.compose.foundation:foundation
             */
            FOUNDATION("androidx.compose.foundation:foundation"),

            /**
             * androidx.compose.material:material
             */
            MATERIAL("androidx.compose.material:material"),

            /**
             * androidx.compose.material:material-icons-core
             */
            MATERIAL_ICONS_CORE("androidx.compose.material:material-icons-core"),

            /**
             * androidx.compose.material:material-icons-extended
             */
            MATERIAL_ICONS_EXTENDED("androidx.compose.material:material-icons-extended"),

            /**
             * androidx.compose.runtime:runtime
             */
            RUNTIME("androidx.compose.runtime:runtime"),

            /**
             * androidx.compose.runtime:runtime-livedata
             */
            RUNTIME_LIVEDATA("androidx.compose.runtime:runtime-livedata"),

            /**
             * androidx.ui:ui-tooling
             */
            TOOLING("androidx.ui:ui-tooling");

            override val version: String
                get() = Versions.AndroidX.compose

            companion object {
                val all = values().map {
                    implementation(it)
                }.toTypedArray()
            }

        }
    }

    enum class Kodein(
        override val depend: String
    ) : IDepend {
        /**
         * org.kodein.di:kodein-di-generic-jvm
         */
        JVM("org.kodein.di:kodein-di-generic-jvm"),

        /**
         * org.kodein.di:kodein-di-framework-android-x
         */
        ANDROID("org.kodein.di:kodein-di-framework-android-x"),

        /**
         * org.kodein.di:kodein-di-erased
         */
        ERASED("org.kodein.di:kodein-di-erased");

        override val version =
            Versions.kodein

        companion object {
            val defaultAndroid = listOf(
                implementation(JVM),
                implementation(ANDROID)
            ).toTypedArray()

            val defaultCommon = listOf(
                implementation(JVM),
                implementation(ERASED)
            ).toTypedArray()
        }
    }
}