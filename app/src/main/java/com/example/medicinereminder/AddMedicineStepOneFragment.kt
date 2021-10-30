package com.example.medicinereminder

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.medicinereminder.databinding.FragmentAddMedicineStepOneBinding

class AddMedicineStepOneFragment : Fragment() {

    private var _binding: FragmentAddMedicineStepOneBinding?=null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAddMedicineStepOneBinding.inflate(inflater,container,false)


        binding.textView6stepOneFragmentTVId.setOnClickListener {
            findNavController().navigate(R.id.action_addMedicineStepOneFragment_to_addMedicineStepTwoFragment)
        }






        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}


