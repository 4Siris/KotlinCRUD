package org.example.kotlinCRUD.controllers

import org.example.kotlinCRUD.models.DataEntity
import org.example.kotlinCRUD.servicies.DataService
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam

@Controller
class MainController (private val dataService : DataService){
    @GetMapping("/getAll")
    fun getAll():ResponseEntity<MutableList<DataEntity>>{
        return ResponseEntity(dataService.getAll(), HttpStatusCode.valueOf(200))
    }

    @GetMapping("/getById")
    fun getById(@RequestParam id: String): ResponseEntity<DataEntity>{
        return ResponseEntity(dataService.getById(id), HttpStatusCode.valueOf(200))
    }

    @PostMapping("/save")
    fun save(@RequestBody data: DataEntity): ResponseEntity<DataEntity>{
        return ResponseEntity(dataService.save(data), HttpStatusCode.valueOf(200))
    }

    @DeleteMapping("/deleteById")
    fun deleteById(@RequestParam id: String): ResponseEntity<String>{
        dataService.deleteById(id)
        return ResponseEntity("OK", HttpStatusCode.valueOf(200))
    }
}