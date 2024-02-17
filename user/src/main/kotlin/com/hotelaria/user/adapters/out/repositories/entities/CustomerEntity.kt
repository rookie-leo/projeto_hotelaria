package com.hotelaria.user.adapters.out.repositories.entities

import jakarta.persistence.*

@Entity(name = "tb_customer")
data class CustomerEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null,

    @Column(name = "name")
    val name: String,

    @Column(name = "email")
    val email: String,

    @Column(name = "password")
    val password: String,

    @Column(name = "phone")
    val phone: String,

    @OneToOne
    @JoinColumn(name = "preferences_id")
    val preferences: PreferencesEntity
)
