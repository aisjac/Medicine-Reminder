package com.example.medicinereminder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.medicinereminder.databinding.ActivityForgotPasswordBinding

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val  bindingForgotPassActivity : ActivityForgotPasswordBinding = ActivityForgotPasswordBinding.inflate(layoutInflater)
        setContentView(bindingForgotPassActivity.root)


        bindingForgotPassActivity.backToLoginImgId.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }

    }

}