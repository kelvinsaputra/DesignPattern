package com.example.designpattern.creationalPattern.AbstractFactory.stationarystore.ExpensiveStationary

class expensivePencil : expensiveStationary {
    override fun write(): String {
        return "$100 Pencil"
    }
}
