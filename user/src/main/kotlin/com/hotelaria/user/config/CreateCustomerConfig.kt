package com.hotelaria.user.config

import com.hotelaria.user.adapters.out.CreateCostumerAdapter
import com.hotelaria.user.application.core.usecases.CreateCustomerUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class CreateCustomerConfig {

    @Bean
    fun createCustomerUseCase(createCustomerAdapter: CreateCostumerAdapter): CreateCustomerUseCase {
        return CreateCustomerUseCase(createCustomerAdapter)
    }

}