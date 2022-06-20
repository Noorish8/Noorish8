package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.FragmentLoginBinding

class MainActivity : AppCompatActivity() {
   lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       binding = ActivityMainBinding.inflate(layoutInflater)

        showFragment(LoginFragment())
    }
    fun showFragment(firstFragment:Fragment){
        val frame =supportFragmentManager.beginTransaction()
        frame.replace(R.id.container, firstFragment)
        frame.commit()
    }

}