package com.example.employee.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "employees")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String ename;
    private String gender;
    private String contact;
    @Column(unique = true)
    private String email;
    private String address;



}
