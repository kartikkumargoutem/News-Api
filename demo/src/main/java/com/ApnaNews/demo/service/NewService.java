package com.ApnaNews.demo.service;


import com.ApnaNews.demo.dto.NewsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewService {

    @Autowired
    private RestTemplate restTemplate;

    public NewsResponse getNews(String country, String categor, String apiKey){
        String url = "https://newsapi.org/v2/top-headlines?country="+country+"&category="+categor+"&apiKey="+apiKey;

        return restTemplate.getForObject(url , NewsResponse.class);

    }
}
