package com.example.medicinereminder

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.medicinereminder.databinding.FragmentAddMedicineStepThreeBinding
import com.example.medicinereminder.databinding.FragmentAddMedicineStepTwoBinding
import java.util.*


class AddMedicineStepThreeFragment : Fragment() {
    private var _binding: FragmentAddMedicineStepThreeBinding? = null
    private val binding get() = _binding!!

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAddMedicineStepThreeBinding.inflate(inflater, container, false)



        val calender = Calendar.getInstance()
        val yearC = calender.get(Calendar.YEAR)
        val monthC = calender.get(Calendar.MONTH)
        val dayC = calender.get(Calendar.DAY_OF_MONTH)

        binding.addMedicineStepThreeImgId.setOnClickListener {

            val dpd = DatePickerDialog(requireContext(), { view, year, monthOfYear, dayOfMonth ->
                // Display Selected date in TextView
                binding.adMedicineStepThreeTVId.text = "$dayOfMonth/$monthOfYear/$year"
            }, yearC, monthC, dayC)
            dpd.show()


        }





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