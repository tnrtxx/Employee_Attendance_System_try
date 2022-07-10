package com.example.employeeattendancesystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.employeeattendancesystem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //FOR EMPLOYEE
        binding.buttonEmployee.setOnClickListener {
            val intent= Intent(this, SignIn::class.java)
            startActivity(intent)
        }

        //FOR ADMIN
        binding.buttonAdmin.setOnClickListener {
            val intent= Intent(this, SignInAdmin::class.java)
            startActivity(intent)

        }
    }
}