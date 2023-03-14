package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.InsuranceDao;
import com.model.Insurance;

@Service
public class InsuranceServiceImpl implements InsuranceService{
	
	@Autowired
	InsuranceDao dao;
	
	@Override
	public void registerEmpInsurance(Insurance insurance) {
		
		dao.registerEmpInsurance(insurance);
		
	}

	@Override
	public int deleteInsurance(int id) {
		// TODO Auto-generated method stub
		return dao.deleteInsurance(id);
	}

}
