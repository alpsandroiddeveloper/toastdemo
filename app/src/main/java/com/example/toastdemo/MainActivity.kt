package com.example.toastdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    fun showToast1(msg : String){
        Toast.makeText(applicationContext,msg,Toast.LENGTH_SHORT).show()
    }

    fun showToast2(msg : String){
        Toast.makeText(applicationContext,msg,Toast.LENGTH_SHORT).show()
    }
}