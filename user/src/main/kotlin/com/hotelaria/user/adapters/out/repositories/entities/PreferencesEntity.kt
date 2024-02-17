package com.hotelaria.user.adapters.out.repositories.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity(name = "tb_preferences")
data class PreferencesEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null,

    @Column(name = "room_type")
    val roomType: String,

    @Column(name = "preferred_floor")
    val preferredFloor: Int,

    @Column(name = "additional_service")
    val additionalService: String
)
