/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatema.evdstudentmaven.controller;

import com.fatema.evdstudentmaven.dao.StudentDao;
import com.fatema.evdstudentmaven.model.Students;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
public class StudentController {
    @Autowired
    private StudentDao dao;
    
    @RequestMapping("/datalist")
    public String getAllStu(Model m){
        List<Students> stuList=dao.getAllstu();        
        m.addAttribute("stuList", stuList);
        return "dataList";
    
    }
    
    
    @GetMapping("/saveform")
    public  String saveForm(Model m){
        
        m.addAttribute("student", new Students());        
        return "addForm";    
    }
    
    @PostMapping("/save")
    public  String saveStu(@ModelAttribute Students stu){        
        dao.saveStudent(stu);            
        return "redirect:/datalist";   
    }
    
    @RequestMapping("/delete/{id}")
    public  String deletestu(@PathVariable("id") int id){
        
        dao.deleteStudent(id);
        return "redirect:/datalist";         
    }
    
    @RequestMapping("/editform/{id}")
    public String StuEditForm(@PathVariable("id") int id,Model m){
        Students st=dao.getstuById(id);
        m.addAttribute("student", st);
        return  "editForm";
    }
    
    @RequestMapping("/edit")
    public String editStuSave(@ModelAttribute("student") Students student){
       dao.updateStudent(student);
        return "redirect:/datalist";
    }
    
}
