package com.example.iteradmin.kotlin_datastroage

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txt=findViewById<EditText>(R.id.edit)
        val bt1=findViewById<Button>(R.id.button)
        val sp:SharedPreferences=getSharedPreferences("data",Context.MODE_PRIVATE)
        val editor:SharedPreferences.Editor=sp.edit()

        bt1.setOnClickListener{

            editor.putString("name",txt.text.toString())
            editor.apply()
            val i=Intent(applicationContext,Main2Activity::class.java)
            startActivity(i)
        }
    }
}
