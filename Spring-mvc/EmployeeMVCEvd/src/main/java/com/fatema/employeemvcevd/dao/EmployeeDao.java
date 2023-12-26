/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatema.employeemvcevd.dao;

import com.fatema.employeemvcevd.model.EmployeeModel;
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
    
    public int saveEmp(EmployeeModel e){
    String sql=" insert into employees(ename, department, email, salary)"
            + "values("
            + "'"+(e.getEname())+",' "
            + "'"+(e.getDepartment())+",' "
            + "'"+(e.getEmail())+",' "
            + "'"+(e.getSalary())+"' )";
    
    return template.update(sql);
            
    }
    
    public int deleteemp(int id) {
        String sql = "delete from employees where id=" + id + "";
        return template.update(sql);
    }
    
    public int updateemp(EmployeeModel e){
        String sql="update  students  set"
                + "ename ='"+(e.getEname())+",'"
                + "'"+(e.getDepartment())+",' "
                + "'"+(e.getEmail())+",'"
                + "'"+(e.getSalary())+"'";
        
        return template.update(sql);
        
    }
    
    public EmployeeModel getempbyid(int id){
    String sql="select * from students where id=?";
    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<EmployeeModel>(EmployeeModel.class));
    
    }
    
    
    
    public List<EmployeeModel> getallemp(){
        String sql="select * from employees";
    return template.query(sql, new RowMapper<EmployeeModel>(){
    public EmployeeModel mapRow(ResultSet rs, int row) throws SQLException{
        EmployeeModel emp = new EmployeeModel();
        emp.setId(rs.getInt("id"));
        emp.setEname(rs.getString("ename"));
        emp.setDepartment(rs.getString("department"));
        emp.setEmail(rs.getString("email"));
        emp.setSalary(rs.getString("salary"));
        return emp;
    }
    });
    
    }

    
    
    
    
    
}
