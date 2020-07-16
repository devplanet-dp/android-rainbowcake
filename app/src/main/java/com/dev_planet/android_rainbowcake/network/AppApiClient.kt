package com.dev_planet.android_rainbowcake.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory



fun createAppApiClient(
    baseUrl: String
): Retrofit = retrofitClient(
    baseUrl
)


private fun retrofitClient(
    baseUrl: String
): Retrofit = Retrofit.Builder()
    .baseUrl(baseUrl)
    .addConverterFactory(GsonConverterFactory.create())
    .build()