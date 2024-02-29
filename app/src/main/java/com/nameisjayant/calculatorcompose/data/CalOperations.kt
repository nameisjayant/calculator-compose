package com.nameisjayant.calculatorcompose.data


sealed class CalOperations {

    data class Add(override val symbol: String = "+") : CalOperations(), Symbol
    data class Subtract(override val symbol: String = "-") : CalOperations(), Symbol
    data class Multiply(override val symbol: String = "*") : CalOperations(), Symbol
    data class Division(override val symbol: String = "/") : CalOperations(), Symbol
}