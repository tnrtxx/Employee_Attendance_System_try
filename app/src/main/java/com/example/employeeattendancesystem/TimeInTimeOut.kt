package com.example.employeeattendancesystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.employeeattendancesystem.databinding.ActivityTimeInTimeOutBinding

class TimeInTimeOut : AppCompatActivity() {

    private lateinit var binding: ActivityTimeInTimeOutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityTimeInTimeOutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonTimeInDashboard.setOnClickListener {
            val intent= Intent(this, TimeIN::class.java)
            startActivity(intent)
        }

        binding.buttonTimeOutDashboard.setOnClickListener {
            val intent= Intent(this, TimeOUT::class.java)
            startActivity(intent)
        }
    }
}