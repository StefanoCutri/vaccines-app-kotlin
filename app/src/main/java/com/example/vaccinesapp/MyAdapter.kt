package com.example.vaccinesapp

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val vaccinesList: ArrayList<VaccineModel> ) : RecyclerView.Adapter<>(){

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        lateinit var vaccineImage: ImageView
        lateinit var vaccineTitle: TextView

        init {
            vaccineTitle = itemView.findViewById(R.id.text1)
            vaccineImage = itemView.findViewById(R.id.imageView)
        }
    }





}