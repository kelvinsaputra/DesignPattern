package com.example.stationarystore

import com.example.stationarystore.app.Application
import com.example.stationarystore.factories.highlighterFactory
import com.example.stationarystore.factories.penFactory
import com.example.stationarystore.factories.pencilFactory
import com.example.stationarystore.factories.stationaryFactory

object Demo {

    private fun configureApplication(order: String): Application {
        val app: Application
        val factory: stationaryFactory

        when {
            order.toLowerCase().contains("pencil") -> {
                factory = pencilFactory()
                app = Application(factory)
            }
            order.toLowerCase().contains("highlighter") -> {
                factory = highlighterFactory()
                app = Application(factory)
            }
            order.toLowerCase().contains("pen") -> {
                factory = penFactory()
                app = Application(factory)
            }
            else -> {
                factory = penFactory()
                app = Application(factory)
            }
        }
        return app
    }

    fun main(args: String): String {
        val app = configureApplication(args)
        return app.write()
    }
}
