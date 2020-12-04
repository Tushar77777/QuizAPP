package com.example.myquizzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bt.setOnClickListener{
            if(etinput.text.toString().isEmpty()){
                Toast.makeText(this,"Enter Your Fucking Name Asshole",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"Welcome"+" "+etinput.text,Toast.LENGTH_SHORT).show()
                val intent =Intent(this,TestActivity::class.java)
                startActivity(intent)

            }
        }


    }





}