package com.example.plantsearchapplication

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.plantsearchapplication.R
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.fragment.findNavController
import com.example.plantsearchapplication.databinding.FragmentHomeBinding;

class HomeFragment : Fragment() {


    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.species.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment2_to_speciesFragment)
        }
//        binding.species.setOnClickListener {
//            findNavController().navigate(R.id.action_speciesFragment_to_speciesFragment2)
//        }

        binding.articles.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment2_to_articlesFragment)
        }


    }


}
