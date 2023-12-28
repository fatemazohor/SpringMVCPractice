/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatema.springevd.model;

/**
 *
 * @author user
 */
public class DataModel {
    
   private int id;
    private String roll;
    private String sName;
    private String department;
    private String  marks;

    public DataModel() {
    }

    public DataModel(int id, String roll, String sName, String department, String marks) {
        this.id = id;
        this.roll = roll;
        this.sName = sName;
        this.department = department;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    
   
   
    
}
