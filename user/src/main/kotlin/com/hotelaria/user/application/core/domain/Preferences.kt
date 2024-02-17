package com.hotelaria.user.application.core.domain

data class Preferences (
    val id: Int? = null,
    val roomType: String,
    val preferredFloor: Int,
    val additionalService: String
)
