package com.example.dragonfruitapp

import android.content.Intent//imported to be able to use intent, which is to move from one activity to another
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import com.example.dragonfruitapp.ui.theme.HomePage
import com.example.dragonfruitapp.ui.theme.RegisterActivity


class LoginActivity : AppCompatActivity() {
    private lateinit var userName: EditText
    private lateinit var pass: EditText
    private lateinit var loginbtn: Button
    private lateinit var regbtn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        regbtn = findViewById(R.id.btnregister)
        userName = findViewById(R.id.txtUserName)
        pass = findViewById(R.id.txtPass)
        loginbtn = findViewById(R.id.btnLogin)

        regbtn.setOnClickListener{
            val toReg = Intent(this@LoginActivity, RegisterActivity::class.java)
            startActivity(toReg)
        }

        loginbtn.setOnClickListener {
            val username = userName.text.toString()
            val password = pass.text.toString()


            if (username == "admin" && password == "pokemon") {
                // Successful login
                val toHome = Intent(this@LoginActivity, HomePage::class.java)
                startActivity(toHome)
            } else {
                // Invalid credentials
                Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}