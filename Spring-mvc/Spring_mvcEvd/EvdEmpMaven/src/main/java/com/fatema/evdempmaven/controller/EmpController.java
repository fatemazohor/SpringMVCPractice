/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatema.evdempmaven.controller;

import com.fatema.evdempmaven.dao.EmployeeDao;
import com.fatema.evdempmaven.model.Employees;
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
public class EmpController {
    
    @Autowired
    private EmployeeDao dao;
    
    @RequestMapping("/viewemp")
    public String getAllEmp(Model m){
        List<Employees> empList=dao.getAllEmp();        
        m.addAttribute("empList", empList);
        return "viewemp";
    
    }
    
    @GetMapping("/saveform")
    public  String saveForm(Model m){
        
        m.addAttribute("employee", new Employees());        
        return "addemp";    
    }
    
    @PostMapping("/save")
    public  String saveStu(@ModelAttribute Employees emp){        
        dao.saveEmp(emp);            
        return "redirect:/viewemp";   
    }
    
    @RequestMapping("/delete/{id}")
    public  String deleteEmp(@PathVariable("id") int id){
        
        dao.deleteEmp(id);
        return "redirect:/viewemp";         
    }
    
    @RequestMapping("/editemp/{id}")
    public String EmpEditForm(@PathVariable("id") int id,Model m){
        Employees emp=dao.getEmpById(id);
        m.addAttribute("employee", emp);
        return  "editemp";
    }
    
    @RequestMapping("/edit")
    public String editStuSave(@ModelAttribute("employee") Employees emp){
       dao.updateEmp(emp);
        return "redirect:/viewemp";
    }
    
}
