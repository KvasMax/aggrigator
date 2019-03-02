plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    compileSdkVersion(28)

    defaultConfig {
        minSdkVersion(14)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"

    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

}

val versionDagger = "2.15"

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.21")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.1.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.1.0")

    api("androidx.recyclerview:recyclerview:1.0.0")
    api("androidx.annotation:annotation:1.1.0-alpha01")
    api("androidx.lifecycle:lifecycle-viewmodel:2.1.0-alpha02")
    api("androidx.fragment:fragment:1.0.0")
    api("org.glassfish:javax.annotation:10.0-b28")

    api("com.google.dagger:dagger:${versionDagger}")

    testImplementation("junit:junit:4.12")
    androidTestImplementation("com.android.support.test:runner:1.0.2")
    androidTestImplementation("com.android.support.test.espresso:espresso-core:3.0.2")
}