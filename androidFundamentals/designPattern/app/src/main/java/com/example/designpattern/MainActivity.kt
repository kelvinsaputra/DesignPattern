package com.example.designpattern

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.designpattern.creationalPattern.AbstractFactory.stationarystore.StationaryStoreActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        stationaryStoreButton.setOnClickListener{
            intent = Intent(this, StationaryStoreActivity::class.java)
            startActivity(intent)
        }
    }
}
