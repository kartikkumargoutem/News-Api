package com.ApnaNews.demo.controler;


import com.ApnaNews.demo.dto.NewsResponse;
import com.ApnaNews.demo.service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/news/v1")
public class NewController {

    @Autowired
    NewService newService;

    @GetMapping("/get")
    public NewsResponse getNews(@RequestParam String country, @RequestParam String categor, @RequestParam String apiKey){


        return newService.getNews(country, categor, apiKey);
    }
}
