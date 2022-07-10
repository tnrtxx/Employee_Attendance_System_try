package com.example.employeeattendancesystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.employeeattendancesystem.databinding.ActivityViewEmployeesBinding

class ViewEmployees : AppCompatActivity() {
    private lateinit var binding: ActivityViewEmployeesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewEmployeesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}