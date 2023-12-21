package com.example.employee.repository;

import com.example.employee.model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Iemployee extends JpaRepository<Employees, Integer> {
}
