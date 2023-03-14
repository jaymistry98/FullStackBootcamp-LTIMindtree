package com.dao;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.app.InsuranceApp;
import com.app.UserApp;
import com.model.Insurance;

@Repository
public class InsuranceDaoImpl extends JdbcDaoSupport implements InsuranceDao {

	@Autowired
	private InsuranceApp app;
	
	@Autowired
	DataSource dataSource;
	
	@PostConstruct 
	private void initConnection() { 
		setDataSource(dataSource); 
	}
	
	@Override
	public void registerEmpInsurance(Insurance insurance) {
		
		//String insertStatement = "insert into insurance values(?,?,?)";
		//getJdbcTemplate().update(insertStatement, new Object[] {insurance.getEmpId(), insurance.getSchemeName(), insurance.getCoverageAmount()});
		app.save(insurance);
	}

	@Override
	public int deleteInsurance(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from insurance where empid = ?";
		return getJdbcTemplate().update(sql, id);
	}

}
