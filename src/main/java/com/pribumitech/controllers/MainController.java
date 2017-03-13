package com.pribumitech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/sayhello")
    public String sayhello() {
        return "index";
    }

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name", "Tom");
        model.addAttribute("formatted", "<b>blue</b>");
        return "index";
    }

}
