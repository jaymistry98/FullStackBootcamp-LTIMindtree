package com.example.empmsregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaServer

public class EmpMsRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpMsRegistryApplication.class, args);
	}

}
