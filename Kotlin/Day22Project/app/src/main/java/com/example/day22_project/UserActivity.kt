package com.example.day22_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val name=intent.getStringExtra("name")
        val phoneNumber=intent.getStringExtra("phone")
        val imageId=intent.getIntExtra("imageId",R.drawable.prasicon)

        val nameTv=findViewById<TextView>(R.id.tVName)
        val phoneTv=findViewById<TextView>(R.id.tVPhone)
        val image=findViewById<CircleImageView>(R.id.profile_image)

        nameTv.text=name
        phoneTv.text=phoneNumber
        image.setImageResource(imageId)
    }
}