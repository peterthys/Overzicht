package com.example.overzicht

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sdf = SimpleDateFormat("dd/M ")
        val currentDate = sdf.format(Date())
        tv_date.text = currentDate
     var aantalJupiler = 0.0
        buttonOpenActivity.setOnClickListener() {


            Intent(this, SecondActivity::class.java).also {
                ////

                if (et_jupiler.text.toString().equals("")){

                     aantalJupiler  = 0.0


                }
                 else
                     aantalJupiler  = et_jupiler.text.toString().toDouble()

                var aantalWijn : Double = 0.0
                if (et_wijn.text.toString().equals("")){
                    aantalWijn=0.0
                }else
                 aantalWijn = et_wijn.text.toString().toDouble()

                var aantalDuvel  : Double= 0.0
                if (et_Duvel.text.toString().equals("")){
                    aantalDuvel=0.0
                }
                else
                    aantalDuvel = et_Duvel.text.toString().toDouble()
                val totaal = aantalJupiler + (aantalDuvel) * 1.5 + (aantalWijn) * 2
                it.putExtra("EXTRA_TOTAAL", totaal)
                it.putExtra("EXTRA_DATE",currentDate)
                startActivity(it)
            }
        }

    }


}
