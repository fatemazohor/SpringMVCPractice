package com.springBoot.testSpringBoot.service;

import com.springBoot.testSpringBoot.model.Student;
import com.springBoot.testSpringBoot.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private IStudentRepo repo;

    public void saveStudent(Student s){
        repo.save(s);
    }

    public List<Student> getAllStudent(){
        return repo.findAll();

    }
    public void deleteStudent(int id){
        repo.deleteById(id);
    }


    public Student findById(int id){
        return repo.findById(id).get();
    }
}
