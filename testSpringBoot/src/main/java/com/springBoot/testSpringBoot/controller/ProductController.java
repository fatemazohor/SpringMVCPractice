package com.springBoot.testSpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/details")
public class ProductController {
    @GetMapping("")
    public String productDetails(){
        return "productDetails";
    }
    @GetMapping("/products")
    public String product(){
        return "products";
    }



}
