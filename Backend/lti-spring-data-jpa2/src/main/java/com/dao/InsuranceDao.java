package com.dao;

import com.model.Insurance;

public interface InsuranceDao {

	public void registerEmpInsurance(Insurance insurance);
	public int deleteInsurance(int id);
}
