package com.example.medicinereminder

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.medicinereminder.databinding.FragmentAddMedicineStepOneBinding
import com.example.medicinereminder.databinding.FragmentVaccineHomeBinding

class VaccineHomeFragment : Fragment() {

    private var _binding: FragmentVaccineHomeBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentVaccineHomeBinding.inflate(inflater,container,false)

        binding.addVaccineFabButtonId.setOnClickListener {
            findNavController().navigate(R.id.action_vaccineHomeFragment_to_vaccineAddFragment)
        }

        return binding.root
    }





}