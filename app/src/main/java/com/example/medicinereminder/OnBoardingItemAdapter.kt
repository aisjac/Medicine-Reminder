package com.example.medicinereminder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class OnBoardingItemAdapter(private val onBoardingItem: List<OnBoardingItem>) :
    RecyclerView.Adapter<OnBoardingItemAdapter.OnBoardingItemViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnBoardingItemViewHolder {
        return OnBoardingItemViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.onboarding_item_container,parent,false
            )
        )
    }

    override fun onBindViewHolder(holder: OnBoardingItemViewHolder, position: Int) {
        holder.bind(onBoardingItem[position])
    }

    override fun getItemCount(): Int {
        return  onBoardingItem.size
    }



    inner class OnBoardingItemViewHolder(view:View) : RecyclerView.ViewHolder(view){
        private val header = view.findViewById<TextView>(R.id.onBoardingHeaderTVId)
        private val image = view.findViewById<ImageView>(R.id.onBoardingImageViewId)
        private val title = view.findViewById<TextView>(R.id.onBoardingTitleTVId)
        private val description = view.findViewById<TextView>(R.id.onBoardingDescriptionTVId)


        fun bind(onBoardingItem: OnBoardingItem){
            header.text = onBoardingItem.onBoardingHeader
            image.setImageResource(onBoardingItem.onBoardingImage)
            title.text = onBoardingItem.onBoardingTitle
            description.text = onBoardingItem.onBoardingDescription
        }
    }


}