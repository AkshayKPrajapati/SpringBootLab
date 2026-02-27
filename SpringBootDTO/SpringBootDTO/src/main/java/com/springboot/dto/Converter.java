package com.springboot.dto;

import org.springframework.stereotype.Component;

import com.springboot.dto.entity.Student;

@Component
public class Converter {
	
	public Student	dtoToEntity (StudentDto dto){
		Student student=new Student();
		student.setName(dto.getName());
		student.setCity(dto.getCity());
		student.setMark(dto.getMark());
		return student;
		
	}
	
	public StudentDto entityToDto(Student student) {
		StudentDto dto= new StudentDto();
		dto.setCity(student.getCity());
		dto.setMark(student.getMark());
		dto.setName(student.getName());
		return dto;
		
	}
}
