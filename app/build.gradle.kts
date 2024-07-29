plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)

    id("kotlin-kapt")
    id("kotlin-android")

    id("androidx.navigation.safeargs")

    id("com.google.gms.google-services")
    id ("kotlin-parcelize")
}

android {
    signingConfigs {
        getByName("debug") {
            storeFile = file("E:\\Workspace\\android\\N8_shopsmart\\keystore\\shopsmart.jks")
            storePassword = "123456"
            keyAlias = "shopsmart"
            keyPassword = "123456"
        }
    }

    namespace = "com.example.n8_shopsmart"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.n8_shopsmart"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
        dataBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    val nav_version = "2.5.3"
    // navigation component
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")

    // intuit
    implementation("com.intuit.ssp:ssp-android:1.1.0")
    implementation("com.intuit.sdp:sdp-android:1.1.0")

    // retrofit call api
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    // glide
    implementation("com.github.bumptech.glide:glide:4.16.0")
    kapt("com.github.bumptech.glide:compiler:4.16.0")

    // gson
    implementation("com.google.code.gson:gson:2.10.1")

    // circle imageview
    implementation ("de.hdodenhof:circleimageview:3.1.0")

    // slide
    implementation("com.github.smarteist:autoimageslider:1.4.0")

    // firebase
    implementation(platform("com.google.firebase:firebase-bom:32.5.0"))
    implementation("com.google.firebase:firebase-analytics")

    // realtime
    implementation("com.google.firebase:firebase-database")

    // authentication
    implementation("com.google.firebase:firebase-auth")

    // image picker
    implementation ("com.github.dhaval2404:imagepicker:2.1")

    // storage
    implementation("com.google.firebase:firebase-storage")
}