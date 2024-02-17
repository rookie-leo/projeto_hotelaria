package com.hotelaria.user.application.extensions

import com.hotelaria.user.adapters.`in`.controllers.requests.CreateCustomerRequest
import com.hotelaria.user.adapters.out.repositories.entities.CustomerEntity
import com.hotelaria.user.application.core.domain.Customer

fun Customer.toCustomerEntity(): CustomerEntity {
    return CustomerEntity(
        id = this.id,
        name = this.name,
        email = this.email,
        password = this.password,
        phone = this.phone,
        preferences = this.preferences.toPreferencesEntity()
    )
}

fun CreateCustomerRequest.toCustomer(): Customer {
    return Customer(
        name = this.name,
        email = this.email,
        password = this.password,
        phone = this.phone,
        preferences = this.preferences.toPreferences()
    )
}