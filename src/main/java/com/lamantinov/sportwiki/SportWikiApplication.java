package com.lamantinov.sportwiki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value = {"classpath:url.properties"})
@SpringBootApplication
@EnableCaching
public class SportWikiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SportWikiApplication.class, args);
    }

}
