package com.ApnaNews.demo.service;


import com.ApnaNews.demo.dto.Articles;
import com.ApnaNews.demo.dto.NewsResponse;
import com.ApnaNews.demo.entity.NewEntity;
import com.ApnaNews.demo.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.List;

@Service
public class NewService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private NewsRepository newsRepository;

    public NewsResponse getNews(String country, String category, String apiKey){
        String url = "https://newsapi.org/v2/top-headlines?country="+country+"&category="+category+"&apiKey="+apiKey;

       NewsResponse newsResponse =  restTemplate.getForObject(url , NewsResponse.class);



        assert newsResponse != null;
        List<Articles> articles = newsResponse.getArticles();


        for(int i = 0; i < articles.size(); i++) {

            NewEntity entity = new NewEntity();

            entity.setAuthor(articles.get(i).getAuthor());
            entity.setTitle(articles.get(i).getTitle());
            entity.setUrl(articles.get(i).getUrl());

            newsRepository.save(entity);
        }

        return  newsResponse;






    }
}
