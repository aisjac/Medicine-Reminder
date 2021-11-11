package com.example.medicinereminder

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
            findNavController().navigate(R.id.action_homeFragment_to_membershipPlanFragment)
        }


        layoutManager = LinearLayoutManager(requireContext())
        adapter= HomeRecyclerAdapter()

        binding.homeFragmentRecyclerViewId.layoutManager= layoutManager
        binding.homeFragmentRecyclerViewId.adapter = adapter





        return binding.root
    }


}