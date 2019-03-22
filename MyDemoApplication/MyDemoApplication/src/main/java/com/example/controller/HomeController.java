package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.entity.User;
import com.example.service.UserService;

// "index" is the name of the jsp page. All the jsp pages go in WEB-INF views
// in react you return response entity not a string.
// in request mapping, value is the form action's action attribute in the jsp.


@Controller
public class HomeController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/") // index url
	public ModelAndView index() {
		return new ModelAndView("index"); 
	}
	
	@RequestMapping("/register") // register page url
	public ModelAndView register() {
		return new ModelAndView("register", "user", new User());
	}
	
	@RequestMapping("/signin") // signin page url
	public ModelAndView signin() {
		return new ModelAndView("signin","user", new User());
	}
	
	@RequestMapping(value="/registerUser", method=RequestMethod.POST) // when you click register
	public ModelAndView submitUserRegistration(@ModelAttribute("user") User user) {
		System.out.println(user);
		userService.saveUser(user);
		return new ModelAndView("signin");
	}
	
	@RequestMapping(value="/signinUser", method=RequestMethod.POST) // when you click login
	public ModelAndView signinUser(@ModelAttribute("user") User user, HttpSession session) {
		System.out.println(user.getEmail() + " " + user.getPassword());
		User loggedInUser = userService.getUser(user.getEmail(), user.getPassword());
		if(loggedInUser != null)
		{
			session.setAttribute("loggedInUser", loggedInUser);
			return new ModelAndView("account");
		}
		else
			return new ModelAndView("signin");
	}
	
}