package com.example.daggerhilt.data.remote

import com.example.daggerhilt.data.model.RandomResponse
import com.example.daggerhilt.domain.model.DomainUserResponse
import retrofit2.http.GET


interface ApiService {

    @GET("api/")
    suspend fun getUser() : List<DomainUserResponse>
}
