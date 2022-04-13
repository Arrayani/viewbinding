package com.example.viewbinding

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewbinding.databinding.RecyclerRowBinding

internal class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    private var stringList: List<String> = ArrayList()

    fun updateList(stringList: List<String>) {
        this.stringList = stringList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val recyclerRowBinding: RecyclerRowBinding =
            RecyclerRowBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(recyclerRowBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(stringList[position])
    }

    override fun getItemCount(): Int {
        Log.d(TAG, "getItemCount: " + stringList.size)
        return stringList.size
    }

    internal inner class ViewHolder(recyclerRowBinding: RecyclerRowBinding) :
        RecyclerView.ViewHolder(recyclerRowBinding.getRoot()) {
        var recyclerRowBinding: RecyclerRowBinding
        fun bindView(title: String?) {
            recyclerRowBinding.textView.setText(title)
        }

        init {
            this.recyclerRowBinding = recyclerRowBinding
            recyclerRowBinding.textView.setOnClickListener(View.OnClickListener {
                Log.d(
                    TAG,
                    "onClick: $adapterPosition"
                )
            })
        }
    }

    companion object {
        private const val TAG = "RecyclerAdapter"
    }
}