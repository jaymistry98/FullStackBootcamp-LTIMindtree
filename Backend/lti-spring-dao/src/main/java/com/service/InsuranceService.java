package com.service;

import com.model.Insurance;

public interface InsuranceService {
	
	public void registerEmpInsurance(Insurance insurance);
	public int deleteInsurance(int id);
}
