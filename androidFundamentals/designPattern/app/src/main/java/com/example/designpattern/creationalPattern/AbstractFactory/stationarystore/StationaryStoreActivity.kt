package com.example.designpattern.creationalPattern.AbstractFactory.stationarystore

import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.designpattern.R

class StationaryStoreActivity: AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.abstract_factory)
        var fill:EditText = findViewById(R.id.fill)
        var submit:Button = findViewById(R.id.submit)
        submit.setOnClickListener(this)
        fill.setOnFocusChangeListener { view, hasFocus ->
            if (hasFocus) {
                fill.setText(" ")
            }
        }
    }

    override fun onClick(view: View) {
        val fill = findViewById<EditText>(R.id.fill)
        val order = fill.text.toString()
        if (order === " ") {
            Toast.makeText(this, "Please enter an order", Toast.LENGTH_SHORT).show()
        } else {
            showPopup(order)
        }
    }

    private fun showPopup(order: String) {
        val exit: Button
        val itemDetails: TextView
        val popup = AlertDialog.Builder(this)
        popup.setCancelable(true)
        val inflater = layoutInflater
        var popupView = inflater.inflate(R.layout.abstract_factory_popup, null)
        popup.setView(popupView)
        val imgContent = popupView.findViewById<View>(R.id.imageLayout)
        val img = imgContent.findViewById<ImageView>(R.id.image)
        val res = Demo.main(order,img)
        val content = popupView.findViewById<View>(R.id.content)
        itemDetails = content.findViewById(R.id.itemDetails)
        exit = content.findViewById(R.id.exit)
        itemDetails.text = res
        val dialog = popup.create()
        exit.setOnClickListener { dialog.dismiss() }
        dialog.show()
    }

}
