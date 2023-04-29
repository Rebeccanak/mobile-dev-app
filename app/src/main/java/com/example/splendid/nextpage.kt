package com.example.splendid

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class nextpage : AppCompatActivity() {
      lateinit var tvnextpage:TextView
      lateinit var tvPrvs:TextView
//      @SuppressLint("MissingInflatedId")
      @SuppressLint("MissingInflatedId")
      override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nextpage)
    tvnextpage = findViewById(R.id.tvNextpage)
    tvPrvs= findViewById(R.id.tvPrvs)
    tvnextpage.setOnClickListener {
        val intent =Intent(this,interesting::class.java)
        startActivity(intent)
    }
    tvPrvs.setOnClickListener {
        val intent=Intent(this,previousActivity::class.java)
        startActivity(intent)
    }
}
        }
