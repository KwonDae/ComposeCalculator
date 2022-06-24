package com.example.composecalculator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CalculatorViewModel: ViewModel() {

    var state by mutableStateOf(CalculatorState())
        private set

    fun onAction(action: CalculatorAction) {
        when(action) {
            is CalculatorAction.Number -> enterNumber(action.number)
            is CalculatorAction.Clear -> state = CalculatorState()
            is CalculatorAction.Delete -> perfromCalculation()
            is CalculatorAction.Decimal -> enterDecimal()
            is CalculatorAction.Calculate -> perfromCalculation()
            is CalculatorAction.Operation -> enterOperation(action.operation)
        }
    }


    private fun enterNumber(number: Int) {

    }

    private fun perfromCalculation() {
        TODO("Not yet implemented")
    }

    private fun enterDecimal() {
        TODO("Not yet implemented")
    }

    private fun enterOperation(operation: CalculatorOperation) {

    }




}