@file:Suppress("MissingPackageDeclaration")

import org.gradle.api.JavaVersion

object BuildConfig {

    const val MIN_SDK = 24
    const val COMPILE_SDK = 32
    const val TARGET_SDK = 32
    val JAVA_VERSION = JavaVersion.VERSION_1_8
    val JAVA_VERSION_NAME = JAVA_VERSION.toString()
}