package com.examples.account;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.examples.account.domain.Account;
import com.examples.account.repository.AccountRepository;
import com.examples.account.repository.InMemoryAccountRepository;
import com.examples.account.service.TransferServiceImpl;



@Configuration
public class AppConfig {
	
	@Bean
	@Lazy
	public InMemoryAccountRepository accountRepository() {
		return new InMemoryAccountRepository();
	}
	
	@Bean
	@Lazy
	public TransferServiceImpl transferService() {
		return new TransferServiceImpl(accountRepository());
	}
	
}
