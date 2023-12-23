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

        String sql = "insert into old_student values('" + s.getsName() + "," + s.getEmail() + ""
                + " ," + s.getPassword() + ", " + s.getGender() + "," + s.getAddress() + "," + s.getCity() + "," + s.getZip() + " ')";
        return template.update(sql);
    }

    public int upadateStudent(Student s) {
        String sql = " update old_student set sname =" + s.getsName() + ",email = " + s.getEmail() + ",password= " + s.getPassword() + " ,gender = " + s.getGender() + ",address= " + s.getAddress() + ",state = " + s.getState() + ",city=" + s.getCity() + ",zip=" + s.getZip() + " where idstudent = " + s.getIdstudent() + "  ";
        return template.update(sql);
    }

    public int deleteStudent(int id) {

        String sql = "delete from old_student where idstudent=" + id + " ";
        return template.update(sql);
    }

    public Student getStuById(int id) {
        String sql = "select * from old_student where id=?";
        return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<Student>(Student.class));
    }

    public List<Student> getStudent() {
        return template.query("select * from old_student", new RowMapper<Student>() {
            public Student mapRow(ResultSet rs, int row) throws SQLException {
                Student e = new Student();
                e.setIdstudent(rs.getInt(1));
                e.setsName(rs.getString(2));
                e.setEmail(rs.getString(3));
                e.setPassword(rs.getString(4));
                e.setGender(rs.getString(5));
                e.setAddress(rs.getString(6));
                e.setCity(rs.getString(7));
                e.setState(rs.getString(8));
                e.setZip(rs.getString(9));
                return e;
            }
        });
    }
}

