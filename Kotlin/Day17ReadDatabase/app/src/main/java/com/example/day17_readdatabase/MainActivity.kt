package com.example.day17_readdatabase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase


class MainActivity : AppCompatActivity() {
    lateinit var database: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val signUp=findViewById<Button>(R.id.btnSignUp)
        val etName=findViewById<TextInputEditText>(R.id.etName)
        val userId=findViewById<TextInputEditText>(R.id.uniqueId)
        val etMail=findViewById<TextInputEditText>(R.id.etMail)
        val userPassword=findViewById<TextInputEditText>(R.id.etPassword)

        signUp.setOnClickListener {

            val name=etName.text.toString()
            val mail=etMail.text.toString()
            val uniqueId=userId.text.toString()
            val password=userPassword.text.toString()

            val user=Users(name,mail,password,uniqueId)

            database= FirebaseDatabase.getInstance().getReference("Users")
            database.child(uniqueId).setValue(user).addOnSuccessListener {
                etName.text?.clear()
                etMail.text?.clear()
                userId.text?.clear()
                userPassword.text?.clear()
                Toast.makeText(this,"User Registered",Toast.LENGTH_SHORT).show()
            }.addOnSuccessListener {
                Toast.makeText(this,"Failed",Toast.LENGTH_SHORT).show()

            }


        }
        val signIntext=findViewById<Button>(R.id.button)
        signIntext.setOnClickListener{
            val openSigninActivity= Intent(this,SigninActivity::class.java)
            startActivity(openSigninActivity)
        }

    }
}