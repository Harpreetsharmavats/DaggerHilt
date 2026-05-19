package com.example.daggerhilt.data.remote

import com.example.cleanarchitecture.data.model.DomainUserResponse
import com.example.cleanarchitecture.data.model.RandomResponse
import retrofit2.http.GET


interface ApiService {

    @GET("api/")
    suspend fun getUser() : List<DomainUserResponse>
}
