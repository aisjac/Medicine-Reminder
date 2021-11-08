package com.example.medicinereminder

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.medicinereminder.databinding.FragmentAboutUsBinding
import com.example.medicinereminder.databinding.FragmentAddMedicineStepTwoBinding

class AboutUsFragment : Fragment() {

    private var _binding: FragmentAboutUsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAboutUsBinding.inflate(inflater,container,false)


        binding.contactUsLinearlayoutId.setOnClickListener {
            findNavController().navigate(R.id.action_aboutUsFragment_to_contactUsFragment)
        }

        return binding.root
    }


}