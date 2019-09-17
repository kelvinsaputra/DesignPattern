package com.example.stationarystore.app

import com.example.designpattern.creationalPattern.AbstractFactory.stationarystore.CheapStationary.cheapStationary
import com.example.designpattern.creationalPattern.AbstractFactory.stationarystore.ExpensiveStationary.expensiveStationary
import com.example.designpattern.creationalPattern.AbstractFactory.stationarystore.factories.stationaryFactory

class Application(factory: stationaryFactory) {
    private val cheapstationary: cheapStationary = factory.createCheapStationary()
    private val expensivestationary: expensiveStationary = factory.createExpensiveStationary()

    fun write(): String {
        val cheapStationary = cheapstationary.write()
        val expensiveStationary = expensivestationary.write()
        return "We have a " + cheapStationary + " and a " + expensiveStationary
    }

}
