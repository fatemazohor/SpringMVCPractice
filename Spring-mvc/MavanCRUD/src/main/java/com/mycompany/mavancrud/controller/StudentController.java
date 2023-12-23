/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavancrud.controller;

import com.mycompany.mavancrud.dao.StudentDao;
import com.mycompany.mavancrud.model.Student;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author user
 */
@Controller
public class StudentController {

    @Autowired
    StudentDao dao;

    @RequestMapping("/studentform")
    public String studentForm(Model m) {
        m.addAttribute("student", new Student());
        return "StudentForm";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveStu(@ModelAttribute("student") Student stu) {
        dao.saveStudent(stu);
        return "redirect:/viewstudent";
    }

    @RequestMapping("/viewstudent")
    public String viewStudent(Model m) {
        List<Student> stuList = dao.getStudent();
        return "viewstudent";
    }

    @RequestMapping("/edit/{id}")
    public String editStudent(@PathVariable int id, Model m) {
        Student stu = dao.getStuById(id);
        m.addAttribute("student", stu);
        return "EditForm";
    }

    @RequestMapping("/update")
    public String updatestu(@ModelAttribute Student stu) {
        dao.upadateStudent(stu);
        return "redirect:/viewstudent";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteStu(@PathVariable int id) {
        dao.deleteStudent(id);
        return "redirect:/viewstudent";
    }

}
