package com.example.designpattern.behavioralPattern.ObserverPattern

import android.app.Activity
import android.content.Context
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_observer.view.*
import java.util.*

class Squidward : Observer {
    val name = "Squidward"
    var status = "Idle"

    override fun update(o: Observable?, arg: Any?) {
        status = "Ready"
    }

}