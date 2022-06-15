package com.lamantinov.sportwiki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SportWikiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SportWikiApplication.class, args);
    }

}
