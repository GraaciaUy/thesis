package com.example.dragonfruitapp.ui.theme


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dragonfruitapp.R
import android.content.Intent
import androidx.appcompat.widget.AppCompatImageView
import com.example.dragonfruitapp.LoginActivity

class RegisterActivity : AppCompatActivity() {

    private lateinit var rtn: AppCompatImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        rtn = findViewById(R.id.backbtn)

        rtn.setOnClickListener{
            val bck = Intent(this@RegisterActivity, LoginActivity::class.java)
            startActivity(bck)
        }
    }
}