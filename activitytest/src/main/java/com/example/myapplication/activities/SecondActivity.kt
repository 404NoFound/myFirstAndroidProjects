package com.example.myapplication.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.BaseActivity
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d(this.localClassName, this.toString() );
        Log.d(this.localClassName, "Task ID is ${taskId}");
        btn_Second.setOnClickListener({
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        })
    }
}
