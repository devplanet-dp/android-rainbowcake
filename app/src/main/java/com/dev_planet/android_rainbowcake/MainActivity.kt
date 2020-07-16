package com.dev_planet.android_rainbowcake

import android.os.Bundle
import co.zsmb.rainbowcake.navigation.SimpleNavActivity
import com.dev_planet.android_rainbowcake.ui.user.UserFragment

class MainActivity : SimpleNavActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            navigator.add(UserFragment())
        }
    }
}