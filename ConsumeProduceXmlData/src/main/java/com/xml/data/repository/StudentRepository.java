package com.xml.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.xml.data.entity.StudentEntity;

@Repository
public interface StudentRepository 
	extends CrudRepository<StudentEntity, Integer> {

}
