package com.example.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class MainActivity : AppCompatActivity() {

    lateinit var gridView: GridView
    var nameList = ArrayList<String>()
    var imageList = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.gridView)

        fillArrays()

        val adapter = AnimalAdapter(this,nameList,imageList)

        gridView.adapter = adapter

    }

    fun fillArrays(){
        nameList.add("Cat")
        nameList.add("Dog")
        nameList.add("Hippo")
        nameList.add("Lion")
        nameList.add("Tiger")
        nameList.add("Rhino")
        nameList.add("Eagle")
        nameList.add("Cow")
        nameList.add("Batman")


        imageList.add(R.drawable.cat)
        imageList.add(R.drawable.dog)
        imageList.add(R.drawable.hippo)
        imageList.add(R.drawable.lion)
        imageList.add(R.drawable.tiger)
        imageList.add(R.drawable.rhino)
        imageList.add(R.drawable.eagle)
        imageList.add(R.drawable.cow)
        imageList.add(R.drawable.batman)


    }

}