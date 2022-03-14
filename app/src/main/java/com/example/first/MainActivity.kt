package com.example.first

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("start" , "i see a button" )

        val button = findViewById<Button>(R.id.button)
        val string = "Balpreet"

        button.setOnClickListener{
            Log.d("click", " the button is clicked")
            val intent = Intent(this , secondActivity::class.java)
            startActivity(intent)
            Log.d("new Activity " , " second Activity is opened")
        }






    }
}