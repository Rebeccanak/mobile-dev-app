package com.example.splendid

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class lastpage : AppCompatActivity() {
    lateinit var tvBack:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lastpage)
        tvBack=findViewById(R.id.tvBack)
        tvBack.setOnClickListener {
            val intent=Intent(this,interesting::class.java)
         startActivity(intent)
        }


        }
    }
