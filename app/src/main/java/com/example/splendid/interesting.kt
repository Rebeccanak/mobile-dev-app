package com.example.splendid

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class interesting : AppCompatActivity() {
    lateinit var tvnextinteresting:TextView
    lateinit var tvnextin:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interesting)
        tvnextinteresting=findViewById(R.id.tvnextinterest)
        tvnextin=findViewById(R.id.tvnextin)
        tvnextinteresting.setOnClickListener {
            val  intent= Intent(this,lastpage::class.java)
            startActivity(intent)
    }
        tvnextin.setOnClickListener {
            val  intent= Intent(this,nextpage::class.java)
            startActivity(intent)
}

    }

    }

