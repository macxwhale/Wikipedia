package com.example.wikipedia.activities.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.wikipedia.R
import com.example.wikipedia.activities.holders.CardHolder
import com.example.wikipedia.activities.holders.ListItemHolder

class ArticleListItemRecyclerAdapter : RecyclerView.Adapter<ListItemHolder>() {


    override fun getItemCount(): Int {
        return 15

    }

    override fun onBindViewHolder(p0: ListItemHolder, p1: Int) {
       //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ListItemHolder {
        var cardItem = LayoutInflater.from(p0.context).inflate(R.layout.article_list_item, p0, false)
        return ListItemHolder(cardItem)
    }

}
