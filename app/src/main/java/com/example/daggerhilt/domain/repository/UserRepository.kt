package com.example.daggerhilt.domain.repository

import com.example.cleanarchitecture.data.model.DomainUserResponse

interface UserRepository {
    suspend fun getUser() : List<DomainUserResponse>
}