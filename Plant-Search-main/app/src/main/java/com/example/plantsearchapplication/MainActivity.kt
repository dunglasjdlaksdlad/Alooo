package com.example.plantsearchapplication

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.plantsearchapplication.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navController = findNavController(R.id.mainContainer)
        bottomNavigationView.setupWithNavController(navController)

        val navHostFragment=supportFragmentManager.findFragmentById(R.id.mainContainer) as NavHostFragment
        navHostFragment.findNavController().run {
            binding.toolbar2.setupWithNavController(this,AppBarConfiguration(graph))
        }
    }

//        val appBarConfiguration = AppBarConfiguration(setOf(R.id.homeFragment2,R.id.profileFragment))
//        setupActionBarWithNavController(navController, appBarConfiguration)

//        val navHostFragment=supportFragmentManager.findFragmentById(R.id.mainContainer) as NavHostFragment
//        navHostFragment.findNavController().run {
//            toolbar.setupActionBarWithNavController
//        }




//        val navHostFragment= supportFragmentManager.findFragmentById(R.id.mainContainer) as NavHostFragment
//        navController=navHostFragment.navController
//        val bottomNavigationView= findViewById<BottomNavigationView>(R.id.bottomNavigationView)
//        setupWithNavController(bottomNavigationView,navController)
//        navHostFragment.findNavController().run {
//
//        }
//    }
//        replaceFragment(HomeFragment())
//        binding.bottomNavigationView.background = null
//
//        binding.bottomNavigationView.setOnItemSelectedListener { item ->
//            when (item.itemId) {
//                R.id.homeFragment -> replaceFragment(HomeFragment())
//                R.id.profileFragment -> replaceFragment(ProfileFragment())
//            }
//            true
//        }
//    }
//
//    private fun replaceFragment(fragment: Fragment) {
//        val fragmentManager: FragmentManager = supportFragmentManager
//        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
//        fragmentTransaction.replace(R.id.frame_layout, fragment)
//        fragmentTransaction.commit()
//    }
}