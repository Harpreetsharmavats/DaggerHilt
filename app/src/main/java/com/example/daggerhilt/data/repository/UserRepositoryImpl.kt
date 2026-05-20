package com.example.daggerhilt.data.repository

import com.example.daggerhilt.data.remote.ApiService
import com.example.daggerhilt.domain.model.DomainUserResponse
import com.example.daggerhilt.domain.repository.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val api: ApiService
) : UserRepository {
    override suspend fun getUser(): List<DomainUserResponse> {
        val response = api.getUser()
        return response.results.map { DomainUserResponse(
            results = listOf(it),
            info = response.info
        )
        }
    }
    }
