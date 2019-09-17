package com.example.designpattern.creationalPattern.AbstractFactory.stationarystore

import android.widget.ImageView
import com.example.designpattern.R
import com.example.stationarystore.app.Application
import com.example.designpattern.creationalPattern.AbstractFactory.stationarystore.factories.highlighterFactory
import com.example.designpattern.creationalPattern.AbstractFactory.stationarystore.factories.penFactory
import com.example.designpattern.creationalPattern.AbstractFactory.stationarystore.factories.pencilFactory
import com.example.designpattern.creationalPattern.AbstractFactory.stationarystore.factories.stationaryFactory

object Demo {

    fun configureApplication(order: String, img: ImageView): Application {
        val app: Application
        val factory: stationaryFactory

        when {
            order.toLowerCase().contains("pencil") -> {
                factory = pencilFactory()
                app = Application(factory)
                img.setImageResource(R.drawable.pencil)

            }
            order.toLowerCase().contains("highlighter") -> {
                factory = highlighterFactory()
                app = Application(factory)
                img.setImageResource(R.drawable.highlighter)
            }
            order.toLowerCase().contains("pen") -> {
                factory = penFactory()
                app = Application(factory)
                img.setImageResource(R.drawable.pen)
            }
            else -> {
                factory = penFactory()
                app = Application(factory)
            }
        }
        return app
    }

    fun main(args: String, img: ImageView): String {
        val app = configureApplication(args,img)
        return app.write()
    }
}
