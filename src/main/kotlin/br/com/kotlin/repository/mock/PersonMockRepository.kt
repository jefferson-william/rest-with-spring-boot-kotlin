package br.com.kotlin.repository.mock

import br.com.kotlin.data.PersonRepository
import br.com.kotlin.model.Person
import org.springframework.stereotype.Service
import java.util.concurrent.atomic.AtomicLong
import java.util.logging.Logger

@Service("PersonMockRepository")
class PersonMockRepository : PersonRepository {
    private val counter: AtomicLong = AtomicLong()
    private val logger = Logger.getLogger(PersonMockRepository::class.java.name)

    override fun findById(id: Long): Person {
        logger.info("Finding one person!")
        val person = Person(
            counter.incrementAndGet(),
            "Jeff",
            "Will",
            "SJC - Brasil",
            "Male"
        )
        return person
    }

    override fun findAll(): List<Person> {
        logger.info("Finding all people!")
        val persons: MutableList<Person> = ArrayList()
        for (i in 0..7) {
            val person = mockPerson(i)
            persons.add(person)
        }
        return persons
    }

    override fun create(person: Person): Person {
        return person
    }

    override fun update(person: Person): Person {
        return person
    }

    override fun delete(id: Long) {
    }

    private fun mockPerson(i: Int): Person {
        return Person(
            counter.incrementAndGet(),
            "Jeff $i",
            "Will $i",
            "SJC - Brasil $i",
            "Male"
        )
    }
}