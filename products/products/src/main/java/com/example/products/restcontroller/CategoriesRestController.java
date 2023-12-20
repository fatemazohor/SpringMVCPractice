package com.example.products.restcontroller;

import com.example.products.Model.Categories;
import com.example.products.Services.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoriesRestController {

    @Autowired
    private CategoriesService service;
    @GetMapping("/")
    public List<Categories> getAll(){
        return service.getAllCategories();
    }
}
