/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatema.evdstudentmaven.dao;

import com.fatema.evdstudentmaven.model.Students;
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
public class StudentDao {
    
    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
    
    
    public int saveStudent(Students stu){
    
        String sql="insert into students(roll, sName, department, marks) values(' "+stu.getRoll()+"','"+stu.getsName()+"','"+stu.getDepartment()+"','"+stu.getMarks()+" ')";
        
        return template.update(sql);
    
    }
    
    public int deleteStudent(int id){
    String sql="delete from students where id=" + id + " ";
    return template.update(sql);
    }
    
    public int updateStudent(Students stu) {

        String sql = "update  students set sname='" + stu.getsName()+ "', roll='" + stu.getRoll() + "', department='" + stu.getDepartment() + "', marks='" + stu.getMarks() + "' where id='" + stu.getId() + "' ";

        return template.update(sql);
    }
    
    public Students getstuById(int id) {
        String sql = "select * from students where id=?";
        return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<Students>(Students.class));
    }
    
    public List<Students> getAllstu() {
        return template.query("select * from students", new RowMapper<Students>() {
            public Students mapRow(ResultSet rs, int row) throws SQLException {
                Students stu = new Students(
                        rs.getInt("id"),
                        rs.getString("sname"),
                        rs.getString("roll"),
                        rs.getString("department"),
                        rs.getString("marks")
                        
                        
                );

                return stu;
            }
        });

    }
    
    
    
}
