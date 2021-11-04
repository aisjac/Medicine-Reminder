package com.example.medicinereminder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.medicinereminder.databinding.ActivityRegistrationBinding

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val  registrationBinding:ActivityRegistrationBinding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(registrationBinding.root)

        registrationBinding.signUpButtonId.setOnClickListener {
            startActivity(Intent(this,OtpVArificationActivity::class.java))
        }

        registrationBinding.signInKorunTVId.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
}