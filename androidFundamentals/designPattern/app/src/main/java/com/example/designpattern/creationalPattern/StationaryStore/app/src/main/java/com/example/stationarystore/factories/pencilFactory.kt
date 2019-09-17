package com.example.stationarystore.factories

import com.example.stationarystore.CheapStationary.cheapPencil
import com.example.stationarystore.CheapStationary.cheapStationary
import com.example.stationarystore.ExpensiveStationary.expensivePencil
import com.example.stationarystore.ExpensiveStationary.expensiveStationary

class pencilFactory : stationaryFactory {

    override fun createCheapStationary(): cheapStationary {
        return cheapPencil()
    }

    override fun createExpensiveStationary(): expensiveStationary {
        return expensivePencil()
    }
}
