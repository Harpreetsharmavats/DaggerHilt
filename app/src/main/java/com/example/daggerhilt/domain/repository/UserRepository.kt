package com.example.daggerhilt.domain.repository

import com.example.daggerhilt.domain.model.DomainUserResponse

interface UserRepository {
    suspend fun getUser() : List<DomainUserResponse>
}