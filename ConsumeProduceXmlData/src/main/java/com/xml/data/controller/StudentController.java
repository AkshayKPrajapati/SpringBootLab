package com.xml.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.xml.data.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
}
