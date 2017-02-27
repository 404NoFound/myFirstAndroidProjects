package com.example.myapplication.utils

import android.app.Activity
import android.widget.Toast
import com.example.myapplication.BaseActivity

object Utils{


}
fun Activity.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message,duration).show();
}
fun BaseActivity.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message,duration).show();
}




