package com.springBoot.testSpringBoot.controller;

import com.springBoot.testSpringBoot.model.Subjects;
import com.springBoot.testSpringBoot.service.SubjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/subjects")
public class SubjectsController {
    @Autowired
    private SubjectsService service;
    @GetMapping("/add")
    public String addSubject(Model m){
        m.addAttribute("subject" ,new Subjects());
        return "/";
    }
    @PostMapping("/save")

    public String saveSub(@ModelAttribute Subjects subjects){
        service.saveSubject(subjects);
        return "redirect:/";

    }
    @GetMapping("/")
    public String getAllSub(Model m){
        List<Subjects> subjectsList=service.getAllSub();
        m.addAttribute("subList", subjectsList);
        m.addAttribute("title","Subjects");
        return "subjects";
    }
    @GetMapping("/delete/{id}")
    public String deleteSub(@PathVariable int id){
        service.deleteSub(id);
        return "redirect: /subjects/";
    }
    @GetMapping("/update/{id}")
    public String findSub(@PathVariable int id,Model m){
        Subjects sub=service.findSub(id);
        m.addAttribute("subject",sub);
        return "redirct:/subjects/";
    }


}
