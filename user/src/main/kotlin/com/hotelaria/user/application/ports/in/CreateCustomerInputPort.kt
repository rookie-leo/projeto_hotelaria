package com.hotelaria.user.application.ports.`in`

import com.hotelaria.user.application.core.domain.Customer

interface CreateCustomerInputPort {
    fun create(customer: Customer)
}
