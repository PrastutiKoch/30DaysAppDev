package com.example.interactiveui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDark=findViewById<Button>(R.id.btnDark)
        val buttonREAD=findViewById<Button>(R.id.btnREAD)
        val layout=findViewById<LinearLayout>(R.id.linearLayout)

        buttonREAD.setOnClickListener{
            layout.setBackgroundResource(R.color.white)


        }
        buttonDark.setOnClickListener{
            layout.setBackgroundResource(R.color.black)
        }
    }
}