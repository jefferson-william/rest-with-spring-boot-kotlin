package br.com.kotlin.domain.exception

import java.lang.RuntimeException

class UnsupportedMathOperationException(
    exception: String?
): RuntimeException(exception) {
}