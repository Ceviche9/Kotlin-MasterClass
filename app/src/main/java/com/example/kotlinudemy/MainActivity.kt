package com.example.kotlinudemy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Para pegar o botão
        val btn = findViewById(R.id.button) as Button
        // Para pegar o texto
        var myTextView = findViewById(R.id.textView) as TextView
        // Criando uma variável
        var count = 0
        // on-click listener
        btn.setOnClickListener {
            count = count + 1
            myTextView.text = count.toString()
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
        }

    }

}