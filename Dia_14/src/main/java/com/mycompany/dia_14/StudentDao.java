/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia_14;

/**
 *
 * @author ficdev
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

public class StudentDao {
    private List<Student> students = new ArrayList<>();
    private DataSource ds;
    
        public void save(Student stud) {
        students.add(stud);
    }

    public void setDataSource(DataSource ds) {
        this.ds = ds;
    }
    
        public Student findById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
        
            public List<Student> findAll() {
        return students;
    }
            
              public void update(Student stud) {
        for (Student student : students) {
            if (student.getId() == stud.getId()) {
                student.setName(stud.getName());
                student.setCity(stud.getCity());
                break;
            }
        }
    }

    public Student findByNameStudent(String string) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = ds.getConnection();
            ps = con.prepareStatement("SELECT * FROM estudante WHERE nome_estudante = ?");
            ps.setString(1, string);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Student stud = new Student();
                stud.setId(rs.getInt("id"));
                stud.setName(rs.getString("nome_estudante"));
                stud.setCity(rs.getString("cidade"));
                return stud;
            } else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
