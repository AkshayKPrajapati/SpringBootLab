package com.springboot.dto.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.springboot.dto.entity.Student;
import com.springboot.dto.repository.StudentRepository;
import com.springboot.modelmapperdto.ModelMapperDtoApplication;
import com.springboot.modelmapperdto.dto.StudentDto;


@Service
public class StudentService {
	@Autowired
    private final ModelMapperDtoApplication modelMapperDtoApplication;

	@Autowired
	private StudentRepository studentRepository;
//	@Autowired
//	private Converter converter;
	@Autowired
	private ModelMapper mapper;

    StudentService(ModelMapperDtoApplication modelMapperDtoApplication) {
        this.modelMapperDtoApplication = modelMapperDtoApplication;
    }
	
	public void saveStudent(@RequestBody StudentDto studentDto) {
		//conversation
		//Student student = this.converter.dtoToEntity(studentDto);
		Student  student = this.mapper.map(studentDto, Student.class);
		Student x = this.studentRepository.save(student);
		System.out.println("Save data : "+x);
	}
	
	public StudentDto getById(int id) {
		Optional<Student> optional = this.studentRepository.findById(id);
		Student student = optional.get();
		
		//conversation
		//StudentDto x = this.converter.entityToDto(student);
		StudentDto dto = this.mapper.map(student, StudentDto.class);
		return dto;
		
	}

	public List<Student> getStudent() {
		List<Student> x = this.studentRepository.findAll();
		return x;
	}
	
}
