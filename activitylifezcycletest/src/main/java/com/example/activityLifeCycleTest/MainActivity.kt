package com.example.activityLifeCycleTest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_StartNormalActivity.setOnClickListener {
            val intent = Intent(this, NormalActivity::class.java)
            startActivity(intent)
        }
        btn_StartDialogActivity.setOnClickListener {
            val intent = Intent(this, DialogActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(this.localClassName, "onStart");
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(this.localClassName, "onRestart");
    }

    override fun onResume() {
        super.onResume()
        Log.d(this.localClassName, "onResume");
    }

    override fun onStop() {
        super.onStop()
        Log.d(this.localClassName, "onStop");
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(localClassName,"onDestroy")
    }

    override fun onPause() {
        super.onPause()
        Log.d(localClassName, "OnPause");
    }
}

