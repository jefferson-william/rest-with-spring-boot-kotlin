package br.com.kotlin.controller

import br.com.kotlin.model.Person
import br.com.kotlin.repository.postgres.PersonPostgresRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.DeleteMapping

@RestController
@RequestMapping("/person")
class PersonController {
    @Autowired
    private lateinit var repository: PersonPostgresRepository

    @GetMapping(value = ["/{id}"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun view(@PathVariable(value = "id") id: Long): Person {
        return repository.findById(id)
    }

    @GetMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    fun findAll(): List<Person> {
        return repository.findAll()
    }

    @PostMapping(consumes = [MediaType.APPLICATION_JSON_VALUE], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun create(@RequestBody person: Person): Person {
        return repository.create(person)
    }

    @PutMapping(value = ["/{id}"], consumes = [MediaType.APPLICATION_JSON_VALUE], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun update(@PathVariable(value = "id") id: Long, @RequestBody person: Person): Person {
        return repository.update(id, person)
    }

    @DeleteMapping(value = ["/{id}"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun delete(@PathVariable(value = "id") id: Long): ResponseEntity<*> {
        repository.delete(id)
        return ResponseEntity.noContent().build<Any>()
    }
}