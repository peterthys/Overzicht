package com.example.overzicht

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val totaal = intent.getDoubleExtra("EXTRA_TOTAAL", 0.0)
        val date = intent.getStringExtra("EXTRA_DATE")
        val totaalString = "$date : $totaal"
        tv_jupiler.text = totaalString
        button_back.setOnClickListener {
            finish()
        }
    }


}


