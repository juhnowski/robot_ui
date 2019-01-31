package com.juhnowski.robot

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class UserLoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_login)
        val password = findViewById<TextView>(R.id.textViewPassword)
        password.text = ""
    }

    fun userloggedIn(v: View?){
        startActivity(Intent(this@UserLoginActivity, AcceptActivity::class.java))
    }

    fun click1(v:View?){
        //◯
        val password = findViewById<TextView>(R.id.textViewPassword)
        val text:StringBuilder = StringBuilder()
        text.append(password.text).append("◯");
        password.text = text.toString()
    }

    fun clickBS(v:View){
        val password = findViewById<TextView>(R.id.textViewPassword)
        if (password.length()>0){
            password.text = password.text.subSequence(0,password.text.length-2)
        }
    }
}
