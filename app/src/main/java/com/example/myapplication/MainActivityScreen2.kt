package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivityScreen2 : AppCompatActivity() {
    lateinit var txtname:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen2)
        txtname=findViewById(R.id.txt_name_out)

//        val ii=intent
//        val b =ii.extras
      
        var bundle :Bundle ?=intent.extras
        var message = bundle!!.getString(ConstantIntent.Name) // 1
        var strUser = intent.getStringExtra("value") // 2

        txtname.setText(message)


    }
}