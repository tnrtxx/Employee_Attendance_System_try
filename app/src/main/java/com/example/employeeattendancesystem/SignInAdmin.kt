package com.example.employeeattendancesystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.employeeattendancesystem.databinding.ActivitySignInAdminBinding

class SignInAdmin : AppCompatActivity() {
    private  lateinit var binding: ActivitySignInAdminBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInAdminBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSignInAdmin.setOnClickListener {
            if(binding.textinputEnterIdAdmin.text.toString().equals("123") && binding.textinputEnterPasswordAdmin.text.toString().equals("admin")){
                val intent= Intent(this, EmployeeDetails::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this,"Error Connecting!", Toast.LENGTH_SHORT).show()
            }
        }

    }
}