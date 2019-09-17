package com.example.stationarystore.app

import com.example.stationarystore.CheapStationary.cheapStationary
import com.example.stationarystore.ExpensiveStationary.expensiveStationary
import com.example.stationarystore.factories.stationaryFactory

class Application(factory: stationaryFactory) {
    private val cheapstationary: cheapStationary = factory.createCheapStationary()
    private val expensivestationary: expensiveStationary = factory.createExpensiveStationary()

    fun write(): String {
        val cheapStationary = cheapstationary.write()
        val expensiveStationary = expensivestationary.write()
        return "$cheapStationary $expensiveStationary"
    }

}
