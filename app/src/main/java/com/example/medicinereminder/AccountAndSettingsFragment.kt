package com.example.medicinereminder

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.medicinereminder.databinding.FragmentAccountAndSettingsBinding
import com.example.medicinereminder.databinding.FragmentAppointmentHomeBinding

class AccountAndSettingsFragment : Fragment() {

    private var _binding: FragmentAccountAndSettingsBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAccountAndSettingsBinding.inflate(inflater,container,false)

        binding.changePasswordFromSettingsId.setOnClickListener {
            findNavController().navigate(R.id.action_accountAndSettingsFragment_to_changePasswordFragment)
        }


        return binding.root
    }


}