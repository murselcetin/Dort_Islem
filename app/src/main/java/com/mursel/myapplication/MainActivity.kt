package com.mursel.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mursel.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var islem: islemler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        islem = islemler()
        toplamaIslemi()
    }

    fun toplamaIslemi() {
        binding.topla.setOnClickListener {
            val sayi1 = binding.input1.text
            val sayi2 = binding.input2.text
            val sonuc = islem.topla(sayi1.toString().toInt(), sayi2.toString().toInt())
            binding.sonuc.text = "Sonuç= "+sonuc.toString()
        }
    }

    fun bugunbunuyaptik(){

    }
}