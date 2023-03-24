package com.example.android_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button:Button = findViewById(R.id.callbutton)
        val editText:EditText = findViewById(R.id.editText_view)

        button.setOnClickListener {
            val phoneNumber = editText.text.toString()
            Toast.makeText(this,phoneNumber,Toast.LENGTH_SHORT).show()
        }

    }
}