package com.example.mycodepathproject

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import kotlin.random.Random

//Returns a random number between 0-255
fun getRandomColor(): Int {
    val x = Random.nextInt(0, 255)
    return x
}

//This kotlin file is for user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Shows the layout file: activity_main
        setContentView(R.layout.activity_main)

        //User can press button to change text color
        //1. Add a button to layout
        //2. Set up logic for the button
        findViewById<Button>(R.id.textColor).setOnClickListener {
            //Handle button tap
            //3. Change the color of the text
            Log.i("Quinten", "Pressed the button")
            //1.Get a reference to the text
            //2. Set the color of the text
            findViewById<TextView>(R.id.textView).setTextColor(resources.getColor(R.color.white))
        }

        //Create Logic for change color for viewColor
        findViewById<Button>(R.id.viewColor).setOnClickListener {
            //Check if button works
            Log.i("Quinten", "Change view pressed")
            //Change the color
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(resources.getColor(R.color.teal_200))
        }

        //Create logic for textString
        findViewById<Button>(R.id.textString).setOnClickListener{
            //Check if button works
            Log.i("Quinten", "Change text string pressed")

            var message: String     //Holds textString

            //Take the string from EditText
            message = findViewById<EditText>(R.id.userString).text.toString()
            //Place string in textView
            findViewById<TextView>(R.id.textView).text = message
        }

        //Create logic for randButton
        findViewById<Button>(R.id.randButton).setOnClickListener{
            //First get random numbers for rgb
            var a = getRandomColor() // a, b, and c will hold random int for rgb colors
            var b = getRandomColor()
            var c = getRandomColor()
            //Now change the text color
            findViewById<TextView>(R.id.textView).setTextColor(Color.rgb(a, b, c))
            //Randomized the variables again
            a = getRandomColor()
            b = getRandomColor()
            c = getRandomColor()
            //Change backgroundView color
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(Color.rgb(a,b,c))
        }

    }
}