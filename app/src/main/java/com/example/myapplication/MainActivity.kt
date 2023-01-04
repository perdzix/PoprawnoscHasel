//Dawid Pergol IIpr POPRAWNOSC HASEL//
package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.check).setOnClickListener {
            val haslo1 = findViewById<TextInputEditText>(R.id.hasloIn)
            val haslo2 = findViewById<TextInputEditText>(R.id.haslopIn)
            if (haslo2.text.toString() == haslo1.text.toString()){
                findViewById<TextView>(R.id.haslopOut).text=("Hasła są poprawne")}
             else{
                findViewById<TextView>(R.id.haslopOut).text=("Hasła są różne")}//
        }
    }
}