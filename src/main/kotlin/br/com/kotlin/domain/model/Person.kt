package br.com.kotlin.domain.model

import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.Id
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Column

@Entity(name = "person")
@Table(name = "person")
data class Person (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    @Column(name = "firstName", nullable = false, length = 255)
    var firstName: String = "",
    
    @Column(name = "lastName", nullable = false, length = 255)
    var lastName: String = "",

    @Column(name = "address", nullable = false, length = 255)
    var address: String = "",
 
    @Column(name = "gender", nullable = false, length = 255)
    var gender: String = "",
) {
}