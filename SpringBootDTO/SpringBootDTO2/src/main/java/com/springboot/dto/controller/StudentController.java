package com.springboot.dto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.autoconfigure.JacksonProperties.Json;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dto.StudentDto;
import com.springboot.dto.entity.Student;
import com.springboot.dto.repository.StudentRepository;
import com.springboot.dto.service.StudentService;

@RestController
public class StudentController {

    private final StudentRepository studentRepository;
	@Autowired
	private StudentService studentService;

    StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
	
	@PostMapping("save")
	public String newStudent(@RequestBody StudentDto  studentDto) {
		this.studentService.saveStudent(studentDto);
		return "new student data saved ";
		
	}
	
	@GetMapping("/get/{id}")
	public StudentDto getStudentById(@PathVariable("id") int id) {
		StudentDto dto = this.studentService.getById(id);
		return dto;
	}
	@GetMapping("students")
	public List<Student> getStudent() {
		List<Student> x = this.studentService.getStudent();
		return x;
	}
	
	
}
