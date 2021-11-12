package com.example.medicinereminder

import android.app.DatePickerDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.navigation.fragment.findNavController
import com.example.medicinereminder.databinding.FragmentAddMedicineStepTwoBinding
import java.util.*

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


        val calender = Calendar.getInstance()
        val yearC = calender.get(Calendar.YEAR)
        val monthC = calender.get(Calendar.MONTH)
        val dayC = calender.get(Calendar.DAY_OF_MONTH)

        binding.addMedicineStartingImgId.setOnClickListener {

            val dpd = DatePickerDialog(requireContext(), { view, year, monthOfYear, dayOfMonth ->
                // Display Selected date in TextView
                binding.addMedicineStartingTVd.text = "$dayOfMonth/$monthOfYear/$year"
            }, yearC, monthC, dayC)
            dpd.show()


        }

        binding.addMedicineEndingImgId.setOnClickListener {

            val dpd = DatePickerDialog(requireContext(), { view, year, monthOfYear, dayOfMonth ->
                // Display Selected date in TextView
                binding.addMedicineEndingTVId.text = "$dayOfMonth/$monthOfYear/$year"
            }, yearC, monthC, dayC)
            dpd.show()


        }


        binding.addDoseButtonId.setOnClickListener {
            customDialog()
        }


            binding.textViewStepTwoFragmentTVId.setOnClickListener {
                findNavController().navigate(R.id.action_addMedicineStepTwoFragment_to_addMedicineStepThreeFragment)
            }

            return binding.root
        }



    private fun customDialog() {
        val dialog = Dialog(requireContext())
        dialog.setContentView(R.layout.popup_for_medicine)

        val yesBtn = dialog.findViewById(R.id.setMedicinePopupButtonId) as Button
        yesBtn.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.addMedicineStepTwoFragment)
            dialog.dismiss()
        })

        dialog.show()

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}
