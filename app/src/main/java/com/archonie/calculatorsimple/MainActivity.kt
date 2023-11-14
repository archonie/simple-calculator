package com.archonie.calculatorsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.archonie.calculatorsimple.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var a :Double? = null
    var b :Double? = null
    var result :Double? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
    private fun sum(a: Double, b:Double): Double{
        return a+b
    }
    private fun subtract(a: Double, b:Double): Double{
        return a-b
    }
    private fun multiply(a: Double, b:Double): Double{
        return a*b
    }
    private fun divide(a: Double, b:Double) :Double{
        return a/b
    }
    fun sumClicked(view: View){
        a = binding.num1Text.text.toString().toDoubleOrNull()
        b = binding.num2Text.text.toString().toDoubleOrNull()
        if(a != null && b != null){
            result = sum(a!!,b!!)
            binding.resultText.text = "Result: ${result}"
        }
        else{
            binding.resultText.text = "You have entered a wrong values."
        }
    }
    fun minusClicked(view: View){
        a = binding.num1Text.text.toString().toDoubleOrNull()
        b = binding.num2Text.text.toString().toDoubleOrNull()
        if(a != null && b != null){
            result = subtract(a!!,b!!)
            binding.resultText.text = "Result: ${result}"
        }
        else{
            binding.resultText.text = "You have entered a wrong values."
        }
    }
    fun crossClicked(view: View){
        a = binding.num1Text.text.toString().toDoubleOrNull()
        b = binding.num2Text.text.toString().toDoubleOrNull()
        if(a != null && b != null){
            result= multiply(a!!,b!!)
            binding.resultText.text = "Result: ${result}"
        }
        else{
            binding.resultText.text = "You have entered a wrong values."
        }
    }
    fun divideClicked(view: View){
        a = binding.num1Text.text.toString().toDoubleOrNull()
        b = binding.num2Text.text.toString().toDoubleOrNull()
        if(a != null && b != null){
            if(binding.num2Text.text.toString().toDouble() != 0.0){
                val result: Double = divide(a!!,b!!)
                binding.resultText.text = "Result: ${result}"
            }
            else{
                binding.resultText.text = "Division by zero is not identified."
            }
        }
        else{
            binding.resultText.text = "You have entered a wrong values."
        }
    }

}