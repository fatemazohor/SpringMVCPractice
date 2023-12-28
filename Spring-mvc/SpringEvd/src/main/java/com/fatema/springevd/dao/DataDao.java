/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatema.springevd.dao;

import com.fatema.springevd.model.DataModel;
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
public class DataDao {
    
    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
    
    public int saveData(DataModel dt){
    
        String sql="insert into students(roll, sName, department, marks) values(' "+dt.getRoll()+"','"+dt.getsName()+"','"+dt.getDepartment()+"','"+dt.getMarks()+" ')";
        
        return template.update(sql);
    
    }
    
    public int deleteData(int id){
    String sql="delete from students where id=" + id + " ";
    return template.update(sql);
    }
    
    public int updateData(DataModel dt) {

        String sql = "update  students set sname='" + dt.getsName()+ "', roll='" + dt.getRoll() + "', department='" + dt.getDepartment() + "', marks='" + dt.getMarks() + "' where id='" + dt.getId() + "' ";

        return template.update(sql);
    }
    
    public DataModel getdataById(int id) {
        String sql = "select * from students where id=?";
        return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<DataModel>(DataModel.class));
    }
    
    public List<DataModel> getAllData(){
        String sql="select * from students";
    return template.query(sql, new RowMapper<DataModel>(){
    public DataModel mapRow(ResultSet rs,int row)throws SQLException{
    DataModel dt=new DataModel(
    rs.getInt("id"),
    rs.getString("roll"),
    rs.getString("sname"),
     rs.getString("department"),
    rs.getString("marks")
    );
    return dt;
    }});
    
    }
    
//    public List<Students> getAllstu() {
//        return template.query("select * from students", new RowMapper<Students>() {
//            public Students mapRow(ResultSet rs, int row) throws SQLException {
//                Students stu = new Students(
//                        rs.getInt("id"),
//                        rs.getString("sname"),
//                        rs.getString("roll"),
//                        rs.getString("department"),
//                        rs.getString("marks")
//           
//                );
//                return stu;
//            }
//        });
//
//    }
    
    
    
}
