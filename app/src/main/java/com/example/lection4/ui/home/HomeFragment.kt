package com.example.lection4.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lection4.R

class HomeFragment : Fragment() {

    private lateinit var articleRecyclerView : RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_home, container, false)
        articleRecyclerView = root.findViewById(R.id.article_recycler_view)
        articleRecyclerView.layoutManager = LinearLayoutManager(container!!.context) //чтобы поместить в ресайслер вещи
        articleRecyclerView.adapter = ArticleAdapter()

        return root
    }
}