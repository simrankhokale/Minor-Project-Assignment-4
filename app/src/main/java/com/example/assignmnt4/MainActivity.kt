package com.example.assignment4

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val btnChangeText = findViewById<Button>(R.id.btnChangeText)
        val btnChangeHeight = findViewById<Button>(R.id.btnChangeHeight)
        val btnCenterText = findViewById<Button>(R.id.btnCenterText)

        btnChangeText.setOnClickListener {
            counter++
            textView.text = "Button clicked $counter times"
        }

        btnChangeHeight.setOnClickListener {
            val newHeight = textView.height + 50
            textView.layoutParams.height = newHeight
            textView.requestLayout()
        }

        btnCenterText.setOnClickListener {
            textView.gravity = Gravity.CENTER
        }
    }
}