package com.nameisjayant.calculatorcompose.data

sealed class CalNumber {

    data class DoubleZero(override val symbol: String = "00") : CalNumber(), Symbol
    data class Zero(override val symbol: String = "0") : CalNumber(), Symbol
    data class One(override val symbol: String = "1") : CalNumber(), Symbol
    data class Two(override val symbol: String = "2") : CalNumber(), Symbol
    data class Three(override val symbol: String = "3") : CalNumber(), Symbol
    data class Four(override val symbol: String = "4") : CalNumber(), Symbol
    data class Five(override val symbol: String = "5") : CalNumber(), Symbol
    data class Six(override val symbol: String = "6") : CalNumber(), Symbol
    data class Seven(override val symbol: String = "7") : CalNumber(), Symbol
    data class Eight(override val symbol: String = "8") : CalNumber(), Symbol
    data class Nine(override val symbol: String = "9") : CalNumber(), Symbol
}