package com.example.empmsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com")
@EntityScan("com.model")
@EnableJpaRepositories("com.app")
public class EmpMsServiceJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpMsServiceJpaApplication.class, args);
	}

}
