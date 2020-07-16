package com.dev_planet.android_rainbowcake.model.interactor

import com.dev_planet.android_rainbowcake.model.api.UserApi
import com.dev_planet.android_rainbowcake.model.entity.User

class UserInteractor(private val userApi: UserApi) {
    suspend fun getUserInfo(): User {
        return userApi.getUserInfo()
    }
}