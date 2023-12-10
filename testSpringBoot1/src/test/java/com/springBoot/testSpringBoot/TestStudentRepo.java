package com.springBoot.testSpringBoot;

import com.springBoot.testSpringBoot.model.Student;
import com.springBoot.testSpringBoot.repository.IStudentRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Date;
@SpringBootTest
public class TestStudentRepo {
    private Student student;
    @Autowired
    private IStudentRepo studentRepo;

    @Test
    public void testAddStudent(){
        //Initialize a new Student Object
        student=new Student();
        student.setRoll(10);
        student.setEmail("ysn@gmail.com");
        student.setName("Ysn");
        studentRepo.save(student);


    }
}
