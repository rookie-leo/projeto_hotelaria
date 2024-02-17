package com.hotelaria.user.application.ports.out

import com.hotelaria.user.adapters.out.repositories.entities.CustomerEntity

interface CreateCustomerOutputPort {
    fun create(customer: CustomerEntity)
}
