package com.example.medicinereminder

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.medicinereminder.databinding.FragmentAddMedicineStepThreeBinding
import com.example.medicinereminder.databinding.FragmentAddMedicineStepTwoBinding


class AddMedicineStepThreeFragment : Fragment() {
    private var _binding: FragmentAddMedicineStepThreeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAddMedicineStepThreeBinding.inflate(inflater, container, false)


        binding.textViewStepThreeFragmentTVId.setOnClickListener {
            findNavController().navigate(R.id.action_addMedicineStepThreeFragment_to_addMedicineFinalStepFragment)
        }







        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}