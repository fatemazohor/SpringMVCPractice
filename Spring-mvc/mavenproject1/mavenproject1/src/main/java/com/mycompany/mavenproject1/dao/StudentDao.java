package com.mycompany.mavenproject1.dao;

import com.mycompany.mavenproject1.model.Student;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import sun.jvm.hotspot.code.Stub;

public class StudentDao {

    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int saveStudent(Student s) {

        String sql = "insert into students(name,roll,gender,email, hobby, dob ) values('" + s.getName() + "'," + s.getRoll()
                + ",'" + s.getGender() + "', '" + s.getEmail() + "', '" + s.getHobby() + "', '" + s.getDob() + "')";

        return jdbcTemplate.update(sql);
    }

    public int updateStudent(Student s) {

        String sql = "update  students  set name='" + s.getName() + "',roll='" + s.getRoll() + "',gender='" + s.getGender() + "', email='" + s.getEmail() + "', hobby='" + s.getHobby() + "', dob='" + s.getDob() + "' where id=" + s.getId() + "";

        return jdbcTemplate.update(sql);
    }

    public int delete(int id) {
        String sql = "delete from students where id=" + id + "";
        return jdbcTemplate.update(sql);
    }

    public Student getStudentById(int id) {
        String sql = "select * from students where id=?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<Student>(Student.class));
    }

    public List<Student> getStudents() {
        return jdbcTemplate.query("select * from students", new RowMapper<Student>() {
            public Student mapRow(ResultSet rs, int row) throws SQLException {
                Student s = new Student();
                s.setId(rs.getInt(1));
                s.setRoll(rs.getInt(2));
                s.setName(rs.getString(3));
                s.setEmail(rs.getString(4));
                s.setGender(rs.getString(5));
                s.setHobby(rs.getString(6));
                
                s.setDob(rs.getString(8));

                return s;
            }
        });
    }

}
