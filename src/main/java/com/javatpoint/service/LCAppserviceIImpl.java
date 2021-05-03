package com.javatpoint.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class LCAppserviceIImpl implements LCAppservice {

	@Autowired
	private JavaMailSender mailsender;

	@Override
	public void sendEmail(String username, String email, String result) {

		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(email);
		message.setSubject("Love Calculator APp Result");
		message.setText("HI " + username + "The resukt predict is  " + result);

		mailsender.send(message);

	}

}
