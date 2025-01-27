package br.com.kotlin.domain.exception

import java.util.Date

class ExceptionResponse (
    val timestamp: Date,
    val message: String?,
    val details: String
) {
}