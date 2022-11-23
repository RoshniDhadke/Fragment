package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  firstFragment=FirstFragment()
        val  SecondFragment=SecondFragment()
        val btn1=findViewById<Button>(R.id.btn1)
        val btn2=findViewById<Button>(R.id.btn2)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl,firstFragment)
            commit()
        }
        btn1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fl, firstFragment)
                addToBackStack(null)
                commit()
            }
        }
        btn2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fl,SecondFragment)
                addToBackStack(null)
                commit()
            }
        }
    }
}

