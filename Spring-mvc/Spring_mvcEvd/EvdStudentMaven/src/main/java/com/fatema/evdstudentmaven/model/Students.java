/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatema.evdstudentmaven.model;

/**
 *
 * @author user
 */
public class Students {
    
    
    private int id;
    private String roll;
    private String sName;
    private String department;
    private String  marks;

    public Students() {
    }

    public Students(int id, String roll, String sName, String department, String marks) {
        this.id = id;
        this.roll = roll;
        this.sName = sName;
        this.department = department;
        this.marks = marks;
    }

    public Students(int aInt, String string, String string0, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
