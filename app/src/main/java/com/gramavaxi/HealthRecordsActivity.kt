package com.gramavaxi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gramavaxi.databinding.ActivityHealthRecordsBinding

class HealthRecordsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHealthRecordsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHealthRecordsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
