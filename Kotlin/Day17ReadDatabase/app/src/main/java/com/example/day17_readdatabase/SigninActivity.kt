package com.example.day17_readdatabase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class SigninActivity : AppCompatActivity() {
    private lateinit var databaseReference: DatabaseReference
    companion object{
        const val  KEY1="com.example.day17_readdatabase.SigninActivity.mail"
        const val  KEY2="com.example.day17_readdatabase.SigninActivity.name"
        const val  KEY3="com.example.day17_readdatabase.SigninActivity.id"

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        val signInButton=findViewById<Button>(R.id.btnSignIn)
        val userName=findViewById<TextInputEditText>(R.id.userNameEditText)
        signInButton.setOnClickListener {
            val uniqueId=userName.text.toString()
            if (uniqueId.isNotEmpty()){
                readData(uniqueId)
            }else{
                Toast.makeText(this,"Please Enter Unique ID",Toast.LENGTH_SHORT).show()
            }

        }
    }//oncreate method over

     fun readData(uniqueId: String) {
        databaseReference=FirebaseDatabase.getInstance().getReference("Users")
        databaseReference.child(uniqueId).get().addOnSuccessListener {
            //if user exist or not
            if(it.exists()){
                //welcome user in your app,with intent and pass info
                val email=it.child("email").value
                val name=it.child("name").value
                val userId=it.child("uniqueId").value
                val intentWelcome=Intent(this,WelcomeActivity::class.java)
                intentWelcome.putExtra(KEY1,email.toString())
                intentWelcome.putExtra(KEY2,name.toString())
                intentWelcome.putExtra(KEY3,userId.toString())
                startActivity(intentWelcome)

            }else{
                Toast.makeText(this,"User Does not Exist",Toast.LENGTH_SHORT).show()

            }


        }.addOnFailureListener{
            Toast.makeText(this,"Failed",Toast.LENGTH_SHORT).show()
        }


    }
}