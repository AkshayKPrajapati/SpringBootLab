package com.springbootcrudresponseentitiy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootcrudresponseentitiy.entity.Student;

@Repository
public interface StudentRepoistroy extends CrudRepository<Student,Integer>{

}
