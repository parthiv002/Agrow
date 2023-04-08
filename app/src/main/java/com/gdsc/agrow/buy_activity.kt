package com.gdsc.agrow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class buy_activity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<items>
    lateinit var imageId: Array<Int>
    lateinit var heading: Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy)

        imageId = arrayOf(
            R.drawable.plough,
            R.drawable.trailer,
            R.drawable.spray,
            R.drawable.harvest,
            R.drawable.rake
        )

        heading = arrayOf(
            "Plough",
            "Trailers",
            "sprayers",
            "harvesters",
            "fake"

        )

        newRecyclerView = findViewById(R.id.itemList)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<items>()

    getUserdata()


        }

    private fun getUserdata() {
        for(i in imageId.indices){
            val Items = items(imageId[i], heading[i])
            newArrayList.add(Items)
        }
        var adapter = MyAdapter(newArrayList)
        newRecyclerView.adapter = adapter
        adapter.setOnItemClickListener(object : MyAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {
               /* Toast.makeText(this, "Under development", Toast.LENGTH_SHORT)
                    .show() */

            }


        })

    }
}
