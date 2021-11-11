package com.example.medicinereminder

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.medicinereminder.databinding.FragmentOthersBinding

class OthersFragment : Fragment() {

    private var _binding: FragmentOthersBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentOthersBinding.inflate(inflater, container, false)

        //showPopUp()


        customDialog()

        return binding.root
    }

    private fun showPopUp() {
        val builder = AlertDialog.Builder(requireContext())
        builder.setTitle("Choose your Destination")
//        builder.setMessage("We have a message")
//builder.setPositiveButton("OK", DialogInterface.OnClickListener(function = x))

        builder.setPositiveButton("টিকা") { dialog, which ->
            findNavController().navigate(R.id.vaccineHomeFragment)
        }

        builder.setNegativeButton("এপয়েন্টমেন্ট") { dialog, which ->
            findNavController().navigate(R.id.appointmentFragment)
        }

//        builder.setNeutralButton("Maybe") { dialog, which ->
//            Toast.makeText(requireContext(),
//                "Maybe", Toast.LENGTH_SHORT).show()
//        }
        builder.show()
    }


    private fun customDialog() {
        val dialog = Dialog(requireContext())
        dialog.setContentView(R.layout.others_fragment_dialog)
//        dialog.setTitle("Android Custom Dialog")
//        dialog.setCancelable(false)

        // set the custom dialog components - text, image and button

//        val textView = dialog.findViewById<View>(R.id.popupTextViewId) as TextView
//        textView.text = "Custom Dialog Kotlin Android!"
//        val imageView = dialog.findViewById<View>(R.id.popupImgViewId) as ImageView
//        imageView.setImageResource(R.mipmap.ic_launcher)

        val yesBtn = dialog.findViewById(R.id.yesButtonId) as Button
        yesBtn.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.vaccineHomeFragment)
            dialog.dismiss()
        })

        dialog.show()

        val noBtn = dialog.findViewById(R.id.noButtonId) as Button
        noBtn.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.appointmentFragment)
            dialog.dismiss()
        })

        dialog.show()
    }


}