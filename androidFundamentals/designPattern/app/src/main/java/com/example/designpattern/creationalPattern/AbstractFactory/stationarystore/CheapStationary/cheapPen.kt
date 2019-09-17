package com.example.designpattern.creationalPattern.AbstractFactory.stationarystore.CheapStationary

class cheapPen : cheapStationary {
    override fun write(): String {
        return "$1 pen"
    }
}
