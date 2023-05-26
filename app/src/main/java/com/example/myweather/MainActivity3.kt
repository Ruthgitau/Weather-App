package com.example.myweather

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myweather.ui.theme.MyWeatherTheme

class MainActivity3 : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity3_main)


        //toast 1
       val toastbtn:Button=findViewById(R.id.button4)
        toastbtn.setOnClickListener{
            val mytoast=Toast.makeText(applicationContext,"hello toast", Toast.LENGTH_SHORT)
            mytoast.show()
        }

        //toast 2

        val button:Button=findViewById(R.id.button7)
        button.setOnClickListener {
            button.text="you clicked me"
            Toast.makeText(this@MainActivity3, "click", Toast.LENGTH_SHORT)
                .show()

        }

        //button on long click listener
        val longbtn:Button=findViewById(R.id.button8)
        longbtn.setOnLongClickListener{
            longbtn.text="long pressed"
            true

        }









    }
}






