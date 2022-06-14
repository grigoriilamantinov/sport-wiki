package com.lamantinov.sportwiki.requests;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.lamantinov.sportwiki.entity.ResponseDTO;
import com.lamantinov.sportwiki.entity.Sport;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class RequestToTheSportsDB implements Request {
    @Override
    public void getResponse() {
        RestTemplate restTemplate = new RestTemplate();
        final String URL = "https://www.thesportsdb.com/api/v1/json/2/all_sports.php";
        final var responseEntity = restTemplate.getForEntity(URL, ResponseDTO.class);

        System.out.println(responseEntity.getBody().getSports());
        System.out.println("Hello");
    }
}
