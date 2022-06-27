package com.lamantinov.sportwiki.requests;

import com.lamantinov.sportwiki.SportWikiApplication;
import com.lamantinov.sportwiki.entity.Sport;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.CacheManager;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Optional;

import static java.util.Optional.empty;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = SportWikiApplication.class)
class RequestToTheSportsDBTestIntegrationTest {

    @Autowired
    CacheManager cacheManager;

    @Autowired
    RequestToTheSportsDB request;

    @BeforeEach
    void setUp() {
        request.getSportsList();
    }

    private Optional<Sport> getCachedSport(final String name) {
        return Optional.ofNullable(cacheManager.getCache("main_request")).map(c -> c.get(name, Sport.class));
    }

    @Test
    void getSportsList() {
        final String strSport = "soccer";
        final Optional<Sport> sport = request.getSportsList().stream()
            .filter(sportFromRequest -> sportFromRequest.getStrSport().equals(strSport))
            .findFirst();

        assertEquals(sport, getCachedSport(strSport));
    }
    @Test
    void givenSportShouldNotBe() {
        request.getSportsList();
        assertEquals(empty(), getCachedSport(""));
    }
}