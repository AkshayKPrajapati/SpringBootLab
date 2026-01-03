package com.springbootcrudresponseentitiy.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootcrudresponseentitiy.entity.Student;
import com.springbootcrudresponseentitiy.repository.StudentRepoistroy;

@Service
public class StudentService {
	@Autowired
	StudentRepoistroy studentRepoistroy;
	
	//insert new data 
	public void saveStudentDetails(Student student) {
		this.studentRepoistroy.save(student);
		System.out.println("student details");
	}
	// fetch all data
	public Iterable<Student> getAllStudent() {
		Iterable<Student> student = this.studentRepoistroy.findAll();
		System.out.println("Student : "  +student);
		return student;
	}
	
	
	// fetch single data
	public Optional<Student> StudentDetailsById(int id) {
		Optional<Student> student = this.studentRepoistroy.findById(id);
		System.out.println("Student : "+student);
		return student;
	}
	
	//delete Student
	public void deleteStudent(int id) {
		 this.studentRepoistroy.deleteById(id);
	}
}
