/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatema.employeemvcevd.model;

/**
 *
 * @author user
 */
public class EmployeeModel {
    
    private int id;
    private String ename;
    private String department;
    private String email;
    private String salary;

    public EmployeeModel() {
    }

    public EmployeeModel(int id, String ename, String department, String email, String salary) {
        this.id = id;
        this.ename = ename;
        this.department = department;
        this.email = email;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    
    
    
}
