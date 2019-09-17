package com.example.designpattern.creationalPattern.AbstractFactory.stationarystore.ExpensiveStationary

class expensiveHighlighter : expensiveStationary {

    override fun write(): String {
        return "$100 Highlighter"
    }

}
