package com.springboot.dto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dto.entity.Student;
import com.springboot.dto.repository.StudentRepository;
import com.springboot.dto.service.StudentService;
import com.springboot.modelmapperdto.dto.StudentDto;

@RestController
@RequestMapping("/students")   
public class StudentController {

    private final StudentRepository studentRepository;
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentRepository studentRepository,
                             StudentService studentService) {
        this.studentRepository = studentRepository;
        this.studentService = studentService;
    }

    @PostMapping("/save")   
    public String newStudent(@RequestBody StudentDto studentDto) {
    	System.out.println(studentDto);
        this.studentService.saveStudent(studentDto);
        return "new student data saved";
    }

    @GetMapping("/get/{id}")   
    public StudentDto getStudentById(@PathVariable("id") int id) {
        return this.studentService.getById(id);
    }

    @GetMapping("/all")  
    public List<Student> getStudent() {
        return this.studentService.getStudent();
    }
}
