// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.3" apply false
}
buildscript {
    repositories {
        google()
    }
    dependencies {
        val nav_version = "2.7.5"
        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version")
    }
}