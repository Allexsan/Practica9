package com.example.practica9

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var buttonClickCounter1 = 0
    private var buttonClickCounter2 = 0
    private var buttonClickCounter3 = 0
    private val notificationFrequency = 3
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener{
            buttonClickCounter1++
            if (buttonClickCounter1 % notificationFrequency == 0){
                showToast("Вы нажали кнопку 1 $notificationFrequency раз(а)")
            }
        }
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener{
            buttonClickCounter2++
            if (buttonClickCounter2 % notificationFrequency == 0){
                showToast("Вы нажали кнопку 2 $notificationFrequency раз(а)")
            }
        }
        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener{
            buttonClickCounter3++
            if (buttonClickCounter3 % notificationFrequency == 0){
                showToast("Вы нажали кнопку 3 $notificationFrequency раз(а)")
            }
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}