package com.springbootcrudresponseentitiy.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springbootcrudresponseentitiy.entity.Student;

@Repository
public interface StudentRepoistroy extends CrudRepository<Student,Integer>{
	
	// select * from student where city="pune";
	
	public	Iterable<Student>findByCity(String city);
	
	
	@Query("select s from student s where c.city := c") 
	public Iterable<Student> getFindByCity(@Param("city") String city);
}
