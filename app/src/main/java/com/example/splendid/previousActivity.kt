package com.example.splendid

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.UserDictionary.Words
import android.widget.TextView

class previousActivity : AppCompatActivity() {
    lateinit var tilanotherpage:TextView
    lateinit var tvctrlpage:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_previous)
        tilanotherpage=findViewById(R.id.tilanotherpage)
        tvctrlpage=findViewById(R.id.tvctrlpage)
        tilanotherpage.setOnClickListener {
            val  intent= Intent(this,nextpage::class.java)
            startActivity(intent)

        }
        tvctrlpage.setOnClickListener {
            val  intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
    }
     }

    }

