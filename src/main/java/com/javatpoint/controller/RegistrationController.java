package com.javatpoint.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javatpoint.api.RegistrationDTO;

@Controller
public class RegistrationController {

	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userregistration") RegistrationDTO registrationdto)
	{
		return "user-regustration-page";
	}
	
	@RequestMapping("/registration-success")
	public String processUserRegistration(@ModelAttribute("registerdto") RegistrationDTO registrationdto )
	{
		System.out.println(registrationdto.getName());
		return "registration-success";
	}
}
