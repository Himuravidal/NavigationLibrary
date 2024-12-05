package com.example.navigationlibrary

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.navigationlibrary.databinding.FragmentTriviaScreenBinding

class TriviaFragment : Fragment() {

    private var _binding: FragmentTriviaScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTriviaScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val radioGroup = view.findViewById<RadioGroup>(R.id.radioGroup)

        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            val selectedOption = when (checkedId) {
                R.id.radioOption1 -> "Option 1"
                R.id.radioOption2 -> "Option 2"
                R.id.radioOption3 -> "Option 3"
                R.id.radioOption4 -> "Option 4"
                else -> "No option selected"
            }
          Log.d("CRIS", "option $selectedOption")
        }

        binding.loseButton.setOnClickListener {
            findNavController().navigate(R.id.action_TriviaScreenFragment_to_TryAgainScreenFragment)
        }

        binding.winButton.setOnClickListener {
            findNavController().navigate(R.id.action_TriviaScreenFragment_to_winFragment)
        }


    }


    companion object {
        fun newInstance() =
            TriviaFragment()
    }
}