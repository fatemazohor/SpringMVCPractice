package com.springBoot.testSpringBoot.controller;

import com.springBoot.testSpringBoot.model.Student;
import com.springBoot.testSpringBoot.model.Subjects;
import com.springBoot.testSpringBoot.service.StudentService;
import com.springBoot.testSpringBoot.service.SubjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
@Autowired
private StudentService service;
@Autowired
private SubjectsService subservice;


    @GetMapping("/")
    public String allStudent(Model m){
        List<Student> studentList=service.getAllStudent();
        m.addAttribute("studentList" , studentList);
        //html title source
        m.addAttribute("title" ,"All Student");
        return "Student";
    }

    @GetMapping("/add")
    public String addstudent(Model m){
//Subject list form Subjects Model
        List<Subjects> subjectsList = subservice.getAllSub();
//create object to use in form
        m.addAttribute("subject", new Subjects());
        m.addAttribute("subjectsList",subjectsList);


        m.addAttribute("student", new Student());
        return "AddStudent";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student student){
        service.saveStudent(student);
        return "redirect:/student/";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id){
        service.deleteStudent(id);
        return "redirect:/student/";
    }

    @GetMapping("/update/{id}")
    public String editStudent(@PathVariable int id, Model m){
        Student s=service.findById(id);
        m.addAttribute("student", s);
        return "AddStudent";
    }

}
