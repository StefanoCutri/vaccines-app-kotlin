package com.example.vaccinesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vaccinesapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initialize()
    }

    private fun initialize(){
        with(binding){
            var vaccinesList : ArrayList<VaccineModel> = ArrayList()
        }
    }
}