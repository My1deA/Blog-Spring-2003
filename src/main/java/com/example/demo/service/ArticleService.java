package com.example.demo.service;

import com.example.demo.domain.Article;

public interface ArticleService {
    //增
    void addArticle(Article article);

    //删
    void delArticle(Integer id);

    //查
    Article findArticlebyId(Integer id);

    //改
    void saveArticle(Article article);
}
