package com.example.wikipedia.activities.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wikipedia.R
import com.example.wikipedia.activities.adapters.ArticleCardRecyclerAdapter

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class FavouritesFragment : Fragment() {

    var favouritesRecycler: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view  = inflater.inflate(R.layout.fragment_favourites, container, false)

        favouritesRecycler = view.findViewById(R.id.favourites_article_recycler)

        favouritesRecycler!!.layoutManager = LinearLayoutManager(context)
        favouritesRecycler!!.adapter = ArticleCardRecyclerAdapter()
        return view
    }


}
