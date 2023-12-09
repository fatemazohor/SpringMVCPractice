package com.springBoot.testSpringBoot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity(name ="products")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private  int roll;
    private String name;
    @Column(unique = true,nullable = false)
    private String email;
    private String gender;
    private Date dob;
    private String subject;
    private String hobby;
}
