package com.example.diceroller

import android.os.Build.VERSION_CODES
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var btn:Button
    private lateinit var imgice:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn=findViewById(R.id.btnRoll)
        imgice=findViewById(R.id.imgDice)
        btn.setOnClickListener{
           // btn.text="Dice Rolled!"
          //  imgice.text=(1..6).random().toString()
            rollDice()
        }
    }
    private fun rollDice(){
        val dice=Dice(6)
        val imgRes=dice.roll()
        // fade in and fade out image
        imgice.animate().apply {
            duration =200
           // alpha(0f)
            rotation(360f)
            withEndAction {


                imgice.setImageResource(imgRes)
                // alpha(1f)

            }
        }.start()

    }
}


class Dice(private val numSides:Int){
    fun roll():Int{
        val randomNumber=(1..numSides).random()
        return when (randomNumber)
        {
            1 ->R.drawable.dice1
            2 ->R.drawable.dice2
            3 ->R.drawable.dice3
            4 ->R.drawable.dice4
            5 ->R.drawable.dice5
            6 ->R.drawable.dice6
            else ->0

        }
    }
}