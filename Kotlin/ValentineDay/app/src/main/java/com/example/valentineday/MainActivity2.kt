package com.example.valentineday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnIntent=findViewById<CardView>(R.id.cardHistory)
        val btnmessage=findViewById<CardView>(R.id.cardMessage)

        btnIntent.setOnClickListener{
            //open a new activity

            intent= Intent(applicationContext,text::class.java)
            startActivity(intent)

        }
        btnmessage.setOnClickListener{
            //open a new activity

            intent= Intent(applicationContext,Message::class.java)
            startActivity(intent)

        }


    }
}