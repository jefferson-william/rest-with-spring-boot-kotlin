package br.com.kotlin.exceptions

import java.lang.RuntimeException

class UnsupportedMathOperationException(
    exception: String?
): RuntimeException(exception) {
}