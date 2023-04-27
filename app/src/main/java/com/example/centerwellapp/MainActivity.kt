package com.example.centerwellapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var edtName: EditText
    lateinit var edtEmail: EditText
    lateinit var edtPassword: EditText
    lateinit var btnLogin: Button
    lateinit var btnSignUp: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtName = findViewById(R.id.mEdtName)
        edtEmail = findViewById(R.id.mEdtEmail)
        edtPassword = findViewById(R.id.mEdtPassword)
        btnLogin = findViewById(R.id.mBtnLogin)
        btnSignUp = findViewById(R.id.mBtnSignUp)

        // Setting onClick Listeners
        btnLogin.setOnClickListener {
            var saini = Intent(this, HomeActivity::class.java)
            startActivity(saini)
        }
        btnSignUp.setOnClickListener {
            var ingia = Intent(this, Sign_UpActivity::class.java)
            startActivity(ingia)
        }
    }
}