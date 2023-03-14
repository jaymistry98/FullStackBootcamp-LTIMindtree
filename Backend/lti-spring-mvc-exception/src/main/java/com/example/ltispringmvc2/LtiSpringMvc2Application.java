package com.example.ltispringmvc2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com")
@SpringBootApplication
public class LtiSpringMvc2Application {

	public static void main(String[] args) {
		SpringApplication.run(LtiSpringMvc2Application.class, args);
	}
	
	

}
