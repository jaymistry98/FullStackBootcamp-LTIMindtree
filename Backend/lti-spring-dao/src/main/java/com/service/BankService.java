package com.service;

import java.util.List;

import com.model.Bank;

public interface BankService {
	
	public void addBankAccount (Bank bank);
	public List<Bank> loadBankAccount();
	public int deleteBankAccount(int id);
}
