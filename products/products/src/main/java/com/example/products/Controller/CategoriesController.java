package com.example.products.Controller;

import com.example.products.Model.Categories;
import com.example.products.Services.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoriesController {
    @Autowired
    private CategoriesService service;
    @GetMapping("/")
    public String getAllCat(Model m){
        List<Categories> categoriesList = service.getAllCategories();
        m.addAttribute("cateList",categoriesList);
        m.addAttribute("title","categoriesList");
        return "Categories";
    }

    @PostMapping("/add")
    public String addCat(Model m){
        m.addAttribute("category", new Categories());
        m.addAttribute("title","Categories_Form");
        return "FormCategories";
    }

    @GetMapping("/save")
    public String saveCat(@ModelAttribute Categories categories){
        service.saveCat(categories);
        return "/";
    }

    @GetMapping("/delete/id")
    public String deleteCat(@PathVariable int id){
        service.deleteCat(id);
        return "redirect: /";
    }

    public String updateCat(@PathVariable int id){
        service.findCategories(id);
        return "FormCategories";
    }



}
