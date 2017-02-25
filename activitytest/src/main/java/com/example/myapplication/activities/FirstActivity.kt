package com.example.myapplication.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.myapplication.BaseActivity
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : BaseActivity() ,View.OnClickListener {
    /**
     * Called when a view has been clicked.

     * @param v The view that was clicked.
     */
    override fun onClick(v: View?) {
        when(v?.id){
            R.id.button -> {
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            }

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(this.localClassName, "onCreate:${this}")
        setContentView(R.layout.activity_first)
        Log.d(this.localClassName, "Task ID is $taskId");
        button.setOnClickListener({
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        })
        textView_ActivityProcess.text = this.toString();
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(this.localClassName, "OnRestart");
    }





    override fun onContentChanged() {
        super.onContentChanged()
    }
}
