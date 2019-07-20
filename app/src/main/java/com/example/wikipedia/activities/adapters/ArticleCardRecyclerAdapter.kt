package com.example.wikipedia.activities.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.wikipedia.R
import com.example.wikipedia.activities.holders.CardHolder

class ArticleCardRecyclerAdapter : RecyclerView.Adapter<CardHolder>() {
    override fun getItemCount(): Int {
        return 15
    }

    override fun onBindViewHolder(holder: CardHolder, position: Int) {

    }

    override fun onCreateViewHolder(p0: ViewGroup, position: Int): CardHolder {
        var cardItem = LayoutInflater.from(p0.context).inflate(R.layout.article_card_item, p0,false)
        return CardHolder(cardItem)
    }
}