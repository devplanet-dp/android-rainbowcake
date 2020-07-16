package com.dev_planet.android_rainbowcake

import android.app.Application
import com.dev_planet.android_rainbowcake.di.network
import com.dev_planet.android_rainbowcake.di.user
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class AppCore : Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidContext(this@AppCore)
            modules(
                listOf(
                    network, user
                )
            )
        }
    }

}