package br.com.kotlin.app.controller

import br.com.kotlin.domain.exception.UnsupportedMathOperationException
import br.com.kotlin.domain.service.MathService
import br.com.kotlin.domain.service.NumberService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PathVariable

@RestController
class MathController {
    private val mathService: MathService = MathService()

    @RequestMapping(value = ["/sum/{numberOne}/{numberTwo}"])
    fun sum(@PathVariable(value = "numberOne") numberOne: String?, @PathVariable(value = "numberTwo") numberTwo: String?): Double {
        if (!NumberService.isNumeric(numberOne) || !NumberService.isNumeric(numberTwo)) {
            throw UnsupportedMathOperationException("Please set a numeric value")
        }
        return mathService.sum(NumberService.convertToDouble(numberOne), NumberService.convertToDouble(numberTwo))
    }

    @RequestMapping(value = ["/subtraction/{numberOne}/{numberTwo}"])
    fun subtraction(@PathVariable(value = "numberOne") numberOne: String?, @PathVariable(value = "numberTwo") numberTwo: String?): Double {
        if (!NumberService.isNumeric(numberOne) || !NumberService.isNumeric(numberTwo)) {
            throw UnsupportedMathOperationException("Please set a numeric value")
        }
        return mathService.subtraction(NumberService.convertToDouble(numberOne), NumberService.convertToDouble(numberTwo))
    }

    @RequestMapping(value = ["/multiplication/{numberOne}/{numberTwo}"])
    fun multiplication(@PathVariable(value = "numberOne") numberOne: String?, @PathVariable(value = "numberTwo") numberTwo: String?): Double {
        if (!NumberService.isNumeric(numberOne) || !NumberService.isNumeric(numberTwo)) {
            throw UnsupportedMathOperationException("Please set a numeric value")
        }
        return mathService.multiplication(NumberService.convertToDouble(numberOne), NumberService.convertToDouble(numberTwo))
    }

    @RequestMapping(value = ["/division/{numberOne}/{numberTwo}"])
    fun division(@PathVariable(value = "numberOne") numberOne: String?, @PathVariable(value = "numberTwo") numberTwo: String?): Double {
        if (!NumberService.isNumeric(numberOne) || !NumberService.isNumeric(numberTwo)) {
            throw UnsupportedMathOperationException("Please set a numeric value")
        }
        return mathService.division(NumberService.convertToDouble(numberOne), NumberService.convertToDouble(numberTwo))
    }

    @RequestMapping(value = ["/average/{numberOne}/{numberTwo}"])
    fun average(@PathVariable(value = "numberOne") numberOne: String?, @PathVariable(value = "numberTwo") numberTwo: String?): Double {
        if (!NumberService.isNumeric(numberOne) || !NumberService.isNumeric(numberTwo)) {
            throw UnsupportedMathOperationException("Please set a numeric value")
        }
        return mathService.average(NumberService.convertToDouble(numberOne), NumberService.convertToDouble(numberTwo))
    }

    @RequestMapping(value = ["/square/{number}"])
    fun square(@PathVariable(value = "number") number: String?): Double {
        if (!NumberService.isNumeric(number)) {
            throw UnsupportedMathOperationException("Please set a numeric value")
        }
        if (NumberService.convertToDouble(number) < 0) {
            throw UnsupportedMathOperationException("Cannot calculate square root of a negative number")
        }
        return mathService.square(NumberService.convertToDouble(number))
    }
}