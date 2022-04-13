package com.example.viewbinding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewbinding.databinding.RowLayoutBinding

class MyAdapter: RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(val binding:RowLayoutBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(RowLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.button
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}