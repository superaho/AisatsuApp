package jp.techacademy.taiki.hamaguchi.aisatsuapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.TimePickerDialog
import android.os.Build
import android.util.Log
import android.view.View
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)


    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.button1 -> showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                    Log.d("UI_PARTS", "$hour:$minute")

                    if (hour.toInt() < 2) {
                        textView.text = "こんばんは"
                    } else if (hour.toInt() < 10) {
                        textView.text = "おはよう"
                    } else if (hour.toInt() < 18) {
                        textView.text = "こんにちは"
                    } else {
                        textView.text = "こんばんは"
                    }
                },
                0, 0, true)


        timePickerDialog.show()
    }
}