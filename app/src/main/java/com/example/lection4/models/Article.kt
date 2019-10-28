package com.example.lection4.models

data class Article(val id: Int, val title: String, val description: String)

class ArticleLab(){

    val articleList: MutableList<Article>

    init {
        articleList = mutableListOf()
        for(i in 0..99){
            val article = Article(i, "Title #$i", "Description #$i")
            articleList.add(article)
        }
    }
}