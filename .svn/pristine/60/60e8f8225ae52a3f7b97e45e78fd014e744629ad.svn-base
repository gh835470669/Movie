package com.luwei.hackvr.service;

import java.util.List;
import java.util.Map;

import com.luwei.hackvr.pojo.Article;

public interface ArticleService {
    public List<Article> getLateArticles(int index, int num); 
    public List<Article> getLateArticles(int index, int num, Byte typeString);
    public List<Article> getArticlesByTime(long start, long end);
    public List<List<Article>> getDayArticlesByNum(int index, int num);
    public List<Article> getTypeArticles(Byte typeString);
    public List<Article> getArticles();
    public Article getArticleById(int id);
    public List<Article> getRemenToutiaoArticles(int index, int num);
    public List<Map<String, Object>> getShouyeToutiaoArticles(int num);
    public Map<String, Object> getShixunToutiaoArticle();
    public Map<String, Object> getGuanchaToutiaoArticle();
    public Map<String, Object> getYingshiToutiaoArticle();
    public Map<String, Object> getYouxiToutiaoArticle();
    public List<Map<String, Object>> getZixunToutiaoArticles(int num);
    public int addClickNum(int id);
    public int offLineArticleById(int id);
}
