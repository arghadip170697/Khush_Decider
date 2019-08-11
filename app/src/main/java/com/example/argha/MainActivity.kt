package com.example.argha

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val weedlist = arrayListOf("Jhonny Khush","Khalifa Khush","Mysore Mango","santosh cook","jsr khush")



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decide.setOnClickListener {
            val random =  Random
            val randomweed = random.nextInt(weedlist.count())
            choices.text = weedlist[randomweed]


        }
        adding.setOnClickListener {
            val newweed = inputs.text.toString()
            weedlist.add(newweed)
            inputs.text.clear()
        }
    }
}
