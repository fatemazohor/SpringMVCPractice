/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavancrud.model;

/**
 *
 * @author user
 */
public class Student {
    private int idstudent;
    private String sName;
    private String email;
    private String password;
    private String gender;
    

    public Student() {
    }

    public Student(int idstudent, String sName, String email, String password, String gender) {
        this.idstudent = idstudent;
        this.sName = sName;
        this.email = email;
        this.password = password;
        this.gender = gender;
       
    }

    public int getIdstudent() {
        return idstudent;
    }

    public void setIdstudent(int idstudent) {
        this.idstudent = idstudent;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    

    @Override
    public String toString() {
        return "Student{" + "idstudent=" + idstudent + ", sName=" + sName + ", email=" + email + ", password=" + password + ", gender=" + gender + ", address=" +'}';
    }
    
    
}
