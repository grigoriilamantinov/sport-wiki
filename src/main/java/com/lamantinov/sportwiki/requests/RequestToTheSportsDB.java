package com.lamantinov.sportwiki.requests;

import com.lamantinov.sportwiki.entity.ResponseDTO;
import com.lamantinov.sportwiki.entity.Sport;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class RequestToTheSportsDB implements Request {

    @Value("${URL}")
    private String URL;

    @Override
    @Cacheable("main_request")
    public List<Sport> getSportsList() {
        RestTemplate restTemplate = new RestTemplate();
        final var responseEntity = restTemplate.getForEntity(URL, ResponseDTO.class);
        return responseEntity.getBody().getSports();
    }
}
