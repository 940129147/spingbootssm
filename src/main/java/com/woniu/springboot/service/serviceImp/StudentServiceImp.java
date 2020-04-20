package com.woniu.springboot.service.serviceImp;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.javassist.expr.NewArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.springboot.entity.Classa;
import com.woniu.springboot.entity.Student;
import com.woniu.springboot.mapper.StudentMapper;
import com.woniu.springboot.service.StudentService;

@Service
public class StudentServiceImp implements StudentService{
	 @Autowired
	 StudentMapper studentMapper;
	 
	 
    
	 //加入事务控制注解
	@Transactional
	@Override
	public void addStudent(Student student) {
		studentMapper.insertStudent(student);
	}

	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}



	@Override
	public List<Student> queryStudents() {
		// TODO Auto-generated method stub
		return studentMapper.queryStudents();
	}



	@Override
	public List<Classa> queryClassa() {
		// TODO Auto-generated method stub
		return studentMapper.queryClassa();
	}

	@Override
	public Student queryStudent(Integer sid) {
		// TODO Auto-generated method stub
		return studentMapper.queryStudent(sid);
	}
	
	@Transactional
	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentMapper.updateStudent(student);
	}

	@Override
	public void deleteStudent(Integer sid) {
		studentMapper.deleteStudent(sid);
		
	}

}
