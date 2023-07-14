package com.example.myweather

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity1 : ComponentActivity() {
    @SuppressLint("SuspiciousIndentation", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity1_main)

    val openactivity:Button=findViewById(R.id.button2)
        openactivity.setOnClickListener{
            val intent=Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }



        val button:Button=findViewById(R.id.button5)
        button.setOnClickListener {
            button.text="LOGIN"
            Toast.makeText(this@MainActivity1, "Successfully Logged In", Toast.LENGTH_SHORT)
                .show()

        }


    }

}



