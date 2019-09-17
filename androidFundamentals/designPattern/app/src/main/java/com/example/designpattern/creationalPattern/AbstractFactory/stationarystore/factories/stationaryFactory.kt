package com.example.stationarystore.factories

import com.example.stationarystore.CheapStationary.cheapStationary
import com.example.stationarystore.ExpensiveStationary.expensiveStationary

interface stationaryFactory {
    fun createCheapStationary(): cheapStationary
    fun createExpensiveStationary(): expensiveStationary
}
