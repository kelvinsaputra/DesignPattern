package com.example.kotlin.Coroutine

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

import kotlinx.android.synthetic.main.activity_coroutine.*
import kotlinx.android.synthetic.main.content_coroutine.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class CoroutineActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutine)
        setSupportActionBar(toolbar)

        GlobalScope.launch {
            text1.text = "Coroutine works"
            delay(3000)
            Log.d("Hello", "HELLLLOOOOOOO")
        }

//        GlobalScope.launch(Dispatchers.Main) { // launch coroutine in the main thread
//            for (i in 10 downTo 1) { // countdown from 10 to 1
//                text1.text = "Countdown $i ..." // update text
//                delay(500) // wait half a second
//            }
//            text1.text = "Done!"
//        }

        Thread.sleep(1000)
        Log.d("Hello", "WOOOOORRRRRLLLLLDDDDD")
        text2.text = "Thread sleep here"

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

}
