package com.myungwoo.randomgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.myungwoo.randomgame.databinding.ActivityDiceBinding
import java.util.*
import kotlin.concurrent.schedule

class Dice_Activity : AppCompatActivity() {

    private lateinit var binding: ActivityDiceBinding
    var state = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDiceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.diceBtn.setOnClickListener {
            var animation : Animation = AnimationUtils.loadAnimation(this, R.anim.effact)
            binding.diceImage.startAnimation(animation)


            Timer().schedule(2300) {
                state = (0..5).random()
                if (state == 0) {
                    binding.diceImage.setImageResource(R.drawable.dice_1)
                }else if(state == 1){
                    binding.diceImage.setImageResource(R.drawable.dice_2)
                }else if(state == 2){
                    binding.diceImage.setImageResource(R.drawable.dice_3)
                }else if(state == 3){
                    binding.diceImage.setImageResource(R.drawable.dice_4)
                }else if(state == 4){
                    binding.diceImage.setImageResource(R.drawable.dice_5)
                }else{
                    binding.diceImage.setImageResource(R.drawable.dice_6)
            }
        }
    }
}
    }