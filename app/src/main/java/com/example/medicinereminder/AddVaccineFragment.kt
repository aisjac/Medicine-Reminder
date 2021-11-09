package com.example.medicinereminder

import android.R
import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.medicinereminder.databinding.FragmentVaccineAddBinding
import java.util.*

class AddVaccineFragment : Fragment() {
   private var _binding:FragmentVaccineAddBinding?=null

    private val binding get() = _binding!!

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentVaccineAddBinding.inflate(inflater, container, false)



        val vaccineName = arrayOf("one","two","three")
        val centerName = arrayOf("center one","center two","center three")
        val day = arrayOf("0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31")
        val month = arrayOf("মাস","মাস","মাস")
        val year = arrayOf("বছর","বছর","বছর")


        binding.vaccineNameSpinnerId.adapter = ArrayAdapter(requireContext(), R.layout.simple_spinner_item,vaccineName)
        binding.vaccineCenterNameSpinnerId.adapter = ArrayAdapter(requireContext(), R.layout.simple_spinner_item,centerName)
        binding.addVaccineDaySpinnerId.adapter = ArrayAdapter(requireContext(), R.layout.simple_spinner_item,day)
        binding.addVaccineMonthSpinnerId.adapter = ArrayAdapter(requireContext(), R.layout.simple_spinner_item,month)
        binding.addVaccineYearSpinnerId.adapter = ArrayAdapter(requireContext(), R.layout.simple_spinner_item,year)


        val calender = Calendar.getInstance()
        val yearC = calender.get(Calendar.YEAR)
        val monthC = calender.get(Calendar.MONTH)
        val dayC = calender.get(Calendar.DAY_OF_MONTH)

        binding.startingDateVaccineImgId.setOnClickListener {

            val dpd = DatePickerDialog(requireContext(), { view, year, monthOfYear, dayOfMonth ->
                // Display Selected date in TextView
                binding.startingDateVaccineTVId.text = "$dayOfMonth/$monthOfYear/$year"
            }, yearC, monthC, dayC)
            dpd.show()


        }


        binding.endingDateVaccineImgId.setOnClickListener {


            val dpd = DatePickerDialog(requireContext(), { view, year, monthOfYear, dayOfMonth ->
                // Display Selected date in TextView
                binding.endingDateVaccineTVId.text = "$dayOfMonth/$monthOfYear/$year"
            }, yearC, monthC, dayC)
            dpd.show()


        }


        return binding.root
    }

}