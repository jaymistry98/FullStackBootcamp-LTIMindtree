package com.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.model.FixedDeposit;
import com.model.SavingsAccount;
import com.service.CalculatorService;

@Configuration
//@ComponentScan("com")
public class AppConfig {
	
	@Bean
	@Lazy
	public SavingsAccount savings() {
		return new SavingsAccount();
	}
	
	@Bean
	@Lazy
	public FixedDeposit fixed() {
		return new FixedDeposit();
	}
	
	@Bean
	@Lazy
	public CalculatorService service() {
		return new CalculatorService(savings());
	}

}
