package com.example.myapplication.activities

import android.app.ProgressDialog
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import com.example.myapplication.BaseActivity
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : BaseActivity(), View.OnClickListener {
    var TAG: String = ""

    /**
     * Called when a view has been clicked.

     * @param v The view that was clicked.
     */
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button -> {
//                val intent = Intent(this, SecondActivity::class.java)
//                startActivity(intent)
                var progress = progressBar2.progress;
                progress += 10;
                progressBar2.progress = progress

                val dialog = ProgressDialog(this);
                dialog.setTitle("This is a dialog");

                dialog.setMessage("Something important")
                dialog.setCancelable(true)
                //dialog.button("OK", { dialogInterface, d -> toast(d.toString()) })
                //dialog.setNegativeButton("cancel", { dialogInterface, i -> toast(dialogInterface.toString()) })
                dialog.show()


            }

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        TAG = this.localClassName
        Log.d(this.localClassName, "onCreate:${this}")
        setContentView(R.layout.activity_first)
        Log.d(this.localClassName, "Task ID is $taskId")
        button.setOnClickListener(this)
        textView_ActivityProcess.text = this.toString()
        editText_FontSizeOnChange()


    }

    private fun editText_FontSizeOnChange() {
        editText_FontSize.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                //throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {


            }

            override fun afterTextChanged(s: Editable?) {
                // throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
                val fontSizeStr: String = s.toString()
                if (!fontSizeStr.isNullOrEmpty()) {
                    try {
                        val fontSize = java.lang.Float.parseFloat(fontSizeStr)
                        textView_HelloWorld.textSize = fontSize

                    } catch (e: Exception) {
                        Log.e(TAG, "Convert Text To Float Failure.Current textView Value : $fontSizeStr")
                    }
                }

            }
        })
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(this.localClassName, "OnRestart")
    }


}
