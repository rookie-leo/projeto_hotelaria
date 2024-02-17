package com.hotelaria.user.application.core.usecases

import com.hotelaria.user.adapters.out.CreateCostumerAdapter
import com.hotelaria.user.application.core.domain.Customer
import com.hotelaria.user.application.extensions.toCustomerEntity
import com.hotelaria.user.application.ports.`in`.CreateCustomerInputPort

class CreateCustomerUseCase(
    private val createCustomerAdapter: CreateCostumerAdapter
) : CreateCustomerInputPort {
    override fun create(customer: Customer) {
        createCustomerAdapter.create(customer.toCustomerEntity())
    }

}