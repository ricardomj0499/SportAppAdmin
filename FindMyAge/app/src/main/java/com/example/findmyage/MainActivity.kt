package com.example.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        butGetAge.setOnClickListener {
            var edad = Integer.parseInt(edad.text.toString())
            var currentYear = Calendar.getInstance().get(Calendar.YEAR)
            var age = edad - currentYear
            textView.text = "your agre is ${age}"
        }
    }
}