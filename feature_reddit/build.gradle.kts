plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android.extensions")
    kotlin("android")
    kotlin("kapt")
}

android {
    compileSdkVersion(28)
    defaultConfig {
        minSdkVersion(22)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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

    implementation("android.arch.lifecycle:extensions:1.1.1")
    implementation("androidx.lifecycle:lifecycle-livedata:2.1.0-alpha02")

    api(project(":core_utils"))
    api(project(":core"))

    implementation("androidx.constraintlayout:constraintlayout:1.1.3")

    implementation("com.squareup.retrofit2:retrofit:2.5.0")
    implementation("com.squareup.retrofit2:converter-moshi:2.5.0")
    implementation("com.serjltt.moshi:moshi-lazy-adapters:2.2")
    implementation("com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:0.9.2")
    implementation("com.squareup.okhttp3:logging-interceptor:3.12.0")

    implementation("com.squareup.picasso:picasso:2.71828")
    implementation("pl.droidsonroids.gif:android-gif-drawable:1.2.16")
    implementation("com.koushikdutta.ion:ion:2.+")


    kapt("com.google.dagger:dagger-compiler:${versionDagger}")

    testImplementation("junit:junit:4.12")
    androidTestImplementation("androidx.test:runner:1.1.2-alpha01")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.1.2-alpha01")
}
