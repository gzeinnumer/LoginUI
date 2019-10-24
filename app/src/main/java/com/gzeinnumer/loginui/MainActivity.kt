package com.gzeinnumer.loginui

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btRegister!!.setOnClickListener(this)
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    override fun onClick(v: View) {
        if (v === btRegister) {
            val a = Intent(this@MainActivity, RegisterActivity::class.java)
            startActivity(a)
        }
    }
}
