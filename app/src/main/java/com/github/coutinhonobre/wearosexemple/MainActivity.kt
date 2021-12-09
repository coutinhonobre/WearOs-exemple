package com.github.coutinhonobre.wearosexemple

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import com.github.coutinhonobre.wearosexemple.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding
    private var value = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            value = value.plus(1)
            Toast.makeText(this, "Click $value", Toast.LENGTH_SHORT).show()
        }

    }
}