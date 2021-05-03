package com.javatpoint.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javatpoint.api.Student;

@Controller
public class TestController {
	
	@RequestMapping("/test")
	public String sayHello()
	{
		System.out.println("Comes under test");
		return "hello-world";
	}
	
	

}
