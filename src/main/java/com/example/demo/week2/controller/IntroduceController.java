package com.example.demo.week2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.week2.service.IntroduceService;

@Controller
public class IntroduceController {

    @Autowired
    IntroduceService service;

    @GetMapping("/introduce/")
    public String getHome(Model model) {
        String introduceName = service.getName();
        String introduceComment = service.getComment();

        model.addAttribute("introduceName", introduceName);
        model.addAttribute("introduceComment", introduceComment);

        return "week2/introduce/index";
    }

}