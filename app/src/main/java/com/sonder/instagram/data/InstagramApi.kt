package com.sonder.instagram.data

import retrofit2.http.GET

interface InstagramApi {
    @GET(".")
    suspend fun userLogin()

    @GET(".")
    suspend fun userSignUp()

    @GET(".")
    suspend fun getData()

    @GET(".")
    suspend fun create()

    @GET(".")
    suspend fun getUserData()

    @GET(".")
    suspend fun getVideos()

    @GET(".")
    suspend fun search()
}