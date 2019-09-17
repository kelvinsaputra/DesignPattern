package com.example.designpattern.creationalPattern.AbstractFactory.stationarystore.factories

import com.example.designpattern.creationalPattern.AbstractFactory.stationarystore.CheapStationary.cheapHighlighter
import com.example.designpattern.creationalPattern.AbstractFactory.stationarystore.CheapStationary.cheapStationary
import com.example.designpattern.creationalPattern.AbstractFactory.stationarystore.ExpensiveStationary.expensiveHighlighter
import com.example.designpattern.creationalPattern.AbstractFactory.stationarystore.ExpensiveStationary.expensiveStationary

class highlighterFactory : stationaryFactory {

    override fun createCheapStationary(): cheapStationary {
        return cheapHighlighter()
    }

    override fun createExpensiveStationary(): expensiveStationary {
        return expensiveHighlighter()
    }
}
