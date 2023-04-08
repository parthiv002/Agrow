package com.gdsc.agrow

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sell = findViewById<ImageView>(R.id.selling)
        sell.setOnClickListener(){
            val intent1 = Intent(this, sell_activity::class.java)
            startActivity(intent1)
        }

        val buy = findViewById<ImageView>(R.id.buying)
        buy.setOnClickListener(){
            val intent2 = Intent(this, buy_activity::class.java)
            startActivity(intent2)
        }

       val talk = findViewById<ImageView>(R.id.talking)
        talk.setOnClickListener(){
            val intent3 = Intent(this, community_activity::class.java)
            startActivity(intent3)
        }


    }


}