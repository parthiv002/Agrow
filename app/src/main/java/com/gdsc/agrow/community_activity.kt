package com.gdsc.agrow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class community_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_community)

        val type = findViewById<EditText>(R.id.edittext)
        val click = findViewById<ImageView>(R.id.button3)

        }
    fun onClick(view: View){
       var displayText:  TextView = findViewById(R.id.edittext)
        displayText.setText("")
    }

    }
