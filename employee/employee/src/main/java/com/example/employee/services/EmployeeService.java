package com.example.employee.services;

import com.example.employee.model.Employees;
import com.example.employee.repository.Iemployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private Iemployee repo;

    public void saveEmp(Employees employees){
        repo.save(employees);
    }

    public List<Employees> getAllEmp(){
        List<Employees> employeesList=repo.findAll();
        return employeesList;
    }

    public void deleteEmp(int id){
        repo.deleteById(id);
    }

    public Employees findEmp(int id){
        Employees emp=repo.findById(id).get();
        return emp;
    }
}
