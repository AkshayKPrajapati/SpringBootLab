package com.springbootcrudresponseentitiy.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootcrudresponseentitiy.entity.Student;
import com.springbootcrudresponseentitiy.services.StudentService;

import ch.qos.logback.core.joran.spi.HttpUtil.RequestMethod;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;

	@ResponseBody
	@GetMapping("/")
	public String getIndex() {
		System.out.println("index page loaded");
		return "index";
	}

	@PostMapping("/saveNewStudent")
	public String saveNewStudent(@RequestBody Student student) {
		this.studentService.saveStudentDetails(student);
		return "save data ";
	}

	@PostMapping("/newStudent")
	public ResponseEntity<String> addNewStudent(@RequestBody Student student) {
		this.studentService.saveStudentDetails(student);
		return new ResponseEntity<String>("New Student Added !!!",HttpStatus.CREATED);
	}

	
	
	
	@GetMapping("StudentAll")
	  public Iterable<Student> getStudentRecord() {
		  Iterable<Student> student =this.studentService.getAllStudent();
		  System.out.println(student);
		  return student;
	   
	  }

	@GetMapping("/students")
	public ResponseEntity<Iterable<Student>> fetchStudentDetails() {
		Iterable<Student> students = studentService.getAllStudent();
		return ResponseEntity.ok(students);
	}
	
	
	@GetMapping("v1/students")
	public ResponseEntity<Iterable<Student>> getStudents() {
		Iterable<Student> students = studentService.getAllStudent();
		return new ResponseEntity<Iterable<Student>>(students,HttpStatus.OK);
	}
	
	@GetMapping("/getStudent/{id}")
	public Optional<Student> getStudentById(@PathVariable int id) {
		Optional<Student> student=this.studentService.StudentDetailsById(id);
		System.out.println(student);
		return student;
	}
	
	@PostMapping("/getStudent")
	public Optional<Student> StudentById(@RequestParam("id") int id) {
		Optional<Student> student=this.studentService.StudentDetailsById(id);
		System.out.println(student);
		return student;
	}
	
	
	@PostMapping("v1/getStudent")
	public ResponseEntity<Student> studentFindById(@RequestParam int id) {

	    Optional<Student> student = studentService.StudentDetailsById(id);

	    if (student.isPresent()) {
	        return new ResponseEntity<>(student.get(), HttpStatus.OK);
	    } else {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }
	}

	
	@DeleteMapping("deleteStudentByid/{id}")
	public String deleteStudent(@PathVariable int id ) {
		this.studentService.deleteStudent(id);
		return "Student with ID " + id + " has been deleted successfully";
	}
	
	
	@DeleteMapping("v1/deleteStudentByid/{id}")
	public ResponseEntity<String> deleteStudentById(@PathVariable int id ) {
		this.studentService.deleteStudent(id);
		//return "Student with ID " + id + " has been deleted successfully";
		return new ResponseEntity<String>("Student with ID " + id + " has been deleted successfully",HttpStatus.NO_CONTENT );
	}
	
	@PutMapping("/update/student")
	public void updateStudent(@RequestBody Student student) {
	    studentService.updateStudent(student);
	}
	@GetMapping("student/findByCity/{city}")
	public Iterable<Student> getFindByCity(@PathVariable String city) {
		Iterable<Student> x = this.studentService.findByCityService(city);
		return x;
	}

}
