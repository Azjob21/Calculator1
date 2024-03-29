package com.example.calculator1

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var tvShowNumber: TextView
    lateinit var bu1: Button
    lateinit var bu2: Button
    lateinit var bu3: Button
    lateinit var budiv: Button
    lateinit var bu5: Button
    lateinit var bu6: Button
    lateinit var bu7: Button
    lateinit var bumul: Button
    lateinit var bu9: Button
    lateinit var bu10: Button
    lateinit var bu11: Button
    lateinit var buminus: Button
    lateinit var bu13: Button
    lateinit var bu14: Button
    lateinit var bu15: Button
    lateinit var buplus: Button
    lateinit var bu17: Button
    lateinit var bu18: Button
    lateinit var bu19: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        tvShowNumber = findViewById(R.id.tvShowNumber)
        bu1 = findViewById(R.id.bu1)
        bu2 = findViewById(R.id.bu2)
        bu3 = findViewById(R.id.bu3)
        budiv = findViewById(R.id.budiv)
        bu5 = findViewById(R.id.bu5)
        bu6 = findViewById(R.id.bu6)
        bu7 = findViewById(R.id.bu7)
        bumul = findViewById(R.id.bumul)
        bu9 = findViewById(R.id.bu9)
        bu10 = findViewById(R.id.bu10)
        bu11 = findViewById(R.id.bu11)
        buminus = findViewById(R.id.buminus)
        bu13 = findViewById(R.id.bu13)
        bu14 = findViewById(R.id.bu14)
        bu15 = findViewById(R.id.bu15)
        buplus = findViewById(R.id.buplus)
        bu17 = findViewById(R.id.bu17)
        bu18 = findViewById(R.id.bu18)
        bu19 = findViewById(R.id.bu19)
        bu1.setBackgroundColor(Color.parseColor("#FBA834"))
        bu2.setBackgroundColor(Color.parseColor("#FBA834"))
        bu3.setBackgroundColor(Color.parseColor("#FBA834"))
        budiv.setBackgroundColor(Color.parseColor("#FBA834"))
        bu5.setBackgroundColor(Color.parseColor("#387ADF"))
        bu6.setBackgroundColor(Color.parseColor("#387ADF"))
        bu7.setBackgroundColor(Color.parseColor("#387ADF"))
        bu9.setBackgroundColor(Color.parseColor("#387ADF"))
        bumul.setBackgroundColor(Color.parseColor("#FBA834"))
        bu10.setBackgroundColor(Color.parseColor("#387ADF"))
        bu11.setBackgroundColor(Color.parseColor("#387ADF"))
        buminus.setBackgroundColor(Color.parseColor("#FBA834"))
        bu13.setBackgroundColor(Color.parseColor("#387ADF"))
        buplus.setBackgroundColor(Color.parseColor("#FBA834"))
        bu14.setBackgroundColor(Color.parseColor("#387ADF"))
        bu15.setBackgroundColor(Color.parseColor("#387ADF"))
        bu17.setBackgroundColor(Color.parseColor("#D04848"))
        bu18.setBackgroundColor(Color.parseColor("#D04848"))
        bu19.setBackgroundColor(Color.parseColor("#D71313"))
        bu19.setBackgroundColor(Color.parseColor("#D71313"))
        bu1.setOnClickListener { buClear() }
        bu2.setOnClickListener { BuNumEvent(it) }
        bu3.setOnClickListener{ buOperation(it)}
        budiv.setOnClickListener{ buOperation(it)}
        bumul.setOnClickListener{ buOperation(it)}
        buminus.setOnClickListener{ buOperation(it)}
        bu5.setOnClickListener { BuNumEvent(it) }
        bu6.setOnClickListener { BuNumEvent(it) }
        bu7.setOnClickListener { BuNumEvent(it) }
        bu9.setOnClickListener { BuNumEvent(it) }
        bu10.setOnClickListener { BuNumEvent(it) }
        bu11.setOnClickListener { BuNumEvent(it) }
        bu13.setOnClickListener { BuNumEvent(it) }
        bu14.setOnClickListener { BuNumEvent(it) }
        bu15.setOnClickListener { BuNumEvent(it) }
        buplus.setOnClickListener{ buOperation(it)}
        bu17.setOnClickListener { BuNumEvent(it) }
        bu18.setOnClickListener { BuNumEvent(it) }
        bu19.setOnClickListener{ buEqualEvent()}

    }
     var isNewOp:Boolean=true
    fun BuNumEvent(view: View) {
        if (isNewOp){
            tvShowNumber.text=""
        }
        isNewOp=false
        var tvNumber: String = tvShowNumber.text.toString()
        val buselect = view as Button
        when (buselect.id) {
            bu2.id -> tvNumber = "-"+tvNumber
            bu5.id -> tvNumber += "7"
            bu6.id -> tvNumber += "8"
            bu7.id -> tvNumber += "9"
            bu9.id -> tvNumber += "4"
            bu10.id -> tvNumber += "5"
            bu11.id -> tvNumber += "6"
            bu13.id -> tvNumber += "1"
            bu14.id -> tvNumber += "2"
            bu15.id -> tvNumber += "3"
            bu17.id -> tvNumber += "0"
            bu18.id -> tvNumber += "."
        }
        tvShowNumber.text = tvNumber // Update TextView
    }
    var oldNum=""
    var op="+"
    fun buOperation(view: View){
        oldNum=tvShowNumber.text.toString()
        isNewOp=true
        val buSelect = view as Button
        when(buSelect.id){
            bu3.id->op="%"
            budiv.id->op="/"
            bumul.id->op="*"
            buminus.id->op="-"
            buplus.id->op="+"
        }
    }
    fun buEqualEvent(){
       val newNum=tvShowNumber.text.toString()
       var Result:Double?=null
        when (op){
            "/"->Result =oldNum.toDouble() / newNum.toDouble()
            "*"->Result =oldNum.toDouble() * newNum.toDouble()
            "-"->Result =oldNum.toDouble() - newNum.toDouble()
            "+"->Result =oldNum.toDouble() + newNum.toDouble()
            "%"->Result =oldNum.toDouble()/100
        }
        tvShowNumber.text=Result.toString()
        isNewOp=true
    }
    fun buClear(){
        isNewOp=true
        tvShowNumber.text="0"
    }
}
