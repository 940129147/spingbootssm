package com.woniu.springboot;

import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.woniu.springboot.entity.Student;
import com.woniu.springboot.mapper.StudentMapper;
import com.woniu.springboot.service.StudentService;

@SpringBootTest
class Springssm01ApplicationTests {
	
	@Autowired
	StudentMapper studentMapper;
	
	@Autowired
	StudentService studentService;
	
	@Autowired
	DataSource dataSource;
	
	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}

	@Test
	void contextLoads() {
	}

	@Test
	void studentTest() {
		List<Student> aa=studentMapper.queryStudents();
		System.out.println(aa.toString());
	}
	
	@Test
	void studentSerViceTest() {
		//studentService.addStudent();
	}
	@Test
	void dataSourceTest() {
		System.out.println(dataSource);
		System.out.println(dataSource.getClass().getName());
	}
}
