package com.example.designpattern

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.designpattern.behavioralPattern.ObserverPattern.ObserverActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        observer.setOnClickListener {
            val intent = Intent(this@MainActivity, ObserverActivity::class.java)
            startActivity(intent)
        }
    }
}
