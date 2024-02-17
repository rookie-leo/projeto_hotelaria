package com.hotelaria.user.adapters.`in`.controllers.requests

import jakarta.validation.constraints.NotEmpty

data class CreateCustomerRequest (
    @field:NotEmpty(message = "O nome deve ser informado")
    val name: String,

    @field:NotEmpty(message = "O email deve ser informado")// TODO - implemeentar uma anotation para validar email
    val email: String,

    @field:NotEmpty(message = "A senha deve ser informada")
    val password: String,


    val phone: String,
    val preferences: PreferencesRequest
)
