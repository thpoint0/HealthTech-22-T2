package com.example.mhapp4

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mhapp4.databinding.ActivityMusicPlayBinding

class SecondActivity : AppCompatActivity() {
        private lateinit var binding: ActivityMusicPlayBinding
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music_play)

        binding = ActivityMusicPlayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // storing ID of the button
        // in a variable
        val button = findViewById<Button>(R.id.button)

        // operations to be performed
        // when user tap on the button
        button?.setOnClickListener()
        {
        // displaying a toast message
        Toast.makeText(this@SecondActivity, R.string.message, Toast.LENGTH_LONG).show() }
        }
}
