package com.example.wikipedia.activities.holders

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.wikipedia.R

class ListItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val articleImageView: ImageView = itemView.findViewById<ImageView>(R.id.result_icon)
    private val titleTextView: TextView = itemView.findViewById<TextView>(R.id.result_title)
}