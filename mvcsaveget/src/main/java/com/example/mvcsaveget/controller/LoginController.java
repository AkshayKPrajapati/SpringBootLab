package com.example.mvcsaveget.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.mvcsaveget.entity.Login;
import com.example.mvcsaveget.service.LoginServices;

import ch.qos.logback.core.model.Model;


@Controller
public class LoginController {
	@Autowired
	LoginServices loginServices;
	
	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}
	
	
	@PostMapping("/loginSucess")
	public String getSuccess(@ModelAttribute Login login,Model model) {
		System.out.println("Hello");
		this.loginServices.savaLoginDetails(login);
		Iterable<Login> x = this.loginServices.getAllLoginDetails();
		System.out.println(x);
		model.addAttribute("loginData",x);
		return "success";
		
	}
	
	
	
}
