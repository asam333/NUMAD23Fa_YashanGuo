plugins {
    id("com.android.application")
}

android {
    signingConfigs {
        create("config") {
            storeFile = file("/Users/guoyashan/Desktop/keystore")
            storePassword = "041899"
            keyAlias = "asam first key"
            keyPassword = "041899"
        }
    }
    namespace = "edu.northeastern.numad23fa_yashanguo"
    compileSdk = 33

    defaultConfig {
        applicationId = "edu.northeastern.numad23fa_yashanguo"
        minSdk = 27
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            signingConfig = signingConfigs.getByName("config")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}