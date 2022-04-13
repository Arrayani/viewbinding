package com.example.viewbinding

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.viewbinding.databinding.ActivityMainBinding
import com.example.viewbinding.RecyclerAdapter

class MMainActivity : AppCompatActivity() {
    var activityMainBinding: ActivityMainBinding? = null
    internal var recyclerAdapter: RecyclerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        val rootView: View = activityMainBinding!!.getRoot()
        setContentView(rootView)

        recyclerAdapter = RecyclerAdapter()
        activityMainBinding.recyclerView.setAdapter(recyclerAdapter)
        val list: MutableList<String> = ArrayList()
        list.add("Iron man")
        list.add("Iron man 2")
        list.add("Iron man 3")
        list.add("Captain America: The First Avenger")
        list.add("Captain America: The Winter Soldier")
        list.add("Captain America: Civil War")
        recyclerAdapter!!.updateList(list)
    }
}