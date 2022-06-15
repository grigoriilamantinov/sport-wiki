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
        final var sportsList = this.getAllSports();
        final var result = sportsList.stream()
            .filter(sport -> sport.getStrSport().equals(name))
            .collect(Collectors.toList());
    return result.get(0);
    }

}
