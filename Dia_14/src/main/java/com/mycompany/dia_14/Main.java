/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia_14;

import java.util.List;

public class Main {
    public static void main(String[] args) {
          Student stud1 = new Student();
          stud1.setId(1);
          stud1.setName("Maria");
          stud1.setCity("cuiaba");
          
         
        
        // Create an instance of the StudentDao
        StudentDao studDao = new StudentDao();
        
        List<Student> studList = studDao.findAll();
        
         studDao.save(stud1);
         
           for (Student s : studList) {
            System.out.println(s.getName());
        }
        
        // Example usage of the DAO
        Student  stud = studDao.findById(1);
        stud.setName("João");
        studDao.update(stud);

     
        for (Student s : studList) {
            System.out.println(s.getName());
        }
        
        
        
    }
}
