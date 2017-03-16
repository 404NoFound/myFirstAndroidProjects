package com.example.myapplication.activities

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.Toast
import com.example.myapplication.R
import kotlinx.android.synthetic.main.title.view.*

class TitleLayout(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {
    init {

        LayoutInflater.from(context).inflate(R.layout.title, this);
        btn_titleBack.setOnClickListener {
            (context as Activity).finish()
        }
        btn_titleEdit.setOnClickListener {
            Toast.makeText(context, "Click Edit Button", Toast.LENGTH_SHORT).show();
        }
    }
}


//btn_titleBack.setOnClickListener {
//    (context as Activity).finish()
//}
//btn_titleEdit.setOnClickListener {
//    Toast.makeText(context, "Click Edit Button", Toast.LENGTH_SHORT).show();
//}