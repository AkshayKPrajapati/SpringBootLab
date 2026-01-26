package com.xml.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.xml.data.entity.StudentEntity;
import com.xml.data.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping(
			value="/savaData"
			)
	public String addNewStudent(@RequestBody StudentEntity student) {
		this.studentService.saveStudent(student);
		System.out.println("data saved ");
		return "save new student details";
	}
}
