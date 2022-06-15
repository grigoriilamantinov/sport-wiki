package com.lamantinov.sportwiki.services;

import com.lamantinov.sportwiki.entity.Sport;

import java.util.List;

public interface SportWikiService {
    List<Sport> getAllSports();

    Sport getSportByName(String name);
}
