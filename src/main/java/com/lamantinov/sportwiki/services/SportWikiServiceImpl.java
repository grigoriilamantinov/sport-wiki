package com.lamantinov.sportwiki.services;

import com.lamantinov.sportwiki.requests.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SportWikiServiceImpl implements SportWikiService {
    final Request request;

    public SportWikiServiceImpl(
        @Autowired Request request
    ) {
        this.request = request;
    }

    @Override
    public String getAllSports() {
        request.getResponse();
        return "ok";
    }

}
