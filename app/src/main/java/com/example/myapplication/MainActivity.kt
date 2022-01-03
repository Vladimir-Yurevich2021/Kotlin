package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
val button=findViewById<Button>(R.id.btn_click_me)
        button.setOnClickListener(View.OnClickListener { button.setText(getString(R.string.txt_great)) })
    }
}