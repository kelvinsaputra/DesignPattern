package com.example.stationarystore.factories

import com.example.stationarystore.CheapStationary.cheapHighlighter
import com.example.stationarystore.CheapStationary.cheapStationary
import com.example.stationarystore.ExpensiveStationary.expensiveHighlighter
import com.example.stationarystore.ExpensiveStationary.expensiveStationary

class highlighterFactory : stationaryFactory {

    override fun createCheapStationary(): cheapStationary {
        return cheapHighlighter()
    }

    override fun createExpensiveStationary(): expensiveStationary {
        return expensiveHighlighter()
    }
}
