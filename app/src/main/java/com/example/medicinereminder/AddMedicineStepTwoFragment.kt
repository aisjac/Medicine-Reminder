package com.example.medicinereminder

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.medicinereminder.databinding.FragmentAddMedicineStepOneBinding
import com.example.medicinereminder.databinding.FragmentAddMedicineStepTwoBinding

class AddMedicineStepTwoFragment : Fragment() {

    private var _binding: FragmentAddMedicineStepTwoBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        _binding = FragmentAddMedicineStepTwoBinding.inflate(inflater, container, false)


        binding.textViewStepTwoFragmentTVId.setOnClickListener {
            findNavController().navigate(R.id.action_addMedicineStepTwoFragment_to_addMedicineStepThreeFragment)
        }







        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}