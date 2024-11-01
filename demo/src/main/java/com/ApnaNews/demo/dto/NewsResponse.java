package com.ApnaNews.demo.dto;


import lombok.*;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class NewsResponse {
    private String status;
    private int totalResults;
    private List<Articles> articles;
}
