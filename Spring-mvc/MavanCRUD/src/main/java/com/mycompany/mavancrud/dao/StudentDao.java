/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavancrud.dao;

import com.mycompany.mavancrud.model.Student;
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

    JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public int saveStudent(Student s) {

        String sql = "insert into student(sName, email, password, gender) values('" + s.getsName() + ", " + s.getEmail() + ", "
                + s.getPassword() + ", " + s.getGender() +  " ')";
        return template.update(sql);
    }

    public int upadateStudent(Student s) {
        String sql = " update student set sname =" + s.getsName() + ",email = " + s.getEmail() + ",password= " + s.getPassword() + " ,gender = " + s.getGender()+"  ";
        return template.update(sql);
    }

    public int deleteStudent(int id) {

        String sql = "delete from student where idstudent=" + id + " ";
        return template.update(sql);
    }

    public Student getStuById(int id) {
        String sql = "select * from student where idstudent=?";
        return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<Student>(Student.class));
    }

    public List<Student> getStudent() {
        return template.query("select * from student", new RowMapper<Student>() {
            public Student mapRow(ResultSet rs, int row) throws SQLException {
                Student e = new Student();
                e.setIdstudent(rs.getInt("idstudent"));
                e.setsName(rs.getString("sName"));
                e.setEmail(rs.getString("email"));
                e.setPassword(rs.getString("password"));
                e.setGender(rs.getString("gender"));
                return e;
            }
        });
    }
}

