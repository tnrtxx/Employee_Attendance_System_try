package com.example.employeeattendancesystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.employeeattendancesystem.databinding.ActivityTimeInBinding

class TimeIN : AppCompatActivity() {

    private lateinit var binding: ActivityTimeInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTimeInBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}