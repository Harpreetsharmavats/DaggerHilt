package com.example.daggerhilt.data.remote

import com.example.daggerhilt.data.model.RandomResponse
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {

    @GET("api/")
    suspend fun getUser(
        @Query("results") result : Int = 5
    ) : RandomResponse
}
