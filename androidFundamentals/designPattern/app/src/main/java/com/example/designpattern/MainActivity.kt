package com.example.designpattern

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), MyRecyclerViewAdapter.ItemClickListener{
    override fun onItemClick(view: View, position: Int) {
        var intent: Intent? = null
        when (position) {
//            0 -> intent = Intent(this, TypographyActivity::class.java)
//            1 -> intent = Intent(this, ButtonActivity::class.java)
//            2 -> intent = Intent(this, ToasterActivity::class.java)
        }

        intent?.let {
            startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val menuCreational = ArrayList<String>()
        menuCreational.add("Pattern C1")
        menuCreational.add("Pattern C2")
        val menuStructural = ArrayList<String>()
        menuStructural.add("Pattern S1")
        menuStructural.add("Pattern S2")
        val menuBehavioral = ArrayList<String>()
        menuBehavioral.add("Pattern B1")
        menuBehavioral.add("Pattern B2")

        val recyclerViewCreational = findViewById<RecyclerView>(R.id.recycler_creational)
        val layoutManagerCreational = LinearLayoutManager(this)
        recyclerViewCreational.layoutManager = layoutManagerCreational
        val dividerItemDecorationCreational = DividerItemDecoration(
            recyclerViewCreational.context,
            layoutManagerCreational.orientation
        )
        recyclerViewCreational.addItemDecoration(dividerItemDecorationCreational)
        val adapterCreational =
            MyRecyclerViewAdapter(this, menuCreational)
        adapterCreational.setClickListener(this)
        recyclerViewCreational.adapter = adapterCreational
    }
}
