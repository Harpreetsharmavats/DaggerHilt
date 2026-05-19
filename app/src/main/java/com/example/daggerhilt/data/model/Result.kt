package com.example.daggerhilt.data.model

import com.example.daggerhilt.domain.model.Dob
import com.example.daggerhilt.domain.model.Id
import com.example.daggerhilt.domain.model.Location
import com.example.daggerhilt.domain.model.Login
import com.example.daggerhilt.domain.model.Name
import com.example.daggerhilt.domain.model.Picture
import com.example.daggerhilt.domain.model.Registered

data class Result(
    val cell: String,
    val dob: Dob,
    val email: String,
    val gender: String,
    val id: Id,
    val location: Location,
    val login: Login,
    val name: Name,
    val nat: String,
    val phone: String,
    val picture: Picture,
    val registered: Registered
)