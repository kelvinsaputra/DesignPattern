package com.example.designpattern.creationalPattern.AbstractFactory.stationarystore.CheapStationary

class cheapPencil : cheapStationary {

    override fun write(): String {
        return "$1 pencil"
    }
}
