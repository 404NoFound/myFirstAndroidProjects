package com.example.myapplication.utils

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.widget.Toast
import com.example.myapplication.BaseActivity

object Utils {


}

fun Activity.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show();
}

fun BaseActivity.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show();
}

/**
 *  context :Context
 *
 */
fun BaseActivity.AlertDialog1(context: Context, title: CharSequence, message: CharSequence, cancelable: Boolean = false): AlertDialog.Builder {
    val dialog = android.app.AlertDialog.Builder(context);
    dialog.setTitle(title)
    dialog.setMessage(message);
    dialog.setCancelable(cancelable)
    return dialog;


}




