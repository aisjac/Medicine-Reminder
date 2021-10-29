package com.example.medicinereminder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.medicinereminder.databinding.ActivityAddMedicineBoardingBinding

class AddMedicineBoardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val addMedicineBinding :ActivityAddMedicineBoardingBinding = ActivityAddMedicineBoardingBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(addMedicineBinding.root)

        addMedicineBinding.addMedicineButtonId.setOnClickListener {
            startActivity(Intent(this,DashboardActivity::class.java))
        }
    }
}