package com.example.kotlinintroduction3month

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kotlinintroduction3month.databinding.FragmentMusicBinding

class MusicFragment : Fragment() {
    private lateinit var binding: FragmentMusicBinding
    private var list = arrayListOf<Music>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMusicBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = MusicAdapter(list, this::OnClick)
        binding.recyclerView.adapter = adapter
    }

    private fun OnClick(position: Int){
        val intent = Intent(activity, SecondActivity()::class.java)
        startActivity(intent)
    }

    private fun loadData() {
        list.add(Music("Blank Space", "Taylor Swift", "3:22"))
        list.add(Music("Watch Me", "Silento", "5:36"))
        list.add(Music("Earned It", "The Weekend", "4:51"))
        list.add(Music("The Hills", "The Weekend", "3:41"))
        list.add(Music("Writing’s On The Wall", "", "5:33"))
        list.add(Music("Blank Space", "Taylor Swift", "3:22"))
        list.add(Music("Blank Space", "Taylor Swift", "3:22"))
        list.add(Music("Blank Space", "Taylor Swift", "3:22"))
    }
}