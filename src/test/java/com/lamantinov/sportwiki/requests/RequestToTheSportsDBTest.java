package com.lamantinov.sportwiki.requests;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lamantinov.sportwiki.SportWikiApplication;
import com.lamantinov.sportwiki.entity.Sport;
import com.lamantinov.sportwiki.services.SportWikiService;
import com.lamantinov.sportwiki.services.SportWikiServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.CacheManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = {SportWikiApplication.class})

class RequestToTheSportsDBTest {

    @Mock
    private RequestToTheSportsDB request;

    private SportWikiService testable;

    @BeforeEach
    void setUp() {
        testable = new SportWikiServiceImpl(request);
    }

    @Test
    void shouldGetSportsList() {
        final List<Sport> sports = new ArrayList<>(){{
            add(new Sport(1, "Soccer", "Play with the ball"));
            add(new Sport(2, "Run", "You run"));
        }};

        final List<Sport> exceptedResult = new ArrayList<>(){{
            add(new Sport(1, "Soccer", "Play with the ball"));
            add(new Sport(2, "Run", "You run"));
        }};

        Mockito.when(request.getSportsList()).thenReturn(sports);

        final var actualResult = testable.getAllSports();

        Assertions.assertEquals(exceptedResult, actualResult);
        Mockito.verify(request).getSportsList();
    }
}