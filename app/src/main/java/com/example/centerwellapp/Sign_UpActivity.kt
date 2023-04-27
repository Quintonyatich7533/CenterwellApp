package com.example.centerwellapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Sign_UpActivity : AppCompatActivity() {
    lateinit var edtName: EditText
    lateinit var edtEmail: EditText
    lateinit var edtPassword: EditText
    lateinit var btnSignUp: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        edtName = findViewById(R.id.mEdtName)
        edtEmail = findViewById(R.id.mEdtEmail)
        edtPassword = findViewById(R.id.mEdtPassword)
        btnSignUp = findViewById(R.id.mBtnSignUp)

        // Setting onClick listeners
        btnSignUp.setOnClickListener {
            var ingia = Intent(this, MainActivity::class.java)
            startActivity(ingia)
        }
    }
}