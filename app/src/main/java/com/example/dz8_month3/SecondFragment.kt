package com.example.dz8_month3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dz8_month3.FirstFragment.Companion.KEY_FOR_IMG
import com.example.dz8_month3.FirstFragment.Companion.KEY_FOR_PASSWORD
import com.example.dz8_month3.FirstFragment.Companion.KEY_FOR_USERNAME
import com.example.dz8_month3.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    private lateinit var navArgs: SecondFragmentArgs

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments.let {
            navArgs = SecondFragmentArgs.fromBundle(it)
        }
        binding.tvNameSecond.text = navArgs.rick.name
        }
}
//arguments?.apply {
//            val userName =getString(KEY_FOR_USERNAME)
//            val password =getString(KEY_FOR_PASSWORD)
//            val img =getString(KEY_FOR_IMG)
//            binding.tvNameSecond.text = userName
//            binding.tvRangSecond.text = password