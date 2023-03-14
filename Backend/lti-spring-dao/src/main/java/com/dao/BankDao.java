package com.dao;

import java.util.List;

import com.model.Bank;

public interface BankDao {

	public void addBankAccount (Bank bank);
	public List<Bank> loadBankAccount();
	public int deleteBankAccount(int id);
}
