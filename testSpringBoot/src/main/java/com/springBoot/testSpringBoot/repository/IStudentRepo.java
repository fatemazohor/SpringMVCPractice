package com.springBoot.testSpringBoot.repository;

import com.springBoot.testSpringBoot.model.Products;
import com.springBoot.testSpringBoot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends JpaRepository<Student, Integer> {

}
