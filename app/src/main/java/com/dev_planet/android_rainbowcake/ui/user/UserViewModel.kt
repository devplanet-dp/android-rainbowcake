package com.dev_planet.android_rainbowcake.ui.user

import co.zsmb.rainbowcake.base.RainbowCakeViewModel

class UserViewModel(
    private val userPresenter: UserPresenter
) : RainbowCakeViewModel<UserViewState>(Initial) {
    fun load() = execute {
        try {
            viewState = Loading
            viewState = UserReady(userPresenter.getData())
        } catch (e: Exception) {
            viewState = Error(e.message)
        }
    }
}