package com.portfolio.nahuelgarrido;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class NahuelgarridoApplication {

	public static void main(String[] args) {
		SpringApplication.run(NahuelgarridoApplication.class, args);
	}

}
