package com.example.daggerhilt.domain.UseCases

import com.example.daggerhilt.domain.model.DomainUserResponse
import com.example.daggerhilt.domain.repository.UserRepository
import javax.inject.Inject

class UserUseCase @Inject constructor(
    val repository: UserRepository)
 {
     suspend operator fun invoke(): List<DomainUserResponse> {
         return repository.getUser()
     }
}