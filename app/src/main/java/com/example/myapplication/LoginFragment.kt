package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {
    lateinit var binding:FragmentLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_login, container, false)
        binding=FragmentLoginBinding.inflate(inflater)
        binding.btnLogin.setOnClickListener {

           val inputName = binding.etEmail.text.toString()
            val bundle =Bundle()
            bundle.putString(ConstantIntent.Name,inputName)

             val fragment=SignUpFragment()
            fragment.arguments=bundle
           fragmentManager?.beginTransaction()?.replace(R.id.container,fragment)?.commit()



//          val  intent = Intent(context, DashBoardActivity::class.java)
//            startActivity(intent)
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.btnSignUp.setOnClickListener {
            val  intent = Intent(context, DashBoardActivity::class.java)
          startActivity(intent)
           // (activity as MainActivity).showFragment(SignUpFragment())
        }
        binding.txtPasswordForgot.setOnClickListener {
            (activity as MainActivity).showFragment(ForgotPassWordFragment())
        }


    }


}


//binding.btnLogin.setOnClickListener {
//    val ii = Intent(context, SignUp::class.java)
//    ii.putExtra(Constant.Name, "")
//    ii.putExtra(Constant.PassWord, "")
//    startActivity(ii)
//
//}