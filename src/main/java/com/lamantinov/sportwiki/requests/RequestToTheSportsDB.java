package com.lamantinov.sportwiki.requests;

import com.lamantinov.sportwiki.entity.Sport;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RequestToTheSportsDB implements Request {
    @Override
    public void getResponse() {
        RestTemplate restTemplate = new RestTemplate();
        final String URL = "https://www.thesportsdb.com/api/v1/json/2/all_sports.php";
        final var response = restTemplate.getForObject(URL, Sport.class);
        System.out.println("Hello");
    }
}
