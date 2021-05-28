package com.example.runmvvmmapsroomcoroutinessettingshilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

// Generated dagger hilt components for Android classes and component lifetimes refer below link
// https://developer.android.com/training/dependency-injection/hilt-android#generated-components
@HiltAndroidApp
class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // To enable logging from timber library.
        Timber.plant(Timber.DebugTree())
    }
}