package com.example.toastingapp_sam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //instantiate - giving it a name as variable
    private lateinit var display_text:TextView
    private lateinit var edt_input_data:EditText
    private lateinit var submitbutton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        display_text=findViewById(R.id.txtdisplay)
        edt_input_data=findViewById(R.id.edtdata)
        submitbutton=findViewById(R.id.btnsubmit)

        submitbutton.setOnClickListener {
            Toast.makeText(this, "Samantha", Toast.LENGTH_SHORT).show()
        }

    }
}