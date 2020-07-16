package com.dev_planet.android_rainbowcake.ui.user

import co.zsmb.rainbowcake.withIOContext
import com.dev_planet.android_rainbowcake.model.interactor.UserInteractor

class UserPresenter(private val userInteractor: UserInteractor) {
    suspend fun getData() = withIOContext {
        userInteractor.getUserInfo()
    }
}