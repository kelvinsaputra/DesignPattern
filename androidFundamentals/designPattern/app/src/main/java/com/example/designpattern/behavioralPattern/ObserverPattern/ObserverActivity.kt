package com.example.designpattern.behavioralPattern.ObserverPattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.designpattern.R
import kotlinx.android.synthetic.main.activity_observer.*

class ObserverActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_observer)

        var spongebob = Spongebob()
        var squidward1 = Squidward()
        var squidward2 = Squidward()
        var squidward3 = Squidward()

        spongebob.addObserver(squidward1)
        spongebob.addObserver(squidward2)
        spongebob.addObserver(squidward3)


        tv_squidward1.setText("Sq1" + squidward1.status)
        tv_squidward2.setText("Sq2" + squidward2.status)
        tv_squidward3.setText("Sq3" + squidward3.status)

        btn_observer.setOnClickListener {
            spongebob.cook("Krabby Patty", 10, true)
            tv_squidward1.setText("Sq1" +squidward1.status)
            tv_squidward2.setText("Sq2" +squidward2.status)
            tv_squidward3.setText("Sq3" +squidward3.status)
        }

    }
}
