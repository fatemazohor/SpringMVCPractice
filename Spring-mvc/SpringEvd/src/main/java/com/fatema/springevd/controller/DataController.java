/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatema.springevd.controller;

import com.fatema.springevd.dao.DataDao;
import com.fatema.springevd.model.DataModel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
public class DataController {
    
    @Autowired
    private DataDao dao;
    
    @RequestMapping("/view")
    public String getAllData(Model m){
        List<DataModel> dtaList=dao.getAllData();        
        m.addAttribute("dtaList", dtaList);
    
        return "view";
    }
    @RequestMapping("/addnew")
    public String addData(Model m){
    m.addAttribute("dta", new DataModel());
        return "addnew";
    }
    
    
    @PostMapping("/save")
    public  String saveStu(@ModelAttribute DataModel dta){        
        dao.saveData(dta);            
        return "redirect:/view";   
    }
    
    @RequestMapping("/editdata/{id}")
    public String updateData(@PathVariable("id") int id,Model m){
    DataModel dt=dao.getdataById(id);
        m.addAttribute("dt", dt);
        return "editdata";
    }
    
    @RequestMapping("/edit")
    public String editDatasave(@ModelAttribute("dt") DataModel dt){
       dao.updateData(dt);
        return "redirect:/view";
    }
    
    @RequestMapping("/delete/{id}")
    public String deleteData(@PathVariable int id){
    dao.deleteData(id);
            return "redirect:/view";
    
    }
    
    
    
    
}
