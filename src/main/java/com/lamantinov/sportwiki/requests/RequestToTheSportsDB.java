package com.lamantinov.sportwiki.requests;

import com.lamantinov.sportwiki.entity.ResponseDTO;
import com.lamantinov.sportwiki.entity.Sport;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class RequestToTheSportsDB implements Request {
    @Override
    public List<Sport> getSportsList() {
        RestTemplate restTemplate = new RestTemplate();
        final String URL = "https://www.thesportsdb.com/api/v1/json/2/all_sports.php";
        final var responseEntity = restTemplate.getForEntity(URL, ResponseDTO.class);
        return responseEntity.getBody().getSports();
    }
}
