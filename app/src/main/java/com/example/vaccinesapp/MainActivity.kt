package com.example.vaccinesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
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

            //AdapterView: RecyclerView
            recyclerView.layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)

            //List of VaccineModal Objects
            var vaccinesList : ArrayList<VaccineModel> = ArrayList()

            val v1 = VaccineModel("Covid-19", R.drawable.vaccine1)
            val v2 = VaccineModel("Hepatitis B", R.drawable.vaccine4)
            val v3 = VaccineModel("Tetanus", R.drawable.vaccine5)
            val v4 = VaccineModel("Pneumococcal", R.drawable.vaccine6)
            val v5 = VaccineModel("Rotavirus", R.drawable.vaccine7)
            val v6 = VaccineModel("Measles", R.drawable.vaccine8)
            val v7 = VaccineModel("Chickenpox", R.drawable.vaccine9)

            vaccinesList.add(v1)
            vaccinesList.add(v2)
            vaccinesList.add(v3)
            vaccinesList.add(v4)
            vaccinesList.add(v5)
            vaccinesList.add(v6)
            vaccinesList.add(v7)

            //Adapter
            val adapter = MyAdapter(vaccinesList)
            recyclerView.adapter = adapter

        }
    }
}