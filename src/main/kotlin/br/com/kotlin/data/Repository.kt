package br.com.kotlin.data

import br.com.kotlin.domain.model.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

interface PersonRepository {
    fun findById(id: Long): Person
    fun findAll(): List<Person>
    fun create(person: Person): Person
    fun update(person: Person): Person
    fun delete(id: Long)
}

@Repository
interface PersonDatabaseRepository : JpaRepository<Person, Long?> {}