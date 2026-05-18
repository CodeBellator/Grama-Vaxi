package com.gramavaxi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gramavaxi.databinding.ActivityRegisterAnimalBinding

class RegisterAnimalActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterAnimalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterAnimalBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
