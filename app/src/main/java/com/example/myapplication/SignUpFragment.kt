package com.example.myapplication

import android.content.Intent
import android.content.Intent.getIntent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.FragmentSignUpBinding


class SignUpFragment : Fragment() {
    lateinit var binding: FragmentSignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_sign_up, container, false)
        binding=FragmentSignUpBinding.inflate(inflater)
      return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val iin= Intent();
        val extra = iin.extras

       if (extra != null) {
            val name = extra.getString (Constant.Name) // get a object
            binding.etName.setText(name)
            val passWord = extra.getString(Constant.PassWord) //get a string
            binding.etName.setText(passWord)
     }


//        val iin= Intent();
//        val b = iin.extras
//
//        val myData =iin.getStringExtra(Constant.Name)
//         binding.etName.setText(myData)
//
//        val id = intent.getStringExtra("id")
//        val name = intent.getStringExtra("name")
//        val data = getString(Constant.Name)
//        textview.setText(data)
    }


}