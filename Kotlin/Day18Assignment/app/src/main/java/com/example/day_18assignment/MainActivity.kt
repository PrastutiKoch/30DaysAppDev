package com.example.day_18assignment

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.day_18assignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.c1.setOnClickListener {
            val options= arrayOf("Pointers","Loops","Dynamic Typing")
            val builder2=AlertDialog.Builder(this)
            builder2.setTitle("Which of the following concepts is not a part of Python?")
            builder2.setSingleChoiceItems(options,0,DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this,"You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()

            })
            builder2.setPositiveButton("Submit",DialogInterface.OnClickListener { dialog, which ->
                //what action should be performed when yes is clicked
                Toast.makeText(this,"You have submitted succesfully",Toast.LENGTH_SHORT).show()

            })
            builder2.setNegativeButton("Decline",DialogInterface.OnClickListener { dialog, which ->

            })
            builder2.show()
        }
        binding.c2.setOnClickListener {
            val options= arrayOf("(a) Zim Den","(b) Guido van Rossum","(c) Niene Stom")
            val builder2=AlertDialog.Builder(this)
            builder2.setTitle("Who developed the Python language?")
            builder2.setSingleChoiceItems(options,0,DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this,"You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()

            })
            builder2.setPositiveButton("Submit",DialogInterface.OnClickListener { dialog, which ->
                //what action should be performed when yes is clicked
                Toast.makeText(this,"You have submitted succesfully",Toast.LENGTH_SHORT).show()

            })
            builder2.setNegativeButton("Decline",DialogInterface.OnClickListener { dialog, which ->

            })
            builder2.show()
        }
        binding.c3.setOnClickListener {
            val options= arrayOf("and","or","not")
            val builder2=AlertDialog.Builder(this)
            builder2.setTitle("Amongst which of the following is/are the logical operators in Python?")
            builder2.setMultiChoiceItems(options,null,DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                //Toast.makeText(this,"You clicked on ${options[which]}",Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("Submit",DialogInterface.OnClickListener { dialog, which ->
                //what action should be performed when yes is clicked
                Toast.makeText(this,"You have submitted succesfully",Toast.LENGTH_SHORT).show()


            })
            builder2.setNegativeButton("Decline",DialogInterface.OnClickListener { dialog, which ->

            })
            builder2.show()

        }
        binding.button.setOnClickListener {
            val builder1=AlertDialog.Builder(this)
            builder1.setTitle("Are you sure?")
            builder1.setMessage("Do you want to close the App")
            builder1.setIcon(R.drawable.baseline_exit_to_app_24)
            builder1.setPositiveButton("Yes",DialogInterface.OnClickListener { dialog, which ->
                //what action should be performed when yes is clicked
                finish()
            })
            builder1.setNegativeButton("No",DialogInterface.OnClickListener { dialog, which ->

            })
            builder1.show()

        }







    }
}