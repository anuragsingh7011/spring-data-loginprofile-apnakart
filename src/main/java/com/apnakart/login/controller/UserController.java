package com.apnakart.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.apnakart.login.entity.UserEntity;
import com.apnakart.login.pojo.UserPojo;
import com.apnakart.login.service.UserService;

@Controller
public class UserController {
	
	@Autowired 
	UserService userService;
	
	@GetMapping("viewProfile")
	public String displayProfile() {
		System.out.println("LoginController.displayProfile():::::     ");
		return "profile";
	}
	@PostMapping("createLogin")
	public String createLogin(@ModelAttribute UserPojo userPojo,Model model) {
//		System.out.println("UserController.createLogin()"+ userPojo.getEmail());
		UserEntity id=userService.doLogin(userPojo);
		System.out.println(" Proile created and id is " + id);	
		
		UserEntity entity =userService.doLogin(userPojo);
		model.addAttribute("info", entity);
		return "profile-confirmation";
		
	}
}
