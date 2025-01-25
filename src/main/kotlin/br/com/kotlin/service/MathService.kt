package br.com.kotlin.service

import kotlin.math.sqrt

class MathService {
    fun sum(numberOne: Double, numberTwo: Double): Double {
        return numberOne + numberTwo;
    }

    fun subtraction(numberOne: Double, numberTwo: Double): Double {
        return numberOne - numberTwo;
    }

    fun multiplication(numberOne: Double, numberTwo: Double): Double {
        return numberOne * numberTwo;
    }

    fun division(numberOne: Double, numberTwo: Double): Double {
        return numberOne / numberTwo;
    }

    fun average(numberOne: Double, numberTwo: Double): Double {
        return (numberOne + numberTwo) / 2;
    }

    fun square(number: Double): Double {
        return sqrt(number)
    }
}