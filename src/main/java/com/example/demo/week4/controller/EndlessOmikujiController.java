package com.example.demo.week4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.week4.service.EndlessOmikujiService;

@Controller
@RequestMapping("endlessOmikuji")
public class EndlessOmikujiController {

    @Autowired
    EndlessOmikujiService service;

    @GetMapping("/")
    public String getHome(Model model) {
        return "week4/omikuji/index";
    }

    @GetMapping("/result")
    public String getResult(Model model) {
        String fortuneMessage = service.getResult();
        String fortuneComment = service.getResultComment();

        model.addAttribute("fortuneMessage", fortuneMessage);
        model.addAttribute("fortuneComment", fortuneComment);

        return "week4/omikuji/result";
    }
}
