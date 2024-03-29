package com.example.calculator1

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val bu1: Button = findViewById(R.id.bu1)
        bu1.setBackgroundColor(Color.parseColor("#FBA834"))
        val bu2: Button = findViewById(R.id.bu2)
        bu2.setBackgroundColor(Color.parseColor("#FBA834"))
        val bu3: Button = findViewById(R.id.bu3)
        bu3.setBackgroundColor(Color.parseColor("#FBA834"))
        val bu4: Button = findViewById(R.id.bu4)
        bu4.setBackgroundColor(Color.parseColor("#FBA834"))
        val bu5: Button = findViewById(R.id.bu5)
        bu5.setBackgroundColor(Color.parseColor("#387ADF"))
        val bu6: Button = findViewById(R.id.bu6)
        bu6.setBackgroundColor(Color.parseColor("#387ADF"))
        val bu7: Button = findViewById(R.id.bu7)
        bu7.setBackgroundColor(Color.parseColor("#387ADF"))
        val bu9: Button = findViewById(R.id.bu9)
        bu9.setBackgroundColor(Color.parseColor("#387ADF"))
        val bu8: Button = findViewById(R.id.bu8)
        bu8.setBackgroundColor(Color.parseColor("#FBA834"))
        val bu12: Button = findViewById(R.id.bu12)
        val bu10: Button = findViewById(R.id.bu10)
        bu10.setBackgroundColor(Color.parseColor("#387ADF"))
        val bu11: Button = findViewById(R.id.bu11)
        bu11.setBackgroundColor(Color.parseColor("#387ADF"))
        bu12.setBackgroundColor(Color.parseColor("#FBA834"))
        val bu16: Button = findViewById(R.id.bu16)
        val bu13: Button = findViewById(R.id.bu13)
        bu13.setBackgroundColor(Color.parseColor("#387ADF"))
        bu16.setBackgroundColor(Color.parseColor("#FBA834"))
        val bu14: Button = findViewById(R.id.bu14)
        bu14.setBackgroundColor(Color.parseColor("#387ADF"))
        val bu15: Button = findViewById(R.id.bu15)
        bu15.setBackgroundColor(Color.parseColor("#387ADF"))
        val bu17: Button = findViewById(R.id.bu17)
        bu17.setBackgroundColor(Color.parseColor("#D04848"))
        val bu18: Button = findViewById(R.id.bu18)
        bu18.setBackgroundColor(Color.parseColor("#D04848"))
        val bu19: Button = findViewById(R.id.bu19)
        bu19.setBackgroundColor(Color.parseColor("#D71313"))


    }
}