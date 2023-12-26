/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatema.employeemvcevd.controller;

import com.fatema.employeemvcevd.dao.EmployeeDao;
import com.fatema.employeemvcevd.model.EmployeeModel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeDao dao;
    
    
    @RequestMapping("/add")
    public String addemp(Model m){
        m.addAttribute("employee", new EmployeeModel());
           return "empform";
    }
    @PostMapping("/save")
    public String saveemp(@ModelAttribute EmployeeModel emp){
        dao.saveEmp(emp);
        return "redirect:/allemp";
    }
    
    @RequestMapping("/allemp")
    public String getAllemp(Model m){
        List<EmployeeModel> elist=dao.getallemp();
        m.addAttribute("emplist", elist);
        return "emplist";
    }
    
}
