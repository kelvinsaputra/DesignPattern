package com.example.stationarystore.factories

import com.example.stationarystore.CheapStationary.cheapPen
import com.example.stationarystore.CheapStationary.cheapStationary
import com.example.stationarystore.ExpensiveStationary.expensivePen
import com.example.stationarystore.ExpensiveStationary.expensiveStationary

class penFactory : stationaryFactory {

    override fun createCheapStationary(): cheapStationary {
        return cheapPen()
    }

    override fun createExpensiveStationary(): expensiveStationary {
        return expensivePen()
    }
}
