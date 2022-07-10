package com.example.employeeattendancesystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.employeeattendancesystem.databinding.ActivitySignInBinding

class SignIn : AppCompatActivity() {

    private lateinit var binding: ActivitySignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //connect mismo yung binding.textInput
        binding.buttonSignIn.setOnClickListener {
            if(binding.textinputEnterId.text.toString().equals("123") && binding.textinputEnterPassword.text.toString().equals("123")){
                val intent= Intent(this, TimeInTimeOut::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this,"Error Connecting!", Toast.LENGTH_SHORT).show()
            }


        }

    }
}