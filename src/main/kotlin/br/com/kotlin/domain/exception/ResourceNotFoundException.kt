package br.com.kotlin.domain.exception

import java.lang.RuntimeException
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.http.HttpStatus

@ResponseStatus(HttpStatus.NOT_FOUND)
class ResourceNotFoundException(exception: String?): RuntimeException(exception) {}