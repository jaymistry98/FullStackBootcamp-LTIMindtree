package com.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class AppDelegate {
	@LoadBalanced
	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	};
	@Autowired
	public RestTemplate template;
	
	@HystrixCommand(fallbackMethod = "callonFail")
	public String loadUsers() {
		String data= template.exchange("http://emp-service/mainapp/loadall"
				,HttpMethod.GET
				,null
				,new ParameterizedTypeReference<String>() {
				}).getBody();
		
		return data;
	}
	
	@HystrixCommand(fallbackMethod = "callonFail")
	public String loadUsers2() {
		String data= template.exchange("http://emp-service-jpa/mainapp/loadall"
				,HttpMethod.GET
				,null
				,new ParameterizedTypeReference<String>() {
				}).getBody();
		
		return data;
	}

	public String callonFail() {
		return "something went wrong...... try after sometime";
	}
}
