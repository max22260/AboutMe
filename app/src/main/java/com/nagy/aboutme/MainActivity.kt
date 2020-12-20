package com.nagy.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.done_button).setOnClickListener(this::addNickname)

    }


    private fun addNickname(view : View)
    {
        val editText = findViewById<EditText>(R.id.nickname_edit)
        val NicknameTextView = findViewById<TextView>(R.id.nickname_text)

        nickname_text.text = editText.text
        editText.visibility = View.GONE
        nickname_text.visibility = View.VISIBLE
    }
}