package com.shubhit.composecalcapp

data class CalculatorState(
    val number1:String="",
    val number2:String="",
    val operations: CalculatorOperations?=null

)