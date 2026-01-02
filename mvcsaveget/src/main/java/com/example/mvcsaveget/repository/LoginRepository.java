package com.example.mvcsaveget.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.mvcsaveget.entity.Login;
@Repository
public interface LoginRepository extends CrudRepository<Login, Integer> {
	
}
