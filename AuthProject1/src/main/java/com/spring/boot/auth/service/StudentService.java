package com.spring.boot.auth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.spring.boot.auth.entity.Student;
import com.spring.boot.auth.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public void saveStudent(Student student) {
		this.studentRepository.save(student);
		System.out.println("Data saved "+student);
	}
	
	
	public Student getStudent(int id) {
	    Student x = this.studentRepository.findById(id)
	            .orElseThrow(() -> new RuntimeException("Student not found"));
	    return x;
	}
	
	public List<Student> getAll() {
		List<Student> students = this.studentRepository.findAll();
		return students;
	}
}
