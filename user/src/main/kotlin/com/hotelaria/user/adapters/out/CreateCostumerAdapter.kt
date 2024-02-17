package com.hotelaria.user.adapters.out

import com.hotelaria.user.adapters.out.repositories.CustomerRepository
import com.hotelaria.user.adapters.out.repositories.PreferencesRepository
import com.hotelaria.user.adapters.out.repositories.entities.CustomerEntity
import com.hotelaria.user.application.ports.out.CreateCustomerOutputPort
import org.springframework.stereotype.Component

@Component
class CreateCostumerAdapter(
    private val customerRepository: CustomerRepository,
    private val preferencesRepository: PreferencesRepository
) : CreateCustomerOutputPort {
    override fun create(customer: CustomerEntity) {
        preferencesRepository.save(customer.preferences)
        customerRepository.save(customer)
    }
}
