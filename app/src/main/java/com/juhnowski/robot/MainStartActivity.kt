package com.juhnowski.robot

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainStartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_start)
    }

    fun start(v:View?){
        startActivity(Intent(this@MainStartActivity, LoginActivity::class.java))
    }
}
