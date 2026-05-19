package com.example.daggerhilt.data.model

import com.example.daggerhilt.domain.model.Info
import com.example.daggerhilt.domain.model.Result

data class RandomResponse(
    val info: Info,
    val results: List<Result>
)