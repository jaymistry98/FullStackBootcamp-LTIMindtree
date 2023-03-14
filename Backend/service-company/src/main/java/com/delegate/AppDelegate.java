package com.delegate;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AppDelegate {
	
	RestTemplate template = new RestTemplate();
	
	public String loadUsers() {
		String data = template.exchange("http://localhost:8045/mainapp/loadusers"
				,HttpMethod.GET
				,null
				, new ParameterizedTypeReference<String>() {	
		        }).getBody();
		
		return data;
	}
	
	public String loadUsers2() {
		String data = template.exchange("http://localhost:8035/mainapp/loadusers2"
				,HttpMethod.GET
				,null
				, new ParameterizedTypeReference<String>() {	
		        }).getBody();
		
		return data;
	}
	
}
