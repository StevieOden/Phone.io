package com.example.phoneio.retrofit

import com.example.phoneio.AppleDescriptionModel
import com.example.phoneio.AppleModel
import retrofit2.Call
import retrofit2.http.*

interface ApiEndpoint {

    @GET("brands/apple-phones-48")
    fun data(): Call<AppleModel>

    @GET("{slug}")
    fun datadetail(@Path("slug") slug: String): Call<AppleDescriptionModel>

}