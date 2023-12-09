package com.springBoot.testSpringBoot.controller;

import com.springBoot.testSpringBoot.model.Student;
import com.springBoot.testSpringBoot.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
@Autowired
private IStudentRepo repo;
    @GetMapping("/")
    public String student(){
        return "Student";
    }
    @GetMapping("/addForm")
    public String addstudent(Model m){
        m.addAttribute("student", new Student());
        return "AddStudent";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student student){
        repo.save(student);
        return "redirect:/";
    }
}
