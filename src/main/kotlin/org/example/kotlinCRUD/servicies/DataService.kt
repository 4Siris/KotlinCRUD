package org.example.kotlinCRUD.servicies

import org.example.kotlinCRUD.models.DataEntity
import org.example.kotlinCRUD.repositories.DataRepository
import org.hibernate.ObjectNotFoundException
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class DataService(private val dataRepository : DataRepository ) {

    fun getAll(): MutableList<DataEntity> {
        return dataRepository.findAll()
    }

    fun getById(id : String): DataEntity?{
        try {
            return dataRepository.findById(id).orElseThrow()
        } catch (e:NoSuchElementException){
            throw RuntimeException("${e.message}")
        }
    }

    fun save(data : DataEntity): DataEntity {
        return dataRepository.save(data)
    }

    fun deleteById(id: String){
        dataRepository.deleteById(id)
    }
}