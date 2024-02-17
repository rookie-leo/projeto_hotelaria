package com.hotelaria.user.adapters.`in`.controllers.requests

import com.fasterxml.jackson.annotation.JsonAlias

data class PreferencesRequest (
    @JsonAlias("room_type")
    val roomType: String,

    @JsonAlias("preferred_floor")
    val preferredFloor: Int,

    @JsonAlias("additional_service")
    val additionalService: String
)
