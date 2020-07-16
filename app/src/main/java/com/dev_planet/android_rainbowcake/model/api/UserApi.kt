package com.dev_planet.android_rainbowcake.model.api

import com.dev_planet.android_rainbowcake.model.entity.User
import retrofit2.http.GET

interface UserApi{

    @GET("user/1")
    suspend fun getUserInfo() : User
}