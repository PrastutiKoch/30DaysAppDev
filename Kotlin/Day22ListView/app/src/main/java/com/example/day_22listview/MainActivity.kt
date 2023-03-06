package com.example.day_22listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listview=findViewById<ListView>(R.id.listView)
        val taskList= arrayListOf<String>()
        taskList.add("The Almanack of Naval Ravikant")
        taskList.add("Atomic Habits")
        taskList.add("Psychology of Money")
        taskList.add("Never Let me go")
        taskList.add("The Stranger Trilogy")

        val adapterForMyListView=ArrayAdapter(this,android.R.layout.simple_list_item_1,taskList)
        listview.adapter=adapterForMyListView

        listview.setOnItemClickListener { parent, view, position, id ->
//            val text="You clicked on "+(view as TextView).text.toString()
//            Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
            val selectedItem = parent.getItemAtPosition(position) as String
            //val intent = Intent(this, Books::class.java)
            if(position==0){
                intent= Intent(applicationContext,Books::class.java)
                startActivity(intent)
            }
            else if (position==2){
                intent= Intent(applicationContext,book2::class.java)
                startActivity(intent)

            }




        }

    }
}