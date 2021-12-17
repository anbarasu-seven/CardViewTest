package com.example.recyclerviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        val myRecyclerView = findViewById<RecyclerView>(R.id.myRecyclerView)
        myRecyclerView.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))

        var adapter = MyContactListAdapter()
        adapter.setClickListener{ name->
                Toast.makeText(this, "$name Clicked", Toast.LENGTH_SHORT).show()
        }
        myRecyclerView.adapter = adapter

    }

}