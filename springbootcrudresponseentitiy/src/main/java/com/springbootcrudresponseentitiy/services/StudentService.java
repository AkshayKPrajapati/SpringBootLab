package com.springbootcrudresponseentitiy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootcrudresponseentitiy.entity.Student;
import com.springbootcrudresponseentitiy.repository.StudentRepoistroy;

@Service
public class StudentService {
	@Autowired
	StudentRepoistroy studentRepoistroy;
	
	
	public void saveStudentDetails(Student student) {
		this.studentRepoistroy.save(student);
		System.out.println("student details");
	}
	
	public Iterable<Student> getAllStudent() {
		Iterable<Student> student = this.studentRepoistroy.findAll();
		System.out.println("Student : "  +student);
		return student;
	}
	
}
