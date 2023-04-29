package com.example.splendid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvnewpage:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvnewpage=findViewById(R.id.tvnewpage)
        tvnewpage.setOnClickListener {
           val  intent= Intent(this,previousActivity::class.java)
            startActivity(intent)
        }
    }
}