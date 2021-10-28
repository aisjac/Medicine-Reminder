package com.example.medicinereminder
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    private lateinit var onBoardingItemAdapter: OnBoardingItemAdapter
    private lateinit var indicatorContainer: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setOnBoardingItem()
        setUpIndicator()
        setCurrentIndicator(0)
        
    }
    private fun setOnBoardingItem(){
        onBoardingItemAdapter = OnBoardingItemAdapter(
            listOf(
                OnBoardingItem(
                    onBoardingHeader = "মেডি হেল্প",
                    onBoardingImage = R.drawable.onboardingimage_one,
                    onBoardingTitle = "ভার্চুয়াল নার্স",
                    onBoardingDescription = "আপনার স্বাস্থ্য এবং ওষুধ গুরুত্বপূর্ণ, এই অ্যাপটি আপনাকে আপনার নার্স এর মতনই খেয়াল রাখবে"
                ),OnBoardingItem(
                    onBoardingHeader = "মেডি হেল্প",
                    onBoardingImage = R.drawable.onboardingimage_two,
                    onBoardingTitle = "সময় শর্তর্কীকরণ",
                    onBoardingDescription = "এই অ্যাপটি আপনাকে মনে করিয়ে দেবে কখন কোন ধরনের ঔষধ আপনার প্রয়োজন"
                ),OnBoardingItem(
                    onBoardingHeader = "মেডি হেল্প",
                    onBoardingImage = R.drawable.onboardingimage_three,
                    onBoardingTitle = "আপনার পরিবারের যত্ন নিন",
                    onBoardingDescription = "এর সাহায্যে আপনি কেবল নিজেরই যত্ন নিতে পারবেন না, আপনার পরিবারের অন্যান্য সদস্যদেরও যত্ন নিতে পারবেন"
                ),
            ))
        val onBoardingViewPager = findViewById<ViewPager2>(R.id.viewPager2)
        onBoardingViewPager.adapter = onBoardingItemAdapter
        onBoardingViewPager.registerOnPageChangeCallback(object :ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                setCurrentIndicator(position)
            }
        })
        (onBoardingViewPager.getChildAt(0) as RecyclerView).overScrollMode = RecyclerView.OVER_SCROLL_NEVER
        findViewById<ImageView>(R.id.imageViewNext).setOnClickListener {
            if (onBoardingViewPager.currentItem + 1 < onBoardingItemAdapter.itemCount){
                onBoardingViewPager.currentItem += 1
            }else{
                navigateLoginActivity()
            }
        }
        findViewById<MaterialButton>(R.id.skipButtonId).setOnClickListener {
            navigateLoginActivity()
        }
    }

    private fun navigateLoginActivity(){
        startActivity(Intent(applicationContext,LoginActivity::class.java))
        finish()
    }

    private fun setUpIndicator(){
        indicatorContainer = findViewById(R.id.indicatorContainerId)
        val indicators = arrayOfNulls<ImageView>(onBoardingItemAdapter.itemCount)
        val layoutParams: LinearLayout.LayoutParams = LinearLayout.LayoutParams(WRAP_CONTENT,
            WRAP_CONTENT)
        layoutParams.setMargins(8,0,0,0)
        for (i in indicators.indices){
            indicators[i] = ImageView(applicationContext)
            indicators[i]?.let {
                it.setImageDrawable(
                    ContextCompat.getDrawable(applicationContext,R.drawable.inactive_indicator_shape)
                )
                it.layoutParams = layoutParams
                indicatorContainer.addView(it)
            }
        }
    }

    private fun setCurrentIndicator(position: Int){
        val childCount = indicatorContainer.childCount
        for (i in 0 until childCount){
            val imageView = indicatorContainer.getChildAt(i) as ImageView
            if (i == position){
                imageView.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.active_indicator_shape))
            }else{
                imageView.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.inactive_indicator_shape))

            }
        }

    }
}