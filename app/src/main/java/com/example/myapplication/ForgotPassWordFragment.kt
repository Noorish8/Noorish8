package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.databinding.FragmentForgotPassWordBinding


class ForgotPassWordFragment : Fragment() {
    lateinit var binding: FragmentForgotPassWordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_forgot_pass_word, container, false)
        binding=FragmentForgotPassWordBinding.inflate(inflater)
        return binding.root
    }


}