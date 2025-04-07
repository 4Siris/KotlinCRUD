package org.example.kotlinCRUD.models

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
class DataEntity(@Id
                 @GeneratedValue(strategy = GenerationType.UUID)
                 var id:String,
                 var someData: String) {
}