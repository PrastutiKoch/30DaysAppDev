package com.example.day_18viewbinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.day_18viewbinding.databinding.ActivityMainBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {
    lateinit var database: DatabaseReference
    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button.setOnClickListener {
            if(binding.checkBox.isChecked){
                val name=binding.eTName.text.toString()
                val mail=binding.etMail.text.toString()
                val user=users(name,mail)
                database= FirebaseDatabase.getInstance().getReference("Users")
                database.child(name).setValue(user).addOnSuccessListener {
                    binding.eTName.text?.clear()
                    binding.etMail.text?.clear()
                    Toast.makeText(this,"User Registered",Toast.LENGTH_SHORT).show()
                }.addOnSuccessListener {
                    Toast.makeText(this,"Failed",Toast.LENGTH_SHORT).show()

                }
                intent= Intent(applicationContext,Welcome::class.java)
                startActivity(intent)





            }
            else{
                Toast.makeText(this,"Please accept the T&C",Toast.LENGTH_SHORT).show()
            }
            //intent= Intent(applicationContext,Welcome::class.java)
            //startActivity(intent)
        }
    }


}