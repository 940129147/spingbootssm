package com.woniu.springboot.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.springboot.entity.Classa;
import com.woniu.springboot.entity.Student;
import com.woniu.springboot.service.StudentService;

//为这个类的每个方法都加@ResponseBody
//@RestController
@Controller
public class StudentController {
    
	@Autowired
	StudentService studentService;
	
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	 
//	@RequestMapping("/studentall")
//	public List<Student> getStudentAll() {
//	return studentService.queryStudents();
//	}
	
	

	//查
	 @GetMapping("/students")
	 public String getStudent(Model model) {
		 List<Student> st=studentService.queryStudents();
		    model.addAttribute("students",st);
		    return "student";
	   }
	  
	  //增加
	  @GetMapping("/student")
	  public String addStudents1(Model model) {
		  List<Classa> ca=studentService.queryClassa();
		    model.addAttribute("classa",ca);
		    return "studentAdd";
	   }
	  
	  @PostMapping("/student")
	  public String addStudents2(Student student) {
		  studentService.addStudent(student);
		    System.out.println("添加成功");
		    return "redirect:/students";
	   }
	  
	  
	  @GetMapping("/student/{sid}")
	  public String updateStudent1(@PathVariable("sid")  Integer sid,Model model) {
		  System.out.println("yyyyyyyyyyyyyyyyyyyyy");
		  List<Classa> ca=studentService.queryClassa();
		    model.addAttribute("classa",ca);
		    System.out.println("该学生学号"+sid);
		    Student student=studentService.queryStudent(sid);
		    model.addAttribute("student",student);
		    return "update";
	    }
	  
	  @PutMapping("/student")
	  public String updateStudent1(Student student){
		  studentService.updateStudent(student);
		  return "redirect:/students";
	  }
	  
	     //删除
		 @DeleteMapping("/student/{sid}")
		 public String deleteStudent(@PathVariable("sid")  Integer sid) {
			 studentService.deleteStudent(sid);
			  return "redirect:/students";
		   }
}
