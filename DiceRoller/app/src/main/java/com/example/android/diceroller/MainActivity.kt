package com.example.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}

        val contarButton: Button = findViewById(R.id.count_button)
        contarButton.setOnClickListener{countUp()}

        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener{reset()}

    }

    private fun rollDice(){
        val randomInt = (1..6).random()
        //Toast.makeText(this,"Button Clicked", Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.result_text)
        //resultText.text = "Dice Rolled!"
        resultText.text = randomInt.toString()
    }

    private fun countUp(){
        val resultText: TextView = findViewById(R.id.result_text)
        var resultInt = resultText.text.toString().toInt()

        when(resultText.text){
            "Hello Word!" -> resultText.text = "1"
            "6" -> resultText.text
            else -> if( resultInt < 6){ resultText.text = resultInt++.toString()}
        }
    }

    private fun reset(){
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "0"
    }
}