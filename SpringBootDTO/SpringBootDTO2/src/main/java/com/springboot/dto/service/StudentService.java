package com.springboot.dto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.springboot.dto.Converter;
import com.springboot.dto.StudentDto;
import com.springboot.dto.entity.Student;
import com.springboot.dto.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private Converter converter;
	
	public void saveStudent(@RequestBody StudentDto studentDto) {
		//conversation
		Student student = this.converter.dtoToEntity(studentDto);
		Student x = this.studentRepository.save(student);
		System.out.println("Save data : "+x);
	}
	
	public StudentDto getById(int id) {
		Optional<Student> optional = this.studentRepository.findById(id);
		Student student = optional.get();
		
		//conversation
		StudentDto x = this.converter.entityToDto(student);
		return x;
		
	}

	public List<Student> getStudent() {
		List<Student> x = this.studentRepository.findAll();
		return x;
	}
	
}
