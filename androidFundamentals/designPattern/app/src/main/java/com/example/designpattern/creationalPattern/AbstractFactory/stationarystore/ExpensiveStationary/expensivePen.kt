package com.example.designpattern.creationalPattern.AbstractFactory.stationarystore.ExpensiveStationary

class expensivePen : expensiveStationary {
    override fun write(): String {
        return "$100 Pen"
    }
}
