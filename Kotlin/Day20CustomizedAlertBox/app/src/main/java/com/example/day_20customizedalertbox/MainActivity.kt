package com.example.day_20customizedalertbox

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //create a variable of type dialog
    lateinit var dialog:Dialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var myButton=findViewById<Button>(R.id.button)


        dialog=Dialog(this)
        dialog.setContentView(R.layout.custom_dialogue)
        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.bg_alert_box))

        var btnGood=dialog.findViewById<Button>(R.id.buttonYes)
        var btnBad=dialog.findViewById<Button>(R.id.buttonNo)

        btnGood.setOnClickListener {
            Toast.makeText(this,"Feedback Sent",Toast.LENGTH_SHORT).show()
        }
        btnBad.setOnClickListener {
            dialog.dismiss()
        }
        myButton.setOnClickListener {
            dialog.show()
        }

    }
}