package com.myungwoo.randomgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myungwoo.randomgame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.coinIntent.setOnClickListener {
            startActivity(Intent(this, CoinGame_Activity::class.java))
        }

        binding.doceIntent.setOnClickListener {
            startActivity(Intent(this, Dice_Activity::class.java))
        }
    }
}