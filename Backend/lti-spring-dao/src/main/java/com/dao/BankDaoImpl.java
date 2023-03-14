package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.model.Bank;
import com.model.Employee;

@Repository
public class BankDaoImpl extends JdbcDaoSupport implements BankDao {

	@Autowired
	DataSource dataSource;
	
	@PostConstruct 
	private void initConnection() { 
		setDataSource(dataSource); 
	}

	@Override
	public void addBankAccount(Bank bank) {
		
		String insertStatement = "insert into bank values(?,?,?,?)";
		getJdbcTemplate().update(insertStatement, new Object[] {Bank.getEmpId(), Bank.getAccNo(), Bank.getInitialBalance(), Bank.getTypeofAccount() });
	}

	@Override
	public List<Bank> loadBankAccount() {
		String sql = "select * from bank";
		List<Map<String, Object>> lst = getJdbcTemplate().queryForList(sql);
		
		List<Bank> result = new ArrayList<Bank>();
		for(Map<String, Object> row: lst) {
			Bank bk = new Bank((Integer)row.get("empid"), (Integer)row.get("accno"), (Integer)row.get("initialbalance"), (String)row.get("typeofaccount"));
			result.add(bk);
		}
		return result;
	}

	@Override
	public int deleteBankAccount(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from bank where empid = ?";
		return getJdbcTemplate().update(sql, id);
	}
	
	
}
