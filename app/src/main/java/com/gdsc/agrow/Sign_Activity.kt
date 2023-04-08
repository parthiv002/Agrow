package com.gdsc.agrow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Sign_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign)
        val log = findViewById<TextView>(R.id.loginText)
        val name = findViewById<EditText>(R.id.username)
        val pass = findViewById<EditText>(R.id.password)
        val button = findViewById<Button>(R.id.button)


        button.setOnClickListener {
            val enteredname = name.text.toString()
            if(enteredname == ""){
                Toast.makeText(this, "Please Enter your name", Toast.LENGTH_SHORT)
                    .show()
            }
            val enteredpass = pass.text.toString()
            if(enteredpass == ""){
                Toast.makeText(this, "Please Enter your password", Toast.LENGTH_SHORT)
                    .show()
            }
            if(enteredname != "" && enteredpass != "") {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }

    }
}