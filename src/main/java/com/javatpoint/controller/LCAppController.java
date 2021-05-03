package com.javatpoint.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.javatpoint.api.UserInfoDTO;
import com.javatpoint.service.LCAppserviceIImpl;

@Controller
@SessionAttributes("userInfo")
public class LCAppController {

	
	@RequestMapping("/")
	public String sayHello(
			/* @ModelAttribute("userInfo") UserInfoDTO userInfodto */ Model model) {

		model.addAttribute("userInfo", new UserInfoDTO());

		return "home-page";
	}

	@RequestMapping("/process-homepage")
	public String showResultPage(// @RequestParam String userName,@RequestParam
									// String crushName
			@Valid @ModelAttribute("userInfo") UserInfoDTO userInfodto, BindingResult result) {

		System.out.println(userInfodto.isTermAndConsition());

		if (result.hasErrors()) {
			System.out.println("my form has errors");
			List<ObjectError> allErrors = result.getAllErrors();
			for (ObjectError temp : allErrors) {
				System.out.println(temp);
			}
			return "home-page";
		}

		/*
		 * Cookie ck=new Cookie("username",userInfodto.getUserName());//creating
		 * cookie object ck.setMaxAge(60*60*24); response.addCookie(ck);//adding
		 * cookie in the response
		 */

		/*
		 * HttpSession session =request.getSession();
		 * session.setAttribute("uname", userInfodto.getUserName());
		 * session.setMaxInactiveInterval(120);
		 */
		return "result-page";
	}

}
