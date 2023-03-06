package com.example.day_24recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var myRecyclerView: RecyclerView
    lateinit var newsArrayList:ArrayList<News>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myRecyclerView=findViewById(R.id.recyclerView)

        var newsImageArray= arrayOf(
            R.drawable.news1,
            R.drawable.news2,
            R.drawable.news3,
            R.drawable.news4,
            R.drawable.news5,
            R.drawable.news6,
            R.drawable.news7,
            R.drawable.news8

        )
        var newsHeadingArray= arrayOf(
            "Pak govt's borrowings from banks touch PKR 1.8 trillion in FY23",
            "China is still the world's biggest pandemic risk: Vivek Ramaswamy",
            "Australian PM to embark on 1st visit to India from March 8-11",
            "India, US, Aus, Japan release statement after QUAD meet, condemn '26/11 attacks'",
            "2022 Nobel Peace Prize winner Ales Bialiatski jailed for 10 years",
            "Pakistani rupee touches record low of 285.09 against US dollar",
            "Don't send weapons to Russia, try to stop war: Germany to China",
            "Pak appoints 1st envoy for Kartarpur Corridor to attract pilgrims"
        )
        //vertically scrolling ,horizontally,uniformly
        myRecyclerView.layoutManager=LinearLayoutManager(this)
        newsArrayList= arrayListOf<News>()

        for(index in newsImageArray.indices){
            val news=News(newsHeadingArray[index],newsImageArray[index])
            newsArrayList.add(news)
        }
        myRecyclerView.adapter=MyAdapter(newsArrayList,this)

    }
}