package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.UserApp;
import com.model.Employee;




@Repository
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {

	@Autowired
	private UserApp app;
	
	@Autowired
	DataSource dataSource;
	
	@PostConstruct 
	private void initConnection() { 
		setDataSource(dataSource); 
	}
	
	@Override
	public void addEmployee(Employee employee) {
		
		//String insertStatement = "insert into employee values(?,?,?)";
		//getJdbcTemplate().update(insertStatement, new Object[] {employee.getEmpId(), employee.getEmpName(), employee.getCity()});
		app.save(employee);
	}

	@Override
	public List<Employee> loadEmployee() {
		/*
		String sql = "select * from employee";
		List<Map<String, Object>> lst = getJdbcTemplate().queryForList(sql);
		
		List<Employee> result = new ArrayList<Employee>();
		for(Map<String, Object> row: lst) {
			Employee emp = new Employee((Integer)row.get("empid"), (String)row.get("empname"), (String)row.get("city"));
			result.add(emp);
		}
		return result;
		*/
		return (List<Employee>) app.findAll();
	}

	@Override
	public Employee findEmployee(int empid) {
		/*
		String sql = "select * from employee where empname = ?";
		return (Employee) getJdbcTemplate().queryForObject(sql, new BeanPropertyRowMapper<Employee>(Employee.class),name);
		*/
		Optional<Employee> opt = app.findById(empid);
		if (opt.isPresent()) {
			return new Employee(empid,"","");
		}
		return null;
		
	}

	@Override
	public void deleteEmployee(int empid) {
		/*
		String sql = "delete from employee where empid = ?";
		return getJdbcTemplate().update(sql, id);
		*/
		app.deleteById(empid);
	}
	
	/*
	@Override
	public int updateEmployee(int id, Employee employee) {
		String sql = "update employee set empname = ? where empid = ?";
		return getJdbcTemplate().update(sql, id);
		
		
	}
	*/
	
	

}
