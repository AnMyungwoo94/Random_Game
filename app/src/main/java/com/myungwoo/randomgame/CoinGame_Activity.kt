package com.myungwoo.randomgame

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.myungwoo.randomgame.databinding.ActivityCoinGameBinding
import java.util.*
import kotlin.concurrent.schedule

class CoinGame_Activity : AppCompatActivity() {

    private lateinit var binding: ActivityCoinGameBinding
    var state = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCoinGameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.coinBtn.setOnClickListener {
            var animation : Animation = AnimationUtils.loadAnimation(this, R.anim.effact)
            binding.coinImage.startAnimation(animation)

            var mediaPlayer : MediaPlayer = MediaPlayer.create(this, R.raw.coin_effect)
            mediaPlayer?.start()

            Timer().schedule(2300){
                state = (0..1).random()

                if(state == 0){
                    binding.coinImage.setImageResource(R.drawable.coin_back)
                }else{
                    binding.coinImage.setImageResource(R.drawable.coin_front)
                }
            }
        }
    }
}