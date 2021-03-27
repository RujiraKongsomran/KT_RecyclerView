package com.rujirakongsomran.kt_recyclerview

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.example_item.view.*

class ExampleAdapter(private val exampleList: List<ExampleItem>) :
    RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.example_item,
            parent, false
        )
        return ExampleViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        val currentItem = exampleList[position]
        holder.iv.setImageResource(currentItem.imageResource)
        holder.tv_1.text = currentItem.text1
        holder.tv_2.text = currentItem.text2

//        if(position == 0){
//            holder.tv_1.setBackgroundColor(Color.YELLOW)
//        }

//        holder.itemView.tv_1.text = currentItem.text1
    }

    override fun getItemCount() = exampleList.size

    class ExampleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val iv: ImageView = itemView.iv
        val tv_1: TextView = itemView.tv_1
        val tv_2: TextView = itemView.tv_2
    }
}