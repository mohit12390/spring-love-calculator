package com.javatpoint.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.javatpoint.api.EmailDTO;
import com.javatpoint.api.UserInfoDTO;
import com.javatpoint.service.LCAppserviceIImpl;

@Controller
public class EMailController {
// Logger 
	
	Logger logger = Logger.getLogger(EMailController.class.getName());
	
	@Autowired
	private LCAppserviceIImpl serviceimpl;

	@RequestMapping("/sendemail")
	public String sendEmail(
			/* @CookieValue("username") String username , */ @ModelAttribute("emaildto") EmailDTO emaildt,
			Model model) {
		
		
		
		return "email-page";

	}

	@RequestMapping("/process-email")
	public String processEmail(@SessionAttribute("userInfo") UserInfoDTO userdto,
			@ModelAttribute("emaildto") EmailDTO emaildto) {

	//	serviceimpl.sendEmail(userdto.getUserName(), emaildto.getEmail(), "FIREND");
		logger.info(emaildto.getEmail());
		return "process-email-page";

	}

}
