package org.example.kotlinCRUD.repositories

import org.example.kotlinCRUD.models.DataEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DataRepository : JpaRepository<DataEntity, String>{
}