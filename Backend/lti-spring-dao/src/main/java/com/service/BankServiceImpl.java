package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.BankDao;
import com.model.Bank;

@Service
public class BankServiceImpl implements BankService {
	
	@Autowired
	BankDao dao;

	@Override
	public void addBankAccount(Bank bank) {
		
		dao.addBankAccount(bank);
		
	}

	@Override
	public List<Bank> loadBankAccount() {
		// TODO Auto-generated method stub
		return dao.loadBankAccount();
	}

	@Override
	public int deleteBankAccount(int id) {
		// TODO Auto-generated method stub
		return dao.deleteBankAccount(id);
	}
}
