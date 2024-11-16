package com.example.newsapp.controller;
import com.example.newsapp.model.NewsArticle;
import com.example.newsapp.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/newsapp")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping("/{query}")
    public List<NewsArticle> fetchNews(@PathVariable String query) {
        return newsService.getNewsArticles(query);
    }

    @PostMapping("/save")
    public NewsArticle saveNews(@RequestBody NewsArticle article) {
        newsService.saveArticle(article);
        return article;
    }
}
