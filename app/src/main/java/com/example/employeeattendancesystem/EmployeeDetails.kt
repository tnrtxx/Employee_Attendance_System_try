package com.example.employeeattendancesystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.employeeattendancesystem.databinding.ActivityEmployeeDetailsBinding

class EmployeeDetails : AppCompatActivity() {

    private lateinit var binding: ActivityEmployeeDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmployeeDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonAddEmployee.setOnClickListener {
            Toast.makeText(this,"Successfully added!", Toast.LENGTH_SHORT).show()
        }
        binding.buttonViewEmployee.setOnClickListener {
            val intent= Intent(this, ViewEmployees::class.java)
            startActivity(intent)
        }
    }
}