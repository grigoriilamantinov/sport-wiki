package com.lamantinov.sportwiki.services;

import com.lamantinov.sportwiki.entity.Sport;
import com.lamantinov.sportwiki.requests.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SportWikiServiceImpl implements SportWikiService {
    final Request request;

    public SportWikiServiceImpl(
        @Autowired Request request
    ) {
        this.request = request;
    }

    @Override
    public List<Sport> getAllSports() {
        return request.getSportsList();
    }

    @Override
    public Sport getSportByName(final String name) {
    return this.getAllSports().stream()
        .filter(sport -> sport.getStrSport().equals(name))
        .findFirst()
        .orElseThrow(() -> new IllegalStateException(String.format("There is no sports with name %s in DB", name)));
    }

}
