package com.example.medicinereminder

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.medicinereminder.databinding.FragmentHomeBinding
import com.example.medicinereminder.databinding.FragmentVaccineHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater,container,false)

        binding.fromFragmentHomeAddMemberButtonId.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_membershipPlanFragment)
        }

        return binding.root
    }


}