package com.example.signup1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnsignup=findViewById<CardView>(R.id.cardSignUp)
        val btnsignin=findViewById<CardView>(R.id.cardSignin)

        btnsignup.setOnClickListener{
            //open a new activity

            intent= Intent(applicationContext,SignUp::class.java)
            startActivity(intent)

        }
        btnsignin.setOnClickListener{
            //open a new activity

            intent= Intent(applicationContext,Signin::class.java)
            startActivity(intent)

        }
    }
}