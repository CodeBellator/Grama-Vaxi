package com.gramavaxi

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gramavaxi.databinding.ActivityDashboardBinding

class DashboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up toolbar
        setSupportActionBar(binding.toolbar)
        
        // Setup clicks to other screens for demo
        binding.toolbar.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        binding.toolbar.setOnMenuItemClickListener {
            // refresh
            true
        }
        
        // Let's add more clicks to show other screens
        binding.root.setOnClickListener {
             // In a real app we'd have a menu or bottom nav
        }
        binding.cardAnimal1.setOnClickListener {
            startActivity(Intent(this, HealthRecordsActivity::class.java))
        }
    }
}
