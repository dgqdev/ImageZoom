package com.dgqdev.imagezoomdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dgqdev.imagezoomdemo.databinding.MainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: MainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}