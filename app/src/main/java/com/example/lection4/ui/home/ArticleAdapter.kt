package com.example.lection4.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lection4.R
import com.example.lection4.models.ArticleLab

class ArticleAdapter : RecyclerView.Adapter<ArticleAdapter.ArticleHolder>(){

    val articleList = ArticleLab().articleList

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.article_item, parent, false)
        return ArticleHolder(view)
    }

    override fun getItemCount(): Int = articleList.size


    override fun onBindViewHolder(holder: ArticleHolder, position: Int) {

        holder.bind(position)
    }

    inner class ArticleHolder(view: View) : RecyclerView.ViewHolder(view){

        fun bind(position: Int){
            val idTextView = itemView.findViewById<TextView>(R.id.id_text_view)
            idTextView.text = "${articleList[position].id}"
            val titleTextView = itemView.findViewById<TextView>(R.id.title_text_view)
            titleTextView.text = articleList[position].title
        }
    }
}