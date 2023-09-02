package com.cristallball

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cristallball.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvChallenges.setOnClickListener{
            binding.tvChallenges.text = getChallenges()
        }
    }

    private fun getChallenges(): String{
        return resources.getStringArray(R.array.challenges)[randomNumber()]
    }

    private fun randomNumber () : Int {
        val size = resources.getStringArray(R.array.challenges).size
        return (0..size).random()
    }

}