package com.example.designpattern.creationalPattern.AbstractFactory.stationarystore.factories

import com.example.designpattern.creationalPattern.AbstractFactory.stationarystore.CheapStationary.cheapPencil
import com.example.designpattern.creationalPattern.AbstractFactory.stationarystore.CheapStationary.cheapStationary
import com.example.designpattern.creationalPattern.AbstractFactory.stationarystore.ExpensiveStationary.expensivePencil
import com.example.designpattern.creationalPattern.AbstractFactory.stationarystore.ExpensiveStationary.expensiveStationary

class pencilFactory : stationaryFactory {

    override fun createCheapStationary(): cheapStationary {
        return cheapPencil()
    }

    override fun createExpensiveStationary(): expensiveStationary {
        return expensivePencil()
    }
}
