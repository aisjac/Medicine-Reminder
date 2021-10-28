package com.example.medicinereminder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.medicinereminder.databinding.ActivityOtpVarificationBinding
import com.goodiebag.pinview.Pinview

class OtpVArificationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val otpBinding : ActivityOtpVarificationBinding = ActivityOtpVarificationBinding.inflate(layoutInflater)
        setContentView(otpBinding.root)
        
        val pinViewValue = findViewById<Pinview>(R.id.pinview)
        
        pinViewValue.setPinViewEventListener { pinview, fromUser ->
            Toast.makeText(this, "PinView Value = "+pinViewValue.value, Toast.LENGTH_SHORT).show()
        }


        otpBinding.backToLoginImgId.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }

    }
}