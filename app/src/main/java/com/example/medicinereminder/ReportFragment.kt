package com.example.medicinereminder

import android.R
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController
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


        binding.addReportButtonId.setOnClickListener {
            customDialog()

        }





        return binding.root
    }


    private fun customDialog() {
        val dialog = Dialog(requireContext())
        dialog.setContentView(com.example.medicinereminder.R.layout.add_report_dialog)

        val yesBtn = dialog.findViewById(com.example.medicinereminder.R.id.addReportEditYesDialogButtonId) as ImageButton
        yesBtn.setOnClickListener(View.OnClickListener {

            dialog.dismiss()
        })

        dialog.show()


        val noBtn = dialog.findViewById(com.example.medicinereminder.R.id.addreportEditNoDialogButtonId) as ImageButton
        noBtn.setOnClickListener(View.OnClickListener {

            dialog.dismiss()
        })

        dialog.show()

    }


}