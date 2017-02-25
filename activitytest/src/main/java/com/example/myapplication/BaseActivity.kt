package com.example.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.myapplication.ActivityCollector


public open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         Log.d(this.localClassName, javaClass.simpleName);
       ActivityCollector.addActivity(this)
        Log.d(this.localClassName, "this is BaseActivity: ");
    }

    override fun onDestroy() {
        super.onDestroy()
        ActivityCollector.RemoveActivity(this);
    }
}
