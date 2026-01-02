package com.example.mvcsaveget.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mvcsaveget.entity.Login;
import com.example.mvcsaveget.repository.LoginRepository;

@Service
public class LoginServices {
	@Autowired
	LoginRepository loginRepository;

	public void savaLoginDetails(Login login) {
		this.loginRepository.save(login);
		System.out.println("Login Data Inserted Sucessfully");
	}
	
	/*
	 * public Login getDataById(int id) { Optional<Login> login =
	 * this.loginRepository.findById(id); System.out.println("Data : "+login);
	 * return (Login) login; }
	 */
	
	
	public Iterable<Login> getAllLoginDetails() {
		Iterable<Login> login = this.loginRepository.findAll();
		System.out.println("Login Details all : "+login);
		return login;
	}
	
	public Optional<Login> getDetailsById(int id ) {
		Optional<Login> x = this.loginRepository.findById(id);
		return x;
	}
	
	
	
	
}
