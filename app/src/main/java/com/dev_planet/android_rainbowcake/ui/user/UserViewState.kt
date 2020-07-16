package com.dev_planet.android_rainbowcake.ui.user

import com.dev_planet.android_rainbowcake.model.entity.User

sealed class UserViewState

object Initial : UserViewState()

object Loading : UserViewState()

class Error(val errorMessage: String?) : UserViewState()

data class UserReady(val data: User) : UserViewState()