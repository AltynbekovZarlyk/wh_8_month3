package com.example.wh_8_month3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wh_8_month3.databinding.FragmentInfoCharacterBinding

class InfoCharacterFragment : Fragment() {

    private lateinit var binding: FragmentInfoCharacterBinding
    private lateinit var navArgs: InfoCharacterFragmentArgs

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentInfoCharacterBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            navArgs = InfoCharacterFragmentArgs.fromBundle(it)
        }
        binding.tvNameCharacter.text = navArgs.infoCharacter.name
        binding.ivInfoCharacter.setImageResource(navArgs.infoCharacter.image)
        binding.tvStatusCharacter.text = navArgs.infoCharacter.status
    }
}