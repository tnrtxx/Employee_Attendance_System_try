package com.example.employeeattendancesystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.employeeattendancesystem.databinding.ActivityTimeOutBinding

class TimeOUT : AppCompatActivity() {

    private lateinit var binding: ActivityTimeOutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTimeOutBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}