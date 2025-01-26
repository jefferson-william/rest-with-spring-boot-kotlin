package br.com.kotlin.exception

import java.lang.RuntimeException

class UnsupportedMathOperationException(
    exception: String?
): RuntimeException(exception) {
}