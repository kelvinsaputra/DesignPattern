package com.example.stationarystore

import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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
            val res = Demo.main(order)
            showPopup(res)
        }
    }

    private fun showPopup(order: String) {
        val exit: Button
        val itemDetails: TextView
        val popup = AlertDialog.Builder(this)
        popup.setCancelable(true)
        val inflater = layoutInflater
        var popupView = inflater.inflate(R.layout.popup, null)
        popup.setView(popupView)
        val imageContent = popupView.findViewById<View>(R.id.imageLayout)
        val content = popupView.findViewById<View>(R.id.content)
        itemDetails = content.findViewById(R.id.itemDetails)
        exit = content.findViewById(R.id.exit)
        itemDetails.text = order
        val dialog = popup.create()
        exit.setOnClickListener { dialog.dismiss() }
        dialog.show()
    }

}
