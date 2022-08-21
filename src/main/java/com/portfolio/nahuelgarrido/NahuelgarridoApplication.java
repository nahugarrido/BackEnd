// uso estas lineas para desactivar el security
//import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
//@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
package com.portfolio.nahuelgarrido;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NahuelgarridoApplication {

	public static void main(String[] args) {
		SpringApplication.run(NahuelgarridoApplication.class, args);
	}

}
