package com.spring.boot.auth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.auth.entity.Student;
import com.spring.boot.auth.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	//Handler
	@GetMapping("/hello")
	public  String getString () {
		return  "Jai Shree Ram" ;	
	}
	
	
	@PostMapping("/save")
	public String saveData(@RequestBody Student student) {
		this.studentService.saveStudent(student);
		return "data saved ";
	}
	
	@GetMapping("getAll")
	public List<Student> getAllStudent() {
		List<Student> students = this.studentService.getAll();
		System.out.println("Student Data : "+students);
		return students;
	}
	
	@GetMapping("get/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable int id) {
	    Student student = studentService.getStudent(id);
	    return ResponseEntity.ok(student);
	}

}
