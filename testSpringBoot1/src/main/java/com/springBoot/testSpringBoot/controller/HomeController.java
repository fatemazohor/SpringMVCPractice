package com.springBoot.testSpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home";
//        "home" is html page name
    }
    @GetMapping(value={"/products","/pro"})
    public String products(){
        return  "products";
    }
}
