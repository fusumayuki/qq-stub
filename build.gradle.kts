plugins {
    alias(libs.plugins.androidLibrary)
}

android {
    namespace = "me.teble.xposed.stub"
    compileSdk {
        version = release(libs.versions.compileSdk.get().toInt()) {
            minorApiLevel = libs.versions.minorApiLevel.get().toInt()
        }
    }
    buildToolsVersion = libs.versions.buildTool.get()
    defaultConfig {
        minSdk = libs.versions.minSdk.get().toInt()
    }


    lint {
        abortOnError = false
    }
}

dependencies {
    // androidx nullability stubs
    compileOnly(libs.androidx.annotation)
    compileOnly(libs.androidx.lifecycle.common.jvm)
}
