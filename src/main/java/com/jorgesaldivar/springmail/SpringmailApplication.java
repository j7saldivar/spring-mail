package com.jorgesaldivar.springmail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmailApplication.class, args);
	}

}
