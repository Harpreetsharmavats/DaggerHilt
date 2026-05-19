package com.example.daggerhilt.data.repository

import com.example.cleanarchitecture.data.model.DomainUserResponse
import com.example.daggerhilt.data.remote.ApiService
import com.example.daggerhilt.domain.repository.UserRepository
import jakarta.inject.Inject

class UserRepositoryImpl @Inject constructor(
    val api : ApiService
) : UserRepository {
    override suspend fun getUser(): List<DomainUserResponse> {
        return api.getUser()
    }
}