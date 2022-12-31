package com.journaldev.spring;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.journaldev.spring.model.User;
import com.journaldev.spring.service.UserService;
import com.journaldev.spring.validator.UserValidator;


@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserValidator userValidator;
	
	
	@RequestMapping(value= "/home", method = RequestMethod.GET)
	public String showPage(@ModelAttribute("users") User u){
		
		
		return "user";
		
		
		
	}
	
	
	/*
	 * //For add and update person both
	 * 
	 * @RequestMapping(value= "/user/save", method = RequestMethod.POST) public
	 * String saveUser(@ModelAttribute("users") User u){
	 * 
	 * //new user, save it this.userService.saveUser(u); return "redirect:user";
	 * 
	 * 
	 * 
	 * }
	 */
	
	
	@RequestMapping(value= "/save", method = RequestMethod.POST)
	public String saverecord(@Valid @ModelAttribute("users") User u,BindingResult result){
		
		userValidator.validate(u, result);
		if(result.hasErrors()) {
			return "user";
		}
			//new user, save it
			this.userService.saveUser(u);
		return "success";
		
		
		
	}
	

	
}
