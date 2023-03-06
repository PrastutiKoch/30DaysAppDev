package com.example.day22_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    lateinit var userArrayList:ArrayList<user>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name= arrayOf("Prastuti","Saumya","Ayesha","Ankit","Aman")
        val lastMsg= arrayOf("Hey,I am good.How about you?","Congratulations","Not attending today","Feels Great to hear this","Amazing")
        val lastMsgTime= arrayOf("4:45 PM","12:30 PM","10:15 AM","9:50 AM","6:20 AM")
        val phoneNumber= arrayOf("913456789","913479789","913456690","918856789","9134560089")
        val imgId= intArrayOf(R.drawable.prasicon,R.drawable.saumya1,R.drawable.icon2,R.drawable.icon3,R.drawable.icon4)

        userArrayList=ArrayList()
        for(eachIndex in name.indices){
            val User=user(name[eachIndex], lastMsg[eachIndex],lastMsgTime[eachIndex],phoneNumber[eachIndex],
                imgId[eachIndex])
            userArrayList.add(User)

            val listView=findViewById<ListView>(R.id.listView)
            listView.isClickable=true
            listView.adapter=Myadapter(this,userArrayList)
            listView.setOnItemClickListener { parent, view, position, id ->
                //open new activity
                val username=name[position]
                val phoneNumber=phoneNumber[position]
                val imageId=imgId[position]

                val i=Intent(this,UserActivity::class.java)
                i.putExtra("name",username)
                i.putExtra("phone",phoneNumber)
                i.putExtra("imageId",imageId)
                startActivity(i)



            }




        }

    }
}