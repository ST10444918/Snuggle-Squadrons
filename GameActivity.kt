package com.st10444918.ass2st10444918

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_game)


        val petImageView = findViewById<ImageView>(R.id.SLEEPING)
        val feedButton = findViewById<Button>(R.id.feed)
        val bathButton = findViewById<Button>(R.id.bath)
        val playButton = findViewById<Button>(R.id.play)
        val sleepButton = findViewById<Button>(R.id.sleep)

        // Logic for the Feed button
        feedButton.setOnClickListener {
            // Change the pet's image to match feeding action icon
            petImageView.setImageResource(R.drawable.sleeping)//replace text in bold with   your picture name


        }

        // Logic for the bath button
        bathButton.setOnClickListener {
            // Change the pet's image to match cleaning action icon
            petImageView.setImageResource(R.drawable.bathing)//your picture here
        }

        // Logic for the play button
        playButton.setOnClickListener {
            // Change the pet's image to match cleaning action icon
            petImageView.setImageResource(R.drawable.playing)//your picture here

        }

        // Logic for the feed button
        feedButton.setOnClickListener {
            // Change the pet's image to match cleaning action icon
            petImageView.setImageResource(R.drawable.eating)//your picture here

        }
        // Logic for the sleep button
        sleepButton.setOnClickListener {
            // Change the pet's image to match cleaning action icon
            petImageView.setImageResource(R.drawable.sleeping)//your picture here
        }


        class MainActivity : AppCompatActivity() {
            //You add these code below here
            private lateinit var feedProgressBar: ProgressBar
            private lateinit var playProgressBar: ProgressBar
            private lateinit var cleanProgressBar: ProgressBar
            private lateinit var SleepProgressBar: ProgressBar


            private var feedProgressStatus: Int = 0
            private var playProgressStatus: Int = 0
            private var cleanProgressStatus: Int = 0
            private var SleepProgressStatus: Int = 0
            //end your code before this line

            @SuppressLint("MissingInflatedId")
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                enableEdgeToEdge()
                setContentView(R.layout.activity_main)
                ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                    val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                    v.setPadding(
                        systemBars.left,
                        systemBars.top,
                        systemBars.right,
                        systemBars.bottom
                    )
                    insets
                }
                //after this curly brace you can start your declarationss
                feedProgressBar = findViewById(R.id.feedProgressBar)
                playProgressBar = findViewById(R.id.playProgressBar)
                cleanProgressBar = findViewById(R.id.cleanProgressBar)
                SleepProgressBar = findViewById(R.id.sleepProgressBar)

                val feedButton = findViewById<Button>(R.id.feed)
                val bathButton = findViewById<Button>(R.id.bath)
                val playButton = findViewById<Button>(R.id.play)
                val sleepButton = findViewById<Button>(R.id.sleep)

                feedButton.setOnClickListener {
                    feedProgressStatus = 0
                    feedProgressBar.progress = feedProgressStatus
                    Thread(Runnable {
                        while (feedProgressStatus < 100) {
                            feedProgressStatus += 5
                            Thread.sleep(1000)
                            runOnUiThread {
                                feedProgressBar.progress = feedProgressStatus
                            }
                        }
                        runOnUiThread {
                            // Update feedTextView message
                        }
                    }).start()
                }

                bathButton.setOnClickListener {
                    cleanProgressStatus = 0
                    cleanProgressBar.progress = cleanProgressStatus
                    Thread(Runnable {
                        while (cleanProgressStatus < 100) {
                            cleanProgressStatus += 5
                            Thread.sleep(1000)
                            runOnUiThread {
                                cleanProgressBar.progress = cleanProgressStatus
                            }
                        }
                        runOnUiThread {
                            // Update cleanTextView message
                        }
                    }).start()
                }

                playButton.setOnClickListener {
                    playProgressStatus = 0
                    playProgressBar.progress = playProgressStatus
                    Thread(Runnable {
                        while (playProgressStatus < 100) {
                            playProgressStatus += 5
                            Thread.sleep(1000)
                            runOnUiThread {
                                playProgressBar.progress = playProgressStatus
                            }
                        }
                        runOnUiThread {
                            // Update playTextView message
                        }
                    }).start()

                    feedButton.setOnClickListener {
                        feedProgressStatus = 0
                        feedProgressBar.progress = feedProgressStatus
                        Thread(Runnable {
                            while (feedProgressStatus < 100) {
                                feedProgressStatus += 5
                                Thread.sleep(1000)
                                runOnUiThread {
                                    feedProgressBar.progress = feedProgressStatus
                                }
                            }
                            runOnUiThread {
                                // Update feed TextView message
                            }
                        }).start()

                        sleepButton.setOnClickListener {
                            SleepProgressStatus = 0
                            SleepProgressBar.progress = playProgressStatus
                            Thread(Runnable {
                                while (SleepProgressStatus < 100) {
                                    SleepProgressStatus += 5
                                    Thread.sleep(1000)
                                    runOnUiThread {
                                        SleepProgressBar.progress = SleepProgressStatus
                                    }
                                }
                                runOnUiThread {
                                    // Update sleep TextView message
                                }
                            }).start()

                        }
                    }
                }


            }
        }
    }
}
