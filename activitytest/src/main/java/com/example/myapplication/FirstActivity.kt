package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(this.localClassName, "onCreate:${this}")
        setContentView(R.layout.activity_first)
        button.setOnClickListener({
            val intent = Intent(this, FirstActivity::class.java)
            startActivity(intent)
        })
        textView_ActivityProcess.text=this.toString();


    }
}
