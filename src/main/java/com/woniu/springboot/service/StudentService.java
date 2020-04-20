package com.woniu.springboot.service;

import java.util.List;

import com.woniu.springboot.entity.Classa;
import com.woniu.springboot.entity.Student;

public interface StudentService {
    void addStudent(Student student);
          
   List<Student> queryStudents();
   List<Classa> queryClassa();
   
   Student queryStudent(Integer sid);
   void updateStudent(Student student);
   void deleteStudent(Integer sid);
}
