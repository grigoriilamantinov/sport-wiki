package com.lamantinov.sportwiki.controllers;

import com.lamantinov.sportwiki.services.SportWikiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
    final SportWikiService sportWikiService;

    public MainController(
        @Autowired SportWikiService sportWikiService
    ) {
        this.sportWikiService = sportWikiService;
    }


    @GetMapping("/sports")
    public String showAllSports(final Model model) {
        model.addAttribute("sportsList", sportWikiService.getAllSports());
        return "sports-view";
    }
}
