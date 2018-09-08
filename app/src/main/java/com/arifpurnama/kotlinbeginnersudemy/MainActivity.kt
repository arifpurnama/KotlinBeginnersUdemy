package com.arifpurnama.kotlinbeginnersudemy

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            Log.i("MainActivity", "Button Telah Di Klik")
            Toast.makeText(this,"Button Telah di Klik",Toast.LENGTH_LONG).show()
        }

        btnSendMessagesToActivity.setOnClickListener {
            val message : String = etUserMessages.text.toString()
            Toast.makeText(this,message,Toast.LENGTH_LONG).show()

            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
