package com.springBoot.testSpringBoot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity(name ="Student")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private  int roll;
    private String name;
    @Column(unique = true,nullable = false)
    private String email;
    private String gender;
    private Date dob;
    private String subject;
    private String hobby;
}
