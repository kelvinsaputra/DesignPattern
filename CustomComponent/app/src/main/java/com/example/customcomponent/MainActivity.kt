package com.example.customcomponent

import android.animation.Animator
import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.ViewAnimationUtils
import android.widget.HorizontalScrollView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.customcomponent.Controller.DummyController
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.view_custom_component.*
import kotlinx.android.synthetic.main.view_custom_component.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val products = DummyController().getProducts()

        recycler_view.apply {
            layoutManager = LinearLayoutManager( this@MainActivity,
                RecyclerView.HORIZONTAL, false)
            adapter = ProductAdapter(products, this@MainActivity)
        }
    }
}
