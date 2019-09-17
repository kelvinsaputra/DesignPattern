package com.example.designpattern.creationalPattern.AbstractFactory.stationarystore.CheapStationary

class cheapHighlighter : cheapStationary {
    override fun write(): String {
        return "$1 highlighter"
    }
}
