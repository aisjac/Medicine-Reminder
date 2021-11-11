package com.example.medicinereminder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class HomeRecyclerAdapter : RecyclerView.Adapter<HomeRecyclerAdapter.ViewHolder>() {

    private var mainImages = intArrayOf(
        R.drawable.default_profile_icon,
        R.drawable.default_profile_icon,
        R.drawable.default_profile_icon,
        R.drawable.default_profile_icon,
        R.drawable.default_profile_icon,
        R.drawable.default_profile_icon
    )
    private var itemName = arrayOf("Capsule", "Tablet", "Syrup", "Capsule", "Tablet", "Syrup")

    private var morning = arrayOf("Morning", "Morning", "Morning", "Morning", "Morning", "Morning")
    private var morningBAO = arrayOf("Before", "After", "onTime", "Before", "After", "onTime")
    private var noon = arrayOf("Noon", "Noon", "Noon", "Noon", "Noon", "Noon")
    private var noonBAO = arrayOf("Before", "After", "onTime", "Before", "After", "onTime")
    private var evening = arrayOf("evening", "evening", "evening", "evening", "evening", "evening")
    private var eveningBAO = arrayOf("Before", "After", "onTime", "Before", "After", "onTime")

    private var detailsArrowImage = intArrayOf(
        R.drawable.forward_arrow,
        R.drawable.forward_arrow,
        R.drawable.forward_arrow,
        R.drawable.forward_arrow,
        R.drawable.forward_arrow,
        R.drawable.forward_arrow
    )

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HomeRecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.remember_medicine_recyclerview_model, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: HomeRecyclerAdapter.ViewHolder, position: Int) {
        holder.itemImage.setImageResource(mainImages[position])

        holder.itemHeadline.text = itemName[position]
        holder.itemMorning.text = morning[position]
        holder.itemNoon.text = noon[position]
        holder.itemEvening.text = evening[position]
        holder.itemBefore.text = morningBAO[position]
        holder.itemAfter.text = noonBAO[position]
        holder.itemOnTime.text = eveningBAO[position]

        holder.itemDetailsArrow.setImageResource(detailsArrowImage[position])
    }

    override fun getItemCount(): Int {
        return mainImages.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        var itemImage: ImageView
        var itemHeadline: TextView
        var itemMorning: TextView
        var itemNoon: TextView
        var itemEvening: TextView
        var itemBefore: TextView
        var itemAfter: TextView
        var itemOnTime: TextView
        var itemDetailsArrow: ImageView


        init {
            itemImage = itemView.findViewById(R.id.itemImageId)
             itemHeadline = itemView.findViewById(R.id.itemNameId)
             itemMorning= itemView.findViewById(R.id.itemMorningTVId)
             itemNoon= itemView.findViewById(R.id.itemNoonTVId)
             itemEvening = itemView.findViewById(R.id.itemEveningTVId)
             itemBefore = itemView.findViewById(R.id.morningBAO_TVId)
             itemAfter = itemView.findViewById(R.id.noonBAO_TVId)
             itemOnTime = itemView.findViewById(R.id.eveningBAO_TVId)
             itemDetailsArrow = itemView.findViewById(R.id.itemDetailsArrowImgId)


            itemView.setOnClickListener {
                val position:Int=adapterPosition
                Toast.makeText(itemView.context, "you clicked ${itemName[position]}", Toast.LENGTH_SHORT).show()
            }

        }



    }

}