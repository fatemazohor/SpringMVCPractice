package com.example.employee.controller;


import com.example.employee.model.Employees;
import com.example.employee.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeesController {
@Autowired
    private EmployeeService employeeService;

    //emp list
    @GetMapping("")
    public String getEmp(Model m){
        List<Employees> employeesList = employeeService.getAllEmp();
        m.addAttribute("empList", employeesList);
        m.addAttribute("title", "Employees List");

        m.addAttribute("employee", new Employees());
        return "EmployeeList";
    }

//    @GetMapping("/add")
//    public String addEmp(Model m){
//        m.addAttribute("employee", new Employees());
//        m.addAttribute("title", "Employee Form");
//        return "FormEmployees";
//    }

    @PostMapping("/save")
    public String saveEmP(@ModelAttribute Employees e){

        employeeService.saveEmp(e);
        return "redirect:/employees";

    }

    @GetMapping("/delete/{id}")
    public String deleteEmp(@PathVariable int id){
        employeeService.deleteEmp(id);
        return "redirect:/employees";
    }

    @GetMapping("/update/{id}")
    public String updateEmp(@PathVariable int id,Model m){
        Employees emp= employeeService.findEmp(id);
        m.addAttribute("employee", emp);
        return "FormEmployees";
    }




}
