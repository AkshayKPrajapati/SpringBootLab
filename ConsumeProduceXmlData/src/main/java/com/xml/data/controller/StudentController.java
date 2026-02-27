package com.xml.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xml.data.entity.StudentEntity;
import com.xml.data.service.StudentService;
@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public String addNewStudent(@RequestBody StudentEntity student) {
        studentService.saveStudent(student);
        return "save new student details";
    }
}
