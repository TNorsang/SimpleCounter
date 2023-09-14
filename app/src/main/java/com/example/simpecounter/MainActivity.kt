package com.example.simpecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)
        val upgradeButton = findViewById<Button>(R.id.upgradeButton)


        var counter = 0

        button.setOnClickListener {
            counter++
            textView.text = counter.toString()

            if(counter >= 100){

                upgradeButton.visibility = View.VISIBLE
                upgradeButton.setOnClickListener {

                    button.setOnClickListener{
                        counter+=2
                        textView.text = counter.toString()
                    }
                    upgradeButton.visibility = View.INVISIBLE

                }
            }
        }



    }
}