package com.hotelaria.user.application.extensions

import com.hotelaria.user.adapters.`in`.controllers.requests.PreferencesRequest
import com.hotelaria.user.adapters.out.repositories.entities.PreferencesEntity
import com.hotelaria.user.application.core.domain.Preferences

fun Preferences.toPreferencesEntity(): PreferencesEntity {
    return PreferencesEntity(
        id = this.id,
        roomType = this.roomType,
        preferredFloor = this.preferredFloor,
        additionalService = this.additionalService
    )
}

fun PreferencesRequest.toPreferences(): Preferences {
    return Preferences(
        roomType = this.roomType,
        preferredFloor = this.preferredFloor,
        additionalService = this.additionalService
    )
}