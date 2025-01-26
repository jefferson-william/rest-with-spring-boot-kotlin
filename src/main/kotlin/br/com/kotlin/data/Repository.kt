package br.com.kotlin.data

import br.com.kotlin.model.Person

interface PersonRepository {
    fun findById(id: Long): Person
    fun findAll(): List<Person>
    fun create(person: Person): Person
    fun update(person: Person): Person
    fun delete(id: Long)
}