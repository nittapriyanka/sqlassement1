package com.sonata.casestudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Userlogin {

	
    
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage()
	{
		return "login";
	}
	
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String welcomePage(ModelMap model, @RequestParam String username, @RequestParam String password){
		if(username.equals("Sushma") && password.equals("abc")) {
			model.put("username", username);
			return "welcome";
		}
		model.put("errorMsg", "Please provide the correct credentials");
		return "login";
	}
	

	}
		
	
	

