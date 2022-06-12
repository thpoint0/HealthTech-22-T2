package com.example.mhapp4;

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mhapp4.databinding.TrendsBinding

class ThirdActivity : AppCompatActivity() {
        private lateinit var binding: TrendsBinding
                override fun onCreate(savedInstanceState: Bundle?) {
                        super.onCreate(savedInstanceState)
                        setContentView(R.layout.trends)

                        binding = TrendsBinding.inflate(layoutInflater)
                        setContentView(binding.root)
                }

}