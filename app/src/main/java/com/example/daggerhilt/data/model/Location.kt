package com.example.daggerhilt.data.model

import com.example.daggerhilt.domain.model.Coordinates
import com.example.daggerhilt.domain.model.Street
import com.example.daggerhilt.domain.model.Timezone

data class Location(
    val city: String,
    val coordinates: Coordinates,
    val country: String,
    val postcode: Int,
    val state: String,
    val street: Street,
    val timezone: Timezone
)