package com.example.legion.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RequestsController {

    @GetMapping("/requests")
    public String requests(Model model) {
        return "requests";
    }
}
