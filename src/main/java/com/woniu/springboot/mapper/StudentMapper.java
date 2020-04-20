package com.woniu.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.woniu.springboot.entity.Classa;
import com.woniu.springboot.entity.Student;

@Mapper
public interface StudentMapper {
  void insertStudent(Student student);
  void updateStudent(Student student);
   
   List<Student> queryStudents();
   Student queryStudent(Integer sid);
   
   
   
   List<Classa> queryClassa();
   
   void deleteStudent(Integer sid);
}
