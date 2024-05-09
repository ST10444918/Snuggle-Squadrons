package com.st10444918.ass2st10444918

import android.content.Intent
import android.os.Bundle

import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


            // Button to navigate to the second screen
            val enterButton = findViewById<Button>(R.id.EnterButton)
            enterButton.setOnClickListener {
                val intent = Intent(this, GameActivity::class.java)// GameActivity: name of the second activity
                startActivity(intent)
            }
            }
    }
