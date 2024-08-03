package com.Vino.mymap


import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivityTest : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.my_button)
        val textView: TextView = findViewById(R.id.my_text_view)

        button.setOnClickListener {
            textView.text = "Button clicked"
        }
    }
}
