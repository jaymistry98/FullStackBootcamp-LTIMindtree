package com.app;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.Bank;

//@Repository
public interface BankApp extends CrudRepository<Bank, Integer> {

}
