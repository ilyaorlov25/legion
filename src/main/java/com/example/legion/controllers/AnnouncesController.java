package com.example.legion.controllers;

import com.example.legion.models.Announce;
import com.example.legion.repo.AnnounceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnnouncesController {

    @Autowired
    private AnnounceRepository announceRepository;

    @GetMapping("/announces")
    public String announces(Model model) {
        Iterable<Announce> posts = announceRepository.findAll();
        model.addAttribute("posts", posts)
        return "announces";
    }
}
