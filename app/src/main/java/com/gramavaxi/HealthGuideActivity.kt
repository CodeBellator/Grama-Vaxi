package com.gramavaxi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gramavaxi.databinding.ActivityHealthGuideBinding

class HealthGuideActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHealthGuideBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHealthGuideBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
