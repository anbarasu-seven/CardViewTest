package com.example.recyclerviewtest


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MyContactListAdapter : RecyclerView.Adapter<MyContactListAdapter.MyViewHolder>() {

    private lateinit var listener: (name: String) -> Unit

    val contactList = listOf(
        "Name 1",
        "Name 2",
        "Name 3",
        "Name 4",
        "Name 5",
        "Name 6",
        "Name 7",
        "Name 8",
        "Name 9",
        "Name 10",
        "Name 11",
        "Name 12",
        "Name 13",
        "Name 14",
        "Name 15",
        "Name 16",
        "Name 17",
        "Name 18",
        "Name 19",
        "Name 20",
        "Name 21",
        "Name 22",
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.contact_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.nameText.text = contactList[position]
        holder.itemView.setOnClickListener {
            listener(contactList[position])
        }
    }

    override fun getItemCount(): Int = contactList.size


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView = itemView.findViewById(R.id.image)
        var nameText: TextView = itemView.findViewById(R.id.nameText)
    }

    fun setClickListener(function: (name: String) -> Unit) {
        this.listener = function
    }
}
