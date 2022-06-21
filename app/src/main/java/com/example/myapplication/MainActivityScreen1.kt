package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivityScreen1 : AppCompatActivity() {
    lateinit var txtname:EditText
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen1)

        txtname=findViewById(R.id.et_name_in)


        button=findViewById(R.id.btn)

        button.setOnClickListener {
         val inpetName = txtname.text.toString()
            val intent = Intent(this, MainActivityScreen2::class.java)
            intent.putExtra(ConstantIntent.Name, inpetName)
            startActivity(intent)

        }

    }
}