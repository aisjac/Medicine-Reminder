package com.example.medicinereminder

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController
import com.example.medicinereminder.databinding.FragmentAppointmentHomeBinding
import com.example.medicinereminder.databinding.FragmentHomeBinding

class AppointmentFragment : Fragment() {

    private var _binding: FragmentAppointmentHomeBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAppointmentHomeBinding.inflate(inflater,container,false)


        binding.medicalAppointmentAddButtonId.setOnClickListener {
            findNavController().navigate(R.id.action_appointmentFragment_to_addAppointmentFragment)
        }


        binding.medicalAppointmentTVId.setOnClickListener {

            customDialog()
        }




        return binding.root
    }



    private fun customDialog() {
        val dialog = Dialog(requireContext())
        dialog.setContentView(R.layout.appointment_dialog)

        val yesBtn = dialog.findViewById(R.id.appointmentEditYesDialogButtonId) as ImageButton
        yesBtn.setOnClickListener(View.OnClickListener {
//            findNavController().navigate(R.id.membershipPlanFragment)
            dialog.dismiss()
        })

        dialog.show()

        val noBtn = dialog.findViewById(R.id.appointmentEditNoDialogButtonId) as ImageButton
        noBtn.setOnClickListener(View.OnClickListener {
//            findNavController().navigate(R.id.membershipPlanFragment)
            dialog.dismiss()
        })

        dialog.show()

    }

}