package com.hotelaria.user.adapters.`in`.controllers

import com.hotelaria.user.adapters.`in`.controllers.requests.CreateCustomerRequest
import com.hotelaria.user.application.core.usecases.CreateCustomerUseCase
import jakarta.validation.Valid
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

import com.hotelaria.user.application.extensions.toCustomer
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@Controller
@RequestMapping("api/v1/customers")
class CustomerController(
    val createClienteUseCase: CreateCustomerUseCase
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createCliente(@Valid @RequestBody customerRequest: CreateCustomerRequest) {
        createClienteUseCase.create(customerRequest.toCustomer())
    }

}