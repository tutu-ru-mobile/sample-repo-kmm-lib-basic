plugins {
    id("com.android.library")
    kotlin("multiplatform")
}

android {
    boilerplate()
}

kotlin {
    iosX64("iOS")
    js {
        browser { }
    }
    android()
    jvm()
    sourceSets {
        val commonMain by getting {
            dependencies {
                api("org.jetbrains.kotlinx:kotlinx-coroutines-core:$COROUTINES_VERSION") {
//                    isForce = true
                }
            }
        }
        val jsMain by getting {
            dependencies {
                apiReact()
            }
        }
        val androidMain by getting {
            dependencies {
                implementationComposeApi()
            }
        }
        val jvmMain by getting {
            dependencies {
                api(project(":lib-idea-adapter"))
            }
        }
    }
}

fixComposeWithWorkaround()
