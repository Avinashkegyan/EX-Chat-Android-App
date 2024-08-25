plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.google.gms.google.services)

}

android {
    namespace = "com.avi.javachat"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.avi.javachat"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    packagingOptions {
        exclude("META-INF/DEPENDENCIES")
        pickFirst("META-INF/DEPENDENCIES")
    }

}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)


    implementation(libs.firebase.analytics)
    implementation(libs.firebase.bom)

    // Firebase dependencies
    implementation("com.android.support:support-v4:27.1.1")
    implementation("com.android.support:design:27.1.1")
    implementation("com.google.firebase:firebase-auth:16.0.2")
    implementation("com.google.firebase:firebase-database:16.0.1")
    implementation("com.google.firebase:firebase-core:16.0.1")
    implementation("com.google.firebase:firebase-storage:16.0.1")
    implementation("com.android.support:cardview-v7:27.1.1")
    implementation("com.rengwuxian.materialedittext:library:2.1.4")

    implementation("de.hdodenhof:circleimageview:2.2.0")
    implementation ("com.github.bumptech.glide:glide:4.8.0")

    implementation ("com.squareup.picasso:picasso:2.71828")
    implementation ("com.google.auth:google-auth-library-oauth2-http:1.15.0")

    implementation ("com.squareup.retrofit2:retrofit:2.3.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.3.0")
    implementation ("com.google.firebase:firebase-messaging:17.3.1")
    implementation ("com.google.firebase:firebase-bom:29.0.4")


    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}


