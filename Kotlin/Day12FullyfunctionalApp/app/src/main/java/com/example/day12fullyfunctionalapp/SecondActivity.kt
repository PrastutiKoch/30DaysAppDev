package com.example.day12fullyfunctionalapp

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.cardview.widget.CardView

class SecondActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val callButton = findViewById<Button>(R.id.buttonCall)
        callButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + 9898989898)
            startActivity(intent)

        }
        val androi = findViewById<CardView>(R.id.androidcard)
        androi.setOnClickListener {
            //open a new activity

            intent = Intent(applicationContext, MainActivity2::class.java)
            startActivity(intent)


        }
    }
}