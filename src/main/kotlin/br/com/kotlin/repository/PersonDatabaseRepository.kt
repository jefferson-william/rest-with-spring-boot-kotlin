package br.com.kotlin.repository

import br.com.kotlin.model.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonDatabaseRepository : JpaRepository<Person, Long?> {}