package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
		return "index"; 
		// "index" is the name of the jsp page. All the jsp pages go in WEB-INF views
		// in react you return response entity not a string.
	}
	
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	
	@RequestMapping("/signin")
	public String signin() {
		return "signin";
	}
	
}
