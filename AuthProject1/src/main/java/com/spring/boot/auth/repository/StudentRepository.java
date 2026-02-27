package com.spring.boot.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.auth.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
