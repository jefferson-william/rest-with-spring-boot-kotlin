package br.com.kotlin

import br.com.kotlin.exceptions.UnsupportedMathOperationException
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PathVariable
import java.lang.Exception

@RestController
class MathController {
    @RequestMapping(value = ["/sum/{numberOne}/{numberTwo}"])
    fun greeting(@PathVariable(value = "numberOne") numberOne: String?, @PathVariable(value = "numberTwo") numberTwo: String?): Double {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw UnsupportedMathOperationException("Please set a numeric value")
        }
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }

    private fun convertToDouble(strNumber: String?): Double {
        if (strNumber.isNullOrBlank()) {
            return 0.0;
        }
        val number = strNumber.replace(",".toRegex(), ".")
        if (isNumeric(number)) {
            return number.toDouble();
        } else {
            return 0.0;
        }
    }

    private fun isNumeric(strNumber: String?): Boolean {
        if (strNumber.isNullOrBlank()) {
            return false;
        }
        val number = strNumber.replace(",".toRegex(), ".")
        return number.matches("""[-+]?[0-9]*\.?[0-9]+""".toRegex())
    }
}