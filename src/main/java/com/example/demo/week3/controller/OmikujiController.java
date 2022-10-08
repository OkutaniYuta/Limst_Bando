package com.example.demo.week3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.week3.service.OmikujiService;

@Controller
@RequestMapping("omikuji")
public class OmikujiController {

    @Autowired
    OmikujiService service;

    @GetMapping("/")
    public String getHome(Model model) {
        return "week3/omikuji/index";
    }

    @GetMapping("/result")
    public String getResult(Model model) {
        String fortuneMessage = service.getResult();
        String fortuneComment = service.getResultComment(fortuneMessage);

        model.addAttribute("fortuneMessage", fortuneMessage);
        model.addAttribute("fortuneComment", fortuneComment);

        return "week3/omikuji/result";
    }
}
