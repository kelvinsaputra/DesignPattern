package com.example.designpattern.behavioralPattern.ObserverPattern

import android.util.Log
import java.util.*

class Spongebob : Observable() {
    val name: String = "Spongebob"

    fun cook(name: String, price: Int, pickle: Boolean) {
        var Patty = KrabbyPatty(name, price, pickle)
        setChanged()
        notifyObservers()
    }
}