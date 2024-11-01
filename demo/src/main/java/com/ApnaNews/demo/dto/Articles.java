package com.ApnaNews.demo.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Articles {

    private int id;

    private String author;

    private String title;

    private String url;
}
