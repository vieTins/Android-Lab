package com.example.ex2

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    var num1: EditText? = null
    var num2: EditText? = null
    var tvResult: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//      lấy id của các view
        num1 = findViewById(R.id.num1)
        num2 = findViewById(R.id.num2)
        tvResult = findViewById(R.id.tvResult)
    }

    fun onAddClick(view: View?) {
        val result = number1 + number2
        tvResult!!.text = "Result: $result"
    }

    fun onSubClick(view: View?) {
        val result = number1 - number2
        tvResult!!.text = "Result: $result"
    }

    fun onMulClick(view: View?) {
        val result = number1 * number2
        tvResult!!.text = "Result: $result"
    }

    fun onDivClick(view: View?) {
        val result = number1 / number2
        tvResult!!.text = "Result: $result"
    }

    private val number1: Double
        get() = num1!!.text.toString().toDouble()

    private val number2: Double
        get() = num2!!.text.toString().toDouble()
}
