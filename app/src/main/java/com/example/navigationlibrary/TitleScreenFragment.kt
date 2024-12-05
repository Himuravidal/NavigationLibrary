package com.example.navigationlibrary

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationlibrary.databinding.FragmentTitleScreenBinding


class TitleScreenFragment : Fragment() {

    private var _binding : FragmentTitleScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.startButton.setOnClickListener {
            findNavController().navigate(R.id.action_TitleScreenFragment_to_TriviaScreenFragment)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTitleScreenBinding.inflate(inflater, container, false)

        return binding.root
    }

    companion object {

        fun newInstance(param1: String, param2: String) =
            TitleScreenFragment().apply {
                arguments = Bundle()
            }
    }
}