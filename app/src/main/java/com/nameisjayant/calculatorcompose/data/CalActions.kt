package com.nameisjayant.calculatorcompose.data


sealed class CalActions {

    data class Clear(override val symbol: String = "C") : CalActions(), Symbol
    data class Delete(override val symbol: String = "x") : CalActions(), Symbol
    data class Calculate(override val symbol: String = "=") : CalActions(), Symbol
    data class Decimal(override val symbol: String = ".") : CalActions(), Symbol
    data class Percentage(override val symbol: String = "%") : CalActions(), Symbol
}