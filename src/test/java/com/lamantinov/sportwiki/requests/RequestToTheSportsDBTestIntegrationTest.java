//package com.lamantinov.sportwiki.requests;
//
//import com.lamantinov.sportwiki.SportWikiApplication;
//import com.lamantinov.sportwiki.entity.Sport;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.cache.CacheManager;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//import java.util.concurrent.ConcurrentHashMap;
//
//import static java.util.Optional.empty;
//import static org.junit.jupiter.api.Assertions.*;
//
//@ExtendWith(SpringExtension.class)
//@SpringBootTest(classes = SportWikiApplication.class)
//class RequestToTheSportsDBTestIntegrationTest {
//
//    @Autowired
//    CacheManager cacheManager;
//
//    @Autowired
//    RequestToTheSportsDB request;
//
//    @BeforeEach
//    void setUp() {
//        request.getSportsList();
//    }
//
//    private Sport getCachedSport(final String name) {
//
//        final var cachedObjects = ((ConcurrentHashMap) cacheManager.getCache("main_request").getNativeCache())
//            .values()
//            .stream()
//            .findFirst()
//            .get();
//
//        final var cachedSpots = ((ArrayList<Sport>)  cachedObjects);
//
//        return cachedSpots.stream()
//            .filter(it -> it.getStrSport().equals(name))
//            .findFirst()
//            .get();
//    }
//
//    @Test
//    void getSportsList() {
//        final String strSport = "Soccer";
//        final Optional<Sport> sport = request.getSportsList().stream()
//            .filter(sportFromRequest -> sportFromRequest.getStrSport().equals(strSport))
//            .findFirst();
//        assertEquals(sport, getCachedSport(strSport));
//    }
//}