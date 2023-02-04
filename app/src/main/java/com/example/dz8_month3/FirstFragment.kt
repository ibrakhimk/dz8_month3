package com.example.dz8_month3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.dz8_month3.databinding.FragmentFirstBinding
import java.text.FieldPosition


class FirstFragment : Fragment() {

    private lateinit var rickAndMortyList:  ArrayList<RickAndMorty>
    private lateinit var binding: FragmentFirstBinding;

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = RickAndMortyAdapter(rickAndMortyList,this::onClick)
        binding.recyclerView.adapter = adapter
    }

    private fun loadData() {
        rickAndMortyList = ArrayList<RickAndMorty>()
        rickAndMortyList.clear()
        rickAndMortyList.apply {
            add(RickAndMorty(R.drawable.rick,"Rick Sanchez","Alive"))
            add(RickAndMorty(R.drawable.morty,"Morty Smith","Alive"))
            add(RickAndMorty(R.drawable.da,"Jerry Smith","Alive"))
            add(RickAndMorty(R.drawable.albert,"Alber Einstein","Alive"))
        }
    }
    private fun onClick(rickAndMorty: RickAndMorty){
        findNavController().navigate(
            FirstFragmentDirections.actionFirstFragmentToSecondFragment(rickAndMortyList))
    }
}
//        val bundle = Bundle()
//        bundle.putSerializable("key", rickAndMorty)
//        findNavController().navigate(R.id.secondFragment, bundle)
//        findNavController().navigate(R.id.secondFragment, bundleOf(
//            KEY_FOR_IMG to rickAndMortyList[position].rank, KEY_FOR_USERNAME to rickAndMortyList[position].name
//        ))