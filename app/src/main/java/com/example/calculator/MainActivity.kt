package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //Btn functions
    fun btnPlus(view:View){
        val inputOne:EditText = findViewById(R.id.inputOne)
        val inputTwo:EditText = findViewById(R.id.inputTwo)
        val result:TextView = findViewById(R.id.result)

        if (inputOne.text.toString() == "" || inputTwo.text.toString() == ""){
            inputOne.hint = "Enter a number"
            inputTwo.hint = "Enter a number"
        }else {
            inputOne.hint = "Input 1"
            inputTwo.hint = "Input 2"
            result.text = "${sum(inputOne.text.toString().toDouble(), inputTwo.text.toString().toDouble())}"
        }
    }

    fun btnRest(view: View){
        val inputOne:EditText = findViewById(R.id.inputOne)
        val inputTwo:EditText = findViewById(R.id.inputTwo)
        val result:TextView = findViewById(R.id.result)

        if (inputOne.text.toString() == "" || inputTwo.text.toString() == ""){
            inputOne.hint = "Enter a number"
            inputTwo.hint = "Enter a number"
        }else {
            inputOne.hint = "Input 1"
            inputTwo.hint = "Input 2"
            result.text = "${rest(inputOne.text.toString().toDouble(), inputTwo.text.toString().toDouble())}"
        }
    }

    @SuppressLint("SetTextI18n")
    fun btnDivide(view: View){
        val inputOne:EditText = findViewById(R.id.inputOne)
        val inputTwo:EditText = findViewById(R.id.inputTwo)
        val result:TextView = findViewById(R.id.result)

        if (inputOne.text.toString() == "" || inputTwo.text.toString() == ""){
            inputOne.hint = "Enter a number"
            inputTwo.hint = "Enter a number"
        }
        else if(inputTwo.text.toString().toInt() == 0){
            result.text = "Infinite"
        }
        else {
            inputOne.hint = "Input 1"
            inputTwo.hint = "Input 2"
            result.text = "${divide(inputOne.text.toString().toDouble(), inputTwo.text.toString().toDouble())}"
        }

    }

    fun btnMultiply(view: View){
        val inputOne:EditText = findViewById(R.id.inputOne)
        val inputTwo:EditText = findViewById(R.id.inputTwo)
        val result:TextView = findViewById(R.id.result)

        if (inputOne.text.toString() == "" || inputTwo.text.toString() == ""){
            inputOne.hint = "Enter a number"
            inputTwo.hint = "Enter a number"
        }else {
            inputOne.hint = "Input 1"
            inputTwo.hint = "Input 2"
            result.text = "${multiply(inputOne.text.toString().toDouble(), inputTwo.text.toString().toDouble())}"
        }
    }

    //Functions of operations
    private fun sum(input1:Double = 0.0, input2:Double = 0.0):Double{
        return input1 + input2
    }
    private fun rest(input1:Double, input2:Double):Double{
        return input1 - input2
    }
    private fun divide(input1:Double, input2:Double):Double{
        return input1 / input2
    }
    private fun multiply(input1:Double, input2:Double):Double{
        return input1 * input2
    }
}