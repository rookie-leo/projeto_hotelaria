package com.hotelaria.user.application.core.domain

class Customer (
    val id: Int? = null,
    val name: String,
    val email: String,
    val password: String,
    val phone: String,
    val preferences: Preferences
)
