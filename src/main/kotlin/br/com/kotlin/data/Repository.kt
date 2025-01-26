package br.com.kotlin.data

import br.com.kotlin.model.Person

interface PersonRepository {
    fun findById(id: Long): Person
    fun findAll(): List<Person>
}