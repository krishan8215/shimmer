package com.example.shimmereffect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shimmereffect.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding  = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.shimmerid.startShimmer()

        fun onDestroy() {
            // Stop shimmer effect when the activity is destroyed
            binding.shimmerid.stopShimmer()
            super.onDestroy()
        }
    }




    }
