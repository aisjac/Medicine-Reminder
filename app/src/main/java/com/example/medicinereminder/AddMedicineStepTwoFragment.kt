package com.example.medicinereminder

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
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


        val options = arrayOf("0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31")
        val optionsDMY = arrayOf("দিন","মাস","বছর")


        binding.addMedicineNumberSpinnerId.adapter = ArrayAdapter(requireContext(),android.R.layout.simple_spinner_item,options)
        binding.addMedicineDMYSpinnerId.adapter = ArrayAdapter(requireContext(),android.R.layout.simple_spinner_item,optionsDMY)




            binding.textViewStepTwoFragmentTVId.setOnClickListener {
                findNavController().navigate(R.id.action_addMedicineStepTwoFragment_to_addMedicineStepThreeFragment)
            }

            return binding.root
        }



    fun showDialog() {


    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}
