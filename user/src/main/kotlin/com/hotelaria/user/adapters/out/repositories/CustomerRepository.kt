package com.hotelaria.user.adapters.out.repositories

import com.hotelaria.user.adapters.out.repositories.entities.CustomerEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository : JpaRepository<CustomerEntity, Long> {

}
