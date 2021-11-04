package com.example.medicinereminder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.medicinereminder.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val loginBinding :ActivityLoginBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(loginBinding.root)

        loginBinding.signInButtonId.setOnClickListener {
            startActivity(Intent(this,AddMedicineBoardingActivity::class.java))
        }

        loginBinding.forgotPasswordTVId.setOnClickListener {
            startActivity(Intent(this,ForgotPasswordActivity::class.java))
        }

        loginBinding.signUpKorunTVId.setOnClickListener {
            startActivity(Intent(this,RegistrationActivity::class.java))
        }
    }
}