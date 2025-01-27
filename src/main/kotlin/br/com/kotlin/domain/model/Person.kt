package br.com.kotlin.domain.model

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.Id
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Column

@Entity(name = "person")
@Table(name = "person")
@JsonPropertyOrder("id", "firstName", "lastName", "gender", "address")
data class Person (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    @field:JsonProperty("firstName")
    @Column(name = "first_name", nullable = false, length = 255)
    var firstName: String = "",

    @field:JsonProperty("lastName")
    @Column(name = "last_name", nullable = false, length = 255)
    var lastName: String = "",

    @Column(nullable = false, length = 255)
    var address: String = "",

    @Column(nullable = false, length = 255)
    var gender: String = "",

    @field:JsonIgnore
    @Column(nullable = false)
    var activate: Boolean = false
) {
}