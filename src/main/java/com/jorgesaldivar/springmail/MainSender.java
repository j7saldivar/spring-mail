package com.jorgesaldivar.springmail;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import com.jorgesaldivar.springmail.config.MailConfig;

@Component
public class MainSender implements CommandLineRunner {

	@Autowired
	private JavaMailSender javaMailSender;
	private final Logger logger = Logger.getLogger(MainSender.class);
	
	@Autowired
	private MailConfig m;

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println(m);
		String to = "me@jorgesaldivar.com";
		String subject = "Spring Framework Mail";
		String body = "This is a test sent by spring framework mail";

		send(to, subject, body);
		logger.info("Message sent");

	}

	public void send(String to, String subject, String body) throws MessagingException {

		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);

		helper.setSubject(subject);
		helper.setTo(to);
		helper.setText(body, true);

		javaMailSender.send(message);

	}

}