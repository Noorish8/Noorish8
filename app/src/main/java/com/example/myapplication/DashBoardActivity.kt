package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityDashBoardBinding

class DashBoardActivity : AppCompatActivity() {
    lateinit var binding:ActivityDashBoardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)
        binding=ActivityDashBoardBinding.inflate(layoutInflater)

        val item = arrayListOf<DashBoardImageModal>()
        item.add(DashBoardImageModal(R.drawable.img_peacock))


        binding.recy.adapter=DashBoardAdapter(item)


    }
}