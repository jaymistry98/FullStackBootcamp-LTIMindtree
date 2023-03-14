package com.app;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.Employee;

@Repository
public interface UserApp extends CrudRepository<Employee, Integer>{
	
	
}
