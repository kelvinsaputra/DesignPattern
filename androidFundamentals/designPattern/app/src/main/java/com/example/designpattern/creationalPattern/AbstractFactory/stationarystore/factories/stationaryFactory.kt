package com.example.designpattern.creationalPattern.AbstractFactory.stationarystore.factories

import com.example.designpattern.creationalPattern.AbstractFactory.stationarystore.CheapStationary.cheapStationary
import com.example.designpattern.creationalPattern.AbstractFactory.stationarystore.ExpensiveStationary.expensiveStationary

interface stationaryFactory {
    fun createCheapStationary(): cheapStationary
    fun createExpensiveStationary(): expensiveStationary
}
