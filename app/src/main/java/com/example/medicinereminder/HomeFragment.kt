package com.example.medicinereminder

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.medicinereminder.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding?=null
    private val binding get() = _binding!!

    private var layoutManager:RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<HomeRecyclerAdapter.ViewHolder>? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater,container,false)

        binding.fromFragmentHomeAddMemberButtonId.setOnClickListener {
            customDialog()
        }


        binding.addMedicineFabButtonId.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_addMedicineStepOneFragment)
        }


        layoutManager = LinearLayoutManager(requireContext())
        adapter= HomeRecyclerAdapter()

        binding.homeFragmentRecyclerViewId.layoutManager= layoutManager
        binding.homeFragmentRecyclerViewId.adapter = adapter





        return binding.root
    }




    private fun customDialog() {
        val dialog = Dialog(requireContext())
        dialog.setContentView(R.layout.membership_dialog)

        val yesBtn = dialog.findViewById(R.id.addMembershipDialogButton) as Button
        yesBtn.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.membershipPlanFragment)
            dialog.dismiss()
        })

        dialog.show()

    }


}