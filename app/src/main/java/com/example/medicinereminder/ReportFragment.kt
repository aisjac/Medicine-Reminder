package com.example.medicinereminder

import android.R
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.medicinereminder.databinding.FragmentReportBinding

class ReportFragment : Fragment() {

    private var _binding:FragmentReportBinding ?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentReportBinding.inflate(inflater, container, false)

        val options = arrayOf("তারিখ","তারিখ","তারিখ","তারিখ","তারিখ","তারিখ")
        val optionsDMY = arrayOf("সময়","সময়","সময়")


        binding.reportDateSpinnerId.adapter = ArrayAdapter(requireContext(),
            R.layout.simple_spinner_item,options)
        binding.reportTimeSpinnerId.adapter = ArrayAdapter(requireContext(),
            R.layout.simple_spinner_item,optionsDMY)


        return binding.root
    }

}