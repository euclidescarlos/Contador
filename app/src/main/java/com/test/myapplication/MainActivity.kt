package com.test.myapplication

import android.os.Bundle

import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity : AppCompatActivity() {
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val buttonPlus: FloatingActionButton = findViewById(R.id.botaomais)
        val buttonMinus: FloatingActionButton = findViewById(R.id.botaomenos)
        val text: TextView = findViewById(R.id.texto)

        buttonPlus.setOnClickListener {
            count++
            text.text = count.toString()
        }

        buttonMinus.setOnClickListener{
            if(count > 0){
            count--
            text.text = count.toString()
            }
        }
    }
}
