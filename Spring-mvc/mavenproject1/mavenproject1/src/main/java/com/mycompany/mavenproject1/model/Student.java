
package com.mycompany.mavenproject1.model;

import java.util.Date;



public class Student {
    
    private int id;
    private int roll;
    private String name;
    private String gender;
  
    private String hobby;
    private String email;
    private String dob;

    public Student() {
    }

    public Student(int id, int roll, String name, String gender, String hobby, String email, String dob) {
        this.id = id;
        this.roll = roll;
        this.name = name;
        this.gender = gender;
        
        this.hobby = hobby;
        this.email = email;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

 

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", roll=" + roll + ", name=" + name + ", gender=" + gender + ", hobby=" + hobby + ", email=" + email + ", dob=" + dob + '}';
    }
    
    
    
    
    
}
