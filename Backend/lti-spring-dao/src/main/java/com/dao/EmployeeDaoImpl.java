package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import com.model.Employee;

@Repository
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {

	@Autowired
	DataSource dataSource;
	
	@PostConstruct 
	private void initConnection() { 
		setDataSource(dataSource); 
	}
	
	@Override
	public void addEmployee(Employee employee) {
		
		String insertStatement = "insert into employee values(?,?,?)";
		getJdbcTemplate().update(insertStatement, new Object[] {employee.getEmpId(), employee.getEmpName(), employee.getCity()});
		
	}

	@Override
	public List<Employee> loadEmployee() {
		String sql = "select * from employee";
		List<Map<String, Object>> lst = getJdbcTemplate().queryForList(sql);
		
		List<Employee> result = new ArrayList<Employee>();
		for(Map<String, Object> row: lst) {
			Employee emp = new Employee((Integer)row.get("empid"), (String)row.get("empname"), (String)row.get("city"));
			result.add(emp);
		}
		return result;
	}

	@Override
	public Employee findEmployee(String name) {
		String sql = "select * from employee where empname = ?";
		
		return (Employee) getJdbcTemplate().queryForObject(sql, new BeanPropertyRowMapper<Employee>(Employee.class),name);
	}

	@Override
	public int deleteEmployee(int id) {
		
		String sql = "delete from employee where empid = ?";
		return getJdbcTemplate().update(sql, id);
		
	}
	
	/*
	@Override
	public int updateEmployee(int id, Employee employee) {
		String sql = "update employee set empname = ? where empid = ?";
		return getJdbcTemplate().update(sql, id);
		
		
	}
	*/
	
	

}
