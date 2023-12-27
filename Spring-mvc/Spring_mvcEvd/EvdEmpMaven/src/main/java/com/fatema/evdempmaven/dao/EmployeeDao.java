/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatema.evdempmaven.dao;

import com.fatema.evdempmaven.model.Employees;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author user
 */
public class EmployeeDao {
    
    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
    
    public int saveEmp(Employees emp){
    
        String sql="insert into employees(ename, department, salary) values(' "+emp.getEname()+"','"+emp.getDepartment()+"','"+emp.getSalary()+" ')";
        
        return template.update(sql);
    
    }
    
    public int deleteEmp(int id){
    String sql="delete from employees where empid=" + id + " ";
    return template.update(sql);
    }
    
    public int updateEmp(Employees emp) {

        String sql = "update  employees set ename='" + emp.getEname()+ "', department='" + emp.getDepartment() + "', salary='" + emp.getSalary() + "' where empid='" + emp.getEmpid() + "' ";

        return template.update(sql);
    }
    
    public Employees getEmpById(int id) {
        String sql = "select * from employees where empid=?";
        return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<Employees>(Employees.class));
    }
    
    public List<Employees> getAllEmp() {
        return template.query("select * from employees", new RowMapper<Employees>() {
            public Employees mapRow(ResultSet rs, int row) throws SQLException {
                Employees emp= new Employees(
                        rs.getInt("empid"),
                        rs.getString("ename"),  
                        rs.getString("department"),
                        rs.getString("salary")
                        
                        
                );

                return emp;
            }
        });

    }
    
    
    
}
