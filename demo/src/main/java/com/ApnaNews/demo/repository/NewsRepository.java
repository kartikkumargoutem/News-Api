package com.ApnaNews.demo.repository;


import com.ApnaNews.demo.entity.NewEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface NewsRepository extends JpaRepository<NewEntity, Long> {


}
