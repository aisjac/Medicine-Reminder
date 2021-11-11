package com.example.medicinereminder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

// For dataBinding

//        val headerView: View = binding.navigationView.getHeaderView(0)
//        val headerBinding: DrawerHeaderBinding = DrawerHeaderBinding.bind(headerView)


        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationViewId)
        val navigationDrawer = findViewById<NavigationView>(R.id.navigationView_drawerId)
        val navController = findNavController(R.id.fragmentContainerView)

        bottomNavigationView.setupWithNavController(navController)

        NavigationUI.setupWithNavController(navigationDrawer,navController)


        val header = navigationDrawer.getHeaderView(0)

        val profileName = header.findViewById<TextView>(R.id.drawerHeaderTVId)

        val closeDrawer = header.findViewById<ImageView>(R.id.drawerCloseImgVId)

        closeDrawer.setOnClickListener {
//            header.findViewById<DrawerLayout>(R.id.NavDrawerDrawerLayoutId).closeDrawer(GravityCompat.START)

            Toast.makeText(this, "Close Icon Clicked !", Toast.LENGTH_SHORT).show()
        }

        profileName.setOnClickListener {
            Toast.makeText(this, "Profile Name Clicked !", Toast.LENGTH_SHORT).show()
        }


    }
}