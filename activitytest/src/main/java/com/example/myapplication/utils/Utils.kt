package com.example.myapplication.utils

import android.app.Activity
import android.util.Log
import android.widget.Toast
import com.example.myapplication.utils.Utils.toast

object Utils{


    fun Activity.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message,duration).show();
    }
}




