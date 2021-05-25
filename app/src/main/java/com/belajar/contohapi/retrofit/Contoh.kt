package com.belajar.contohapi.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Contoh {
    private const val BASE_URL = "url api meater"

    val retrofitBuilder = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiInstance = retrofitBuilder.create(IContoh::class.java)
}