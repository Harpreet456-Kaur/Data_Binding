package com.example.data_binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.data_binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var value = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.intValue = 0
        binding.activity = this
    }

    fun onPlusClick(){
        value++
        binding.intValue = value
    }
    fun onMinusClick() {
        value--
        binding.intValue = value

    }
    fun onResetClick() {
        value = 0
        binding.intValue=0
    }
}