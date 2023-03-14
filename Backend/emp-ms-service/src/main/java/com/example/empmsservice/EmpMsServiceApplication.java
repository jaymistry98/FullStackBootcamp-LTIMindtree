package com.example.empmsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com")
public class EmpMsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpMsServiceApplication.class, args);
	}

}
