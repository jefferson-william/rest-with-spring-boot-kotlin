package br.com.kotlin.model

import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.Id
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Column

@Entity
@Table(name = "Person")
data class Person (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    @Column(nullable = false, length = 255)
    var firstName: String = "",
    
    @Column(nullable = false, length = 255)
    var lastName: String = "",

    @Column(nullable = false, length = 255)
    var address: String = "",
 
    @Column(nullable = false, length = 255)
    var gender: String = "",
) {
}