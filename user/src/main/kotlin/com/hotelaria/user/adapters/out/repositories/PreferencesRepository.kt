package com.hotelaria.user.adapters.out.repositories

import com.hotelaria.user.adapters.out.repositories.entities.PreferencesEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PreferencesRepository : CrudRepository<PreferencesEntity, Int> {
}