package com.lamantinov.sportwiki.requests;

import com.lamantinov.sportwiki.entity.Sport;

import java.util.List;

public interface Request {
    List<Sport> getSportsList();
}
