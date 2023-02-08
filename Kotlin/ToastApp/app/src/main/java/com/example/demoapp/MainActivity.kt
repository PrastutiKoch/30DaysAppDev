package com.example.demoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonUpload = findViewById<Button>(R.id.btnUpload)
        val buttonDownload = findViewById<Button>(R.id.btnDownload)

        buttonUpload.setOnClickListener{
            Toast.makeText(applicationContext,"Hi,you have uploaded successfully",Toast.LENGTH_SHORT).show()

    }
    }
}