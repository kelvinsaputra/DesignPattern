package com.example.designpattern.creationalPattern.AbstractFactory.stationarystore.factories

import com.example.designpattern.creationalPattern.AbstractFactory.stationarystore.CheapStationary.cheapPen
import com.example.designpattern.creationalPattern.AbstractFactory.stationarystore.CheapStationary.cheapStationary
import com.example.designpattern.creationalPattern.AbstractFactory.stationarystore.ExpensiveStationary.expensivePen
import com.example.designpattern.creationalPattern.AbstractFactory.stationarystore.ExpensiveStationary.expensiveStationary

class penFactory : stationaryFactory {

    override fun createCheapStationary(): cheapStationary {
        return cheapPen()
    }

    override fun createExpensiveStationary(): expensiveStationary {
        return expensivePen()
    }
}
