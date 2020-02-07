package com.example.collaborationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"ciontoh oas",Toast.LENGTH_LONG).show()

        imgucup.setOnClickListener {
            startActivity(Intent(this, Main2Activity::class.java))
        }
    }


}
