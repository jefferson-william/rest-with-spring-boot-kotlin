package br.com.kotlin.repository.postgres

import br.com.kotlin.exception.ResourceNotFoundException
import br.com.kotlin.model.Person
import br.com.kotlin.repository.PersonDatabaseRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import java.util.logging.Logger

@Repository("PersonPostgresRepository")
class PersonPostgresRepository {
    @Autowired
    private lateinit var repository: PersonDatabaseRepository
    private val logger = Logger.getLogger(PersonPostgresRepository::class.java.name)

    fun findById(id: Long): Person {
        logger.info("Finding one person!")
        return repository.findById(id).orElseThrow({ ResourceNotFoundException("No records found for this identifier!")})
    }

    fun findAll(): List<Person> {
        logger.info("Finding all people!")
        val persons = repository.findAll()
        return persons
    }

    fun create(person: Person): Person {
        return repository.save(person)
    }

    fun update(id: Long, payload: Person): Person {
        val person = repository.findById(id).orElseThrow({ ResourceNotFoundException("No records found for this identifier!")})
        person.firstName = payload.firstName
        person.lastName = payload.lastName
        person.address = payload.address
        person.gender = payload.gender
        return repository.save(person)
    }

    fun delete(id: Long) {
        val person = repository.findById(id).orElseThrow({ ResourceNotFoundException("No records found for this identifier!")})
        repository.delete(person)
    }
}