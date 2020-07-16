package com.dev_planet.android_rainbowcake.di

import com.dev_planet.android_rainbowcake.model.api.UserApi
import com.dev_planet.android_rainbowcake.model.interactor.UserInteractor
import com.dev_planet.android_rainbowcake.network.createAppApiClient
import com.dev_planet.android_rainbowcake.ui.user.UserPresenter
import com.dev_planet.android_rainbowcake.ui.user.UserViewModel
import org.koin.dsl.module


val appApiClient = createAppApiClient("https://api.github.com/")
val userApi = appApiClient.create(UserApi::class.java)

val network = module {
    factory { userApi }
}
val user = module {
    factory { UserPresenter(get()) }
    factory { UserViewModel(get()) }
    factory { UserInteractor(get()) }
}