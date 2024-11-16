package com.example.newsapp.service;
import com.example.newsapp.model.NewsArticle;
import com.example.newsapp.repository.NewsArticleRepository;
import com.example.newsapp.response.NewsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@Service
public class NewsService {

    private static final String API_URL = "https://newsapi.org/v2/everything?q=";

    @Autowired
    private NewsArticleRepository newsRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Value("${newsapi.api.key}")
    private String apiKey;

    public List<NewsArticle> getNewsArticles(String query) {
        String url = API_URL + query + "&apiKey=" + apiKey;
        NewsResponse response = restTemplate.getForObject(url, NewsResponse.class);
        return response != null ? response.getArticles() : List.of();
    }

    public void saveArticle(NewsArticle article) {
        newsRepository.save(article);
    }
}
