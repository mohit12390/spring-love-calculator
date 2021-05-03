package com.javatpoint.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javatpoint.api.Contact;

@Controller
public class ComplexForm {

	@RequestMapping("/complex")
	public String FormHandling()
	{
		return "complex_form";
	}
	
	@RequestMapping(value="/handleForm", method=RequestMethod.POST)
	public String handleForm(@ModelAttribute("contact") Contact contact)
	{
		System.out.println(contact);
		return "success";
	}
	
	
}
